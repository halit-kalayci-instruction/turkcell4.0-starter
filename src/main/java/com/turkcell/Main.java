package com.turkcell;


import java.util.ArrayList;
import java.util.List;

public class Main
{
  // Main class scope'u

  // entrypoint
  public static void main(String[] args)
  {
    System.out.println("Hello world!");
    System.out.println("Merhaba, Turkcell");
    // Bu bir yorum satırıdır.

    // Scope - Kapsam (Bağlam)
    // Java -> tip güvenli
    int number = 0;
    int number1 = 1; // null
    System.out.println(number);
    System.out.println(number1);

    String name = "Adem"; // string name = "";

    {
      // c scope
      System.out.println(number);
      int cScopeNumber = 50;
    }

    // System.out.println(cScopeNumber); // Compile-time error

    // Array,List
    String[] names = new String[5];
    names[0] = "Adem";
    names[1] = "Şevval";
    names[2] = "Merve";
    names[3] = "Çınar";
    names[4] = "Ramazan";

    int[] ages = { 18,20,21,25,30,35 };

    System.out.println(ages[3]);
    System.out.println(names[2]);
    //System.out.println(names);

    // Liste yapıları
    // interfaceler => newlenemez
    List<String> nameList = new ArrayList<>();
    nameList.add("Duygu");
    nameList.add("Rabia");
    System.out.println(nameList);
    // for
    // değişken tanımı; koşul; scope sonrası işlem;
    for( int i=0; i < nameList.size() ; i++ )
    {
      // Döngünün her koşul sağladığında çalıştıracağı kapsam..
      System.out.println(nameList.get(i));
    }

    for (String s : nameList) {
      // Döngünün her koşul sağladığında çalıştıracağı kapsam..
      System.out.println(s);
    }
    // while
    int i=0;
    // Infinite loop
    while(i<5) {
      System.out.println("i 5'den küçük");
      i++;
    }
    System.out.println("***************");

    int j=6;
    while(j<5) {
      System.out.println("while çalıştı");
      j++;
    }

    // do - while
    do{
      System.out.println("do-while çalıştı");
    }while(j<5);

    // Şart blokları
    int age = 18;
    if ( age <= 18  ) {
      System.out.println("Kullanıcı sisteme üye olamaz.");
    }
    else if (age == 18) {
      System.out.println("Ay ve gün sorgulanıyor..");
    }
    else {
      System.out.println("Kullanıcı sisteme üye olabilir.");
    }
    // if bloğu

    int number2 = 50;
    if(number2 > 20)
      System.out.println("Number2 20'den büyük");

    sendEmail("abc");
    sendEmail("123");
    sendEmail("456");
    sendEmail("789");
    sendEmail("email3");
    sendEmail("email4");
    sendEmail("email5");
    sendEmail("email6");

    double tax = calculateTax(200);
    System.out.println(tax);

    double tax2 = calculateTax(200,0.40);
    System.out.println(tax2);


    //sayHello(new String[]{ "Adem","Halit","Engin"});

    //sayHello(new String[]{ "Hatice","Çınar" });

    sayHello("Halit","Engin","Nafiye","Çınar","Hatice");

    // new => Bir classtan bir instance üretir.
    Product product1 = new Product(); // yeni bir ürün
    product1.setPrice(1000);
    product1.makeDiscount();

    Product product2 = new Product(
            "Laptop",
            5000,
            50);

    System.out.println(product1.getPrice()); // get

    TaxCalculator.CalculateKdv(200);
    TaxCalculator.CalculateKdv(300);
    TaxCalculator.CalculateKdv(500);
    TaxCalculator.CalculateKdv(700);

    CorporateCustomer corporateCustomer = new CorporateCustomer();
    corporateCustomer.setCustomerNo("ABC123");
    corporateCustomer.buy();

    IndiviualCustomer individualCustomer = new IndiviualCustomer();
    individualCustomer.setCustomerNo("GHJ456");
    individualCustomer.buy();

    // Inheritance - Kalıtım
    // Polymorphism - Çok biçimlilik
    // Method Overloading, Method Overriding



    ProductRepositoryInterface productRepository = new PgProductRepository();
    productRepository.add(product1); // 100 farklı noktada 100 kez çağırıldı.
    productRepository.getAll(); //  50

  }
  // 10:55
  public static void sendEmail(String email) {
    // 20.30 satır...
    System.out.println( email+ " Email gönderiliyor...");
  }

  // Method Overloading => Parametre kombinasyonlarının farklı olması.
  public static double calculateTax(double price, double taxRate) {
    return price * taxRate;
  }
  public static double calculateTax(double price){
    return price * 0.20;
  }
  /*public static void sayHello(String[] name) {
    for(int i=0; i<name.length; i++) {
      System.out.println("Hello " + name[i]);
    }
  }*/
  // varargs
  public static void sayHello(String... names) {
    for(int i=0; i<names.length; i++) {
      System.out.println("Hello " + names[i]);
    }
  }
  // built-in
}


//a->b->c