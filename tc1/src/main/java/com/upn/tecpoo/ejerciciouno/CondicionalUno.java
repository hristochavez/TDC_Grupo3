/*
 * En este ejercicio se solicita una contraseña y luego se le vuelve a solicitar
 * para validarla. LLegado a los tres errores aparece el mensaje USUARIO
 * BLOQUEADO y cuando se logra ingresar aparece BIENVENIDO
 */

package com.upn.tecpoo.ejerciciouno;

import java.util.Scanner;

public class CondicionalUno
{
    public static void main(String[] args) 
    {
        String password;
        Scanner inputData = new Scanner(System.in);
        
        // Se solicita la contraseña por primera vez
        System.out.println("Ingrese su contraseña:");
        password = inputData.nextLine();

        /* 
         * La función sucessfullLogin retorna TRUE o
         * FALSE dependiendo de lo que haya ingresado
         * el usuario 
         */
        if(sucessfullLogin(password, 3)) {
            System.out.println("BIENVENIDO!!");
        } else {
            System.out.println("USUARIO BLOQUEADO");
        };
    }

    public static boolean sucessfullLogin(String password,int attempts)
    {
        String repassword;
        boolean sucessfullLogin = false;
        Scanner inputData = new Scanner(System.in);

        // Esta es la segunda vez que se le pide la
        // contraseña
        System.out.println("Para validar, reingrese su contraseña:");
        repassword = inputData.nextLine();

        if(repassword.equals(password)) {
            sucessfullLogin = true;
        } else {
            /* 
             * Si ha ingresado una contraseña incorrecta,
             * comenzara a disminuir un contador (pasado como
             * parametro) y mientras siga equivocandose el
             * contador seguira disminuyendo
             */
            attempts--;
            while (attempts > 0 && !sucessfullLogin)
            {
                System.out.println("Contraseña incorrecta. Vuelva a intentar:");
                repassword = inputData.nextLine();
                if (repassword.equals(password)) {
                    sucessfullLogin = true;
                } else {
                    attempts--;
                }
            }
        }
        return sucessfullLogin;
    }
}
