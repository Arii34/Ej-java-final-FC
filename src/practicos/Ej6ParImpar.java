/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejs.practicos;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ej6ParImpar {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num=leer.nextInt();
        if(num%2==0){
            System.out.println("el numero es par");
        }else{
            System.out.println("el numero es impar");
        }
    }
    
}
