/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.basiocos.en.java;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class EjerciciosBasiocosEnJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Desarrollar un algorit,o donde me muestren los numeros impares
       
    Scanner miScanner = new Scanner(System.in);

        int numElegido;
        
        int a;
        System.out.println("ingresar el numero de inicio: ");
        a=miScanner.nextInt();
        int z;
        System.out.println("ingresa el numero de limite:");
        z=miScanner.nextInt();
        do{

            System.out.println("Pulse 1 para imprimir los números pares o"

                    + " pulse 2 para imprimir los números impares: ");

            numElegido = miScanner.nextInt();

            if(numElegido == 1){

                while(a<= z){

                    if(a % 2 == 0){

                    System.out.println(a);

                    }

                    a++;

                }

            }

            if(numElegido == 2){

                while(a <= z){

                    if(a% 2 != 0) {

                    System.out.println(a);

                    }

                    a++;

                }

            }

        }while(numElegido != 1 && numElegido != 2);
                
        
    }
   
}
