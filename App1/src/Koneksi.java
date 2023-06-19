/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ACER
 */
public class Koneksi {
    private static Connection Koneksi;
    
    public static Connection getKoneksi(){
        if (Koneksi == null ){
            try{
                String url = "jdbc;mysql://localhost:3306/ayyshop";
                String user = "root";
                String password = "";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Koneksi = DriverManager.getConnection(url,user,password);
                System.out.println("Berhasil");
            }catch (Exception e){
                System.out.println("ERROR");
            }
        }
        return Koneksi;
    }
    
        public static void main(String args[]){
            getKoneksi();
        }
}
