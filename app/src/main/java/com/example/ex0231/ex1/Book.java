package com.example.ex0231.ex1;

public class Book extends Product {
    private String author;

    public Book(String name, double price, String description, String author)
    {
        super(name,price,description);
        this.author = author;
    }
    @Override
    public String getDescription()
    {
        return super.getDescription()+" and the author is: "+this.author;
    }
    public String getAuthor()
    {
        return this.author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }

}
