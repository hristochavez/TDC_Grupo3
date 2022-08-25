/*
 * En este enunciado se ejemplifica instrucciones secuenciales
 * Se solicita por consola datos al usuario y se generan operaciones
 * matemáticas básicas con estas.
 */

package com.upn.tecpoo.ejerciciouno;

import java.util.Scanner;

public class SecuencialUno
{
    public static void main(String[] args)
    {
        double numa, numb;
        Scanner inputData = new Scanner(System.in);

        System.out.println("Ingrese un primer número (entero o decimal):");
        numa = inputData.nextDouble();

        System.out.println("Ingrese un segundo número (entero o decimal):");
        numb = inputData.nextDouble();

        System.out.println("La suma de " + numa + "+" + numb + " es:");
        System.out.println(numa + numb);

        System.out.println("La resta de " + numa + "-" + numb + " es:");
        System.out.println(numa - numb);

        System.out.println("La multiplicación de " + numa + "x" + numb + " es:");
        System.out.println(numa * numb);

        System.out.println("La división de " + numa + " / " + numb + " es:");
        System.out.println(numa / numb);

        System.out.println("El módulo de " + numa + " / " + numb + " es: ");
        System.out.println(numa % numb);

        System.out.println(numa + " elevado a " + numb + " es:");
        System.out.println(Math.pow(numa, numb));

        inputData.close();
    }
}
