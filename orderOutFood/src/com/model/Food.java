package com.model;

public class Food {
     String itemId;
     String itemName;
     float itemprice;
     public Food(String itemId,String itemName,int itemprice){
         this.itemId = itemId;
         this.itemName = itemName;
         this.itemprice = itemprice;
     }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public float getItemprice() {
        return itemprice;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemprice(float itemprice) {
        this.itemprice = itemprice;
    }
}
