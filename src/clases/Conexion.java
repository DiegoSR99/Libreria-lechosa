/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Conexion {

    public static Connection conectar() {
        try {
            Connection conectar = DriverManager.getConnection("jdbc:postgresql://ec2-3-83-116-102.compute-1.amazonaws.com/baselechosa", "postgres", "c0ntr4s3n4");
            return conectar;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión, contacte al adminsitrador del programa");
            System.out.println("Error " + e);
        }
        return (null);
    }
}
