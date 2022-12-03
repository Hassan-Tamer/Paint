package Frontend;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import Backend.*;

public class MainWindow extends javax.swing.JFrame implements Node{
    /**
     * Creates new form MainWindow
     */
    
    private DrawingEngineBody D;
    private ColorWindow colorize = new ColorWindow();
    private Node Pnode;
    private Color Border,Fill;
    private CircleInputs CircleWindow;
    // private RectangleInputs RectangleWindow;
    // private TriangleInputs TriangleWindow;
    // private LineInputs LineWindow;
    
    // public ColorWindow getc(){
    //     return colorize;
    // }

    public void setFill(Color fill) {
        Fill = fill;
    }

    public void setBorder(Color border) {
        Border = border;
    }

    public javax.swing.JComboBox<String> getComboBox(){
        return jComboBox1;
    }

    public DrawingEngineBody getDrawingEngine(){
        return D;
    }

    public MainWindow() {
        initComponents();
        setTitle("Drawing application");
        D = new DrawingEngineBody(DrawingPanel.getGraphics());
        setResizable(false);
        colorize.setParentNode(this);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CircleBtn = new javax.swing.JButton();
        LineBtn = new javax.swing.JButton();
        TriangleBtn = new javax.swing.JButton();
        RectangleBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        ColorizeBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        DrawingPanel = new java.awt.Canvas();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        CircleBtn.setBackground(new java.awt.Color(153, 255, 255));
        CircleBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CircleBtn.setText("Circle");
        CircleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CircleBtnActionPerformed(evt);
            }
        });

        LineBtn.setBackground(new java.awt.Color(153, 255, 255));
        LineBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LineBtn.setText("Line Segment");
        LineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineBtnActionPerformed(evt);
            }
        });

        TriangleBtn.setBackground(new java.awt.Color(153, 255, 255));
        TriangleBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TriangleBtn.setText("Triangle");
        TriangleBtn.setActionCommand("Triangle");
        TriangleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TriangleBtnActionPerformed(evt);
            }
        });

        RectangleBtn.setBackground(new java.awt.Color(153, 255, 255));
        RectangleBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RectangleBtn.setText("Rectangle");
        RectangleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RectangleBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Select Shape");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        ColorizeBtn.setBackground(new java.awt.Color(153, 255, 255));
        ColorizeBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ColorizeBtn.setText("Colorize");
        ColorizeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorizeBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(153, 255, 255));
        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        DrawingPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ColorizeBtn)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CircleBtn)
                        .addGap(38, 38, 38)
                        .addComponent(LineBtn)
                        .addGap(44, 44, 44)
                        .addComponent(TriangleBtn)
                        .addGap(51, 51, 51)
                        .addComponent(RectangleBtn))
                    .addComponent(DrawingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 226, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorizeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RectangleBtn)
                    .addComponent(TriangleBtn)
                    .addComponent(LineBtn)
                    .addComponent(CircleBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DrawingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    protected void jComboBox1ActionPerformed(ActionEvent evt) {
    }
    

    private void AddComboBox(String name){
        if(jComboBox1.getSelectedIndex() == -1)     //In case we deleted all shapes we restart indexing
            D.setIndex(1);
        int index = D.getIndex();
        jComboBox1.addItem(name+" "+index);
        jComboBox1.setSelectedIndex(index-1);       //sets the selected item the last drawn figure
    }

    private int getVariable(String Var , String Title){
        //Pop an input message and take the input
        String Varstr = JOptionPane.showInputDialog(null,"Enter "+Var+":",
        "Getting "+Title,JOptionPane.INFORMATION_MESSAGE);

        //If the user closed the panel function returns -1
        if(Varstr == null)
            return -1;
        try{
            int var = Integer.parseInt(Varstr);
            //If the value is negative function keeps asking for the correct value
            if(var < 0){
                JOptionPane.showMessageDialog(null,"YOU MUST ENTER AN ACCEPTABLE VALUE"
                ,"Negative Number Error",JOptionPane.ERROR_MESSAGE);
                return getVariable(Var, Title);
                }
            return var;
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"YOU MUST ENTER AN ACCEPTABLE VALUE"
                ,"Data Type Error",JOptionPane.ERROR_MESSAGE);
                return getVariable(Var, Title);
        }
    }
    
    //Overload the above function
    //Special case to return a point instead of a single integer
    private Point getVariable(){
        int X = getVariable("X","Position in X");

        if(X == -1)
            return null;
        
        int Y = getVariable("Y","Position in Y");

        if(Y == -1)
            return null;

        Point P = new Point(X,Y);
        return P;
    }

    private void CircleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CircleBtnActionPerformed
        if(CircleWindow == null){
            CircleWindow = new CircleInputs();
            CircleWindow.setParentNode(this);
        }
        CircleWindow.setVisible(true);
    }//GEN-LAST:event_CircleBtnActionPerformed

    private void LineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineBtnActionPerformed
        //Getting variables
        int X1 = getVariable("X1" , "Starting Point (X1) Radius");
        
        if(X1 == -1)        //indicates that the user closed the window
            return;

        int Y1 = getVariable("Y1" , "Starting Point (Y1) Radius");
        
        if(Y1 == -1)
            return;

        int X2 = getVariable("X2" , "End Point (X2) Radius");
        
        if(X2 == -1)
            return;

        int Y2 = getVariable("Y2" , "End Point (Y2) Radius");
        
        if(Y2 == -1)
            return;

        Line l = new Line(new Point(X1,Y1) , new Point(X2,Y2));
        D.addShape(l);
        AddComboBox("Line");
    }//GEN-LAST:event_LineBtnActionPerformed

    private void TriangleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TriangleBtnActionPerformed
        Point p1,p2,p3;
        p1 = getVariable();
        p2 = getVariable();
        p3 = getVariable();

        Triangle tri = new Triangle(p1,p2,p3);
        D.addShape(tri);
        AddComboBox("Triangle");
    }//GEN-LAST:event_TriangleBtnActionPerformed

    private void RectangleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RectangleBtnActionPerformed
       //Getting data to draw rectangle

        Point p = new Point();
        p = getVariable();
        if(p == null)       //indicates that the user closed the window
            return;
        int X = ((int)p.getX());
        int Y = ((int)p.getY());

        int Width = getVariable("Width" , "Rectangle's Width");
        
        if(Width == -1)  //indicates that the user closed the window
            return;

        int Height = getVariable("Height" , "Rectangle's Height");
        
        if(Height == -1)
            return;
        
        Rectangle rec = new Rectangle(new Point(X,Y),Width,Height);

        D.addShape(rec);
        AddComboBox("Rectangle");
    }//GEN-LAST:event_RectangleBtnActionPerformed

    private void ColorizeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorizeBtnActionPerformed
        //If comboBox index is -1 then there isn't any drawn shapes
        if(jComboBox1.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "THERE ARE NO SHAPES TO COLORIZE", 
            "WARNING" , 2);
            return;
        }
        
        if(colorize == null){
            colorize = new ColorWindow();
            colorize.setParentNode(this);
        }
        colorize.setVisible(true);
    }//GEN-LAST:event_ColorizeBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        int i = jComboBox1.getSelectedIndex();
        //No drawn shapes to delete if combobox index is -1
        if(i==-1){
            JOptionPane.showMessageDialog(null, "THERE ARE NO SHAPES TO DELETE", 
            "WARNING" , 2);
            return;
        }
        Shape[] s =  D.getShapes();
        D.removeShape(s[i]);
        jComboBox1.removeItem(jComboBox1.getSelectedItem());

    }//GEN-LAST:event_DeleteBtnActionPerformed

    public void colorShape(){
        int index = jComboBox1.getSelectedIndex();
        Shape[] s = D.getShapes();
        s[index].setColor(Border);
        if(!(s[index] instanceof Line))     //Lines don't have Fill color
            s[index].setFillColor(Fill);
        D.refresh(DrawingPanel.getGraphics());
    }

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1MouseClicked

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CircleBtn;
    private javax.swing.JButton ColorizeBtn;
    private javax.swing.JButton DeleteBtn;
    private java.awt.Canvas DrawingPanel;
    private javax.swing.JButton LineBtn;
    private javax.swing.JButton RectangleBtn;
    private javax.swing.JButton TriangleBtn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
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
