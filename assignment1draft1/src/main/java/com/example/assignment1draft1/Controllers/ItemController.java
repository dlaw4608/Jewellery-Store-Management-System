package com.example.assignment1draft1.Controllers;

import com.example.assignment1draft1.Main;
import com.example.assignment1draft1.Models.DisplayCase;
import com.example.assignment1draft1.Models.DisplayTray;
import com.example.assignment1draft1.Models.JewelleryItem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ItemController {

@FXML
    TextField description, price, searchbar;
@FXML
   public ChoiceBox gender;
@FXML
   public ChoiceBox<String> type;
@FXML
   public ListView<JewelleryItem> listview;

@FXML
public ComboBox<DisplayTray> traybox;

@FXML
public ComboBox<DisplayCase> casebox;



public void addItem(ActionEvent actionEvent){
    String description = this.description.getText();
    String typ = String.valueOf(type.getValue());
   // boolean gder = gender.isShowing();
    String gder = String.valueOf(gender.getValue());
    double prce = Double.parseDouble(price.getText());

    JewelleryItem ji = new JewelleryItem(description,typ,gder,prce);
    Main.selectedDisplayCase = casebox.getSelectionModel().getSelectedItem();
    Main.selectedDisplayTray = traybox.getSelectionModel().getSelectedItem();
    if(Main.selectedDisplayTray != null) {
        Main.selectedDisplayTray.displayJewellery.addElement(ji);


        populateListView();
    }
    }




  public void removeItem() {
      int i = 0;
      Main.selectedDisplayTray.displayJewellery.removeElement(i);
      populateListView();
  }



    public void populateListView(){
        listview.getItems().clear();
        Main.selectedDisplayTray.displayJewellery.addContentstoListView(listview);
    }

    public void populateComboBox(){
        traybox.getItems().clear();

        Main.myDisplayCases.addContentstoComboBox(casebox);
    }

public void initialize(){
    populateComboBox();
    gender.getItems().addAll("Female","Male", "Unisex");
    type.getItems().addAll("Ring", "Necklace", "Watch", "Bracelets","Earrings");

}
public void click(){
    Main.selectedDisplayCase = casebox.getSelectionModel().getSelectedItem(); //click on which case and tray to store item in
    traybox.getItems().clear();
    Main.selectedDisplayCase.displayTrays.addContentstoComboBox(traybox);


}

    public void gotoaddMaterial(){
        Main.selectedJewelleryItem = listview.getSelectionModel().getSelectedItem();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("materialview.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 640, 480);
            Main.itemtomaterialstage.setTitle("Add Jewellery item");
            Main.itemtomaterialstage.setScene(scene);
        } catch (IOException m) {
            m.printStackTrace();
        }
    }
    public void goViewStockController(){

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("search:view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 640, 480);
            Main.casetotraystage.setTitle("Add Jewellery item");
            Main.casetotraystage.setScene(scene);
        } catch (IOException m) {
            m.printStackTrace();
        }
    }
}


