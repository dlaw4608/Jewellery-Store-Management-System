package com.example.assignment1draft1.Models;

import com.example.assignment1draft1.ADT.LinkList;
import javafx.scene.control.ListView;

public class DisplayCase {
    private int displayCaseID = 1;
    private boolean displayCaseType = false;
    private boolean displayCaseLighting = false;
    public LinkList<DisplayTray> displayTrays = new LinkList<>();

    public LinkList<DisplayTray> getDisplayTrays() {
        return displayTrays;
    }

    public void setDisplayTrays(LinkList<DisplayTray> displayTrays) {
        this.displayTrays = displayTrays;
    }

    public DisplayCase(int displayCaseID, boolean displayCaseType, boolean displayCaseLighting) {
        this.displayCaseID = displayCaseID;
        this.displayCaseType = displayCaseType;
        this.displayCaseLighting = displayCaseLighting;
    }

    @Override
    public String toString() {
        return "DisplayCase{" +
                "displayCaseID=" + displayCaseID +
                ", displayCaseType=" + displayCaseType +
                ", displayCaseLighting=" + displayCaseLighting +
             //   ", displayTrays=" + displayTrays +
                '}';
    }



    public int getDisplayCaseID(){return displayCaseID;}

    public boolean isDisplayCaseType() {
        return displayCaseType;
    }

    public boolean isDisplayCaseLighting() {
        return displayCaseLighting;
    }

    public void setDisplayCaseNumber(int displayCaseID) {
        this.displayCaseID = displayCaseID;
    }

    public void setDisplayCaseType(boolean displayCaseType) {
        this.displayCaseType = displayCaseType;
    }

    public void setDisplayCaseLighting(boolean displayCaseLighting) {
        this.displayCaseLighting = displayCaseLighting;
    }

    public void addContentstoListView(ListView<DisplayTray> lv) {
    }



    }

