/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DB_Connection {
    public static Connection connection;

    public static Connection configuration_db() throws SQLException {
        try {
            String url_host = "jdbc:mysql://localhost/booking_db";
            String nama_user = "root";
            String password_db = ""; // kosongkan jika tidak ada password

            connection = DriverManager.getConnection(url_host, nama_user, password_db);

            System.out.println("Database successfully connected");
            //JOptionPane.showMessageDialog(null, "Selamat, terhubung");
        } catch (Exception e) {
            System.out.println("Database failed to connect");
            //JOptionPane.showMessageDialog(null, "Gagal terhubung: " + e.getMessage());
        }

        return connection;
    }

//    public static void main(String[] args) throws SQLException {
//        configuration_db();
//    }
}
