package com.example.assignment1draft1.Models;

public class Material {
    public String name;
    public String information;
    public String amount;
    public double quality;

    public Material(String name, String information,String amount, double quality){
        this.name = name;
        this.information = information;
        this.amount = amount;
        this.quality = quality;

    }

    @Override
    public String toString() {
        return "Material{" +
                "name='" + name + '\'' +
                ", information='" + information + '\'' +
                ", amount='" + amount + '\'' +
                ", quality=" + quality +
                '}';
    }
}
