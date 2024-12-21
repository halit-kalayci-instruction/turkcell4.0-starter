package com.turkcell;

public class Customer {
  private String customerNo;

  public String getCustomerNo() {
    return customerNo;
  }

  public void setCustomerNo(String customerNo) {
    this.customerNo = customerNo;
  }

  public void buy()
  {
    System.out.println("Customer buy methodu.");
  }
}
