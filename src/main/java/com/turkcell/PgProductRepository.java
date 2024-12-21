package com.turkcell;

import java.util.List;


public class PgProductRepository extends ProductRepositoryInterface
{

  @Override
  public List<Product> getAll() {
    System.out.println("PgProductRepository.getAll");
    return List.of();
  }

  @Override
  public void add(Product product) {
    System.out.println("PgProductRepository.add");
  }
}
