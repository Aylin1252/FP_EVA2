/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_do_while;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA2_20_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("menu principal");
        System.out.println("presiona la opcion:");
        System.out.println("1.pedidos:");
        System.out.println("2.peoveedores");
        System.out.println("3.facturacion");
        System.out.println("4.salir:");
        opcion = captu.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("pedidos del sistema!!");
                break;
            case 2:
                    System.out.println("provedores del sistama");
                    break;
            case 3:
            System.out.println("facturacion del sistema");
                break;
        }
        
        }while(opcion!=4);//mientras sea diferente a 4 -->ESE ES NEGACION !!!
        System.out.println("fin del programa");
    }
    
}
