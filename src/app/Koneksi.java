/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author asus
 */
public class Koneksi {
    public static Connection Go(){
        try {
            MysqlDataSource m = new MysqlDataSource();
            m.setServerName("localhost");
            m.setDatabaseName("db_kasir"); 
            m.setUser("root"); 
            m.setPassword(""); 
            m.setPortNumber(3306); 
            m.setServerTimezone("Asia/Jakarta");
            Connection c = m.getConnection();
            //System.out.println("Sukses terhubung");
            return c;
        } catch (Exception e) {
            System.err.println("GAGAL terhubung\n"+e.getMessage());
        }
        
        return null;
    }
}