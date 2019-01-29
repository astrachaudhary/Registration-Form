/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Student;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author chaudhary
 */

  public class DatabaseConnection{
 public Connection con;
    public  void Connect()
    {
        try
        {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        con=DriverManager.getConnection("jdbc:odbc:myreg");
        System.out.println("Succesful Connection");
        }
        catch(Exception ex)
        {
            System.out.println("Error While Connecting");
        }
    }
    public void DisConnect()
{
try
{
con.close();
System.out.print("DisConnected");
}
catch(Exception ex)
{
System.out.print("Error in disconnecting" + ex);
}
}

  public static void main(String[] args) {
 DatabaseConnection obj=new DatabaseConnection();
 obj.Connect();
 obj.DisConnect();
 }
}
