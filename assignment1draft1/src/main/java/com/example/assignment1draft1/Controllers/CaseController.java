package com.example.assignment1draft1.Controllers;

import com.example.assignment1draft1.Models.DisplayCase;
import com.example.assignment1draft1.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;

import java.io.IOException;

public class CaseController {

    @FXML
    public CheckBox lighttype;
    @FXML
    TextField txtid, dlindex;
    @FXML
    public ChoiceBox<String> walltype;
    @FXML
    public ListView<DisplayCase> listview;


    public void addDisplayCase(ActionEvent actionEvent) {
        int id = Integer.parseInt(txtid.getText());
        boolean lighting = lighttype.isSelected();
        boolean type = false;
        if (walltype.getValue().equals("Wall-Mounted"))
            type = true;



        DisplayCase dc = new DisplayCase(id, type, lighting);
        Main.myDisplayCases.addElement(dc);
        System.out.println(Main.myDisplayCases.gethead());
        populateListView();

    }

    public void gotoaddDisplayTray(ActionEvent actionEvent) {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("trayview.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 640, 480);
            Main.casetotraystage.setTitle("Add display tray");
            Main.casetotraystage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public void initialize() {
        walltype.getItems().addAll("Wall-Mounted", "Freestanding");



    }

    public void deleteAllCases() {
        Main.myDisplayCases.deleteWholeList();
    }

    public void populateListView() {
        listview.getItems().clear();
        Main.myDisplayCases.addContentstoListView(listview);

    }



    public void resetCase() {
        listview.getItems().clear();
        deleteAllCases();



    }




}

