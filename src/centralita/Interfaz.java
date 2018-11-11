
package centralita;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Interfaz extends javax.swing.JFrame {
    protected static Centralita callCenter = new Centralita(); 
    
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRegistro = new javax.swing.JTable();
        btnImport = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        btnLlamar = new javax.swing.JButton();
        btnAct = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lbNum = new javax.swing.JLabel();
        btnExp = new javax.swing.JButton();

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
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 150, 136));

        jPanel1.setBackground(new java.awt.Color(0, 150, 136));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de llamadas ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(331, 331, 331))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tbRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Número de origen ", "Número de destino ", "Duración en seg", "Costo en céntimos", "Tipo "
            }
        ));
        jScrollPane1.setViewportView(tbRegistro);

        btnImport.setBackground(new java.awt.Color(121, 85, 72));
        btnImport.setForeground(new java.awt.Color(255, 255, 255));
        btnImport.setText("Importa archivo .csv");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Total factura: ");

        lbTotal.setText("0.00");

        btnLlamar.setBackground(new java.awt.Color(96, 125, 139));
        btnLlamar.setForeground(new java.awt.Color(255, 255, 255));
        btnLlamar.setText("Realizar llamada ");
        btnLlamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlamarActionPerformed(evt);
            }
        });

        btnAct.setBackground(new java.awt.Color(96, 125, 139));
        btnAct.setForeground(new java.awt.Color(255, 255, 255));
        btnAct.setText("Actualizar tabla ");
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Número de llamadas:");

        lbNum.setText("0");

        btnExp.setBackground(new java.awt.Color(76, 175, 80));
        btnExp.setForeground(new java.awt.Color(255, 255, 255));
        btnExp.setText("Exportar registro en .csv");
        btnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNum)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLlamar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExp)
                        .addGap(24, 24, 24))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTotal)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAct, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(lbNum))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lbTotal))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLlamar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(37, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
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

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        try {
            importarRegistro();
        } catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnImportActionPerformed

    private void btnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpActionPerformed
        exportarRegistro();
    }//GEN-LAST:event_btnExpActionPerformed
    
    private void importarRegistro() throws FileNotFoundException, IOException{
        
       
       JFileChooser  file = new JFileChooser();
       file.showOpenDialog(this);
       File abrir = file.getSelectedFile();
       
       if(abrir != null){ 
           FileReader archivo = new FileReader(abrir);
           BufferedReader leer = new BufferedReader(archivo);
           String line = leer.readLine();
           while(null != line){

               String[] matriz = line.split(",");
              for(int i = 0; i < matriz.length; i++){
                  if(matriz[i].equalsIgnoreCase("Número de origen")){
                      break;
                  }
                 
                  else if(matriz[i].equalsIgnoreCase("Número de llamadas")){
                       callCenter.setCont(Integer.parseInt(matriz[i + 1]));
                       break;
                  }
                  else if(matriz[i].equalsIgnoreCase("Costo total")){
                       System.out.println(matriz[i + 1]);  
                       break;
                  }
                  else if(matriz[i + 4].equalsIgnoreCase("Franja 1") || matriz[i + 4].equalsIgnoreCase("Franja 2") || matriz[i + 4].equalsIgnoreCase("Franja 3")){
                       
                      int franja = 1;
                      if(matriz[i + 4].equalsIgnoreCase("Franja 1")){
                           franja = 1;
                       }
                      else if(matriz[i + 4].equalsIgnoreCase("Franja 2")){
                           franja = 2;
                       }
                      else if(matriz[i + 4].equalsIgnoreCase("Franja 3")){
                           franja = 3;
                       }
                      
                      double precio = (Double.parseDouble(matriz[i + 3])/ Double.parseDouble(matriz[i + 2]));
                      String numeOrigen = matriz[i];
                      String numDestino = matriz[i + 1];
                      double duracion =  Double.parseDouble(matriz[i + 2]);
                      String tipo = matriz[i + 4];
                      System.out.println(precio);
                      Llamada llamada = new LlamadaProvincial(precio,franja,numeOrigen,numDestino, duracion, tipo);
                      callCenter.getLlamadas().add(llamada);
                      break;
                  }
                  else{
                      double precio = (Double.parseDouble(matriz[i + 3])/ Double.parseDouble(matriz[i + 2]));
                      String numeOrigen = matriz[i];
                      String numDestino = matriz[i + 1];
                      double duracion =  Double.parseDouble(matriz[i + 2]);
                      String tipo = matriz[i + 4];
                      System.out.println(precio);
                      Llamada llamada = new LlamadaLocal(precio,numeOrigen,numDestino, duracion, tipo);
                      callCenter.getLlamadas().add(llamada);
                      break;
                  }
              }
             
               line = leer.readLine();
           }
          
           JOptionPane.showMessageDialog(null, "El documento fue importado con éxito, por favor presioné el botón \"actualizar tabla\" ");
           
       }
       
       
       
    }
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
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnLlamar;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNum;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTable tbRegistro;
    // End of variables declaration//GEN-END:variables
}
