package airlinebookingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {
    Connection conn = null;
    void connect() throws SQLException
    {
        
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String username = "system";
            String password = "happytohelp";
            try
            {
            conn = DriverManager.getConnection(url,username,password);
                System.out.println("Connection SuccessFull!");
            }
            catch(SQLException e) {
                System.out.println("Connection Not Successfull");
            }
        }
        catch(ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
