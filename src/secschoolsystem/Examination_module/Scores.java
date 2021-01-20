/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package secschoolsystem.Examination_module;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author NDIEMA
 */
public class Scores extends javax.swing.JPanel {
Connection conn=null;
    Statement st=null;
       String pwd="";
    String user="root";
    String url = "jdbc:mysql://localhost:3306/school";
        String userid = "root",in;
        String password = "";
        public String ny;
    String sql2,sql;
 private void fillcombobox()
{
    try{
       Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn=DriverManager.getConnection(url,user,pwd);
            st=conn.createStatement();
            String sql="select admno from student";
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                String ad=rs.getString("admno");
                adno.addItem(ad);
            }
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
}
  private double getavgscore()
{
    double avmark=0.0;
   String sql1 = "SELECT avg( `mark` ) FROM `performance` WHERE `adm_no` = '"+adno.getSelectedItem()+"' AND  `term` = '"+String.valueOf(term.getSelectedItem())+"' AND `issue_date` = '"+String.valueOf(((JTextField)idate.getDateEditor().getUiComponent()).getText())+"' AND `class_name` = '"+String.valueOf(form.getSelectedItem())+"'"; 
   String sql3 = "update classresult set  values(?,?,?,?)"; 
  try 
        {
            Connection connection = DriverManager.getConnection( url, userid, password );
            PreparedStatement pst = connection.prepareStatement(sql1);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                avmark=rs.getDouble("avg( `mark` )");
                avg.setText(String.valueOf(avmark));
               // return(avmark);
            }
        }
        catch (SQLException e)
        {
            System.out.println( e.getMessage() );
        }
  return(avmark);
}
   private void runclassresulttriger()
{
    double avmark=Double.parseDouble(avg.getText());
    String sql2="insert into classresults values('"+adno.getSelectedItem()+"','"+String.valueOf(form.getSelectedItem())+"','"+avmark+"','"+String.valueOf(term.getSelectedItem())+"','"+String.valueOf(((JTextField)idate.getDateEditor().getUiComponent()).getText())+"')";
   String sql1 = "SELECT * from classresults WHERE adm_no = '"+adno.getSelectedItem()+"' AND  `term` = '"+String.valueOf(term.getSelectedItem())+"' AND `issue_date` = '"+String.valueOf(((JTextField)idate.getDateEditor().getUiComponent()).getText())+"' AND `classname` = '"+String.valueOf(form.getSelectedItem())+"'"; 
  sql="update classresult set mark='"+avmark+"' where adm_no = '"+adno.getSelectedItem()+"' AND  `term` = '"+String.valueOf(term.getSelectedItem())+"' AND `issue_date` = '"+String.valueOf(((JTextField)idate.getDateEditor().getUiComponent()).getText())+"' AND `classname` = '"+String.valueOf(form.getSelectedItem())+"'"; 
   try 
        {
            Connection connection = DriverManager.getConnection( url, userid, password );
            PreparedStatement pst = connection.prepareStatement(sql1);
            ResultSet rs = pst.executeQuery();
            if(!rs.next()){
               pst.execute(sql2);
               JOptionPane.showMessageDialog(null,"success");
            }
            else{
                pst.execute(sql);
                  JOptionPane.showMessageDialog(null,"success");
            }
        }
        catch (SQLException e)
        {
            System.out.println( e.getMessage() );
        }
 
}
   public String GetSubectCode()
    {
       
       return(String.valueOf(subcode.getSelectedItem()));
    }
    public String Getterm()
    {
       return(String.valueOf(term.getSelectedItem()));
    }
    public String Getform()
    {
       return(String.valueOf(form.getSelectedItem()));
    }
     public String GetDate()
    {
        
     String h=String.valueOf(((JTextField)idate.getDateEditor().getUiComponent()).getText());
     if((((JTextField)idate.getDateEditor().getUiComponent()).getText()).isEmpty()){
       save.setEnabled(false);
     }
     else{
       save.setEnabled(true);   
     }
       return(h);
        
    }
   
private boolean validateentry()
    {
     return true;
     
    }
    public Scores() {
    
        initComponents();
        getdatafrommysql();fillcombobox();
    }
