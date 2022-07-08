/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author dtgroup.id
 */
public class koneksi {
    Connection connect;
    Statement stm;
    
    public void konek(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/percetakan", "root", "");
            stm = connect.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi database gagal "+e.getMessage());
        }
    }
       
}
