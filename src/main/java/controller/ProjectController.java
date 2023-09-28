/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Project;
import util.ConnectionFactory;

/**
 *
 * @author giana
 */
public class ProjectController {
    public void save (Project project){
        String sql = "INSERT INTO projects (name,"
                + "description,"
                + "createdAt,"
                + "updatedAt) VALUES (?,?,?,?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
           
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar o projeto" + e.getMessage(), e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjectController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
    public void update(Project project) throws ClassNotFoundException{
        String sql = "UPDATE projects SET"      
                + "name = ?,"
                + "description = ?,"
                + "createdAt = ?,"
                + "updatedAt = ?,"
                + "WHERE id = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.setInt(5, project.getId());
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar o projeto" + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
   
    
    
    public List<Project> getAll() throws ClassNotFoundException{
        String sql = "SELECT * FROM projects WHERE projectId = ?";
        
        List<Project> listProjects = new ArrayList<>();
        
        Connection connection = null;
        //classe que recupera os dados do banco de dados
        PreparedStatement statement = null;
        ResultSet resultSet = null;  
        
        
        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                Project project = new Project();
                project.setId(resultSet.getInt("id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setCreatedAt(resultSet.getDate("createdAt"));
                project.setUpdatedAt(resultSet.getDate("updatedAt"));
                
                listProjects.add(project);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar os projeto" + e.getMessage(), e);
        } finally {
           ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
                
        return listProjects;
    }
    
    
     
    public void deleteById(int idProject) throws ClassNotFoundException{
        String sql = "DELETE FROM projects WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, idProject);
            statement.execute();
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao deletar o projeto" + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
}