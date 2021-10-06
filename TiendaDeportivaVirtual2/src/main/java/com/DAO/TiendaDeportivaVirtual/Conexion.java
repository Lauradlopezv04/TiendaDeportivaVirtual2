package com.DAO.TiendaDeportivaVirtual;
import java.sql.Connection;


import java.sql.DriverManager;
public class Conexion {
    protected Connection Conexion;
    
    protected void Conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
<<<<<<< HEAD
            //Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tienda145?useSSL=false&serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8", "root", "root");
            
=======
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda145?useSSL=false&serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8", "root", "root");
>>>>>>> cd878015ce1a3d944d8e27e7b634a645f4e1e8f4
            System.out.println("Conexión a base de datos OK\n");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
    }
    
    protected void Desconectar() {
        try {
            Conexion.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
