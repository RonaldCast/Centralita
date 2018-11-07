package centralita;

public class RealizarLlamada extends javax.swing.JFrame {

    protected static Llamada llamada;
    private String numOrigen;
    private String numDestino;

    public RealizarLlamada() {
        initComponents();
        iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNumOrigen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNumDestino = new javax.swing.JTextField();
        btnFranja1 = new javax.swing.JButton();
        btnLocal = new javax.swing.JButton();
        btnFranja2 = new javax.swing.JButton();
        btnFranja3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Realizar llamada ");

        txtNumOrigen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumOrigenKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Número destino:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Número Origen:");

        txtNumDestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumDestinoKeyPressed(evt);
            }
        });

        btnFranja1.setText("Franja 1");
        btnFranja1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFranja1ActionPerformed(evt);
            }
        });

        btnLocal.setText("Local");
        btnLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalActionPerformed(evt);
            }
        });

        btnFranja2.setText("Franja 2");
        btnFranja2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFranja2ActionPerformed(evt);
            }
        });

        btnFranja3.setText("Franja 3");
        btnFranja3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFranja3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFranja1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFranja2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFranja3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNumDestino))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtNumOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel1)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFranja1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFranja2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFranja3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciar() {
        btnLocal.setEnabled(false);
        btnFranja1.setEnabled(false);
        btnFranja2.setEnabled(false);
        btnFranja3.setEnabled(false);
    }

    private void habilitar() {
        btnLocal.setEnabled(true);
        btnFranja1.setEnabled(true);
        btnFranja2.setEnabled(true);
        btnFranja3.setEnabled(true);
    }
    private void btnLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalActionPerformed
        numOrigen = txtNumOrigen.getText();
        numDestino = txtNumDestino.getText();

        llamada = new LlamadaLocal(15, numOrigen, numDestino, 0, "Local");

        CronometroLlamada ct = new CronometroLlamada();
        ct.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLocalActionPerformed

    private void btnFranja1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFranja1ActionPerformed
        numOrigen = txtNumOrigen.getText();
        numDestino = txtNumDestino.getText();

        llamada = new LlamadaProvincial(20, 1, numOrigen, numDestino, 0, "Franja 1");

        CronometroLlamada ct = new CronometroLlamada();
        ct.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnFranja1ActionPerformed

    private void btnFranja2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFranja2ActionPerformed
        numOrigen = txtNumOrigen.getText();
        numDestino = txtNumDestino.getText();

        llamada = new LlamadaProvincial(25, 1, numOrigen, numDestino, 0, "Franja 2");

        CronometroLlamada ct = new CronometroLlamada();
        ct.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnFranja2ActionPerformed

    private void btnFranja3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFranja3ActionPerformed
        numOrigen = txtNumOrigen.getText();
        numDestino = txtNumDestino.getText();

        llamada = new LlamadaProvincial(30, 1, numOrigen, numDestino, 0, "Franja 3");

        CronometroLlamada ct = new CronometroLlamada();
        ct.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnFranja3ActionPerformed

    private void txtNumOrigenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumOrigenKeyPressed

        if (txtNumOrigen.getText().isEmpty() != true && txtNumDestino.getText().isEmpty() != true) {
            habilitar();
        } else {
            iniciar();

        }
    }//GEN-LAST:event_txtNumOrigenKeyPressed

    private void txtNumDestinoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumDestinoKeyPressed
        if (txtNumOrigen.getText().isEmpty() != true && txtNumDestino.getText().isEmpty() != true) {
            habilitar();
        } else {
            iniciar();

        }
    }//GEN-LAST:event_txtNumDestinoKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealizarLlamada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFranja1;
    private javax.swing.JButton btnFranja2;
    private javax.swing.JButton btnFranja3;
    private javax.swing.JButton btnLocal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtNumDestino;
    private javax.swing.JTextField txtNumOrigen;
    // End of variables declaration//GEN-END:variables
}
