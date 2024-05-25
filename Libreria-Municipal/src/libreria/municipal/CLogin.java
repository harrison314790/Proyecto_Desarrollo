package libreria.municipal;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CLogin {
    String user;
    String password;
    String tipo;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public boolean verificarUsuario(JTextField paraUser, JPasswordField paraPassword, JComboBox<String> paraTipo){
        
        CConexion objetoConexion = new CConexion();
        boolean usuarioValido = false;
        
        String consulta = "SELECT * FROM users WHERE usuario=? AND password=? AND tipo=?";
        
        
        
            try {
        CallableStatement cs = objetoConexion.conectar().prepareCall(consulta);
        
        String user = paraUser.getText();
        String password = paraPassword.getText();
        String tipo = paraTipo.getSelectedItem().toString();

        // Establece los valores del nombreUsuario y contrasena en la consulta
        cs.setString(1, user);
        cs.setString(2, password);
        cs.setString(3, tipo);

        ResultSet rs = cs.executeQuery();

        // Verifica si se encontró un usuario con las credenciales proporcionadas
        if (rs.next()) {
            usuarioValido = true;
            JOptionPane.showMessageDialog(null, "Acceso Valido");
            
        }else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas. Intente de nuevo.");
        }
        

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al verificar usuario" + e.toString());
    }
            
        
        
        return usuarioValido;
        
    }
}
