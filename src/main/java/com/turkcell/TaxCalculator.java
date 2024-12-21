package com.turkcell;

public class TaxCalculator
{
  public static double CalculateKdv(double price) {
    return price * 0.20;
  }
  public static double CalculateKdv(double price, double rate) {
    return price * rate;
  }
}
