package libreria.municipal;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class CConexion {
    Connection conectar = null;
    String usuario = "postgres";
    String password = "cardcaptor";
    String bd = "ProyectoBD";
    String ip = "localhost";
    String puerto = "5432";
    
    String cadena = "jdbc:postgresql://"+ip+":"+puerto+"/"+bd;
    
    public Connection conectar(){
     
        try{
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,password);
            
            //JOptionPane.showMessageDialog(null, "conexion establecida");
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Error al conectar "+e.toString());
        }
        return conectar;
    }
}
