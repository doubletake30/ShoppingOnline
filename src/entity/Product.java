/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Product implements Serializable, Comparable {

    private static final long serialVersionUID = 7247210392003788145L;
    private String productID;
    private String productName;
    private int quantity;
    private double price;
    private int soldQuantity;
    private List<Integer> allRating = new ArrayList<>();
    private double rating;
    private User user = null;
    private ShopOwner shopowner = null;

    public Product() {
    }

    public Product(String productID, String productName, int quantity, double price, int soldQuantity, double rating, ShopOwner shopowner) {
        this.productID = productID;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.soldQuantity = soldQuantity;
        this.rating = rating;
        this.shopowner = shopowner;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    public User getUser() {
        return this.user;
    }

    public ShopOwner getShopowner() {
        return this.shopowner;
    }

    public void setShopowner(ShopOwner shopowner) {
        this.shopowner = shopowner;
    }

    public List<Integer> getAllRating() {
        return allRating;
    }

    public void setAllRating(int rating) {
        this.allRating.add(rating);
    }

    
    
    @Override
    public String toString() {
        return String.format("|%6s|%-22s|%-10d|%-7.1f|%-15d|%-6.1f|",
                this.productID, this.productName, this.quantity,
                this.price, this.soldQuantity, this.rating);
    }

   @Override
    public int compareTo(Object o) {
    Product toComaprePrd = (Product) o;
    if (this.soldQuantity == toComaprePrd.soldQuantity) {
        return 0;
    } else if (this.soldQuantity > toComaprePrd.soldQuantity) {
        return 1;
    } else {
        return -1;
    }
}


    public static Comparator<Product> compareByRatingStar = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            // Reverse the comparison by switching the order of o1 and o2
            if (o1.rating == o2.rating) {
                return 0;
            } else if (o1.rating > o2.rating) {
                return -1; // Return -1 instead of 1 to sort in descending order
            } else {
                return 1; // Return 1 instead of -1 to sort in descending order
            }
        }
    };

}
