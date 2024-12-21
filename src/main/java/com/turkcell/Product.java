package com.turkcell;

public class Product {
  public Product(String name, double price, int stock) {
    this.name = name;
    this.price = price;
    this.stock = stock;
  }
  public Product() {}

  private double price;
  private String name;
  private int stock;

  // public methods
  // getter-setter methods
  // salt-okunur salt-yazılır
  // read-only write-only
  // kontrollü erişim
  // Kapsülleme - Encapsulation
  public double getPrice()
  {
    return this.price;
  }
  public void setPrice(double price)
  {
    if(price < 0)
      price = 0;
    this.price = price;
  }

  public static void makeDiscount() {
    System.out.println("İndirim yapılıyor..");
  }

  // OOP Concepts
  // Encapsulation
  // Inheritance
  // Polymorphism
  // Interface
  // Abstract Class
  // -----
  // Package yapısı
  // Dış paketler
}
