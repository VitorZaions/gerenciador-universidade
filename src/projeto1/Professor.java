/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alunos
 */
public class Professor extends Funcionario {
    
    String titulação,areapesquisa;        
    double valorhoraaula;
    int numerohorasaula;           
    
    /*
    protected boolean Setdados(){
        
         Scanner Scan = new Scanner(System.in); 

         System.out.println("Cargo Selecionado : Professor");
             
         System.out.println("Digite o nome : ");
         nome = Scan.next();
         
         while(nome == null){
           System.out.println("Nome inválido, digite novamente.");
           nome = Scan.next();
         }
         
                      
         System.out.println("Digite o endereço : ");
         endereço = Scan.next();         
         
         while(endereço == null){
           System.out.println("Endereço inválido, digite novamente.");
           endereço = Scan.next();
         }       
                              
         System.out.println("Digite o telefone : ");
         telefone = Scan.next();         
         
         while(telefone == null){
           System.out.println("Endereço inválido, digite novamente.");
           telefone = Scan.next();
         }
                     
         System.out.println("Digite o CPF : ");
         cpf = Scan.next();         
                      
        while(cpf == null || isCPF(cpf) == false){
           System.out.println("CPF inválido, digite novamente.");
           cpf= Scan.next();
         }
         
         System.out.println("Digite o CTPS : ");
         CTPS = Scan.nextInt();
         
         while(CTPS == 0){
           System.out.println("CTPS inválido, digite novamente.");
           CTPS = Scan.nextInt();
         }
         
         System.out.println("Digite o salário : ");
         salário = Scan.nextDouble();
         
         while(salário == 0){
           System.out.println("Salário inválido, digite novamente.");
          salário = Scan.nextDouble();
         }
         
         System.out.println("Digite a titulação : ");
         titulação = Scan.next();
         
         
        while(titulação == null){
           System.out.println("Titulação inválida, digite novamente.");
          titulação = Scan.next();
         }
         
         
         System.out.println("Digite a área de pesquisa : ");
         areapesquisa = Scan.next();
         
         while(areapesquisa == null){
           System.out.println("Área de pesquisa inválida, digite novamente.");
          areapesquisa = Scan.next();
         }    
         
         return true;
    }
     */
                
    @Override
     protected double calcularSalario(){               
         double calculo = numerohorasaula * valorhoraaula;         
         salário = calculo;
         return salário;
         }      
     
     
     protected void SetNumeroHorasAula(int numerohaulap){
         numerohorasaula = numerohaulap;
     }
     
     protected void SetValorHoraAula(double valorhoraulap){         
         valorhoraaula = valorhoraulap;
     }


     protected int GetNumerosHorasAula(){         
         return numerohorasaula;
     }
     
     protected double GetValorHoraAula(){
         return valorhoraaula;         
     }
    
       protected void SetNome(String nomep){
        nome = nomep;
      }
      
       protected void SetEndereço(String endereçop){
       endereço = endereçop;
      }
      
       protected void SetTelefone(String telefonep){
      telefone = telefonep;
      }
      
       protected void SetCpf(String cpfp){           
        if(cpf == null || isCPF(cpf) == false){
           System.out.println("CPF inválido, favor corrigir.");                
         }else{
            cpf = cpfp;
        }
      }
      
      protected  void SetCTPS(int ctpsp){
          CTPS = ctpsp;
      }
      
      protected  void SetSalario(double salariop){
          salário = salariop;
          
      }   
      
       protected String GetNome(){
          return nome;
      }
      
       protected String GetEndereço(){
          return endereço;
      }
      
       protected String GetTelefone(){
          return telefone;
      }
      
       protected String GetCpf(){
          return cpf;
      }
      
       protected int GetCTPS(){
          return CTPS;
      }
      
       protected double GetSalario(){
          return salário;
      }
       
          
          ////////////////////
      
      
      
    
    
       protected void Getdados(){
         System.out.println("Cargo : Professor");             
         System.out.println("Nome : " + nome);                      
         System.out.println("Endereço : " + endereço);                      
         System.out.println("Telefone : " + telefone);   
         System.out.println("CPF : " + cpf);        
         System.out.println("CTPS : " + CTPS);
         System.out.println("Salário : " + salário);         
         System.out.println("Titulação : " + titulação);         
         System.out.println("Área de pesquisa : " + areapesquisa); 
}
    
    
    
    
    
}
