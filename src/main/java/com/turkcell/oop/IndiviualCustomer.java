package com.turkcell.oop;

public class IndiviualCustomer extends Customer
{
  private String identityNo;

  public String getIdentityNo() {
    return identityNo;
  }

  public void setIdentityNo(String identityNo) {
    this.identityNo = identityNo;
  }

  // Override

  @Override // annotation
  public void buy() {
    // super? => classın extend ettiği classı (Customer)
    // this => classın kendisi (IndiviualCustomer)
    //super.buy();

    System.out.println("IndiviualCustomer.buy");
  }
}
