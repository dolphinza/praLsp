/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * author : Maulaya Shalih AL-Farisi
 */
package appdbPackage;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class konekdb {
    private static Connection koneksi;
    public static Connection SambungKoneksi(){
        if(koneksi == null){
            try{
                String url = "jdbc:mysql://localhost/dbmhs";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, pass);
            }
            catch(SQLException e){
                System.out.println(e);
            }
        }
        return koneksi;
    }
}
