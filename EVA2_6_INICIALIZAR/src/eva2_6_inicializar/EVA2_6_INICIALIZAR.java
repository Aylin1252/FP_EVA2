/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_inicializar;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA2_6_INICIALIZAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diasSemana[]= {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
                  Scanner captu = new Scanner (System . in);
        int dia;
        System.out.println("dia de la semana (0 a 6):");
        dia = captu.nextInt ();
        System.out.println(diasSemana[dia]);
        
    }
    
}
