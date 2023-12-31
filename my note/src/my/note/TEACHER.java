/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package my.note;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yahia Benotmane
 */
public class TEACHER extends javax.swing.JFrame {

    /**
     * Creates new form TEACHER
     */
    public TEACHER() {
        initComponents();
        SetIconImage();
         this.setLocationRelativeTo(this);
    }
    public int  rowselect;
 static  DefaultTableModel model;
public static void addRowtotable (Object[] D_row){
         model =(DefaultTableModel) jTable1.getModel();
            model.addRow(D_row);
        }
 public void clearTable()
{
   
    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TEACHERNAMELabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        info = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        BTNsave = new javax.swing.JButton();
        BTNinsert = new javax.swing.JButton();
        ClassnameLabel = new javax.swing.JLabel();
        INPUTIDSEARCH = new javax.swing.JTextField();
        INPUTTEST = new javax.swing.JTextField();
        SerchLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LabelFULLNAME = new javax.swing.JLabel();
        LabelTEST = new javax.swing.JLabel();
        LabelEXAM = new javax.swing.JLabel();
        LabelMOYENNE = new javax.swing.JLabel();
        INPUTEXAM = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        LabelClass = new javax.swing.JLabel();
        LabelMODULE = new javax.swing.JLabel();
        LabelNUMBER = new javax.swing.JLabel();
        GETFULLNAME = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        OUTPUTremark = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fullname", "Test", "Exame", "Moyenne"
            }
        ));
        jTable1.setRowHeight(30);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        TEACHERNAMELabel.setText("Hello , Mr Username");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/note/bookmark_20px.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonUpdate.setBackground(new java.awt.Color(204, 204, 204));
        buttonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/note/update_user_20px.png"))); // NOI18N
        buttonUpdate.setText("Update");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/note/paper_plane_20px.png"))); // NOI18N
        jButton3.setText("Push");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        info.setBackground(new java.awt.Color(204, 204, 204));
        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/note/info_25px.png"))); // NOI18N
        info.setText("Info");
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/note/enter_25pxwhit.png"))); // NOI18N
        jButton5.setText("Exit");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        BTNsave.setBackground(new java.awt.Color(204, 204, 204));
        BTNsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/note/bookmark_20px.png"))); // NOI18N
        BTNsave.setText("Save");

        BTNinsert.setBackground(new java.awt.Color(204, 204, 204));
        BTNinsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/note/new_document_20px.png"))); // NOI18N
        BTNinsert.setText("Insert");
        BTNinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNinsertActionPerformed(evt);
            }
        });

        ClassnameLabel.setText("Class of :");

        INPUTTEST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INPUTTESTActionPerformed(evt);
            }
        });

        SerchLabel.setText("Search some student");

        jLabel5.setText("Test :");

        LabelFULLNAME.setText("Fullname :");

        LabelTEST.setText("Test :");

        LabelEXAM.setText("Exam :");

        LabelMOYENNE.setText("Moyenne :");

        jLabel10.setText("Exam :");

        jLabel11.setText("Tools :");

        jLabel12.setText("Class information :");

        LabelClass.setText("Class :");

        LabelMODULE.setText("Module :");

        LabelNUMBER.setText("Student number :");

        jLabel1.setText("Full name ;");

        OUTPUTremark.setText("...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addComponent(jLabel12)
                            .addComponent(LabelClass)
                            .addComponent(LabelMODULE)
                            .addComponent(LabelNUMBER))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClassnameLabel))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SerchLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BTNinsert, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BTNsave, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addComponent(LabelFULLNAME)
                            .addComponent(LabelTEST)
                            .addComponent(LabelEXAM)
                            .addComponent(LabelMOYENNE)
                            .addComponent(INPUTEXAM, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(INPUTTEST, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(GETFULLNAME)
                            .addComponent(INPUTIDSEARCH)
                            .addComponent(OUTPUTremark, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(TEACHERNAMELabel))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TEACHERNAMELabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClassnameLabel)
                    .addComponent(SerchLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(INPUTIDSEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LabelFULLNAME)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LabelTEST)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LabelEXAM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LabelMOYENNE)
                                .addGap(195, 195, 195)
                                .addComponent(jLabel1)
                                .addGap(1, 1, 1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LabelClass)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LabelMODULE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LabelNUMBER)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(13, 13, 13)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(GETFULLNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(INPUTTEST, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(INPUTEXAM, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OUTPUTremark)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BTNinsert, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BTNsave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public int u=0;//size data base
    private void BTNinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNinsertActionPerformed
   String exam = INPUTEXAM.getText();
   String test = INPUTTEST.getText();
   String fullN=GETFULLNAME.getText();
     DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
   
  
     int select =jTable1.getSelectedRow();
     //String d=(String) model.getValueAt(select, 0);
           if (select>=0){
              // DB.update(GETFULLNAME.getText(),  Integer.parseInt(d));
              model.setValueAt(fullN, select, 1);
               model.setValueAt(test, select, 2);
                model.setValueAt(exam, select, 3);
                 model.setValueAt((Double.parseDouble(exam)+Double.parseDouble(test))/2, select, 4);
           }else{
               JOptionPane.showMessageDialog(this, "ERROR");
           }
    }//GEN-LAST:event_BTNinsertActionPerformed

    private void INPUTTESTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INPUTTESTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INPUTTESTActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
         new DEP().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton5MouseClicked

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
             // public static ArrayList<Attribute> getpersons(){
             clearTable();
        System.out.println("updating...........");
        DB db= new DB();
        db.getConnection();
        Connection conn= db.getConnection();
        Statement stmt;
       // ArrayList<Attribute>  personlist =new ArrayList();
      
        try{
            stmt=conn.createStatement();
            ResultSet rs =stmt.executeQuery("select id,student_name from student_info");
            while(rs.next()){//next() bcause other data going in rs(resultset)
               Attribute person =new Attribute();
               person.setId(rs.getInt("id"));
               person.setStudent_name(rs.getString("student_name"));
               //person.setAge(rs.getInt("age"));
             //  personlist.add(person);
               
               addRowtotable(new Object []{ person.getId() ,person.getStudent_name(),null, null ,null});
            }
            conn.close();
            //return personlist;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        //return null;
        
        
   // }
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
     int selectedRowIndex =jTable1.getSelectedRow();
    
//GETFULLNAME.setText(model.getValuAt(selectedRowIndex,1));
GETFULLNAME.setText(model.getValueAt(selectedRowIndex, 1).toString());
INPUTTEST.setText(model.getValueAt(selectedRowIndex, 2).toString());
INPUTEXAM.setText(model.getValueAt(selectedRowIndex,3).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       //ArrayList<Attribute> listA = new ArrayList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
       Attribute person =new Attribute();
      
       int taille = jTable1.getRowCount();
       //boolean up=true;
        /*try {
            System.out.println("size="+DB.sizeArabic());
            if(DB.sizeArabic()==0){
                up=false;
            }} catch (SQLException ex) {
            Logger.getLogger(TEACHER.class.getName()).log(Level.SEVERE, null, ex);
        }*/
       for(int i=0;i<taille;i++){
        person.setTest(model.getValueAt(i, 2).toString());
        person.setExam(model.getValueAt(i, 3).toString());
        person.setStudent_name( model.getValueAt(i, 1).toString());
          person.setClasse("//");
           
            person.setAverage(model.getValueAt(i, 4).toString());
            if(u<=taille){
                DB.insert(person);
                u++;
    }else{
           System.out.println("this "+DB.update((String) model.getValueAt(i, 1),person));
            }  
       }
      /* int i=0;
       //for(int i=0;i<=3;i++){
            String t =(String) model.getValueAt(i, 2);
            String t2=(String) model.getValueAt(i, 3);
            String t3=(String) model.getValueAt(i, 4);
        person.setStudent_name("gggggggg");
        Double g=Double.valueOf(t);
         person.setTest(5.00);
        person.setExam(5.2);
        person.setAverage(11.00);
        person.setClasse("cc");
         DB.insert(person);*/
       //}
       //listA.add(person);
      // DB.insert(person);
        /*Attribute atr= new Attribute();
        atr.setTest();
        atr.setExam();*/
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int width = jTable1.getRowCount(); 
         System.out.println(">>>"+width);
         JOptionPane.showMessageDialog(this,  width);
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
       
       
               // DB.update();
    }//GEN-LAST:event_infoActionPerformed

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
            java.util.logging.Logger.getLogger(TEACHER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TEACHER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TEACHER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TEACHER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TEACHER().setVisible(true);
            }
        });
    }
    
private void SetIconImage() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LOGO.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNinsert;
    private javax.swing.JButton BTNsave;
    private javax.swing.JLabel ClassnameLabel;
    private javax.swing.JTextField GETFULLNAME;
    private javax.swing.JTextField INPUTEXAM;
    private javax.swing.JTextField INPUTIDSEARCH;
    private javax.swing.JTextField INPUTTEST;
    private javax.swing.JLabel LabelClass;
    private javax.swing.JLabel LabelEXAM;
    private javax.swing.JLabel LabelFULLNAME;
    private javax.swing.JLabel LabelMODULE;
    private javax.swing.JLabel LabelMOYENNE;
    private javax.swing.JLabel LabelNUMBER;
    private javax.swing.JLabel LabelTEST;
    private javax.swing.JLabel OUTPUTremark;
    private javax.swing.JLabel SerchLabel;
    private javax.swing.JLabel TEACHERNAMELabel;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JButton info;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
