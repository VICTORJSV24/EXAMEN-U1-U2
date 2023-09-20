/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenu1.u2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExamenU1U2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner lectura = new Scanner (System.in);
      double ganancia=to1,to2,to3,ga1,ga2,ga3;
      final double instumento1=1250.45;
      final double instrumento2= 3743.00;
      final double instrumento3 =  2683.78;
        System.out.println("ingrese el nombre del instrumento 1");
        String insto1= lectura.nextLine();
        double precio1=lectura.nextDouble();
        System.out.println("ingrese el nombre del instrumento 2");
        String insto2= lectura.nextLine();
        double precio2= lectura.nextDouble();
        System.out.println("ingrese el nombre del instrumento 3");
        String insto3= lectura.nextLine();
       double precio3= lectura.nextDouble();
       
       ga1= insto1-precio1;
       ga2= insto2-precio2;
       ga3=insto3-precio3;
       
       total1ganancia= (ganancia/precio)*100;
       tatal2 ganancia= (ganancia/precio2)*100;
       totalganancia= (ganancia/precio3)*100;
       
       
       
        
    }
}
