/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejs.teoricos;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ej6Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros enteros");
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if ((num1 < 25 ) && (num2 < 25)){
            System.out.println("Ambos numeros son menores que 25");
            
        } else if ((num1 < 25 ) || (num2 < 25)){
            System.out.println("almenos 1 numero es mayor que 25");
            
        } else {
            System.out.println("Ningun numero es mayor que 25");
        }
        
    }
    
}
