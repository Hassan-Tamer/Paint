package Frontend;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;

public class ColorWindow extends javax.swing.JFrame implements Node{

    /**
     * Creates new form ColorWindow
     */
    private Node Pnode;
    private FillColor FillMenu;
    private BorderColor BorderMenu;
    private Color Fill,Border;
    public ColorWindow() {
        initComponents();
        setTitle("Color Chooser");
        setResizable(false);
        FillMenu = null;
        BorderMenu = null;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        SetFillBtn = new javax.swing.JButton();
        DefaultFillBtn = new javax.swing.JButton();
        DefaultBorderBtn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FillPanel = new javax.swing.JPanel();
        BorderPanel = new javax.swing.JPanel();
        SetBorderBtn = new javax.swing.JButton();
        SetColorsBtn = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        SetFillBtn.setBackground(new java.awt.Color(153, 255, 255));
        SetFillBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SetFillBtn.setText("Set Background");
        SetFillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetFillBtnActionPerformed(evt);
            }
        });

        DefaultFillBtn.setBackground(new java.awt.Color(153, 255, 255));
        DefaultFillBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DefaultFillBtn.setText("Set Default Fill Color");
        DefaultFillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultFillBtnActionPerformed(evt);
            }
        });

        DefaultBorderBtn1.setBackground(new java.awt.Color(153, 255, 255));
        DefaultBorderBtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DefaultBorderBtn1.setText("Set Default Border Color");
        DefaultBorderBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultBorderBtn1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fill Color");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Border Color");
        jLabel2.setOpaque(true);

        FillPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout FillPanelLayout = new javax.swing.GroupLayout(FillPanel);
        FillPanel.setLayout(FillPanelLayout);
        FillPanelLayout.setHorizontalGroup(
            FillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        FillPanelLayout.setVerticalGroup(
            FillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        BorderPanel.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout BorderPanelLayout = new javax.swing.GroupLayout(BorderPanel);
        BorderPanel.setLayout(BorderPanelLayout);
        BorderPanelLayout.setHorizontalGroup(
            BorderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        BorderPanelLayout.setVerticalGroup(
            BorderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        SetBorderBtn.setBackground(new java.awt.Color(153, 255, 255));
        SetBorderBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SetBorderBtn.setText("Set Border");
        SetBorderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetBorderBtnActionPerformed(evt);
            }
        });

        SetColorsBtn.setBackground(new java.awt.Color(153, 255, 255));
        SetColorsBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SetColorsBtn.setText("Set Colors");
        SetColorsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetColorsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DefaultBorderBtn1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BorderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addComponent(SetColorsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(SetBorderBtn)))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SetFillBtn)
                    .addComponent(DefaultFillBtn)
                    .addComponent(FillPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(490, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FillPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BorderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetColorsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DefaultFillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DefaultBorderBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SetFillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetBorderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(340, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                                                  
        this.setVisible(false);
        ((JFrame)getParentNode()).setVisible(true);
    }                     

    private void SetFillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetFillBtnActionPerformed
        if(FillMenu == null){
            FillMenu = new FillColor();
            FillMenu.setParentNode(this);
        }
        FillMenu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_SetFillBtnActionPerformed

    private void SetBorderBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        if(BorderMenu == null){
            BorderMenu = new BorderColor();
            BorderMenu.setParentNode(this);
        }
        BorderMenu.setVisible(true);
        setVisible(false);
        
    }                         
                        
    private void DefaultFillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DefaultFillBtnActionPerformed
        Fill = Color.WHITE;
        FillPanel.setBackground(Color.WHITE);
    }//GEN-LAST:event_DefaultFillBtnActionPerformed

    private void DefaultBorderBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DefaultBorderBtn1ActionPerformed
        Border = Color.BLACK;
        BorderPanel.setBackground(Color.BLACK);
    }//GEN-LAST:event_DefaultBorderBtn1ActionPerformed

    private void SetColorsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetColorsBtnActionPerformed
        ((MainWindow)getParentNode()).setBorder(Border);
        ((MainWindow)getParentNode()).setFill(Fill);
        JOptionPane.showMessageDialog(null, "Colors Set Successfully"); //Feedback message
        setVisible(false);
        ((JFrame)Pnode).setVisible(true);
        ((MainWindow)Pnode).colorShape();       //Colorize the  shape and refresh
    }//GEN-LAST:event_SetColorsBtnActionPerformed


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
            java.util.logging.Logger.getLogger(ColorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColorWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BorderPanel;
    private javax.swing.JButton DefaultBorderBtn1;
    private javax.swing.JButton DefaultFillBtn;
    private javax.swing.JPanel FillPanel;
    private javax.swing.JButton SetBorderBtn;
    private javax.swing.JButton SetColorsBtn;
    private javax.swing.JButton SetFillBtn;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setParentNode(Node n) {
        Pnode = n;
    }

    @Override
    public Node getParentNode() {
        return Pnode;
    }

    public Node getPnode() {
        return Pnode;
    }

    public void setPnode(Node pnode) {
        Pnode = pnode;
    }

    public Color getFill() {
        return Fill;
    }

    public void setFill(Color fill) {
        Fill = fill;
    }

    public Color getBorder() {
        return Border;
    }

    public void setBorder(Color border) {
        Border = border;
    }


    public void setFillPanelColor(Color fill) {
        FillPanel.setBackground(fill);
    }

    public void setBoarderPanelColor(Color Border) {
        BorderPanel.setBackground(Border);
    }

}
