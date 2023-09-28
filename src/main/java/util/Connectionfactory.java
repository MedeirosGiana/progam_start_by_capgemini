/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author giana
 */
public class ConnectionFactory {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver"; 
    public static final String URL = "jdbc:mysql://localhost:3306/todo_app";
    public static final String USER = "root";
    public static final String PASSWORD = "Root";
    
    public static java.sql.Connection getConnection() throws ClassNotFoundException{
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException ex) {
            throw new RuntimeException("Erro na conexão com o banco de dados", ex);
        }
    } 
    
    public static void closeConnection(Connection connection){
        try{
            if(connection != null){
                connection.close();
            }
        }  catch(SQLException e) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", e);
        }      
    }
    
    public static void closeConnection(Connection connection, PreparedStatement statement){
        try{
            if(connection != null){
                connection.close();
            }
            
            if(statement != null){
                statement.close();
            }
            
        }  catch(SQLException e) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", e);
        }      
    }
    
    public static void closeConnection(Connection connection, 
            PreparedStatement statement, ResultSet resultSet ){
        try{
            if(connection != null){
                connection.close();
            }
            
            if(statement != null){
                statement.close();
            }
            
            if(resultSet != null){
                resultSet.close();
            }
            
        }  catch(SQLException e) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", e);
        }      
    }
}
