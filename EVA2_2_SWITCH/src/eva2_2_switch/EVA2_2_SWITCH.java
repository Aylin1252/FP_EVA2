/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_switch;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA2_2_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SWITCHC-->OPCION MULTIPLE
        Scanner captu =new Scanner (System.in);
        int dia;
        System.out.println("Dia de la semana en numero (1-7):");
        dia=captu.nextInt();
      /* if dia ==1{
               System.out.println("lunes");
       }else id dia==2{
        System.out.println("martes");
    }*/
      switch (dia){
          case 1:
              System.out.println("lunes");
              break;//fin de caso switch
              case 2:
              System.out.println("martes");
              break;
              case 3:
              System.out.println("miercoles");
              break;
              case 4:
              System.out.println("jueves");
              break;
              case 5:
              System.out.println("viernes");
              break;
              case 6:
              System.out.println("sabado");
              break;
              case 7:
              System.out.println("domingo");
              break;
              default:
                  System.out.println("numero incorrecto");
                  
      }
    }
    
}
