/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author yash
 */
public class MysqlConnect {
    Connection con=null;
    public static Connection ConnectDb(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost/login","root","");
            JOptionPane.showMessageDialog(null,"Connect to Database");
            return con;
        }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;
    
}
       
}
}
