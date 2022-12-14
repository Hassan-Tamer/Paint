package Frontend;

import java.awt.Point;

import javax.swing.JColorChooser;
import javax.swing.JFrame;

import java.awt.Color;
import Shapes.DrawingEngineBody;
import Shapes.Triangle;

public class TriangleInputs extends javax.swing.JFrame implements Node{

    private Node Pnode;
    private DrawingEngineBody D;
    private Color Fill = Color.WHITE;
    private Color Border = Color.BLACK;

    public TriangleInputs() {
        initComponents();
        setTitle("Add Triangle");
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Y2Data = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        X1Data = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Y1Data = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        X2Data = new javax.swing.JTextField();
        X3Data = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Y3Data = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        FillBtn = new javax.swing.JButton();
        BorderBtn = new javax.swing.JButton();
        CreateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X2");

        Y2Data.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Y2Data.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Y2Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Y2");

        X1Data.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        X1Data.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        X1Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X1");

        Y1Data.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Y1Data.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Y1Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Y1");

        X2Data.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        X2Data.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        X2Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        X3Data.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        X3Data.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        X3Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X3");

        Y3Data.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Y3Data.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Y3Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Y3");

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
        CreateBtn.setText("Create Triangle");
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
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CreateBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FillBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(BorderBtn)
                        .addGap(28, 28, 28))))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(X3Data, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(Y3Data)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(Y2Data))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(X1Data, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(Y1Data)
                            .addComponent(X2Data))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(X1Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Y1Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(X2Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Y2Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(X3Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Y3Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FillBtn)
                    .addComponent(BorderBtn))
                .addGap(18, 18, 18)
                .addComponent(CreateBtn)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearText(){
        javax.swing.JTextField[] TextFields = {X1Data,Y1Data,X2Data,Y2Data,X3Data,Y3Data};
        for(javax.swing.JTextField t:TextFields){
            t.setText("");
        }
    }

    private void FillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FillBtnActionPerformed
        Color c=JColorChooser.showDialog(this,"Fill Color",Fill);
        if(c!=null)
            Fill = c;
    }//GEN-LAST:event_FillBtnActionPerformed

    private void BorderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorderBtnActionPerformed
        Color c=JColorChooser.showDialog(this,"Border Color",Border);
        if(c!=null)
            Border = c;
    }//GEN-LAST:event_BorderBtnActionPerformed

    private void CreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBtnActionPerformed
        D = ((MainWindow)Pnode).getDrawingEngine();
        int x1 = ((MainWindow)Pnode).Validations(X1Data);
        int y1 = ((MainWindow)Pnode).Validations(Y1Data);
        int x2 = ((MainWindow)Pnode).Validations(X2Data);
        int y2 = ((MainWindow)Pnode).Validations(Y2Data);
        int x3 = ((MainWindow)Pnode).Validations(X3Data);
        int y3 = ((MainWindow)Pnode).Validations(Y3Data);
        int[] variables = {x1,x2,x3,y1,y2,y3};
        
        for(int i : variables){
            if(i==-1)
                return;
        }
        Triangle triangle = new Triangle(new Point(x1,y1),new Point(x2,y2),new Point(x3,y3));
        triangle.setColor(Border);
        triangle.setFillColor(Fill);
        D.addShape(triangle);
        ((MainWindow)Pnode).AddComboBox(triangle.toString());
        setVisible(false);
        ((JFrame)Pnode).setVisible(true);
        clearText();
        Border = Color.BLACK;       //Reset
        Fill = Color.WHITE;
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
            java.util.logging.Logger.getLogger(TriangleInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TriangleInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TriangleInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TriangleInputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TriangleInputs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorderBtn;
    private javax.swing.JButton CreateBtn;
    private javax.swing.JButton FillBtn;
    private javax.swing.JTextField X1Data;
    private javax.swing.JTextField X2Data;
    private javax.swing.JTextField X3Data;
    private javax.swing.JTextField Y1Data;
    private javax.swing.JTextField Y2Data;
    private javax.swing.JTextField Y3Data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
        clearText();
    }           
}
