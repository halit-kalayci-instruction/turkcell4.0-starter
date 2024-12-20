package com.turkcell;


import java.util.ArrayList;
import java.util.List;

public class Main {
  // Main class scope'u
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
  }
}
//a->b->c