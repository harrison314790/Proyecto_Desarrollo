package libreria.municipal;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * Clase CConexion para gestionar la conexión a la base de datos PostgreSQL.
 */
public class CConexion {
    Connection conectar = null;
    String usuario = "postgres";
    String password = "3147905916";
    String bd = "bibliotecaMunicipal-DB";
    String ip = "localhost";
    String puerto = "5432";
    
    String cadena = "jdbc:postgresql://"+ip+":"+puerto+"/"+bd;
    
    /*
     * Método para establecer la conexión con la base de datos.
     *
     * @return Un objeto Connection si la conexión es exitosa, de lo contrario, null.
     */
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
