/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_captura_datos;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA2_15_CAPTURA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int tama;
        System.out.println("¿ calificaciones que quieres capturar?");
        tama = captu.nextInt();
        int califas[] = new int [tama];
        for(int i = 0; i <califas.length; i++){
        System.out.println("calificacion #" + (i +1) + ":");
        califas[i] = captu.nextInt();
        
        }
        //lectura
         for(int i = 0; i <califas.length; i++){
        System.out.print("[" + califas [i] + "]");
    }
         //promedio del grupo
         //sumar todas las calificaciones
         int sumaCalifas = 0;
         for (int i = 0; i< califas.length; i++){
             sumaCalifas = sumaCalifas +califas [i];
             
         }
          System.out.println("acumulado -" + sumaCalifas);
          double promedio = sumaCalifas / (double)califas.length;
           System.out.println("promedio:" + promedio);
    }
}
