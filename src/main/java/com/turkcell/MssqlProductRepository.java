package com.turkcell;

import java.util.List;

// class -> class (extends)
// class -> interface (implements)
public class MssqlProductRepository implements ProductRepositoryInterface
{

  @Override
  public List<Product> getAll() {
    System.out.println("MssqlProductRepository.getAll");
    return List.of();
  }

  @Override
  public void add(Product product) {
    System.out.println("MssqlProductRepository.add");
  }
}
