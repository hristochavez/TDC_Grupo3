/*
 * En este ejemplo se obtiene la estación del año usando la estructura
 * condicional Switch.
 */

package com.upn.tecpoo.ejerciciouno;

import java.time.LocalDate;

public class CondicionalDos
{
    public static void main(String[] args)
    {
        LocalDate ld = LocalDate.now();
        int month = ld.getMonthValue();

        switch (month)
        {
            case 1: case 2: case 3:
                System.out.println("Es verano.");
                break;
            case 4: case 5: case 6:
                System.out.println("Es otoño.");
                break;
            case 7: case 8: case 9:
                System.out.println("Es invierno.");
                break;
            case 10: case 11: case 12:
                System.out.println("Es primavera.");
                break;
            default:
                System.out.println("El mes indicado no existe.");
                break;
        }
    }
}
