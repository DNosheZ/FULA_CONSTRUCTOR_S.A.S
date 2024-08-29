/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fula_constructor_s.a.s;

import java.util.HashMap;
import java.util.Map;
import java.io.*;

/**
 *
 * @author Windows
 */
public final class User {
    String userId;
    String userPassword;
    public Map<String, String> registros = new HashMap<>();
    

    public User(String userId, String userPassword) {
        this.userId = userId;
        this.userPassword = userPassword;
    }

    public User() {
    }
    
    public void registrar(){
        Map<String, String> registros = new HashMap<>();

        String fileName = "users.txt";
        
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            
            while((line = br.readLine()) != null){
                String[] parts = line.split(";");
                registros.put(parts[0], parts[1]);
            }
        }catch(IOException e){
            
        }
        
        this.setRegistros(registros);
        
    }

    public Map<String, String> getRegistros() {
        registrar();
        return registros;
    }

    public void setRegistros(Map<String, String> registros) {
        
        this.registros = registros;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    
    
}
