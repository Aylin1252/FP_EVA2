/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_33_cuenta;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EVA2_33_CUENTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int saldo,reti;
        System.out.println("Bienvenido a tu cuenta de banco!!!!");
        System.out.println("su saldo inicial es :$");
        saldo=captu.nextInt();
        while(saldo>=0){
            System.out.println("cuanto quieres retirar?");
            reti=captu.nextInt();
            saldo-=reti;
            if(saldo<=0){
                System.out.println("tu cuenta esta en rojos!!");
            }else if (saldo==0){
                System.out.println("ya no tienes dinero!!");
                System.out.println("saldo restante!!!"+saldo);
                
                
            }else{
            System.out.println("sigues con dinero");
      
        }
    }
    }
    
}
