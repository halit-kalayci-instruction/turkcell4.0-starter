package com.turkcell.oop;

public class TaxCalculator
{
  public static double CalculateKdv(double price) {
    return price * 0.20;
  }
  public static double CalculateKdv(double price, double rate) {
    return price * rate;
  }
}
