
package DAO;

import java.sql.*;


public class Conexion {
    
    public Connection conectar(){
        
        Connection con=null;
      //  Ubuntu_Mysqlpaco123
        try{            
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://10.2.1.253:3306/nuevaa";
            String user="bd";
            String pass="Ubuntu_Mysqlpaco123";
            con = DriverManager.getConnection(url, user, pass);
        }
        catch(Exception ex){            
            System.out.println("Ha sido imposible crear la conexion");
        }
        
       return con; 
    }
    
    public void desconectar(Connection con){
        
        try{
            if (con!=null) con.close();
            
        } catch(Exception ex){
            
            System.out.println("Ha sido imposible cerrar la conexion");
        }
        
    }
    
}
