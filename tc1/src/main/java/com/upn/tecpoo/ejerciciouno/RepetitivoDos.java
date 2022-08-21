/*
 * El segundo enunciado pide el nombre y apellido del usuario y genera un
 * número aleatorio basado en la cantidad de vocales, la fecha en la que se
 * ejecuta el programa y un numero aleatorio entre 0 y la cantidad de vocales
 * que tiene su nombre y apellidos completo
 */

package com.upn.tecpoo.ejerciciouno;

import java.time.LocalDate;
import java.util.Scanner;

public class RepetitivoDos
{
    protected static String nombre;
    protected static String apellidoPaterno;
    protected static String apellidoMaterno;
    protected static final char[] VOCALES = {'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args)
    {
        int cantVocales = 0;
        int numAleat;
        int diaDelAnio;
        LocalDate hoy = LocalDate.now();
        Scanner inputData = new Scanner(System.in);

        System.out.println("Ingresa tu nombre:");
        RepetitivoDos.nombre = inputData.nextLine();

        System.out.println("Ingresa tu apellido paterno:");
        RepetitivoDos.apellidoPaterno = inputData.nextLine();

        System.out.println("Ingresa tu apellido materno:");
        RepetitivoDos.apellidoMaterno = inputData.nextLine();

        cantVocales = countVocales();
        numAleat = getRandom(cantVocales);
        diaDelAnio = hoy.getDayOfYear();

        System.out.println("Basandome en el nombre....tu número de la suerte " +
                "es:\n" + (cantVocales+numAleat+diaDelAnio));
    }

    // Obtiene un número aleatorio entre 0 y maxValue.
    private static int getRandom(int maxValue) {
        int aleatorio = (int) (Math.random()*(maxValue+1));
        return aleatorio;
    }

    // Retorna la cantidad de vocales que tienen sus nombre y
    // apelllidos.
    private static int countVocales()
    {
        int cantVocales = 0;

        // Cuenta la cantidad de vocales que tiene nombre.
        for (int i = 0; i < RepetitivoDos.nombre.length(); i++)
        {
            for (int j = 0; j < RepetitivoDos.VOCALES.length; j++)
            {
                if (RepetitivoDos.nombre.charAt(i) == RepetitivoDos.VOCALES[j])
                {
                    cantVocales += 1;
                    j = RepetitivoDos.VOCALES.length;
                }
            }
        }

        // Cuenta la cantidad de vocales que tiene apellidoPaterno.
        for (int i = 0; i < RepetitivoDos.apellidoPaterno.length(); i++)
        {
            for (int j = 0; j < RepetitivoDos.VOCALES.length; j++)
            {
                if (RepetitivoDos.apellidoPaterno.charAt(i) == RepetitivoDos.VOCALES[j])
                {
                    cantVocales += 1;
                    j = RepetitivoDos.VOCALES.length;
                }
            }
        }

        // Cuenta la cantidad de vocales que tiene apellidoMaterno.
        for (int i = 0; i < RepetitivoDos.apellidoMaterno.length(); i++)
        {
            for (int j = 0; j < RepetitivoDos.VOCALES.length; j++)
            {
                if (RepetitivoDos.apellidoMaterno.charAt(i) == RepetitivoDos.VOCALES[j])
                {
                    cantVocales += 1;
                    j = RepetitivoDos.VOCALES.length;
                }
            }
        }
        return cantVocales;
    }
}
