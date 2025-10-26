package com.example.ex0231.ex1;

public class Product {
    private String name;
    private double price;
    private String description;

    public Product(String name, double price, String description)
    {
        this.name = name;
        this.price = price;
        this.description = description;
    }
    public String getName()
    {
        return this.name;
    }
    public double getPrice()
    {
        return this.price;
    }
    public String getDescription()
    {
        return this.description;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

}
