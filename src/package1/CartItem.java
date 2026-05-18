/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;

/**
 *
 * @author 5440
 */
public class CartItem {
    String name;
    double price;
    int quantity;

    public CartItem(
    String name,
    double price,
    int quantity) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {

        return price * quantity;
    }
    
}
