package Frontend;
import java.awt.Point;

import javax.swing.JColorChooser;
import javax.swing.JFrame;

import java.awt.Color;
import Backend.DrawingEngineBody;
import Backend.Rectangle;

public class RectangleInputs extends javax.swing.JFrame implements Node{

    private Node Pnode;
    private DrawingEngineBody D;
    private Color Fill = null;
    private Color Border = Color.BLACK;

    public RectangleInputs() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        HeightData = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        XData = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        YData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        WidthData = new javax.swing.JTextField();
        FillBtn = new javax.swing.JButton();
        BorderBtn = new javax.swing.JButton();
        CreateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        setTitle("Add Rectangle");
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Width");

        HeightData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HeightData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        HeightData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Height");

        XData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        XData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        XData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");

        YData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        YData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        YData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Y");

        WidthData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        WidthData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        WidthData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        FillBtn.setBackground(new java.awt.Color(51, 51, 51));
        FillBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FillBtn.setForeground(new java.awt.Color(255, 255, 255));
        FillBtn.setText("Select Fill Color");
        FillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FillBtnActionPerformed(evt);
            }
        });

        BorderBtn.setBackground(new java.awt.Color(51, 51, 51));
        BorderBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BorderBtn.setForeground(new java.awt.Color(255, 255, 255));
        BorderBtn.setText("Select BorderColor");
        BorderBtn.setActionCommand("Select Border Color");
        BorderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorderBtnActionPerformed(evt);
            }
        });

        CreateBtn.setBackground(new java.awt.Color(51, 51, 51));
        CreateBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CreateBtn.setForeground(new java.awt.Color(255, 255, 255));
        CreateBtn.setText("Create Rectangle");
        CreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(HeightData, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(XData, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(YData)
                            .addComponent(WidthData))))
                .addGap(60, 60, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CreateBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FillBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(BorderBtn)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(XData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(YData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(WidthData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(HeightData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FillBtn)
                    .addComponent(BorderBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(CreateBtn)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FillBtnActionPerformed
        Color c =JColorChooser.showDialog(this,"Fill Color",Color.WHITE);
        if(c!=null)
            Fill = c;
    }//GEN-LAST:event_FillBtnActionPerformed

    private void BorderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorderBtnActionPerformed
        Color c=JColorChooser.showDialog(this,"Border Color",Color.BLACK);
        if(c!=null)
            Border = c;
    }//GEN-LAST:event_BorderBtnActionPerformed

    private void CreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBtnActionPerformed
        D = ((MainWindow)Pnode).getDrawingEngine();
        javax.swing.JTextField[] TextFields = {XData,YData,WidthData,HeightData};
        int x = ((MainWindow)Pnode).Validations(XData);
        int y = ((MainWindow)Pnode).Validations(YData);
        int width = ((MainWindow)Pnode).Validations(WidthData);
        int height = ((MainWindow)Pnode).Validations(HeightData);
        if(x == -1 || y== -1 || height == -1){

        }
        else{
            Rectangle r = new Rectangle(new Point(x,y),width,height);
            r.setColor(Border);
            r.setFillColor(Fill);
            D.addShape(r);
            ((MainWindow)Pnode).AddComboBox("Rectangle");
            setVisible(false);
            ((JFrame)Pnode).setVisible(true);
            for(javax.swing.JTextField t:TextFields){       //clear all text fields
                t.setText("");
            }
            Border = Color.BLACK;
            Fill = null;
        }
    }//GEN-LAST:event_CreateBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RectangleInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RectangleInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RectangleInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RectangleInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RectangleInputs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorderBtn;
    private javax.swing.JButton CreateBtn;
    private javax.swing.JButton FillBtn;
    private javax.swing.JTextField HeightData;
    private javax.swing.JTextField WidthData;
    private javax.swing.JTextField XData;
    private javax.swing.JTextField YData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setParentNode(Node n) {
        Pnode = n;
    }

    @Override
    public Node getParentNode() {
        return Pnode;
    }
    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                                                  
        this.setVisible(false);
        ((JFrame)getParentNode()).setVisible(true);
    }           
}
