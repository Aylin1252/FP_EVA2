/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_ciclo_infinito;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA2_24_CICLO_INFINITO {
    final static String USUARIO ="admin";
    final static String PWD="admin";
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        String usu, contra;
        
        while(true){
        System.out.println("ACCESO AL SISTEMA");
        System.out.println("USUARIO");
        usu = captu.nextLine();
        System.out.println("CONTRASEÑA");
        contra = captu.nextLine();
        if(usu.equals(USUARIO)&& contra.equals(PWD))
            break;//termina el ciclo
    }
        
        System.out.println("BIENVENIDO AL SISTEMA");
    }

}
