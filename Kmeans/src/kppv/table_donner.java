/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kppv;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dadab
 */
public class table_donner extends javax.swing.JFrame {

    /**
     * Creates new form table_donner
     */
    public table_donner() {
        initComponents();
    }
public int  rowselect;
public int i=0;
public int h=0;
 static  DefaultTableModel model;
public static void addRowtotable (Object[] D_row){
         model =(DefaultTableModel) t.getModel();
            model.addRow(D_row);
        }
 public void clearTable()
{
   
    DefaultTableModel dtm = (DefaultTableModel) t.getModel();
dtm.setRowCount(0);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        t = new javax.swing.JTable();
        x = new javax.swing.JTextField();
        y = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        y1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        x1 = new javax.swing.JTextField();
        KPPV = new javax.swing.JButton();
        c = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        r = new javax.swing.JLabel();
        k = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class", "X", "Y", "Distense"
            }
        ));
        t.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));
        getContentPane().add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 124, -1));
        getContentPane().add(y, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 124, -1));

        jLabel2.setText("X");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 20, -1));

        jLabel3.setText("Y");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 18, 22));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        y1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y1ActionPerformed(evt);
            }
        });
        getContentPane().add(y1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 40, 40));

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel4.setText("Noveau Point ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 160, -1));

        jLabel5.setText("Y");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, -1, -1));

        jLabel6.setText("X");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, -1, -1));

        jButton2.setText("reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, -1, -1));

        x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1ActionPerformed(evt);
            }
        });
        getContentPane().add(x1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 40, 40));

        KPPV.setText("PPV");
        KPPV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KPPVActionPerformed(evt);
            }
        });
        getContentPane().add(KPPV, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 170, 40));

        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        getContentPane().add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 30, 90, -1));

        jLabel7.setText("Class :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("==>");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 60, 60));

        r.setFont(new java.awt.Font("Segoe UI Emoji", 1, 48)); // NOI18N
        getContentPane().add(r, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, 50, 50));
        getContentPane().add(k, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 40, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setText("K");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 30, 40));

        jLabel1.setText("GRAPH");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 480, 60, 40));

        jMenu1.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 h++;
   String xx= x.getText();
   String yy = y.getText();
   String xx1 = x1.getText();
   String yy1 = y1.getText();
   String clas = c.getText();
   //String fullN=GETFULLNAME.getText();
   int m=0;
     DefaultTableModel model = (DefaultTableModel)t.getModel();
     if("".equals(xx)){
         x.setBackground(Color.red);
         m++;
     }else{
         x.setBackground(Color.white);
     }
     if("".equals(yy)){
         y.setBackground(Color.red);
         m++;
     }else{
         y.setBackground(Color.white);
     }
     if("".equals(xx1)){
         x1.setBackground(Color.red);
         m++;
     }else{
         x1.setBackground(Color.white);
     }
     if("".equals(yy1)){
         y1.setBackground(Color.red);
         m++;
     }else{
         y1.setBackground(Color.white);
     }
     if("".equals(clas)){
         c.setBackground(Color.red);
         m++;
     }else{
         c.setBackground(Color.white);
     }
   if(m==0){
   //addRowtotable(new Object []{ 55,4, 5 ,"g"});
     int select =t.getSelectedRow();
     //String d=(String) model.getValueAt(select, 0);
           if (select>=0){
              // DB.update(GETFULLNAME.getText(),  Integer.parseInt(d));
              model.setValueAt(clas, select, 0);
              model.setValueAt(xx, select, 1);
              
               model.setValueAt(yy, select, 2);
               
                model.setValueAt(Math.sqrt(pow(Double.parseDouble(xx1)-Double.parseDouble(xx),2)+pow(Double.parseDouble(yy1)-Double.parseDouble(yy),2)), select, 3);
                 //model.setValueAt(Math.sqrt(pow(Double.parseDouble(xx1)-Double.parseDouble(xx),2)+pow(Double.parseDouble(yy1)-Double.parseDouble(yy),2)), select, 3);
           }else{
              // Double d=getDistence(xx,yy,xx1,yy1);
               //System.out.println("d="+d);
               Double xv=Double.parseDouble(xx1)-Double.parseDouble(xx);
               Double yv= Double.parseDouble(yy1)-Double.parseDouble(yy);
               //System.out.println("d="+xv);
               //System.out.println("d2="+yv);
               addRowtotable(new Object []{ clas,xx, yy,Math.sqrt((pow(xv,2))+(pow(yv,2)))});
               x.setText(null);
               y.setText(null);
               //JOptionPane.showMessageDialog(this, "ERROR");
           }
           i++;}else{
       JOptionPane.showMessageDialog(this,"write all data");
   }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y1ActionPerformed

    private void x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
