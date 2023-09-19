/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.Task;
import util.ConnectionFactory;

/**
 *
 * @author giana
 */
public class TaskController {
    public void save(Task task) throws SQLException{
        String sql = "INSERT INTO tasks (idProject,"
                + "description,"
                + "completed,"
                + "deadline,"
                + "createdAt,"
                + "updatedAt) VALUES (?,?,?,?,?,?,?,?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            
        } catch(SQLException e){
            throw new SQLException("Erro ao deletar a tarefa");
           }
    }
    
    public void update(Task task){
        
    }
   
    
    public void deleteById(int taskId) throws SQLException{
        String sql = "DELETE FROM tasks WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1,taskId);
            statement.execute();            
        } catch(SQLException e){
            throw new SQLException("Erro ao deletar a tarefa");
           }
        } 
    
    public List<Task> getAll(int idProject){
        return null;
    }
    
}
    
  

