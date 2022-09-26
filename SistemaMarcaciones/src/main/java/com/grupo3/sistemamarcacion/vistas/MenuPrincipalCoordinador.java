package com.grupo3.sistemamarcacion.vistas;

import com.grupo3.sistemamarcacion.controladores.InicioSesion;
import com.grupo3.sistemamarcacion.empleado.Empleado;

public class MenuPrincipalCoordinador extends MenuPrincipal {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apeMatLbl;
    private javax.swing.JLabel apePatLbl;
    private javax.swing.JLabel dniLbl;
    private javax.swing.JLabel forApeMat;
    private javax.swing.JLabel forApePat;
    private javax.swing.JLabel forDniLbl;
    private javax.swing.JLabel forNombreLbl;
    private javax.swing.JLabel forTipoDocumento;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JLabel tipoDocumento;
    // End of variables declaration//GEN-END:variables
    private Empleado empleado;

    public MenuPrincipalCoordinador(String idEmpleado, int idTipoEmpleado)
    {
        super(idEmpleado, idTipoEmpleado);
        InicioSesion is = new InicioSesion(idEmpleado, idTipoEmpleado);
        this.empleado = is.obtenerEmpleado();
        this.initComponents();
        setLocationRelativeTo(null);
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dniLbl = new javax.swing.JLabel();
        nombreLbl = new javax.swing.JLabel();
        apePatLbl = new javax.swing.JLabel();
        apeMatLbl = new javax.swing.JLabel();
        tipoDocumento = new javax.swing.JLabel();
        forDniLbl = new javax.swing.JLabel();
        forNombreLbl = new javax.swing.JLabel();
        forApePat = new javax.swing.JLabel();
        forApeMat = new javax.swing.JLabel();
        forTipoDocumento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dniLbl.setText("ID:");

        nombreLbl.setText("Nombre:");

        apePatLbl.setText("Apellido Paterno:");

        apeMatLbl.setText("Apellido Materno:");

        tipoDocumento.setText("Tipo de documento:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(apeMatLbl)
                    .addComponent(apePatLbl)
                    .addComponent(nombreLbl)
                    .addComponent(tipoDocumento)
                    .addComponent(dniLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(forDniLbl)
                    .addComponent(forNombreLbl)
                    .addComponent(forApePat)
                    .addComponent(forApeMat)
                    .addComponent(forTipoDocumento))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniLbl)
                    .addComponent(forDniLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forNombreLbl)
                    .addComponent(nombreLbl))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apePatLbl)
                    .addComponent(forApePat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apeMatLbl)
                    .addComponent(forApeMat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoDocumento)
                    .addComponent(forTipoDocumento))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
}
