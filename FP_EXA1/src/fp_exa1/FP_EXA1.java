/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fp_exa1;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class FP_EXA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int natacion,ciclismo,carrera;
        int total;
        
        Scanner captu = new Scanner (System.in);
        System.out.println("tiempo en natacion:");
        natacion= captu.nextInt();
        System.out.println("tiempo en ciclismo:");
        ciclismo= captu.nextInt();
        System.out.println("tiempo en carrera:");
        carrera= captu.nextInt();
        total = natacion +ciclismo+carrera;
        if ((total<120)&&((natacion<60)&& (ciclismo<60 )&&(carrera<60)))
            System.out.println("EXCELENTE");
        else if ((total<150)||((natacion<70)&&(ciclismo<70 )&&(carrera<70)))
            System.out.println("BUENA");
        else
            System.out.println("REGULAR");
    }
    
    
}
