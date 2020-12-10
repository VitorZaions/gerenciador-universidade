/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

//Falta gravar aqui as disciplinas que o aluno faz


import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
public abstract class Aluno extends Pessoa {
    
    protected String nome,email,telefone;
    protected int code;
    protected byte status;
   
    List<Disciplina> disciplinas;    
    
    protected Curso curso;    
    

    private boolean setdadosLer(){
         Scanner Scan = new Scanner(System.in);

         System.out.println("Digite um código para identificar o aluno");
         code = Scan.nextInt();         
                  
         while(code <=0){
              System.out.println("Código inválido, digite novamente.");
               code = Scan.nextInt();
         }
                  
         System.out.println("Digite o nome do aluno:");         
         nome = Scan.next();
                  
         while(nome == null){
           System.out.println("Nome inválido, digite novamente.");
           nome = Scan.next();
         }
         
         System.out.println("Digite o email do aluno");         
         email = Scan.next();
         
         while(email == null){
                   System.out.println("Email inválido, digite novamente.");
                   email = Scan.next();
         }         
         
         System.out.println("Digite o telefone");         
         telefone = Scan.next();
                  
           while(telefone == null){
              System.out.println("Email inválido, digite novamente.");
              telefone = Scan.next();
         }         
    
         System.out.println("Digite o status da matrícula do aluno (M para matriculado, T para trancado e D para desligado. ");         
         char stats;
         stats = Scan.next().charAt(0);         
                  
         while(stats != 'M' || stats != 'T' || stats != 'D' || stats != 'm' || stats != 't' || stats != 'd'){
              System.out.println("Status da matrícula inválido, digite novamente.");
              stats = Scan.next().charAt(0);
         } 
           
         if(stats == 'M' || stats == 'm'){
             status = 1;             
         }else if(stats == 'T' || stats == 't'){             
             status = 2;                            
         }else if(stats == 'D' || stats == 'd'){             
             status = 3;         
         }   
         return true;
        
    }
    
    protected void lerdadosSeter(){
        if (setdadosLer()){
            System.out.println("Dados modificados com sucesso!");
        }        
    }
    
    protected void mostrardadosGetter(){
        getdados();        
    }
    
    ////////////////
        
    
    
   protected  String GetNome(){
         return nome;       
    }
    
    protected  String GetEmail(){
        return email;
    }
    
    protected  String GetTelefone(){
        return telefone;
    }
    
    protected  int GetCode(){
        return code;
    }    

    protected  int GetStatus(){
        return status;        
    }
    
     protected void SetNome(String nomep){
           nome = nomep;      
    }
    
     protected void SetEmail(String emailp){
           email = emailp;
    }
    
     protected void SetCode(int codep){
        code = codep;        
    }
        
     protected void SetStatus(byte statusp){
        status = statusp;
    }
     
    protected void AddDisciplina(Disciplina Disciplinap){
      disciplinas.add(Disciplinap);
    }     
    
    protected List GetDisciplina(){
      return disciplinas;
    } 

    protected void SetCurso(Curso cursop){        
        curso = cursop;                
    }
    
    protected Curso GetCurso(){        
        return curso;               
    }
        
    private void getdados(){      
         System.out.println("Código para identificação do aluno : " + code);                  
         System.out.println("Nome do aluno : " + nome);
         System.out.println("Email do aluno : " + email);  
         System.out.println("Telefone do aluno : " + telefone);     
                           
         int retval = disciplinas.size() - 1;         
         for(int i = 0 ; i <= retval ; i++){             
             System.out.println("Disciplina: " + i + " : "  + disciplinas.get(i).nome);        
         }           
         System.out.println("Curso do aluno : " + curso);         
    } 
}
