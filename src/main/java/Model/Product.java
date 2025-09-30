/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Student
 */
public class Product {
    private String Name;
    private String ProductName;
    private String Category;
    private String Price;

    public Product(String Name, String Category, String Price) {
        this.Name = Name;
        this.Category = Category;
        this.Price = Price;
    }
    
    public String getName() {
        return Name;
    }

    public String getCategory() {
        return Category;
    }

    public String getPrice() {
        return Price;
    }
    
    
}