public void getdatafrommysql()
{
  sql = "select distinct    * from performance";  
  try 
        {
            Connection connection = DriverManager.getConnection( url, userid, password );
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            scs.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException e)
        {
            System.out.println( e.getMessage() );
        }
  
        
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        subcode = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        term = new javax.swing.JComboBox();
        form = new javax.swing.JComboBox();
        idate = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        change = new javax.swing.JButton();
        err = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        score = new javax.swing.JTextField();
        grd = new javax.swing.JTextField();
        pts = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        adno = new javax.swing.JComboBox();
        avg = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        scs = new javax.swing.JTable();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("SET"));

        subcode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "101 English", "102 Kiswahili", "121 Mathematics", "231 Biology", "232 Physics", "233 Chemistry", "311 History", "312 Geography", "313 C.R.E", "443 Agriculture", "451 Computer Studies", "565 Business studies", " " }));

        jLabel5.setText("SUBJECT");

        jLabel6.setText("CLASS");

        term.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TERM 1", "TERM 2", "TERM 3" }));

        form.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FORM 1", "FORM 2", "FORM 3", "FORM 4" }));

        idate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                idateMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                idateMouseReleased(evt);
            }
        });

        jLabel7.setText("TERM");

        jLabel8.setText("ISSUE DATE: ");

        ok.setText("SET");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        change.setText("CHANGE");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });

        err.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 56, Short.MAX_VALUE)
                .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(err, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(form, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subcode, 0, 217, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(term, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subcode, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(term, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(err, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SCORES RECORD..", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 12))); // NOI18N

        jLabel1.setText("STUDENT_ID:");

        jLabel2.setText("SCORE:");

        jLabel3.setText("GRADE:");

        jLabel4.setText("POINTS:");

        score.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        score.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                scoreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                scoreKeyTyped(evt);
            }
        });

        grd.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        pts.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        save.setText("SAVE");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveMouseEntered(evt);
            }
        });
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(grd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(score, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pts)
                    .addComponent(adno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(avg, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(adno, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(score))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pts))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        scs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(scs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 442, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 443, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void idateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idateMouseExited

    }//GEN-LAST:event_idateMouseExited

    private void idateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idateMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_idateMouseReleased

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        String dt=this.GetDate();
        /*idate.getForeground().equals(Color.red)*/
        if(dt.equals("")||(err.getForeground().equals(Color.red))){
            err.setForeground(Color.red);
            err.setText("ERROR:::INVALID_DATE/NO_DATE_ENTERED!!!");}
        //else if(dt.)
        else{
            err.setForeground(Color.green);
            err.setText("SUCCESS:::CHANGES_SAVED!!!");
            subcode.setEnabled(false);term.setEnabled(false);
            form.setEnabled(false);idate.setEnabled(false);
            change.setEnabled(true);ok.setEnabled(false);
            // JOptionPane.showMessageDialog(null,this.GetDate()+","+this.Getform()+","+this.GetSubectCode()+","+this.Getform());
        }     // TODO add your handling code here:
    }//GEN-LAST:event_okActionPerformed

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        subcode.setEnabled(true);term.setEnabled(true);
        form.setEnabled(true);idate.setEnabled(true);
        ok.setEnabled(true);change.setEnabled(false);
        // TODO add yoaur handling code here:
    }//GEN-LAST:event_changeActionPerformed

    private void scoreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scoreKeyReleased
        String sub=this.GetSubectCode();

        int sc=Integer.parseInt(score.getText());
        if(sc>100||sc<0){score.setText("");}
        if(sc<=100&&sc>90){grd.setText("A");pts.setText("12");}
        if(sc<=90&&sc>80){grd.setText("A-");pts.setText("11");}
        if(sc<=80&&sc>70){grd.setText("B+");pts.setText("10");}
        if(sc<=70&&sc>60){grd.setText("B");pts.setText("9");}
        if(sc<=60&&sc>50){grd.setText("B-");pts.setText("8");}
        if(sc<=50&&sc>45){grd.setText("C+");pts.setText("7");}
        if(sc<=45&&sc>40){grd.setText("C");pts.setText("6");}
        if(sc<=40&&sc>35){grd.setText("C-");pts.setText("5");}
        if(sc<=35&&sc>30){grd.setText("D+");pts.setText("4");}
        if(sc<=30&&sc>20){grd.setText("D");pts.setText("3");}
        if(sc<=20&&sc>10){grd.setText("D-");pts.setText("2");}
        if(sc<=10&&sc>0){grd.setText("E");pts.setText("1");}

        //else if(sc<80&&sc>=70){grd.setText("A-");pts.setText("11");}

        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_scoreKeyReleased

    private void scoreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scoreKeyTyped

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) ||(c == KeyEvent.VK_BACK_SPACE)
            || (c == KeyEvent.VK_DELETE))) {
        evt.consume();
        }
        // if(sc>100||sc<0){score.setText("");}

    }//GEN-LAST:event_scoreKeyTyped

    private void saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseEntered
        this.GetDate();        // TODO add your handling code here:
    }//GEN-LAST:event_saveMouseEntered

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn=DriverManager.getConnection(url,user,pwd);
            st=conn.createStatement();
            String sql="insert into performance(class_name,issue_date,subject_code,mark,adm_no,point,grade,term) values ('"+form.getSelectedItem()+"','"+this.GetDate()+"','"+this.GetSubectCode()+"','"+score.getText()+"','"+String.valueOf(adno.getSelectedItem())+"','"+pts.getText()+"','"+grd.getText()+"','"+this.Getterm()+"')";
            st.executeUpdate(sql);
            getavgscore();
            JOptionPane.showMessageDialog(null, "SAVED_SUCCESSFULLY");
            getdatafrommysql();
            runclassresulttriger();
          }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());   // TODO code application logic here
        }
    }//GEN-LAST:event_saveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox adno;
    private javax.swing.JTextField avg;
    private javax.swing.JButton change;
    private javax.swing.JLabel err;
    private javax.swing.JComboBox form;
    private javax.swing.JTextField grd;
    private com.toedter.calendar.JDateChooser idate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ok;
    private javax.swing.JTextField pts;
    private javax.swing.JButton save;
    private javax.swing.JTextField score;
    private javax.swing.JTable scs;
    private javax.swing.JComboBox subcode;
    private javax.swing.JComboBox term;
    // End of variables declaration//GEN-END:variables
}
