/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jpa.conection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author italo
 */
public class ConnectionFactory {
    
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");
    
    
    public EntityManager getConnection(){
        
        return emf.createEntityManager();
    }
    
    
}
