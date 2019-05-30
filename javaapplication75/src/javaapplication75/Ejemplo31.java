/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo31 {

    public static void main(String[] args) {
        // TODO code application logic here
        double notas;
        Scanner entrada = new Scanner(System.in);
        int[] datos = new int[6];
        boolean bandera = true;
        int i = 0;
        String opcion;
        //Arreglo cadena qeu alamcena los rangos 
        String[] rangos = {"0-8", "8.1-12", "12.1-16", "16.1-19", "19.1-20",
            "20.1-&"};
        System.out.println("VALIDACIÓN DE NOTAS EN RANGOS ESPECÍFICOS ");
        //WHILE bandera que permite la validacion de notas en rangos especificos 
        while (bandera) {
            System.out.println("Ingrese las notas del estudiante");
            notas = entrada.nextDouble();
            if (notas <= 8) {
                //suma en el array las veces que ingresa las notas ene se rango
                datos[0] = datos[0] + 1;
            } else {
                if (notas >= 8.1 && notas <= 12) {
                    datos[1] = datos[1] + 1;
                } else {
                    if (notas >= 12.1 && notas <= 16) {
                        datos[2] = datos[2] + 1;
                    } else {
                        if (notas >= 16.1 && notas <= 19) {
                            datos[3] = datos[3] + 1;
                        } else {
                            if (notas >= 19.1 && notas <= 20) {
                                datos[4] = datos[4] + 1;
                            } else {
                                if (notas >= 20.1) {
                                    datos[5] = datos[5] + 1;
                                }

                            }
                        }
                    }
                }
            }
            //limpieza d eentrada 
            entrada.nextLine();
            System.out.println("Desea seguir ingresandio notas: si - no ");
            opcion = entrada.nextLine();
            //Controladoor de ingereso de datos segun lo que desee el usuario
            if (opcion.equals("no")) {
                bandera = false;
            }
        }
        System.out.println("Resultados\nRangos\n");
        //For que permite controlar la impresion de los ranggos 
        for (i = 0; i < datos.length; i++) {
            System.out.printf(" %s = %d\n", rangos[i], datos[i]);
        }
    }
}
