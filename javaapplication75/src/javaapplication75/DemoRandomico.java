/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Random;

/**
 *
 * @author Salas
 */
public class DemoRandomico {
    public static void main (String[] args){
        //se debe importar como el scanner para el Random
        //el Random nos permite generar numeros aleatorios
        Random aleatorios = new Random();
        //con el next.Int(4)se controla el limite de nuemros que puede generar 
        int v = aleatorios.nextInt(4);
        System.out.printf("%d\n",v);
    }
}
