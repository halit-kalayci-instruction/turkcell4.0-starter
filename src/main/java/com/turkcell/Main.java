package com.turkcell;

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

    // List,Array
  }
}
//a->b->c