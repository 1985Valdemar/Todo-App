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
public class Project {
    //CRIAÇÃO ATRIBUTOS DO BANCO DADOS
    private int id;
    private String name;
    private String descrition;
    private Date createAt;
    private Date updateAt;

    //metodo construtor
    public Project(int id, String name, String descrition, Date createAt, Date updateAt) {
        this.id = id;
        this.name = name;
        this.descrition = descrition;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }
    //METODO PERMITE ACESSAR OS ATRIBUTOS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
    
    //CLASSE QUE REPRESENTA O PROJETO
    @Override
    public String toString() {
        return "Project{" + "id=" + id + ", name=" + name + ", descrition=" + descrition + ", createAt=" + createAt + ", updateAt=" + updateAt + '}';
    }
}