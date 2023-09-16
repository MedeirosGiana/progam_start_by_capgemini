/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author giana
 */
public class Task {
    private Integer id;
    private Integer idProjects;
    private String description;
    private String notes;
    private Boolean completed;
    private Date deadline;
    private Date createdAt;
    private Date updatedAt;
    
    public Task(){
    }

    public Task(Integer id, Integer idprojects, String description,String notes, Boolean completed, Date deadline, Date createdAt, Date updatedAt) {
        this.id = id;
        this.idprojects = idprojects;
        this.description = description;
        this.notes = notes;
        this.completed = completed;
        this.deadline = deadline;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdprojects() {
        return idprojects;
    }

    public void setIdprojects(Integer idprojects) {
        this.idprojects = idprojects;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", idprojects=" + idprojects + ", description=" + description + ", notes=" + notes + ", completed=" + completed + ", deadline=" + deadline + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
    }
    
    
}
