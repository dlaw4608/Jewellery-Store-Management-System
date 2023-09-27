package com.example.assignment1draft1.Models;

import com.example.assignment1draft1.ADT.LinkList;

public class DisplayTray {
    public LinkList<JewelleryItem> displayJewellery = new LinkList<>();
    public String identifier ;
    public String materialColor ;
    public double dimensions ;

    public DisplayTray(String identifier,String materialColor,double dimensions) {
        this.identifier = identifier;
        this.materialColor = materialColor;
        this.dimensions = dimensions;

    }

    public LinkList<JewelleryItem> getDisplayJewellery() {
        return displayJewellery;
    }

    public void setDisplayJewellery(LinkList<JewelleryItem> displayJewellery) {
        this.displayJewellery = displayJewellery;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "DisplayTray{" +
                //"displayJewellery=" + displayJewellery +
                " TrayID='" + identifier + '\'' +
                ", materialColor='" + materialColor + '\'' +
                ", dimensions=" + dimensions +
                '}';
    }
}
