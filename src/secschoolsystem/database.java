/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package secschoolsystem;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Student
 */
public class database {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    database()
    {
        try{
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");
           pst=con.prepareStatement("select JOB_TYPE,idno,PWORD from teacher where JOB_TYPE=? and idno=? and PWORD=?");
           
        }
        catch(Exception ex)
        {
                 System.out.println(ex.getMessage());
         JOptionPane.showMessageDialog(null, "UNABLE_TO_CONNECT_TO_DATABASE", "ERROR!!",JOptionPane.ERROR_MESSAGE); 
        System.exit(1);
        }
    }
    public Boolean CheckLogin(String job,String idno, String pwd)
    {
      try{
          pst.setString(1,job);
          pst.setString(2,idno);
          pst.setString(3, pwd);
          rs=pst.executeQuery();
          if(rs.next())
          {
              return true;
          }
          else{
              return false;
          }
      }
      catch(Exception ex){
          System.out.println(ex.getMessage());
       JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR WHILE VALIDATING",JOptionPane.ERROR_MESSAGE);  
       return false;
      }
    }
}
