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

            String path =
            "jdbc:ucanaccess://C:/Users/Amna/OneDrive/Documents/ecommerce.accdb";

            Connection con =
            DriverManager.getConnection(path);

            return con;

        } catch(SQLException e) {

            e.printStackTrace();

            return null;
        }
    }
}

