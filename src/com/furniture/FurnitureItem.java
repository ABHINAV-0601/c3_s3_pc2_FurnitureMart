package com.furniture;

public class FurnitureItem {
    private int furnitureCode;
    private  String furnitureType;
    private String gradeOfFurniture;
    private String furnitureUsage;
    private double price;
    final static int DISCOUNT = 5;

    FurnitureItem(){
        furnitureCode = 0;
        furnitureType = null;
        gradeOfFurniture = null;
        furnitureUsage = null;
        price = 0.0;
    }
}
