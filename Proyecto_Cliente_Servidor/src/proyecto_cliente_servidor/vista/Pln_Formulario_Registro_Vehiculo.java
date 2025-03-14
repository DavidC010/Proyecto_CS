/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto_cliente_servidor.vista;

/**
 *
 * @author lincy
 */
public class Pln_Formulario_Registro_Vehiculo extends javax.swing.JPanel {

    /**
     * Creates new form Formulario_Registro_Vehiculo
     */
    public Pln_Formulario_Registro_Vehiculo() {
        initComponents();
    }

    private void setPanelSize() {
        this.setPreferredSize(new java.awt.Dimension(600, 650));
        this.setMinimumSize(new java.awt.Dimension(600, 650));
        this.setMaximumSize(new java.awt.Dimension(600, 650));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Txt_Color = new javax.swing.JTextField();
        Txt_Placa = new javax.swing.JTextField();
        Txt_Numero_Chasis = new javax.swing.JTextField();
        Txt_Poliza_Adquirida = new javax.swing.JTextField();
        Jlb_Titulo_Formulario_Registro = new javax.swing.JLabel();
        Jlb_Marca = new javax.swing.JLabel();
        Jlb_Modelo = new javax.swing.JLabel();
        Jlb_Color = new javax.swing.JLabel();
        Jlb_Placa = new javax.swing.JLabel();
        Jlb_Tipo_poliza_adquirida = new javax.swing.JLabel();
        Jlb_Numero_chasis = new javax.swing.JLabel();
        Txt_Marca = new javax.swing.JTextField();
        Txt_Modelo = new javax.swing.JTextField();
        Btn_Registrar = new javax.swing.JButton();

        Jlb_Titulo_Formulario_Registro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Jlb_Titulo_Formulario_Registro.setText("Formulario Registro Vehiculo");

        Jlb_Marca.setText("Marca");

        Jlb_Modelo.setText("Modelo");

        Jlb_Color.setText("Color");

        Jlb_Placa.setText("Placa");

        Jlb_Tipo_poliza_adquirida.setText("Tipo poliza adquirida");

        Jlb_Numero_chasis.setText("Numero Chasis");

        Txt_Modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_ModeloActionPerformed(evt);
            }
        });

        Btn_Registrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Btn_Registrar.setText("Registrar");
        Btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Jlb_Marca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Jlb_Modelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Jlb_Color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Jlb_Placa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Jlb_Tipo_poliza_adquirida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Jlb_Numero_chasis, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Txt_Numero_Chasis, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Txt_Placa, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Txt_Modelo, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Txt_Marca, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Txt_Color, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Txt_Poliza_Adquirida, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(Jlb_Titulo_Formulario_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(Btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Jlb_Titulo_Formulario_Registro)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlb_Marca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jlb_Modelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlb_Color, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Color))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlb_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Placa))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlb_Numero_chasis, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Numero_Chasis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlb_Tipo_poliza_adquirida, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Poliza_Adquirida))
                .addGap(88, 88, 88)
                .addComponent(Btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_ModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_ModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_ModeloActionPerformed

    private void Btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_RegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Registrar;
    private javax.swing.JLabel Jlb_Color;
    private javax.swing.JLabel Jlb_Marca;
    private javax.swing.JLabel Jlb_Modelo;
    private javax.swing.JLabel Jlb_Numero_chasis;
    private javax.swing.JLabel Jlb_Placa;
    private javax.swing.JLabel Jlb_Tipo_poliza_adquirida;
    private javax.swing.JLabel Jlb_Titulo_Formulario_Registro;
    private javax.swing.JTextField Txt_Color;
    private javax.swing.JTextField Txt_Marca;
    private javax.swing.JTextField Txt_Modelo;
    private javax.swing.JTextField Txt_Numero_Chasis;
    private javax.swing.JTextField Txt_Placa;
    private javax.swing.JTextField Txt_Poliza_Adquirida;
    // End of variables declaration//GEN-END:variables
}
