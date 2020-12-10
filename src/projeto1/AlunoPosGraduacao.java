package projeto1;


import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class AlunoPosGraduacao extends Aluno {
    
     private String graduacao,instGraduacao;
     private int anoinicio,anofim;
    
    
    /*
    private boolean setdados(){
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
           
           System.out.println("Digite a graduação do aluno:");         
         graduacao = Scan.next();
                  
           while(graduacao == null){
              System.out.println("Graduação inválida, digite novamente.");
              graduacao = Scan.next();
         }    
           System.out.println("Digite a instituição da graduação:");         
         instGraduacao = Scan.next();
                  
           while(instGraduacao == null){
              System.out.println("Instituição inválida, digite novamente.");
              instGraduacao = Scan.next();
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
        
    } */
    
  /*  protected void lerdados(){
        if (setdados()){
            System.out.println("Dados modificados com sucesso!");
        }        
    } 
    
     
    protected void mostrardados(){
        getdados();        
    } */
    
    protected  String GetGraducao(){
        return graduacao;
    }
                
   protected String GetInstGrauacao(){
        return instGraduacao;
    }

    protected  int GetAnoInicio(){
        return anoinicio;
    }
                
    protected int GetAnoFim(){
        return anofim;
    }   

    protected void SetGraduation(String graduacaop){
        graduacao = graduacaop;
    }
   
    protected void InstGraduacao(String graduacaInstop){
        instGraduacao = graduacaInstop;
    } 
            
    protected void SetAnoInicio(int anop){
        anoinicio = anop;
    }
   
    protected void SetAnoFim(int anofimp){
        anofim = anofimp;
    } 
    
    //////////////////////////
    
    
    private void getdados(){      
         System.out.println("Código para identificação do aluno : " + code);                  
         System.out.println("Nome do aluno : " + nome);
         System.out.println("Email do aluno : " + email);  
         System.out.println("Telefone do aluno : " + telefone);     
         System.out.println("Ano Início : " + anoinicio);   
         System.out.println("Ano Fim : " + anofim);   
    } 
}


