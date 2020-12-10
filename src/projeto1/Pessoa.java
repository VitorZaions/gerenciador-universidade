/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

/**
 *
 * @author Alunos
 */
public abstract class Pessoa {    
    protected String nome,telefone;    
    
     protected void SetNome(String nomep){
        nome = nomep;
      }
         
      protected void SetTelefone(String telefonep){
      telefone = telefonep;
      }      
      
     protected String GetNome(){
          return nome;
      }
     
     protected String GetTelefone(){
          return telefone;
      }
    
    
}
