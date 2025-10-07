/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA2_10_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 
       //imprimir del 1 al 20
       
       System.out.println("");
       for (int i = 1; i <= 20; i++)
           System.out.println(i +  "-");
       System.out.println("");
       for (int i = 20; i >= 1; i--)
           System.out.print(i +  "-");
       //imprimir los pares de 0 a 10
       //0 - 2 - 4 ...100
       //+=,-=,*=,/=
       System.out.println("");
       for(int i = 0; i<=100;i+=2)
           System.out.println(i + "-");
       //impriman en orden inverso
       System.out.println("");
       for(int i = 100; i>=0;i-=2)
           System.out.print(i + "-");
       //solicitar dos numeros al ususario,imprimir la lista
       //entre esos numeros
        System.out.println("");
        int num1,num2;
       Scanner captu = new Scanner (System.in);
      System.out.println("introduzca el primer numero");
      num1 = captu.nextInt();
      System.out.println("introduzca el segundo numero");
      num2 = captu.nextInt();
      for (int f = num1; f <= num2; f++ ){
      System.out.println(f + "-");
      }
        System.out.println("");
        for(int f = num2; f >= num1; f--){
        System.out.println(f + "-");
        }
        
        
    
    }


}
    