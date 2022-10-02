package com.grupo3.sistemamarcacion.main;

import com.grupo3.sistemamarcacion.vistas.Login2;
public class Main {
    public static void main(String[] args)
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login2().setVisible(true);
            }
        });
    }
}
