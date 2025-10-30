/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_32_factorial;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA2_32_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
       int valor,resu = 1;
       System.out.println("escribe el numero a sacar");
       valor=captu.nextInt();
       for(int i=1; i<=valor;i++){
           resu=resu *i;
       }
       System.out.println("el resultado es"+ resu);
    }
    
}
