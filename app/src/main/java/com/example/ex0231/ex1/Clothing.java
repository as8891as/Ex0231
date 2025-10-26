package com.example.ex0231.ex1;

public class Clothing extends Product {
    private String size;

    public Clothing(String name, double price, String description, String size) {
        super(name, price, description);
        this.size = size;
    }
    @Override
    public String getDescription()
    {
        return super.getDescription()+" and the size is: "+this.size;
    }
    public String getSize() {
        return this.size;
    }
    public void setSize(String size) {
        this.size = size;
    }
}
