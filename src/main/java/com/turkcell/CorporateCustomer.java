package com.turkcell;

public class CorporateCustomer extends Customer
{
  private String taxNo;

  public String getTaxNo() {
    return taxNo;
  }

  public void setTaxNo(String taxNo) {
    this.taxNo = taxNo;
  }
}
