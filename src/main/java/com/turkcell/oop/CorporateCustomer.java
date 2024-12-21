package com.turkcell.oop;

public class CorporateCustomer extends Customer
{
  private String taxNo;

  public String getTaxNo() {
    return taxNo;
  }

  public void setTaxNo(String taxNo) {
    this.taxNo = taxNo;
  }

  @Override
  public void buy() {
    System.out.println("CorporateCustomer.buy");
  }
}
