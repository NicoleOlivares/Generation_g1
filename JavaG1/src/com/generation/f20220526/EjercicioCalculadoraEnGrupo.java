package com.generation.f20220526;

import java.util.Scanner;

public class EjercicioCalculadoraEnGrupo {
	
	 public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);


         int num1 = 0;
         int num2 = 0;


         System.out.println("ingrese un numero");
         num1 = sc.nextInt();
         System.out.println("ingrese un segundo numero");
         num2 = sc.nextInt();

         int opcion = 0;

         do {
             System.out.println(" (0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir \n (5) resto");

             opcion = sc.nextInt();

         }while (opcion < 0 || opcion > 5 );

     /*while(opcion <0 || opcion > 5){

         System.out.println(" (0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir \n (5) resto");
          opcion = sc.nextInt();
     }
     System.out.println("Opcion invalida");*/

         switch (opcion) {
             case 0://SALIR
                 //accion para la opcion 1
                 System.out.println("+-+-+-+ Vuelva Pronto :) +-+-+-+");
                 break;
             case 1://sumar
                 //accion para la opcion 1
                 System.out.println("+----Suma----+");
                 System.out.println(num1 + " + " + num2 + " = " + suma(num1,num2));
                 break;
             case 2://resta
                 //accion para la opcion 2
                 System.out.println("----Resta----");
                 System.out.println(num1 + " - " + num2 + " = " + resta(num1,num2));
                 break;
             case 3://multiplicacion
                 //accion para la opcion 3
                 System.out.println("----Multiplica----");
                 System.out.println(num1 + " * " + num2 + " = " + multiplicacion(num1,num2));
                 break;
             case 4://division
                 //accion para la opcion 4
                 System.out.println("----Divide----");
                 System.out.println(num1 + " / " + num2 + " = " + division(num1,num2));
                 break;
             case 5://resto
                 //accion para la opcion 5
                 System.out.println("----Resto----");
                 System.out.println(num1 + " % " + num2 + " = " + resto(num1,num2));
                 break;

             default:
                 System.out.println("opcion invalida, por favor ingrese un numero del 0 al 5.");
                 break;
         }
     }

     // Funcion suma
     public static Double suma (double num1, double num2){
         return (num1 + num2);
     }

     //Funcion resta
     public static Double resta (double num1, double num2) {
         return (num1 - num2);
     }

     //Funcion multiplicacion
     public static Double multiplicacion (double num1, double num2) {
         return (num1 * num2);
     }

     //Funcion division
     public static Double division (double num1, double num2) {
         return (num1 / num2);
     }


     //Funcion resto

     public static Double resto (double num1, double num2) {
         return (num1 % num2);
         }


 }
 