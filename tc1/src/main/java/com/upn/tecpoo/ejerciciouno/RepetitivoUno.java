/*
 * En este ejemplo de estructuras repetitivas, pedimos al usuario un número
 * entero y este número entero sera el maximo valor hasta donde se puedan
 * obtener números primos.
 */

package com.upn.tecpoo.ejerciciouno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepetitivoUno
{
    public static void main(String[] args)
    {
        int maxValue;
        List<String> primos = new ArrayList<String>();
        Scanner inputData = new Scanner(System.in);

        System.out.println("Ingrese el máximo valor(ENTERO):");
        maxValue = inputData.nextInt();

        primos = getPrimos(maxValue);

        System.out.println(primos);
    }

    public static List<String> getPrimos(int max)
    {
        List<String> primos = new ArrayList<String>();
        boolean isNotPrime;
        int cont;
        
        // Se tiene un número mínimo y máximo de donde se veran
        // si son primos o no.
        for (int i = 2; i <= max; i++)
        {
            cont = 0;
            isNotPrime = false;

            /*
             * Se analiza un número y se van haciendo divisiones
             * sucesivas entre 1 luego 2 luego 3 .... hasta llegar
             * al número analizado
             */
            for (int j = 1; j <= i; j++)
            {
                if (i % j == 0)
                {
                    cont++;

                    // Si tiene más de dos divisores NO es un número primo
                    if (cont > 2)
                    {
                        isNotPrime = true;
                        j = i;
                    }
                }
            }
            if (!isNotPrime) { primos.add(String.valueOf(i)); }
        }
        return primos;
    }
}
