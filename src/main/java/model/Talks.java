/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Acer
 */
public class Talks {
    //CRIACAO DE ATRIBUTOS PARA BANCO DADOS
    private int id;
    private int idProject;
    private String name;
    private String descrition;
    private String notes;
    private boolean isCompleted;
    private Date deadline;
    private Date createdAt;
    private Date updDateAt;

    //METODO CONSTRUTOR
    public Talks(int id, int idProject, String name, String descrition, String notes, boolean isCompleted, Date deadline, Date createdAt, Date updDateAt) {
        this.id = id;
        this.idProject = idProject;
        this.name = name;
        this.descrition = descrition;
        this.notes = notes;
        this.isCompleted = isCompleted;
        this.deadline = deadline;
        this.createdAt = createdAt;
        this.updDateAt = updDateAt;
    }

    //METODOS ACESSORES AOS ATRIBUTOS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
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

    public Date getUpdDateAt() {
        return updDateAt;
    }

    public void setUpdDateAt(Date updDateAt) {
        this.updDateAt = updDateAt;
    }
 
   //RETORNA UMA STRING + ATRIBUTOS E VALORES

    @Override
    public String toString() {
        return "Talks{" + "id=" + id + ", idProject=" + idProject + ", name=" + name + ", descrition=" + descrition + ", notes=" + notes + ", isCompleted=" + isCompleted + ", deadline=" + deadline + ", createdAt=" + createdAt + ", updDateAt=" + updDateAt + '}';
    }
    
}