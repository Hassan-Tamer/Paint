package Frontend;

import java.awt.Point;
import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import Shapes.DrawingEngineBody;
import Shapes.Circle;


public class CircleInputs extends javax.swing.JFrame implements Node{
    private Node Pnode;
    private DrawingEngineBody D;
    private Color Fill = Color.WHITE;
    private Color Border = Color.BLACK;

    public CircleInputs(){
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        XData = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        YData = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        HeightData = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FillBtn = new javax.swing.JButton();
        BorderBtn = new javax.swing.JButton();
        CreateBtn = new javax.swing.JButton();
        Widthdata = new javax.swing.JTextField();
        Width = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Add Circle");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Y");

        HeightData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HeightData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        HeightData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Height");

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
        CreateBtn.setText("Create Circle");
        CreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBtnActionPerformed(evt);
            }
        });

        Widthdata.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Widthdata.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Widthdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WidthdataActionPerformed(evt);
            }
        });

        Width.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Width.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Width.setText("Width");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CreateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FillBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BorderBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Width, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(Widthdata))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(YData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(HeightData))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(XData)))
                        .addGap(0, 126, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(XData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(YData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(HeightData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Width)
                    .addComponent(Widthdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FillBtn)
                    .addComponent(BorderBtn))
                .addGap(18, 18, 18)
                .addComponent(CreateBtn)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearText(){
        javax.swing.JTextField[] TextFields = {XData,YData,HeightData,Widthdata};
        for(javax.swing.JTextField t:TextFields){
            t.setText("");
        }
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                                                  
        this.setVisible(false);
        ((JFrame)getParentNode()).setVisible(true);
        clearText();
    }           

    private void CreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBtnActionPerformed
        D = ((MainWindow)Pnode).getDrawingEngine();
        int x = ((MainWindow)Pnode).Validations(XData);
        int y = ((MainWindow)Pnode).Validations(YData);
        int Height = ((MainWindow)Pnode).Validations(HeightData);
        int Width = ((MainWindow)Pnode).Validations(Widthdata);
        if(x == -1 || y== -1 || Height == -1 || Width == -1)
            return;
    
        Circle c = new Circle(new Point(x,y),Height,Width);
        c.setColor(Border);
        c.setFillColor(Fill);
        setVisible(false);
        ((JFrame)Pnode).setVisible(true);
        D.addShape(c);
        ((MainWindow)Pnode).AddComboBox(c.toString());
        Border = Color.BLACK;
        Fill = Color.WHITE;
        clearText();
        
    }//GEN-LAST:event_CreateBtnActionPerformed

    private void FillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FillBtnActionPerformed
        Color c=JColorChooser.showDialog(this,"Fill Color",Fill);
        if(c!=null)
            Fill = c;
    }//GEN-LAST:event_FillBtnActionPerformed

    private void BorderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorderBtnActionPerformed
        Color c=JColorChooser.showDialog(this,"Fill Color",Border);
        if(c!=null)
            Border = c;
    }//GEN-LAST:event_BorderBtnActionPerformed

    private void WidthdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WidthdataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WidthdataActionPerformed
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
            java.util.logging.Logger.getLogger(CircleInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CircleInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CircleInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CircleInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CircleInputs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorderBtn;
    private javax.swing.JButton CreateBtn;
    private javax.swing.JButton FillBtn;
    private javax.swing.JTextField HeightData;
    private javax.swing.JLabel Width;
    private javax.swing.JTextField Widthdata;
    private javax.swing.JTextField XData;
    private javax.swing.JTextField YData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setParentNode(Node n) {
        Pnode = n;
    }

    @Override
    public Node getParentNode() {
        return Pnode;
    }
}
