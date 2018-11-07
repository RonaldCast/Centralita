
package centralita;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Interfaz extends javax.swing.JFrame {
    protected static Centralita callCenter = new Centralita(); 
    
    public Interfaz() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRegistro = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnExp = new javax.swing.JButton();
        btnLlamar = new javax.swing.JButton();
        btnAct = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbNum = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CallCenter");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Registro de llamada ");

        tbRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Número de origen ", "Número de destino ", "Duración en seg", "Costo en céntimos", "Tipo "
            }
        ));
        jScrollPane1.setViewportView(tbRegistro);

        btnExp.setText("Exportar registro en .csv");
        btnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpActionPerformed(evt);
            }
        });

        btnLlamar.setText("Realizar llamada ");
        btnLlamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlamarActionPerformed(evt);
            }
        });

        btnAct.setText("Actualizar tabla ");
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Total factura: ");

        lbTotal.setText("0.00");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Número de llamadas:");

        lbNum.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLlamar)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExp))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lbTotal)
                                    .addGap(18, 18, 18)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAct)
                                .addGap(141, 141, 141)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbNum)
                                .addGap(18, 18, 18)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAct, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lbNum))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLlamar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLlamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlamarActionPerformed
        RealizarLlamada ventana1 = new RealizarLlamada();
        ventana1.setVisible(true);
    }//GEN-LAST:event_btnLlamarActionPerformed

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
        recorrer();
        lbTotal.setText( "" + Interfaz.callCenter.getTotalFactura());
    }//GEN-LAST:event_btnActActionPerformed

    private void btnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpActionPerformed
        exportarRegistro();
    }//GEN-LAST:event_btnExpActionPerformed
    
    private void  exportarRegistro(){
        try{
            PrintWriter pw = new PrintWriter(new File("callcenter.csv"));
            StringBuilder sb = new StringBuilder();
            
            sb.append("Número de origen");
            sb.append(",");
            sb.append("Número deDestino");
            sb.append(",");
            sb.append("Duracion");
            sb.append(",");
            sb.append("Costo en céntimos");
            sb.append(",");
            sb.append("Tipo");
            sb.append("\n");
            for (int i = 0; i < Interfaz.callCenter.getLlamadas().size(); i++) {
                sb.append(Interfaz.callCenter.getLlamadas().get(i).getNumOrigen());
                sb.append(",");
                sb.append(Interfaz.callCenter.getLlamadas().get(i).getNumDestino());
                sb.append(",");
                sb.append( Interfaz.callCenter.getLlamadas().get(i).getDuracion());
                sb.append(",");
                sb.append(Interfaz.callCenter.getLlamadas().get(i).calcularPrecio());
                sb.append(",");
                sb.append(Interfaz.callCenter.getLlamadas().get(i).getTipo());
                sb.append("\n");
            }
            sb.append("Número de llamadas");
            sb.append(",");
            sb.append(Interfaz.callCenter.getTotalLlamadas());
            sb.append("\n");
            sb.append("Costo total");
            sb.append(",");
            sb.append(Interfaz.callCenter.getTotalFactura());
            
            JOptionPane.showMessageDialog(null, "El archivo callCenter.csv fue exportado con exito");
            pw.write(sb.toString());
            pw.flush();
            pw.close();
        }
        catch(IOException e){
            System.out.println("Error " +  e.getMessage());
        }
    }
    

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
        
    }
    
    public void recorrer(){
        lbNum.setText("" + Interfaz.callCenter.getCont());
        DefaultTableModel modelo = (DefaultTableModel) tbRegistro.getModel(); 
        modelo.setRowCount(0);
        for(int i = 0; i < Interfaz.callCenter.getLlamadas().size() ; i++){
            Object[] fila = new Object[6];
            fila[0] = i + 1 ;
            fila[1] = Interfaz.callCenter.getLlamadas().get(i).getNumOrigen();
            fila[2] = Interfaz.callCenter.getLlamadas().get(i).getNumDestino();
            fila[3] = Interfaz.callCenter.getLlamadas().get(i).getDuracion();
            fila[4] = Interfaz.callCenter.getLlamadas().get(i).calcularPrecio();
            fila[5] = Interfaz.callCenter.getLlamadas().get(i).getTipo();
            modelo.addRow(fila);
            tbRegistro.setModel(modelo);
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAct;
    private javax.swing.JButton btnExp;
    private javax.swing.JButton btnLlamar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNum;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTable tbRegistro;
    // End of variables declaration//GEN-END:variables
}
