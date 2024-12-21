package com.turkcell;

public class Product {
  public Product(String name, double price, int stock) {
    this.setName(name);
    this.setPrice(price);
    this.setStock(stock);
  }
  public Product() {}

  private double price;
  private String name;
  private int stock;

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    if(price < 0)
      price = 0;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public static void makeDiscount() {
    System.out.println("İndirim yapılıyor..");
  }

  // OOP Concepts
  // Encapsulation -
  // Inheritance -
  // Polymorphism -
  // Interface
  // Abstract Class
  // -----
  // Package yapısı
  // Dış paketler
}
