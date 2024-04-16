/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cityfeatures;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author thoma
 */
public class DBConnect {
    
    public Connection OpenConnection() throws SQLException, ClassNotFoundException {
        // Load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Create connection
        java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/city_features","root","devry123");
        
        return connection;
    }
    
}
