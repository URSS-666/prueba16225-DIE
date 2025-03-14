
package BD;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Database {
    
    Connection conectar = null;
    
    String usuario ="root";
    String contraseña ="";
    String bd ="proyecto";
    String ip ="localhost";
    String puerto ="3306";
    
    String cadena ="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contraseña);
        } catch (Exception e) {
        }
        return conectar;
    }
    public void cerrarConexion(){
        try {
            if (conectar!= null && !conectar.isClosed()) {
            conectar.close();
        }
        } catch (Exception e) {
        }
    }
}
    
