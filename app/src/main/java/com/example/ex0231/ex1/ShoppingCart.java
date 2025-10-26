package com.example.ex0231.ex1;

public class ShoppingCart {
    private Product[] productList = new Product[10];

    public ShoppingCart(Product[] productList) {
        this.productList = productList;
    }
    public Product[] getProductList() {
        return this.productList;
    }
    public void setProductList(Product[] productList) {
        this.productList = productList;
    }
    public double calculateTotal()
    {
        double sum = 0;
        for (Product product : productList)
        {
            sum += product.getPrice();
        }
        return sum;
    }
}
