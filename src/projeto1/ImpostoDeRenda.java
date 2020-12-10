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
public class ImpostoDeRenda {
    
    
    void calcularimpostoderenda(double valor){   //Ajustar Valores

    if (valor <= 2000)
    {
       
        System.out.println("Isento");
    }
    else if (valor > 2000 && valor <= 3000)
    {
        double valoraux = valor - 2000;
        double calculo = valoraux * 8 / 100;
        
        System.out.println("R$ " + calculo);
        


    }
    else if (valor > 3000 && valor <= 4500)
    {
        double valoraux = valor - 2000;

        valoraux = valoraux - 1000;

        double calculo = (valoraux * 18) / 100;

        calculo = calculo + 80;

        System.out.println("R$ " + calculo);
    }
    else
    {
        double valoraux = valor - 2000;

        valoraux = valoraux - 1000;

        valoraux = valoraux - 1500;

        double calculo = (valoraux * 28) / 100;

        calculo = calculo + 80;

        calculo = calculo + 270;

        System.out.println("R$ " + calculo);
    }
        
        
        
        
        
        
        
        
        
    }
    
}
