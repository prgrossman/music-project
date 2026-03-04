package com.prgrossman.music.domain.product;

public abstract class Product {
    private final int productID;
    private double basePrice;

    protected Product(int productId, double basePrice) {
        if(productId <0){
            throw new IllegalArgumentException("Product ID Cannot be negative");
        }
        if(basePrice <0){
            throw new IllegalArgumentException("Base Price cannot be negative");
        }
        this.productID=productId;
        this.basePrice=basePrice;
    }

    public int getProductID(){
        return productID;
    }

    public double getBasePrice(){
        return basePrice;
    }

    public abstract ProductType getProductType();


}
