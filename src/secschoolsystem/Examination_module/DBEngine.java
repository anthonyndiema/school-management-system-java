/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package secschoolsystem.Examination_module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

/**
*
* @author cgg
*/
public class DBEngine
{String url = "jdbc:mysql://localhost:3306/school";
        String userid = "root";
        String password = "";

public Vector getScores()throws Exception
{

Connection connection = DriverManager.getConnection( url, userid, password );;
Vector<Vector<String>> scorevector = new Vector<Vector<String>>();
            PreparedStatement pre = connection.prepareStatement("select subject_code,mark,grade from performance where adm_no='"+1234+"'");
            ResultSet rs = pre.executeQuery();
            while(rs.next())
{
Vector<String> score = new Vector<String>();
score.add(rs.getString("subject_code"));
score.add(rs.getString("mark"));
score.add(rs.getString("grade"));
scorevector.add(score);
}
if(connection!=null){
connection.close();}

return scorevector;
}
}
