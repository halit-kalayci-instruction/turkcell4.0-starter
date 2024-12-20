package com.turkcell;

// [erişim_belirteci] class [isim]

// kalıp
public class Product {
  // constructor - yapıcı blok
  // eğer manual bir ctor tanımı yoksa, boş(parametresiz) ctor
  // ide tarafından oto. oluşturulur.

  // all args
  // no args
  // required args -> SONRA
  public Product(String name, double price, int stock) {
    this.name = name;
    this.price = price;
    this.stock = stock;
  }
  public Product() {}

  public double price; // Özellikler-Property
  public String name;
  public int stock;

  // Methods
  public static void makeDiscount() {
    System.out.println("İndirim yapılıyor..");
  }

  // OOP Concepts
  // Inheritance
  // Encapsulation
  // Polymorphism
  // Interface-Abstract Class
  // -----
  // Package yapısı
  // Dış paketler
}
