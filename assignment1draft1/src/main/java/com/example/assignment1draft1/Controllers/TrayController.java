package com.example.assignment1draft1.Controllers;

import com.example.assignment1draft1.Main;
import com.example.assignment1draft1.Models.DisplayCase;
import com.example.assignment1draft1.Models.DisplayTray;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class TrayController {

    @FXML
    public ColorPicker colorPicker;

    @FXML
    TextField textField;

    @FXML
    TextField dim;

    @FXML
    public ListView<DisplayTray> lv;

    @FXML
    public ComboBox<DisplayCase> combobox;


    public void addDisplayTray(ActionEvent actionEvent) {
        String id = textField.getText();
        String cp = String.valueOf(colorPicker.getValue());
        double dimen = Double.parseDouble(dim.getText());

        DisplayTray dt = new DisplayTray(id, cp, dimen);
        Main.selectedDisplayCase = combobox.getSelectionModel().getSelectedItem();
        if (Main.selectedDisplayCase != null) {
            Main.selectedDisplayCase.displayTrays.addElement(dt);




            System.out.println(Main.selectedDisplayCase.displayTrays.gethead());
            populateListView();
        }
    }

    public void gotoaddItem() {
        Main.selectedDisplayTray = lv.getSelectionModel().getSelectedItem();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("itemview.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 640, 480);
            Main.traytoitemstage.setTitle("Add Jewellery item");
            Main.traytoitemstage.setScene(scene);
        } catch (IOException d) {
            d.printStackTrace();
        }
    }


    public void populateListView() {
        lv.getItems().clear();
        Main.selectedDisplayCase.displayTrays.addContentstoListView(lv);
    }

    public void populateComboBox() {
        combobox.getItems().clear();
        Main.myDisplayCases.addContentstoComboBox(combobox);
    }
    public void resetTray(){
        lv.getItems().clear();

    }

    public void initialize() {
        populateComboBox();
    }

}
