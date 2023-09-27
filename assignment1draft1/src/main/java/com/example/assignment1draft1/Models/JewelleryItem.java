package com.example.assignment1draft1.Models;

import com.example.assignment1draft1.ADT.LinkList;

public class JewelleryItem {
    public /*static*/ LinkList<Material> displayMaterial = new LinkList<>();
    public String description;
    public String jewellerytype;
    public String gender;
    public double price;

    public JewelleryItem(String description,String jewellerytype, String gender, double price) {
        this.description = description;
        this.jewellerytype = jewellerytype;
        this.gender = gender;
        this.price = price;
    }

    @Override
    public String toString() {
        return "JewelleryItem{" +
                "description='" + description + '\'' +
                ", jewellerytype='" + jewellerytype + '\'' +
                ", gender=" + gender + '\'' +
                ", price=€" + price +
                '}';
    }
}
