/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaej17vectores3;

import java.util.Scanner;

/**
 *
 * @author Enrico
 */
public class JavaEj17Vectores3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     /* Recorrer un vector de N enteros contabilizando cuántos números son de 1
dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/
     //Por ej: 100(3 digitos), 22(2 digitos) y 3 ( un digito)
     Scanner read= new Scanner(System.in);
        System.out.println("Ingrese el tamaÑo del vector");
                  
        int n= read.nextInt();
        int[] vector= new int[n];
        int Dig1, Dig2,Dig3,Dig4,Dig5;
        
         Dig1=0;
         Dig2=0;
         Dig3=0;
         Dig4=0;
         Dig5=0;
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (int)(Math.random()*10000+1);
            
        }
        for (int i = 0; i < vector.length; i++){
 
            switch(String.valueOf(vector[i]).length()){
                case 1:
                   Dig1++;
                   break;
                case 2:
                    Dig2++;
                   break;
                case 3:
                    Dig3++;
                   break;
                case 4:
                    Dig4++;
                   break;
                case 5:
                    Dig5++;
                   break;   
                    
            }
        
        }
        System.out.println("La cantidad de números con un dígito es: "+ Dig1 );     
        System.out.println("La cantidad de números con dos dígitos es:" + Dig2);
        System.out.println("La cantidad de números con tres dígitos es "+ Dig3);
        System.out.println("La cantidad de números con cuatro díg es: "+ Dig4);
        System.out.println("La cantidad de números con cinco dígitos es "+Dig5);
}
    }
