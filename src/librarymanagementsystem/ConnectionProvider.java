/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class ConnectionProvider {
    
    Connection conn = null;
    
    public static Connection getConnDB(){
        try {
            Class.forName("org.sqlite.JDBC");
            
            Connection conn = DriverManager.getConnection("jdbc:sqlite:libraryDB.db");
            return conn;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
