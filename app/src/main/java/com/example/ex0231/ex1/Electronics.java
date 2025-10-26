package com.example.ex0231.ex1;

public class Electronics extends Product {
    private String brand;

    public Electronics(String name, double price, String description, String company) {
        super(name, price, description);
        this.brand = company;
    }
    @Override
    public String getDescription()
    {
        return super.getDescription()+" and the brand is: "+this.brand;
    }
    public String getCompany() {
        return this.brand;
    }
    public void setCompany(String company) {
        this.brand = company;
    }
}
