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
    private String name;
    private String description;
    private Boolean completed;
    private String notes;   
    private Date deadline;
    private Date createdAt;
    private Date updatedAt;
    
    public Task(Integer id, Integer idProjects, String name, String description, Boolean completed, String notes, Date deadline, Date createdAt, Date updatedAt) {
        this.id = id;
        this.idProjects = idProjects;
        this.name = name;
        this.description = description;
        this.completed = completed;
        this.notes = notes;
        this.deadline = deadline;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    public Task(){
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdProjects() {
        return idProjects;
    }

    public void setIdProjects(Integer idProjects) {
        this.idProjects = idProjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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
        return "Task{" + "id=" + id + ", idProjects=" + idProjects + ", name=" + name + ", description=" + description + ", completed=" + completed + ", notes=" + notes + ", deadline=" + deadline + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
    }    
    
}
