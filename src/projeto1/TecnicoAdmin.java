/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

import java.util.Scanner;

/**
 *
 * @author Alunos
 */
public class TecnicoAdmin extends Funcionario{
    
    
    private double salarioBase,valorHoraExtra;
    private int quantidadehoraextra;
    
    /*
    protected boolean Setdados(){
        
         Scanner Scan = new Scanner(System.in);   
         
         //Técnico Administrativo
             
         System.out.println("Cargo Selecionado : Técnico Administrativo");             
                         
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
         
        while(cpf == null){
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
         
         return true;
    }
      */
    

    
    
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
       
       
       protected void SetSalarioBase(double salariobasep){
           salarioBase = salariobasep;
       }
       
       protected void SetValorHoraExtra(double valorhoraextrap){
           valorHoraExtra = valorhoraextrap;           
       }
       
       protected void SetQuantidadeHoraExtra(int qhoraextrap){
           quantidadehoraextra = qhoraextrap;
           
       }       
       
       protected double GetSalarioBase(){
           return salarioBase;
       }
       
       protected double GetValorHoraExtra(){
           return valorHoraExtra;
       }
       
       protected int GetQuantidadeHoraExtra(){
           return quantidadehoraextra;
       }       
       
      
          @Override
     protected double calcularSalario(){         
         double calculo = salarioBase + (valorHoraExtra * quantidadehoraextra );       
         salário = calculo;
         return salário;
     }
       
         
       protected void Getdados(){  
         //Técnico Administrativo             
         System.out.println("Cargo : Técnico Administrativo");
         System.out.println("Nome : " + nome);
         System.out.println("Endereço : " + endereço);    
         System.out.println("Telefone : " + telefone); 
         System.out.println("CPF : " + cpf);
         System.out.println("CTPS : " + CTPS);
         System.out.println("Salário : " + salário);  
         System.out.println("Salário Base : " + salarioBase);
         System.out.println("Valor hora extra : " + valorHoraExtra);
         System.out.println("Quantidade de horas extras : " + quantidadehoraextra);
}
    
    
    
}
