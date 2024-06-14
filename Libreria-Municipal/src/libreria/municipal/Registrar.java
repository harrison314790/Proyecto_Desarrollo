/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package libreria.municipal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import org.mindrot.jbcrypt.BCrypt;

/*
 * Ventana de registro de usuarios en la aplicación de la biblioteca municipal.
 */
public class Registrar extends javax.swing.JFrame {
    private Connection connection;
    
    /*
     * Constructor que inicializa la conexión a la base de datos y los componentes de la interfaz gráfica.
     */
    public Registrar() {
        connection = new CConexion().conectar(); // Inicializa la conexión a la base de datos
        initComponents(); // Inicializa los componentes de la interfaz gráfica
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TfdDni = new javax.swing.JTextField();
        Tfdcorreo = new javax.swing.JTextField();
        BtnRegistrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Tfdcontraseña = new javax.swing.JPasswordField();
        TfdConfirContraseña = new javax.swing.JPasswordField();
        BtnVolver = new javax.swing.JButton();
        Tfdusuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar usuario");
        setPreferredSize(new java.awt.Dimension(920, 620));
        setResizable(false);

        jPanel1.setToolTipText("");
        jPanel1.setMinimumSize(new java.awt.Dimension(920, 620));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setPreferredSize(new java.awt.Dimension(471, 443));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(107, 117, 131));
        jLabel2.setText("Usuario*");
        jLabel2.setToolTipText("En este caso su usuario sera su correo electronico");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(107, 117, 131));
        jLabel3.setText("Correo*");
        jLabel3.setToolTipText("En este caso su usuario sera su correo electronico");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(107, 117, 131));
        jLabel4.setText("Contraseña*");
        jLabel4.setToolTipText("En este caso su usuario sera su correo electronico");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(107, 117, 131));
        jLabel5.setText("Confirme contraseña*");
        jLabel5.setToolTipText("En este caso su usuario sera su correo electronico");

        TfdDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfdDniActionPerformed(evt);
            }
        });

        BtnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libreria/municipal/btn_registrar.png"))); // NOI18N
        BtnRegistrar.setToolTipText("");
        BtnRegistrar.setBorderPainted(false);
        BtnRegistrar.setContentAreaFilled(false);
        BtnRegistrar.setPreferredSize(new java.awt.Dimension(136, 68));
        BtnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnRegistrarMouseExited(evt);
            }
        });
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(239, 41, 51));
        jLabel6.setText("REGISTRATE");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Los campos marcados con * son obligatorios");
        jLabel7.setToolTipText("");

        BtnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libreria/municipal/btn_volver.png"))); // NOI18N
        BtnVolver.setBorderPainted(false);
        BtnVolver.setContentAreaFilled(false);
        BtnVolver.setPreferredSize(new java.awt.Dimension(136, 68));
        BtnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnVolverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnVolverMouseExited(evt);
            }
        });

        Tfdusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfdusuarioActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(107, 117, 131));
        jLabel8.setText("Numero de identificacion*");
        jLabel8.setToolTipText("En este caso su usuario sera su correo electronico");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(110, 110, 110))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TfdConfirContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TfdDni, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                    .addComponent(Tfdcorreo)
                                    .addComponent(Tfdcontraseña)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(BtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(Tfdusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                                .addComponent(jLabel8))
                            .addGap(62, 62, 62)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(BtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(13, 13, 13)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TfdDni, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tfdusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tfdcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tfdcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TfdConfirContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(BtnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1421, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(239, 41, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(920, 90));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRAR USUARIO");
        jLabel1.setMaximumSize(new java.awt.Dimension(504, 56));
        jLabel1.setMinimumSize(new java.awt.Dimension(504, 56));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 2120, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnRegistrarActionPerformed

    private void TfdDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfdDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfdDniActionPerformed

    /*
     * Maneja el evento de entrada del ratón al botón de registrar.
     *
     * @param evt El evento del ratón.
     */
    private void BtnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegistrarMouseEntered
        // Cambia el ícono del botón al estado presionado
        ImageIcon estatoDosRe = new ImageIcon("src\\libreria\\municipal\\btn_registrar_pressed.png");
        BtnRegistrar.setIcon(estatoDosRe);
    }//GEN-LAST:event_BtnRegistrarMouseEntered

    /*
     * Maneja el evento de salida del ratón del botón de registrar.
     *
     * @param evt El evento del ratón.
     */
    private void BtnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegistrarMouseExited
        // Cambia el ícono del botón al estado normal
        ImageIcon estadoUnoRe = new ImageIcon("src\\libreria\\municipal\\btn_registrar.png");
        BtnRegistrar.setIcon(estadoUnoRe);
    }//GEN-LAST:event_BtnRegistrarMouseExited

    /*
     * Maneja el evento de clic del ratón en el botón de registrar.
     *
     * @param evt El evento del ratón.
     */
    private void BtnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegistrarMouseClicked
        String dni = TfdDni.getText().trim();
        String nombre = Tfdusuario.getText().trim();
        String correo = Tfdcorreo.getText().trim();
        String contraseña = new String(Tfdcontraseña.getPassword());
        String confirmarContraseña = new String(TfdConfirContraseña.getPassword());

        // Validación de campos vacíos
        if (dni.isEmpty() || nombre.isEmpty() || correo.isEmpty() || contraseña.isEmpty() || confirmarContraseña.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos.");
            TfdDni.setText("");
            Tfdusuario.setText("");
            Tfdcorreo.setText("");
            Tfdcontraseña.setText("");
            TfdConfirContraseña.setText("");
            TfdDni.requestFocus();
            return;
        }

        // Validación de coincidencia de contraseñas
        if (!contraseña.equals(confirmarContraseña)) {
            JOptionPane.showMessageDialog(null, "¡Las contraseñas no coinciden!");
            Tfdcontraseña.setText("");
            TfdConfirContraseña.setText("");
            Tfdcontraseña.requestFocus();
            return;
        }

        try {
            // Verificar si el usuario ya está registrado por DNI, nombre de usuario o correo electrónico
            if (usuarioExiste("dni", dni)) {
                JOptionPane.showMessageDialog(null, "¡El DNI ya está registrado!");
                TfdDni.setText("");
                TfdDni.requestFocus();
                return;
            }

            if (usuarioExiste("nombre", nombre)) {
                JOptionPane.showMessageDialog(null, "¡El nombre de usuario ya está registrado!");
                Tfdusuario.setText("");
                Tfdusuario.requestFocus();
                return;
            }

            if (usuarioExiste("correo", correo)) {
                JOptionPane.showMessageDialog(null, "¡El correo electrónico ya está registrado!");
                Tfdcorreo.setText("");
                Tfdcorreo.requestFocus();
                return;
            }

            // Registrar el usuario si no existe y enviar correo de confirmación
            if (registrarUsuario(dni, nombre, correo, contraseña)) {
                enviarCorreoDeConfirmacion(correo);
                JOptionPane.showMessageDialog(null, "¡Te has registrado exitosamente! Se ha enviado un correo de bienvenida.");
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "¡Hubo un problema al registrar el usuario!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "¡Hubo un error al acceder a la base de datos!");
        }
        
    }//GEN-LAST:event_BtnRegistrarMouseClicked

    private void BtnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVolverMouseEntered
        // TODO add your handling code here:
        ImageIcon estatoDos = new ImageIcon("src\\libreria\\municipal\\btn_volver_pressed.png");
        BtnVolver.setIcon(estatoDos);
    }//GEN-LAST:event_BtnVolverMouseEntered

    private void BtnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVolverMouseExited
        // TODO add your handling code here:
        ImageIcon estatoUno = new ImageIcon("src\\libreria\\municipal\\btn_volver.png");
        BtnVolver.setIcon(estatoUno);
    }//GEN-LAST:event_BtnVolverMouseExited

    private void BtnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVolverMouseClicked
        // TODO add your handling code here:
        Login secScreen = new Login();
        secScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnVolverMouseClicked

    private void TfdusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfdusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfdusuarioActionPerformed
    
    /*
     * Verifica si un usuario ya está registrado en la base de datos.
     *
     * @param campo El campo por el cual verificar (dni, nombre, correo).
     * @param valor El valor a verificar.
     * @return true si el usuario existe, false si no.
     * @throws SQLException Si hay un error al acceder a la base de datos.
     */
    private boolean usuarioExiste(String campo, String valor) throws SQLException {
        String query = "SELECT COUNT(*) FROM usuarios WHERE " + campo + " = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, valor);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        }
        return false;
    }

    
    // Limpia todos los campos de texto en la interfaz gráfica.
    private void limpiarCampos() {
        TfdDni.setText("");
        Tfdusuario.setText("");
        Tfdcorreo.setText("");
        Tfdcontraseña.setText("");
        TfdConfirContraseña.setText("");
    }

    /*
     * Envía un correo electrónico de confirmación al nuevo usuario registrado.
     *
     * @param correo El correo electrónico del usuario.
     */
    private void enviarCorreoDeConfirmacion(String destinatario) {
        final String remitente = "harrison31479@gmail.com";
        final String password = "yqnt vwsx vxgt tgcq";

        Properties propiedades = new Properties();
        propiedades.put("mail.smtp.host", "smtp.gmail.com");
        propiedades.put("mail.smtp.port", "587");
        propiedades.put("mail.smtp.auth", "true");
        propiedades.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(propiedades, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(remitente, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(remitente));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
            message.setSubject("¡Bienvenido a nuestra biblioteca!");

            String mensajeBienvenida = "¡Hola!\n\n";
            mensajeBienvenida += "Te damos la más cordial bienvenida a nuestra biblioteca. Nos alegra que hayas decidido registrarte como cliente.\n";
            mensajeBienvenida += "A partir de ahora, podrás realizar pedidos de libros y disfrutar de todos nuestros servicios.\n\n";
            mensajeBienvenida += "¡Esperamos que tu experiencia con nosotros sea excelente!\n\n";
            mensajeBienvenida += "Atentamente,\n";
            mensajeBienvenida += "El equipo de la Biblioteca Municipal";

            message.setText(mensajeBienvenida);
            Transport.send(message);
            JOptionPane.showMessageDialog(null, "¡Te has registrado exitosamente! Se ha enviado un correo de bienvenida.");
        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null, "¡Ha ocurrido un error al enviar el correo de confirmación!");
            throw new RuntimeException(e);
        }
    }
    
    /*
     * Registra un nuevo usuario en la base de datos.
     *
     * @param dni         El DNI del nuevo usuario.
     * @param nombre      El nombre de usuario del nuevo usuario.
     * @param correo      El correo electrónico del nuevo usuario.
     * @param contraseña  La contraseña del nuevo usuario.
     * @return true si el registro es exitoso, false si no.
     * @throws SQLException Si hay un error al acceder a la base de datos.
     */
    private boolean registrarUsuario(String dni, String nombre, String correo, String contraseña) throws SQLException {
        String query = "INSERT INTO usuarios (dni, nombre, correo, contraseña) VALUES (?, ?, ?, ?)";
        String hashedPassword = BCrypt.hashpw(contraseña, BCrypt.gensalt());

        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, dni);
            ps.setString(2, nombre);
            ps.setString(3, correo);
            ps.setString(4, hashedPassword);
            return ps.executeUpdate() > 0;
        }
    }
    
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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JPasswordField TfdConfirContraseña;
    private javax.swing.JTextField TfdDni;
    private javax.swing.JPasswordField Tfdcontraseña;
    private javax.swing.JTextField Tfdcorreo;
    private javax.swing.JTextField Tfdusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
