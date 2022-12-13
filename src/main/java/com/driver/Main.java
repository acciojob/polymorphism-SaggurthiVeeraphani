package com.driver;

public class Main {
public static class Product{

    public int Product(int x,int y){
        return x*y;

    }
    public int Product(int x,int y,int z){
        return x*y*z;
    }
    public double Product(double x,double y){
        return x*y;
    }
}

    public static void main(String[] args) {
    Product p = new Product();
    p.Product(6,8);
    p.Product(8,9,10);
    p.Product(8.5,9.75);
    }
}