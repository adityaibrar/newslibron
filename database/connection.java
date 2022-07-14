/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import database.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
/**
 *
 * @author IBRAR
 */
public class connection {
    public static Connection mysqlconfig;
    static Statement mysqlstm;
    public Connection configDB() throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/newslibron";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);
            mysqlstm = mysqlconfig.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi GAGAL!\n"+e);
        }
        return mysqlconfig;
}
}
