package Frontend;
import java.awt.Point;
import java.awt.Color;
import javax.swing.JFrame;
import Backend.DrawingEngineBody;
import Backend.Circle;


public class CircleInputs extends javax.swing.JFrame implements Node{
    private Node Pnode;
    private javax.swing.JComboBox<String> ComboBox;
    private DrawingEngineBody D;
    private FillColor FillMenu;
    private BorderColor BorderMenu;
    ColorWindow coWindow;

    public CircleInputs(){
        initComponents();
        FillMenu = null;
        BorderMenu = null;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        XData = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        YData = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        RadiusData = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FillBtn = new javax.swing.JButton();
        BorderBtn = new javax.swing.JButton();
        CreateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        setTitle("Add Circle");

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

        RadiusData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RadiusData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RadiusData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Radius");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(YData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(RadiusData))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(XData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CreateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FillBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BorderBtn)
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
                    .addComponent(RadiusData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FillBtn)
                    .addComponent(BorderBtn))
                .addGap(18, 18, 18)
                .addComponent(CreateBtn)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                                                  
        this.setVisible(false);
        ((JFrame)getParentNode()).setVisible(true);
    }           

    private void AddComboBox(String name){
        if(ComboBox.getSelectedIndex() == -1)     //In case we deleted all shapes we restart indexing
            D.setIndex(1);
        int index = D.getIndex();
        ComboBox.addItem(name+" "+index);
        ComboBox.setSelectedIndex(index-1);       //sets the selected item the last drawn figure
    }

    private int Validations(javax.swing.JTextField Data){
        String Str = Data.getText();
        if(Str.equals("")){
            Data.setText("ADD DATA HERE");
            return -1;
        }
        else{
            try{
                int var = Integer.parseInt(Str);
                if(var < 0){
                    Data.setText("ADD POSITIVE VALUES");
                    return -1;
                }
                else{
                    return var;
                }
            }
            catch(NumberFormatException e){
                    Data.setText("NOT NUMERIC VALUE");
                    return -1;
            }
        }
    }

    private void CreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBtnActionPerformed
        ComboBox = ((MainWindow)Pnode).getComboBox();
        D = ((MainWindow)Pnode).getDrawingEngine();
        javax.swing.JTextField[] TextFields = {XData,YData,RadiusData};
        int x = Validations(XData);
        int y = Validations(YData);
        int radius = Validations(RadiusData);
        if(x == -1 || y== -1 || radius == -1){

        }
        else{
            Circle c = new Circle(new Point(x,y),radius);
            D.addShape(c);
            AddComboBox("Circle");
            setVisible(false);
            ((JFrame)Pnode).setVisible(true);
            for(javax.swing.JTextField t:TextFields){       //clear all text fields
                t.setText("");
            }
        }  

        
    }//GEN-LAST:event_CreateBtnActionPerformed

    private void FillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FillBtnActionPerformed
        
    }//GEN-LAST:event_FillBtnActionPerformed

    private void BorderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorderBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BorderBtnActionPerformed

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
    private javax.swing.JTextField RadiusData;
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
