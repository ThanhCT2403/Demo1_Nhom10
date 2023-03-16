package com.tn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Program {
    public static void main(String[] args) {
        Connection connection = null;
        try{
            //create Driver to connect do mysql
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create connection with db name = "samsung", username = "root", password = "root"
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/samsung","root","root");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM account");

            while (resultSet.next()){
                int id2 = resultSet.getInt("id");
                //System.out.println(id2);
                String username = resultSet.getString("username");
                //System.out.println(username);
                String password = resultSet.getString("password");
                //System.out.println(password);
                String fullName = resultSet.getString("fullName");
                //System.out.println(fullName);
                System.out.println(id2+"\t"+username+"\t"+password+"\t"+fullName+"\t");
            }
            System.out.println("Connect Successfully!");
        }catch (Exception ex){
            System.out.println("Error:fail");
            ex.printStackTrace();
        }

    }
}
