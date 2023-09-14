/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.DriverManager;

/**
 *
 * @author Acer
 */
public class ConnectionFactory {
    
//INDICAÇAO QUAL BANCO DE DADO NO CASO mysql
    public static final String DRIVER = "com.mysql.jdbc.driver";
    
//URL CAMINHO DO BANCO DADOS NO CASO SERVIDOR INDICA IP
    public static final String URL = "jdbc:mysql://localhost:3306/todoApp";
    
//USUARIO E SENHA SEGURANÇA
    public static final String USER = "root";
    public static final String PASS = ""; 
    
    //static = não precisa objto para chamar este metodo
    //vai devolver uma conexao
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            throw new RuntimeException("Erro na conexão com o banco de dados", ex);
        }
    }
}
