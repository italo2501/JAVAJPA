/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jpa.testes;

import br.com.jpa.model.bean.Categoria;
import br.com.jpa.model.bean.Produto;
import br.com.jpa.model.dao.ProdutoDAO;

/**
 *
 * @author italo
 */
public class ProdutoTeste {
    
    public static void main(String[] args) {
        
        ProdutoDAO dao  = new ProdutoDAO();
        
        
        dao.remove(2);
       
     }
    
    

}
