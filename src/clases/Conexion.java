package clases;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    static Connection conectar = null;

    static String bd = "baselechosa";
    static String user = "postgres";
    static String pass = "c0ntr4s3n4";
    static String url = "jdbc:postgresql://ec2-3-83-116-102.compute-1.amazonaws.com/";

    public static Connection conectar() {
        try {
            conectar = DriverManager.getConnection(url + bd, user, pass);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión, contacte al adminsitrador del programa");
            System.out.println("Error " + e);
        }
        return conectar;
    }
}
