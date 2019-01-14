/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jpa.testes;

import br.com.jpa.model.bean.Categoria;
import br.com.jpa.model.dao.CategoriaDAO;

/**
 *
 * @author italo
 */
public class CategoriaTeste {
    public static void main(String[] args) {
       
        
        CategoriaDAO dao = new CategoriaDAO();
        
        
        dao.remove(3);
        
        
        
        dao.findAll().forEach((c) -> {
            System.out.println("ID: "+ c.getId() +" Descrição: "+ c.getDescricao());
        });
        
        
    }
}
