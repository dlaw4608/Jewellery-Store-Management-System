package com.example.assignment1draft1;

import com.example.assignment1draft1.ADT.LinkList;
import com.example.assignment1draft1.Models.DisplayCase;
import com.example.assignment1draft1.Models.DisplayTray;
import com.example.assignment1draft1.Models.JewelleryItem;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static LinkList<DisplayCase> myDisplayCases = new LinkList<>();
    public static DisplayCase selectedDisplayCase = null;
    public static DisplayTray selectedDisplayTray;
    public static JewelleryItem selectedJewelleryItem;
    public static Stage casetotraystage;
    public static Stage traytoitemstage;
    public static Stage itemtomaterialstage;
    public static Stage caseToViewStockStage;
    public static Stage viewtomaterialstage;



    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        stage.setTitle("Jewellery Management");
        stage.setScene(scene);
        casetotraystage = stage;
        traytoitemstage = stage;
        itemtomaterialstage = stage;
        viewtomaterialstage = stage;
        stage.show();


    }



    public static void main(String[] args) {
        launch();
    }
}