x1.setText(null);
y1.setText(null);// TODO add your handling code here:

    }//GEN-LAST:event_jButton2ActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cActionPerformed

    private void KPPVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KPPVActionPerformed
        ArrayList<Double> mydistence = new ArrayList<Double>();
        ArrayList<Integer> myclass = new ArrayList<Integer>();
         ArrayList<Integer> clasRep = new ArrayList<Integer>();
         ArrayList<Integer> clasRepcomp = new ArrayList<Integer>();
        Double m,listmin = null,p;
         int v=0,e=0;
         r.setText(null);
          if(h==0){
              JOptionPane.showMessageDialog(this,"table vide ");  
              e++;
         }
         if("".equals(k.getText())){
         k.setBackground(Color.red);
         v++;
         }else{
         k.setBackground(Color.white);
         }
         if(v==0 &&  e==0){
         //add les distence in array list (mydistence)
         System.out.println(model.getRowCount());
         for (int r = 0; r < model.getRowCount(); r++) {
             mydistence.add(Double.parseDouble( model.getValueAt(r, 3).toString()));
             
         }
        
         //trie array list de destence croiasent
          for (int i = 0; i < mydistence.size(); i++){ 
             
             
                for (int j = i+1; j < mydistence.size(); j++) {
                          
                      if(mydistence.get(j)<mydistence.get(i)){
                                 
                               p=mydistence.get(i);
                               mydistence.set(i,mydistence.get(j)); 
                                //y=j;
                               mydistence.set(j, p);
                              
                       }

                } 

      
            }
          
           //trie les class in arraylist
            for (int j = 0; j < mydistence.size(); j++) {
                    for (int o = 0; o < model.getRowCount(); o++) {
                   if (Objects.equals(mydistence.get(j), Double.valueOf(model.getValueAt(o, 3).toString()))) {
                       myclass.add(Integer.valueOf(model.getValueAt(o, 0).toString()));
                         //System.out.println("hi hi ");
                   } 
                   }
                    
                }
            // k
                System.out.println(myclass);
          int kk=Integer.parseInt(k.getText());
          if(kk==1 || kk==2){
              r.setText(myclass.get(0).toString());
          }else{
              
                  
                 
                           int b=0,c=0,ii=0;
                           for (int j = 0; j < kk; j++) {
                           if(b==0){
                                for (int u = 0; u < kk; u++) {
                               if(Objects.equals(myclass.get(u), myclass.get(0))) {
                                   c++;
                                   b++;
                               }
                                }
                                clasRep.add(c);
                                c=0;
                                clasRepcomp.add(myclass.get(j));
                           }else{
                               
                               if(!Objects.equals(myclass.get(j), myclass.get(ii))){
                                   ii=j;
                                   for (int u = 0; u < kk; u++) {
                               if(Objects.equals(myclass.get(u), myclass.get(j))) {
                                   c++;
                                   
                               }
                                }
                                   clasRep.add(c);
                                   c=0;
                                   clasRepcomp.add(myclass.get(j));
                               }

                   
              }
            
          }
         
          
          System.out.println(mydistence);
          System.out.println(clasRep+"<<<<<");
          System.out.println(">>>"+clasRepcomp);
          
          
           int index=0;
        //DefaultTableModel model = (DefaultTableModel)t.getModel();
         //System.out.println("d2="+model.getValueAt(0, 3));
         Double max= Double.valueOf(clasRep.get(0).toString());
        
         for (int j = 1; j < clasRep.size(); j++) { 
              m=Double.valueOf(clasRep.get(j).toString());
            if(m>max){
               max=m;
               index=j; 
            }
        }
         r.setText(clasRepcomp.get(index).toString());
    }}else{
           JOptionPane.showMessageDialog(this,"write K ");  
         }
          for (int j = 0; j < mydistence.size(); j++) {
         mydistence.remove(j);
                 }
          for (int j = 0; j < myclass.size(); j++) {
         myclass.remove(j);
                 }
          for (int j = 0; j < clasRep.size(); j++) {
         clasRep.remove(j);
                 }
          for (int j = 0; j < clasRepcomp.size(); j++) {
         clasRepcomp.remove(j);
                 }
          
    }//GEN-LAST:event_KPPVActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
