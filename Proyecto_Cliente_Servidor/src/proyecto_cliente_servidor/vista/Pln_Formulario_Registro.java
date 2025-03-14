/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto_cliente_servidor.vista;

/**
 *
 * @author lincy
 */
public class Pln_Formulario_Registro extends javax.swing.JPanel {

       public Pln_Formulario_Registro() {
        initComponents();
        setPanelSize();
    }

    /**
     * Método para establecer el tamaño del panel
     */
    private void setPanelSize() {
        this.setPreferredSize(new java.awt.Dimension(600, 650));
        this.setMinimumSize(new java.awt.Dimension(600, 650));
        this.setMaximumSize(new java.awt.Dimension(600, 650));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jlb_Nombre_Completo = new javax.swing.JLabel();
        Jlb_Cedula = new javax.swing.JLabel();
        Jlb_Genero = new javax.swing.JLabel();
        Jlb_Edad = new javax.swing.JLabel();
        Jlb_Correo = new javax.swing.JLabel();
        Jlb_Fecha_Nacimiento = new javax.swing.JLabel();
        Txt_Nombre_Completo = new javax.swing.JTextField();
        Txt_Cedula = new javax.swing.JTextField();
        Txt_Genero = new javax.swing.JTextField();
        Txt_Edad = new javax.swing.JTextField();
        Txt_Fecha_Nacimiento = new javax.swing.JTextField();
        Txt_Correo = new javax.swing.JTextField();
        Btn_Registar_Nuevo_Cliente = new javax.swing.JButton();
        Jlb_Titulo_Formulario_Registro = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(598, 615));

        Jlb_Nombre_Completo.setText("Nombre Completo");

        Jlb_Cedula.setText("Cedula");

        Jlb_Genero.setText("Genero");

        Jlb_Edad.setText("Edad");

        Jlb_Correo.setText("Correo");

        Jlb_Fecha_Nacimiento.setText("Fecha de Nacimiento");

        Txt_Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_CedulaActionPerformed(evt);
            }
        });

        Btn_Registar_Nuevo_Cliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Btn_Registar_Nuevo_Cliente.setText("Registrar");

        Jlb_Titulo_Formulario_Registro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Jlb_Titulo_Formulario_Registro.setText("Formulario Registro Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(Jlb_Titulo_Formulario_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Jlb_Nombre_Completo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jlb_Cedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jlb_Genero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jlb_Edad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jlb_Correo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jlb_Fecha_Nacimiento, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Txt_Fecha_Nacimiento, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Txt_Edad, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Txt_Cedula, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Txt_Nombre_Completo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Txt_Genero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Txt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(Btn_Registar_Nuevo_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Jlb_Titulo_Formulario_Registro)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Nombre_Completo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlb_Nombre_Completo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jlb_Cedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlb_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Genero))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlb_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Edad))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlb_Fecha_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Fecha_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlb_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Correo))
                .addGap(88, 88, 88)
                .addComponent(Btn_Registar_Nuevo_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addGap(134, 134, 134))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_CedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_CedulaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Registar_Nuevo_Cliente;
    private javax.swing.JLabel Jlb_Cedula;
    private javax.swing.JLabel Jlb_Correo;
    private javax.swing.JLabel Jlb_Edad;
    private javax.swing.JLabel Jlb_Fecha_Nacimiento;
    private javax.swing.JLabel Jlb_Genero;
    private javax.swing.JLabel Jlb_Nombre_Completo;
    private javax.swing.JLabel Jlb_Titulo_Formulario_Registro;
    private javax.swing.JTextField Txt_Cedula;
    private javax.swing.JTextField Txt_Correo;
    private javax.swing.JTextField Txt_Edad;
    private javax.swing.JTextField Txt_Fecha_Nacimiento;
    private javax.swing.JTextField Txt_Genero;
    private javax.swing.JTextField Txt_Nombre_Completo;
    // End of variables declaration//GEN-END:variables
}
