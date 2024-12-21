package com.turkcell.oop;

import java.util.List;

// Interface -> Tamamen soyut class
public abstract class ProductRepositoryInterface
{
 abstract List<Product> getAll(); // Signature-İmza
 abstract void add(Product product);

 void addAndLog(Product product) {
    add(product);
    System.out.println("Loglama yapıldı");
 }
}
