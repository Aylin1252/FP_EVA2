/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_break;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA2_27_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu= new Scanner (System.in);
        int valor ,adivinar;
        do{
            adivinar =(int)(Math.random()*5);
        System.out.println("adivina el numero.-1 para terminar.");
        valor= captu.nextInt();
        if(valor==adivinar)
             System.out.println("ADIVINASTE!!!");
        else if (valor==-1){
            System.out.println("gracias por jugar!!");
            break;
        }else{
            System.out.println("no adivinaste!!!!");
        }
        }while(true);
        
        }
    }
    

