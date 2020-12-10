/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto1;

//Falta gravar as disciplinas do curso aqui (???)

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author Computador
 */
public abstract class Curso {
    protected int code,duração;
    protected String nome;
    
    List<Disciplina> disciplinas;     

     
    //Mapa Disciplinas    
   // Map<String,Disciplina> example = new HashMap<String,Disciplina>();
        
    private boolean setdadosSet(){   
        
         Scanner Scan = new Scanner(System.in);  
        
         System.out.println("Digite o código da disciplina");
         code = Scan.nextInt();
         
         while(code <= 0){
            System.out.println("Código inválido, digite novamente.");
            code = Scan.nextInt();
        }             
         
         System.out.println("Digite o nome do curso");
         nome = Scan.next();
        
            while(nome == null){
            System.out.println("Nome inválido, digite novamente.");
            nome = Scan.next();
        }        
         System.out.println("Digite em anos a duração do curso");
         duração = Scan.nextInt();
         
        if(duração == 0){
            System.out.println("Duração inválida, digite novamente.");
            duração = Scan.nextInt();        
        }     
        
        return true;
    }
    
   protected void mostrardados(){
       getdados();
   }
   
   protected void lerdadosLer(){
   if (setdadosSet()){
            System.out.println("Dados modificados com sucesso!");
        }        
   }
   
   ////////////////////////////////////
   
    protected int getCode(){
       return code;
   }
   
    protected int getDuração(){
       return duração;
   }
   
   
    protected String GetNome(){
       return nome;
   }
   
   
    protected void SetCode(int codep){
       code = codep;
   }
   
    protected void SetDuração( int dura){
       duração = dura;
   }
   
    protected void SetNome(String nomep){
       nome = nomep;
   }
   
    
    protected void AddDisciplina(Disciplina Disciplinap){
      disciplinas.add(Disciplinap);
    }     
    
    protected List GetDisciplina(){
      return disciplinas;
    }     
    
   ////////////////////////
   
    
    protected abstract void getdados();
    
}
