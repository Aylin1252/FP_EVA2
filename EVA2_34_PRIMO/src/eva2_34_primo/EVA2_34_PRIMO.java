/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_34_primo;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA2_34_PRIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner captu= new Scanner (System.in);
       int numero;
       int contador =0;
       System.out.println("ingresa un numero");
       numero=captu.nextInt();
       for (int i=1;i<=numero;i++){
       if (numero%i==0){
           contador++;
       }
       }
       if(contador==2){
           System.out.println(numero+ "es primo.");
       }else{
           System.out.println(numero+"no es primo.");
       }
       
    }
    
}
