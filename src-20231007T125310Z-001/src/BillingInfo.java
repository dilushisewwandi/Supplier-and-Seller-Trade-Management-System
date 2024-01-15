
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class BillingInfo {
    
  Supplier supplier;
  ArrayList<Products>products; 
  String date;
  float totalcost;

    public BillingInfo() {
        this.supplier = null;
        this.products = new ArrayList<>();
        this.date = "";
        this.totalcost = 0;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public ArrayList<Products> getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products.add(products);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(float totalcost) {
        this.totalcost = totalcost;
    }
  
  
}
