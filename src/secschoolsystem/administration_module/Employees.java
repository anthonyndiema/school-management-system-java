package secschoolsystem.administration_module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Employees extends javax.swing.JPanel {

 String url = "jdbc:mysql://localhost:3306/school";
        String userid = "root",in;
        String password = "";
        Connection conn=null;
        ResultSet rs;
    Statement st=null;
   
    String pwd="";
    String user="root";
        public String ny;
    String sql;
    public Employees() {
        initComponents();
         getdatafrommysql();
    }
 public void getdatafrommysql()
{
  sql = "select * from teacher";  
  try 
        {
            Connection connection = DriverManager.getConnection( url, userid, password );
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            rec.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException e)
        {
            System.out.println( e.getMessage() );
        }
  
        
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        save = new javax.swing.JButton();
        p_info = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idno = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        job = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        telno = new javax.swing.JTextField();
        addr = new javax.swing.JTextField();
        town = new javax.swing.JTextField();
        sex = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pword = new javax.swing.JPasswordField();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        rec = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        save.setText("SAVE INFORMATION");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        p_info.setBackground(new java.awt.Color(153, 153, 153));
        p_info.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 12))); // NOI18N
        p_info.setName("personal info:"); // NOI18N

        jLabel1.setText("National I.D Number:");

        jLabel2.setText("First name:");

        jLabel3.setText("Last name:");

        jLabel4.setText("Sur name:");

        jLabel9.setText("JOB:");

        job.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "bursar", "patron", "teacher", "matron" }));

        javax.swing.GroupLayout p_infoLayout = new javax.swing.GroupLayout(p_info);
        p_info.setLayout(p_infoLayout);
        p_infoLayout.setHorizontalGroup(
            p_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_infoLayout.createSequentialGroup()
                .addGroup(p_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(job, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fname, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(idno)
                    .addComponent(lname)
                    .addComponent(sname))
                .addContainerGap())
        );
        p_infoLayout.setVerticalGroup(
            p_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(p_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16)
                .addGroup(p_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Other information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 12))); // NOI18N
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);

        jLabel5.setText("Telephone number:");

        jLabel6.setText("Address:");

        jLabel7.setText("Town:");

        sex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "other" }));

        jLabel8.setText("Sex:");

        jLabel10.setText("Password:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sex, 0, 417, Short.MAX_VALUE)
                    .addComponent(town, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addr, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(telno)
                    .addComponent(pword))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(telno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(town, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(pword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(p_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit)
                .addGap(28, 28, 28)
                .addComponent(delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(edit)
                    .addComponent(delete)
                    .addComponent(search)))
        );

        rec.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        rec.getTableHeader().setResizingAllowed(false);
        rec.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(rec);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn=DriverManager.getConnection(url,user,pwd);
            st=conn.createStatement();
            String preid=idno.getText();
            String sql="insert into teacher values( '"+String.valueOf(job.getSelectedItem())+"','"+idno.getText()+"','"+fname.getText()+"','"+lname.getText()+"'"
            + ",'"+sname.getText()+"','"+sex.getSelectedItem()+"','"+telno.getText()+"','"+addr.getText()+"'"
            + ",'"+town.getText()+"','"+String.valueOf(pword.getPassword())+"')";
            rs=st.executeQuery("select * from teacher where  idno='"+idno.getText()+"'");
            if(rs.next())
            {
                st.execute("UPDATE teacher set JOB_TYPE='"+String.valueOf(job.getSelectedItem())+"',fname='"+fname.getText()+"',lname='"+lname.getText()+"'"
                    + ",sname='"+sname.getText()+"',sex='"+sex.getSelectedItem()+"',telno='"+telno.getText()+"',address='"+addr.getText()+"'"
                    + ",town='"+town.getText()+"',pword='"+String.valueOf(pword.getPassword())+"' where idno='"+preid+"'");
           getdatafrommysql();
            }
            else
            {
                st.executeUpdate(sql);getdatafrommysql();
            }
            JOptionPane.showMessageDialog(null, "success");
            initComponents();

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());  // TODO code application logic here
        }//JOptionPane.showMessageDialog(null,( this.getSize()));
        getdatafrommysql();
    }//GEN-LAST:event_saveActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        if(rec.isRowSelected(rec.getSelectedRow())){
            job.setSelectedItem(String.valueOf(rec.getValueAt(rec.getSelectedRow(), 0)));
            idno.setText(String.valueOf(rec.getValueAt(rec.getSelectedRow(), 1)));
            fname.setText(String.valueOf(rec.getValueAt(rec.getSelectedRow(), 2)));
            lname.setText(String.valueOf(rec.getValueAt(rec.getSelectedRow(), 3)));
            sname.setText(String.valueOf(rec.getValueAt(rec.getSelectedRow(), 4)));
            sex.setSelectedItem(String.valueOf(rec.getValueAt(rec.getSelectedRow(), 5)));
            telno.setText(String.valueOf(rec.getValueAt(rec.getSelectedRow(), 6)));
            addr.setText(String.valueOf(rec.getValueAt(rec.getSelectedRow(), 7)));
            town.setText(String.valueOf(rec.getValueAt(rec.getSelectedRow(), 8)));
            pword.setText(String.valueOf(rec.getValueAt(rec.getSelectedRow(), 9)));
        }
        else{
            JOptionPane.showMessageDialog(null, "NO_SELECTED+ROW");
        }

    }//GEN-LAST:event_editActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if(rec.isRowSelected(rec.getSelectedRow())){
            String id=String.valueOf(rec.getValueAt(rec.getSelectedRow(), 1));
            try
            {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                conn=DriverManager.getConnection(url,user,pwd);
                st=conn.createStatement();
                st.executeUpdate("DELETE FROM teacher WHERE idno = '"+id+"'");
                JOptionPane.showMessageDialog(null, "Recore_deleted_successfully");
                getdatafrommysql();
            }
            catch (Exception e)
            {
                System.out.println( e.getMessage() );
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "NO_SELECTED+ROW");
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String sresult=JOptionPane.showInputDialog("Please enter search string:");
        sql = "select * from teacher where  PWORD like '%"+sresult+"%' OR JOB_TYPE like '%"+sresult+"%' OR  idno like '%"+sresult+"%' OR fname like '%"+sresult+"%' OR lname like '%"+sresult+"%' OR sname like '%"+sresult+"%' OR sex like '%"+sresult+"%' OR telno like '%"+sresult+"%' OR town like '%"+sresult+"%' OR address like '%"+sresult+"%'";
        try
        {
            Connection connection = DriverManager.getConnection( url, userid, password );
            PreparedStatement pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();

            rec.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException e)
        {
            System.out.println( e.getMessage() );
        }

    }//GEN-LAST:event_searchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addr;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField idno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox job;
    private javax.swing.JTextField lname;
    private javax.swing.JPanel p_info;
    private javax.swing.JPasswordField pword;
    private javax.swing.JTable rec;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JComboBox sex;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField telno;
    private javax.swing.JTextField town;
    // End of variables declaration//GEN-END:variables
}
