package com.vam.persistence;

import static org.junit.Assert.fail;
import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.Test;

public class JDBCTest {
	static { 
        try { 
            Class.forName("oracle.jdbc.driver.OracleDriver"); 
        } catch(Exception e) { 
            e.printStackTrace(); 
        } 
    } 
    
    @Test 
    public void testConnection() { 
    		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    		String id = "gkdlrhfo";
    		String password = "0070";
            try(Connection con = DriverManager.getConnection( 
                url,id,password
                )){ 
            System.out.println(con); 
        } catch (Exception e) { 
            fail(e.getMessage()); 
        } 
    
    }    

}