clearTable();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
          
        /*import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;*/

 class PointPlotter extends JPanel {

  public void paintComponent(Graphics g) {
      int x=0;
         int y=0;
         //PointPlotter p=new PointPlotter();
    super.paintComponent(g);
    for (int r = 0; r < model.getRowCount(); r++) {
          x=  Integer.parseInt(model.getValueAt(r, 1).toString());
          y=  Integer.parseInt(model.getValueAt(r, 2).toString());
             g.setColor(Color.red);  
            g.fillOval(-x, -y, 20, 20); // draws a point at (50, 50)
            
            
         }
    
  }
 }
 
 
  //public static void main(String[] args) {
    JFrame frame = new JFrame("Point Plotter");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new PointPlotter());
    frame.setSize(200, 200);
    frame.setVisible(true);
  //}


       
        
        
        /* int[] coordinates={100,20};
    int mar=50;
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g1=(Graphics2D)g;
        g1.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        int width=getWidth();
        int height=getHeight();
        g1.draw(new Line2D.Double(mar,mar,mar,height-mar));
        g1.draw(new Line2D.Double(mar,height-mar,width-mar,height-mar));
        double x=(double)(width-2*mar)/(coordinates.length-1);
        double scale=(double)(height-2*mar)/getMax();
        g1.setPaint(Color.BLUE);
        for(int i=0;i<coordinates.length;i++){
            double x1=mar+i*x;
            double y1=height-mar-scale*coordinates[i];
            g1.fill(new Ellipse2D.Double(x1-2,y1-2,4,4));
        }
        
        
        
    }
    private int getMax(){
        int max=-Integer.MAX_VALUE;
        for(int i=0;i<coordinates.length;i++){
            if(coordinates[i]>max)
                max=coordinates[i];
           
        }return max;
    }       
        
    public static void main(String args[]){
        JFrame frame =new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new G());
    frame.setSize(400,400);
    frame.setLocation(200,200);
    frame.setVisible(true);
    }
}*/
           
    }//GEN-LAST:event_jLabel1MouseClicked

    private void tMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMouseClicked
         DefaultTableModel model = (DefaultTableModel)t.getModel();
     int selectedRowIndex =t.getSelectedRow();
    
//GETFULLNAME.setText(model.getValuAt(selectedRowIndex,1));
x.setText(model.getValueAt(selectedRowIndex, 1).toString());
y.setText(model.getValueAt(selectedRowIndex, 2).toString());
c.setText(model.getValueAt(selectedRowIndex,0).toString());
 
    }//GEN-LAST:event_tMouseClicked

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
            java.util.logging.Logger.getLogger(table_donner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(table_donner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(table_donner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(table_donner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new table_donner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KPPV;
    private javax.swing.JTextField c;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField k;
    private javax.swing.JLabel r;
    public static javax.swing.JTable t;
    private javax.swing.JTextField x;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField y;
    private javax.swing.JTextField y1;
    // End of variables declaration//GEN-END:variables

    private Double getDistence(String xx,String yy,String xx1,String yy1) {
    return Math.sqrt(pow(Double.parseDouble(xx1)-Double.parseDouble(xx),2)+pow(Double.parseDouble(yy1)-Double.parseDouble(yy),2));
    }
}
