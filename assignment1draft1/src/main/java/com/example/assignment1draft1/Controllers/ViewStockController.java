package com.example.assignment1draft1.Controllers;

import com.example.assignment1draft1.ADT.LinkList;
import com.example.assignment1draft1.ADT.LinkNode;
import com.example.assignment1draft1.Main;
import com.example.assignment1draft1.Models.DisplayCase;
import com.example.assignment1draft1.Models.DisplayTray;
import com.example.assignment1draft1.Models.JewelleryItem;
import com.example.assignment1draft1.Models.Material;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ViewStockController {
    @FXML
    ListView<String> viewList;


    public ViewStockController() {
        this.displaycase = new LinkList<>();
        this.displaytray = new LinkList<>();
        this.jewelleryitems = new LinkList<>();
        this.materials = new LinkList<>();
    }

    public static LinkList<DisplayCase> displaycase;
    public static LinkList<DisplayTray> displaytray;
    public static LinkList<JewelleryItem> jewelleryitems;
    public static LinkList<Material> materials;


    public void ViewAll() {
        LinkNode<DisplayCase> dc = Main.myDisplayCases.getHeadNode();
        viewList.getItems().clear();

        while (dc != null) {
            String S;
            LinkNode<DisplayTray> dt = dc.getContents().displayTrays.getHeadNode();
            while (dt != null) {
                LinkNode<JewelleryItem> ji = dt.getContents().displayJewellery.getHeadNode();
                while (ji != null) {

                    S = dc.getContents().getDisplayCaseID() + dt.getContents().getIdentifier() + ji.getContents().toString();
                    viewList.getItems().add(S);

                    ji = ji.next;

                }


                dt = dt.next;
            }


            dc = dc.next;
        }


    }
   public void goToAddMaterials(){

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("materialview.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 640, 480);
            Main.viewtomaterialstage.setTitle("Add Jewellery item");
            Main.viewtomaterialstage.setScene(scene);
        } catch (IOException v) {
            v.printStackTrace();
        }


    }



    /**
     * Search Tab
     **/
    public ListView<String> searchView;
    public TextField search;

    public void searchJewelleryItem() {
        LinkNode<DisplayCase> dc = Main.myDisplayCases.getHeadNode();
        searchView.getItems().clear();

        while (dc != null) {
            String S;
            LinkNode<DisplayTray> dt = dc.getContents().displayTrays.getHeadNode();
            while (dt != null) {
                LinkNode<JewelleryItem> ji = dt.getContents().displayJewellery.getHeadNode();
                while (ji != null) {
                    if (ji.getContents().description.contains(search.getText())) {
                        S = dc.getContents().getDisplayCaseID() + dt.getContents().getIdentifier() + ji.getContents().toString();
                        searchView.getItems().add(S);
                    }


                    ji = ji.next;

                }


                dt = dt.next;
            }


            dc = dc.next;
        }


    }

    public void ResetAllCases() {
        Main.myDisplayCases.deleteWholeList();
        Main.selectedDisplayCase.displayTrays.deleteWholeList();
        Main.selectedDisplayTray.displayJewellery.deleteWholeList();
        Main.selectedJewelleryItem.displayMaterial.deleteWholeList();
    }

    public void ResetAll() {
        viewList.getItems().clear();
        ResetAllCases();


    }


}


/*


    public void loadItem(ActionEvent event) throws Exception {
    Class<?>[] classes = new Class[] {DisplayCase.class};
    XStream xstream = new XStream(new DomDriver());
    XStream.setupDefaultSecurity(xstream);
    xstream.allowTypes(classes);

        ObjectInputStream is = xstream.createObjectInputStream
       /* try {

            XStream xstream = new XStream(new DomDriver());
            xstream.addPermission(AnyTypePermission.ANY);
            ObjectInputStream is = xstream.createObjectInputStream(new FileReader("items.xml"));
            jewelleryitems = (LinkList<JewelleryItem>) is.readObject();
            is.close();


        } catch (Exception e) {
            System.out.println("Error in reading this file : " + e);
        }*/
   // }
/*
    public void saveItem(ActionEvent event) throws Exception {
        /*try {
            XStream xstream = new XStream(new DomDriver());

            ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("items.xml"));

            out.writeObject(jewelleryitems
            );
            out.close();
        } catch (Exception d) {
            System.out.println("Error cannot save file:" + d);
        }
    }*/
    //}


