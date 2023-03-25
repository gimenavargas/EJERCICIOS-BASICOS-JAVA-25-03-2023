/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imprimir.numeros.pares;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class ImprimirNumerosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner miScanner = new Scanner(System.in);
      int a=1;
      int z=100;
      while(a <= z){

                    if(a% 2 != 0) {

                    System.out.println(a);

                    }

                    a++;

                }
    }
    
}
