
package house.management;

import java.sql.*;

public class dbconnect {
    public static Connection connectDB(){
        Connection con = null;
      try{
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost/hm", "root", "");
          return con;
      }catch (Exception ex){
        System.out.println("There are error");
        return null;
      }
        
    }
    
}
