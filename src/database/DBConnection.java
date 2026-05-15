/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() {
    try {
        // Manually load the driver now that JARs are fixed
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        
        // Use the absolute path to your file
        String url = "jdbc:ucanaccess://D:/Documents/NetBeansProjects/E-Commerce/src/Ecommerce.accdb";
        
        Connection conn = DriverManager.getConnection(url);
        System.out.println("Connection Success!");
        return conn;
    } catch (ClassNotFoundException | SQLException e) {
        System.out.println("Error: " + e.getMessage());
        return null;
    }
}
}

