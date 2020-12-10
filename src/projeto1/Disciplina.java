/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

//Falta colocar qual é o professor da disciplina e em qual curso é essa disciplina (???) ****Feito

import java.util.List;
//import java.util.ArrayList;
import java.util.Scanner;

public class Disciplina {
    protected String nome;
    private int code,carga;
    
    
    List<Curso> cursodisciplina;
    //List<Curso> cursodisciplina = new ArrayList<Curso>(); 
    
    
    Funcionario professor;
           
      private boolean setdados(){         
         Scanner Scan = new Scanner(System.in);         
      
         System.out.println("Digite um código para identificar a disciplina");
         code = Scan.nextInt();        
         
        while(code <= 0){
                System.out.println("Código inválido, digite novamente.");
                code = Scan.nextInt();     
         }    
      
         System.out.println("Digite o nome da disciplina:");         
         nome = Scan.next();
         
         while(nome == null){
                System.out.println("Nome inválido, digite novamente.");
                nome = Scan.next();
         }   
                
         System.out.println("Digite a carga horária da disciplina");         
         carga = Scan.nextInt();
         
         while(carga <= 0){
              System.out.println("Carga horária da inválida, digite novamente.");
              carga = Scan.nextInt();
         }         
         
             return true;
    }

    protected void lerdados(){
        if (setdados()){
            System.out.println("Dados modificados com sucesso!");
        }        
    }  
    
    protected void mostrardados(){
        getdados();
    }
     
    
     protected void SetNome(String nomep){
        nome = nomep;
    }
    
     protected void SetCode(int codep){
        code = codep;
    }
    
     protected void SetCarga(int cargap){
        carga = cargap;
    }
    
         
    protected void SetCurso(Curso course){
       cursodisciplina.add(course);
    }
    
        
    protected void SetProfessor(Funcionario teacher){
        professor = teacher;
    }           
    
     protected String GetNome(){
        return nome;
    }
    
    protected  int GetCode(){
        return code;
    }
    
    protected  int SetCarga(){
        return carga;
    }
            
    protected List GetCurso(){
        return cursodisciplina;
    }
    
    protected Funcionario GetProfessor(){
        return professor;
    }
    
    private void getdados(){
        System.out.println("Código da disciplina : " + code);
        System.out.println("Nome da disciplina: " + nome);
        System.out.println("Carga horária da disciplina: " +carga);
    }
    
}
