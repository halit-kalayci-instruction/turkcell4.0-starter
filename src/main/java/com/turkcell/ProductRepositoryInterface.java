package com.turkcell;

import java.util.List;

// Interface -> Tamamen soyut class
public interface ProductRepositoryInterface
{
  List<Product> getAll(); // Signature-İmza
  void add(Product product);
}
