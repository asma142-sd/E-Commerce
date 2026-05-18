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

            Class.forName(
            "net.ucanaccess.jdbc.UcanaccessDriver");

            String url =
            "jdbc:ucanaccess://C:/Users/5440/OneDrive/Documents/Ecommerce.accdb";

            Connection con =
            DriverManager.getConnection(url);

            System.out.println(
            "Database Connected");

            return con;

        } catch(ClassNotFoundException | SQLException e) {

            System.out.println(e);

            return null;
        }
    
}
}

