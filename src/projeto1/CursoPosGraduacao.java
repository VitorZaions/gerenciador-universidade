/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class CursoPosGraduacao extends Curso {
          
     List<AlunoPosGraduacao> alunos;         
    
      protected void AddAluno(AlunoPosGraduacao AlunoPosGraduacaop){
      alunos.add(AlunoPosGraduacaop);
    }     
    
    protected List GetAlunos(){
      return alunos;
    }     
    
    
    
        @Override
    protected void getdados(){
         System.out.println("Código do curso : " + code);
         System.out.println("Nome do curso: " + nome);
         System.out.println("Duração do curso: " + duração);       

         //////////Verify
         
         int retval = disciplinas.size() - 1;         
         for(int i = 0 ; i <= retval ; i++){             
             System.out.println("Disciplina " + i + " : "  + disciplinas.get(i).nome);        
         }        
         
         
         int retval2 = alunos.size() - 1;         
         for(int i = 0 ; i <= retval ; i++){             
             System.out.println("Aluno " + i + " : "  + alunos.get(i).nome);        
         }        
         
         
    }
    
    
    
}
