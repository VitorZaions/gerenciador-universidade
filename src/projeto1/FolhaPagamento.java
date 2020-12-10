/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

//import static java.lang.Math.E;
import java.util.List;

public class FolhaPagamento {
    
    private double TotalFolha;    
    
    void somarFolha(List Funcionarios){
        
        for (int i = 0; i < Funcionarios.size(); i++) {
                        
            String Cargo;      
            
        //    Object obj;
          //  obj = Funcionarios.get(i).getClass();
            
            Funcionario Funcionarie = (Funcionario)Funcionarios.get(i);
                        
         /*   if(obj instanceof Professor){
                 Professor Funcion =  (Professor)Funcionarios.get(i); 
                Cargo = "Professor"; 
            }else{
                   TecnicoAdmin Funcion =  (TecnicoAdmin)Funcionarios.get(i);  
                 Cargo = "Técnico Administrativo";    
            }                   
               
           Funcionario Funcio =  (Funcionario)Funcionarios.get(i);   */
              
           System.out.println("Nome : " + Funcionarie.nome);
           System.out.println("Salário: " + Funcionarie.salário);
           System.out.println("Cargo : " + Funcionarios.get(i).getClass());
           System.out.println("*************************");           
           
           TotalFolha += Funcionarie.salário;
        }            
        
    }
        
    
     public double totalEncargos(double totalFolha) {
         double FGTS = (( TotalFolha * 8 ) / 100);
         double INSS = (( TotalFolha * 8 ) / 100);
         double TEncargos = FGTS + INSS ;         
         return TEncargos;
     }
    
   double GetTotalFolha(){
       return TotalFolha;
   }
   
}
