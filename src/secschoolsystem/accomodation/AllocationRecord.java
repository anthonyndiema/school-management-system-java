/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package secschoolsystem.accomodation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
public class AllocationRecord extends javax.swing.JFrame {
String url = "jdbc:mysql://localhost:3306/school";
        String userid = "root",in;
        String password = "";
        Connection conn=null;
        ResultSet rs;
    Statement st=null;
   
    String pwd="",sql;
    String user="root";
    
    public AllocationRecord() {
        initComponents();setDefaultLookAndFeelDecorated(true);
           setExtendedState(JFrame.MAXIMIZED_BOTH);
fillcombobox();getdatafrommysql();

    }
    public void getdatafrommysql()
{
  sql = "select * from houseassign";  
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
public void fillcombobox()
{
    try{
       Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn=DriverManager.getConnection(url,user,pwd);
            st=conn.createStatement();
            String sql="select admno from student";
            rs=st.executeQuery(sql);
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        task = new javax.swing.JPanel();
        house = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        houseno = new javax.swing.JComboBox();
        save = new javax.swing.JButton();
        adno = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        rec = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        task.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                taskComponentShown(evt);
            }
        });
        task.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                taskFocusGained(evt);
            }
        });
        jTabbedPane1.addTab("TASK ALLOCATION", task);

        jLabel1.setText("Student_admission_no:");

        jLabel2.setText("Dorm/house assignment:");

        houseno.setBackground(new java.awt.Color(255, 204, 0));
        houseno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mariagoretti", "Kilimanjaro", "Mt. Kenya", "king James", "Ruiru" }));

        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jButton1.setText("add");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(houseno, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adno, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(houseno)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rec.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(rec);

        javax.swing.GroupLayout houseLayout = new javax.swing.GroupLayout(house);
        house.setLayout(houseLayout);
        houseLayout.setHorizontalGroup(
            houseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(houseLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
        );
        houseLayout.setVerticalGroup(
            houseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(houseLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 210, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("ACCOMODATION RECORDS", house);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void taskComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_taskComponentShown

    }//GEN-LAST:event_taskComponentShown

    private void taskFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_taskFocusGained

    }//GEN-LAST:event_taskFocusGained

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn=DriverManager.getConnection(url,user,pwd);
            st=conn.createStatement();
            String sql="select * from houseAssign where adno='"+String.valueOf(adno.getSelectedItem())+"'";
            String sql2="INSERT  INTO houseAssign VALUES('"+String.valueOf(adno.getSelectedItem())+"','"+String.valueOf(houseno.getSelectedItem())+"')";
            String sql3="UPDATE houseAssign SET houseno='"+String.valueOf(houseno.getSelectedItem())+"' where adno='"+String.valueOf(adno.getSelectedItem())+"'";
            rs=st.executeQuery(sql);
            if(rs.next())
            {
                int result1 = JOptionPane.showConfirmDialog(null, "Record_already_exists...Do_you_want_to_continue?","UPDATE?", JOptionPane.OK_CANCEL_OPTION);
                if(result1==JOptionPane.OK_OPTION)
                {st.execute(sql3); getdatafrommysql();JOptionPane.showMessageDialog(null, "SAVED_SUCCESSFULLY","SUCCESS",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            if(!rs.next())
            {
                st.execute(sql2);getdatafrommysql(); JOptionPane.showMessageDialog(null, "SAVED_SUCCESSFULLY","SUCCESS",JOptionPane.INFORMATION_MESSAGE);
            }
            rs.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
            // JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);  // TODO code application logic here
        }
    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(AllocationRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllocationRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllocationRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllocationRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllocationRecord().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox adno;
    private javax.swing.JPanel house;
    private javax.swing.JComboBox houseno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable rec;
    private javax.swing.JButton save;
    private javax.swing.JPanel task;
    // End of variables declaration//GEN-END:variables
}
