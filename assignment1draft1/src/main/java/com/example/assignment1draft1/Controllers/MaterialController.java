package com.example.assignment1draft1.Controllers;

import com.example.assignment1draft1.*;
import com.example.assignment1draft1.Models.DisplayCase;
import com.example.assignment1draft1.Models.DisplayTray;
import com.example.assignment1draft1.Models.JewelleryItem;
import com.example.assignment1draft1.Models.Material;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MaterialController {
@FXML
    TextField materialname, info, amnt, qlty;

@FXML
    ListView listview;

@FXML
    ComboBox<JewelleryItem> jewellbox;

@FXML
    public ComboBox<DisplayTray> traybox;

@FXML
    public ComboBox<DisplayCase> casebox;



public void addMaterial(ActionEvent actionEvent){
    String name = materialname.getText();
    String information = info.getText();
    String amount = amnt.getText();
    double quality = Double.parseDouble(qlty.getText());

    Material mt = new Material(name,information,amount,quality);


    Main.selectedJewelleryItem = jewellbox.getSelectionModel().getSelectedItem();

    if(Main.selectedJewelleryItem != null) {
    Main.selectedJewelleryItem.displayMaterial.addElement(mt);
    populateListView();}

}

    private void populateListView() {
        listview.getItems().clear();
        Main.selectedJewelleryItem.displayMaterial.addContentstoListView(listview);
    }

    public void populateComboBox(){
        jewellbox.getItems().clear();
        Main.myDisplayCases.addContentstoComboBox(casebox);

    }

    public void initialize(){
        populateComboBox();}

    public void clickDisplayCase(){
        Main.selectedDisplayCase = casebox.getSelectionModel().getSelectedItem();
        Main.selectedDisplayCase.displayTrays.addContentstoComboBox(traybox);
    }

    public void clickDisplayTray(){
    Main.selectedDisplayTray = traybox.getSelectionModel().getSelectedItem();
    Main.selectedDisplayTray.displayJewellery.addContentstoComboBox(jewellbox);
    }

    
}

