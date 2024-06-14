package libreria.municipal;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/*
 * Ventana de inicio de sesión para la librería municipal.
 */
public class Login extends javax.swing.JFrame {

    /*
     * Constructor de la clase Login.
     * Inicializa los componentes de la interfaz gráfica y realiza la conexión inicial.
     */
    public Login() {
        initComponents();
        // Establecer conexión con la base de datos al iniciar sesión
        CConexion objetoConexion = new CConexion();
        objetoConexion.conectar();  
    }

    /*
     * Se definen todos y cada uno de los componentes que conforman la GUI y sus propiedades
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        BtnIngresar = new javax.swing.JButton();
        txtInicioSesion = new javax.swing.JLabel();
        txtMensaje1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        txtContra = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        txtContra1 = new javax.swing.JLabel();
        campoTipo = new javax.swing.JComboBox<>();
        campoContra = new javax.swing.JPasswordField();
        BtnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 980, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(239, 41, 51));

        txtTitulo.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("LIBRERIA MUNICIPAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(txtTitulo)
                .addGap(198, 198, 198))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(txtTitulo)
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(251, 252, 254), null));

        BtnIngresar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BtnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libreria/municipal/btn_acceder.png"))); // NOI18N
        BtnIngresar.setBorder(null);
        BtnIngresar.setBorderPainted(false);
        BtnIngresar.setContentAreaFilled(false);
        BtnIngresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/libreria/municipal/btn_acceder_pressed.png"))); // NOI18N
        BtnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnIngresarMouseExited(evt);
            }
        });

        txtInicioSesion.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        txtInicioSesion.setForeground(new java.awt.Color(239, 41, 51));
        txtInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtInicioSesion.setText("Iniciar sesión");

        txtMensaje1.setBackground(new java.awt.Color(255, 255, 255));
        txtMensaje1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtMensaje1.setForeground(new java.awt.Color(71, 93, 83));
        txtMensaje1.setText("Los campos marcados con * son obligatorios");

        txtUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(107, 117, 131));
        txtUsuario.setText("Usuario *");

        txtContra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtContra.setForeground(new java.awt.Color(107, 117, 131));
        txtContra.setText("Contraseña *");

        campoUsuario.setToolTipText("Ingrese su usuario registrado");

        txtContra1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtContra1.setForeground(new java.awt.Color(107, 117, 131));
        txtContra1.setText("Tipo de usuario *");

        campoTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Admin" }));
        campoTipo.setToolTipText("Elije el tipo de usuario que eres");

        campoContra.setToolTipText("ingrese su contraseña registrada");

        BtnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libreria/municipal/btn_registrar.png"))); // NOI18N
        BtnRegistrar.setToolTipText("");
        BtnRegistrar.setBorderPainted(false);
        BtnRegistrar.setContentAreaFilled(false);
        BtnRegistrar.setMaximumSize(new java.awt.Dimension(136, 68));
        BtnRegistrar.setMinimumSize(new java.awt.Dimension(136, 68));
        BtnRegistrar.setPreferredSize(new java.awt.Dimension(108, 50));
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtContra1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContra, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(BtnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addComponent(txtInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMensaje1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoContra))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(txtInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMensaje1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtContra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoContra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtContra1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(327, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 920, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Método para manejar el evento cuando el cursor entra en el botón de ingresar.
     * Cambia el ícono del botón a su estado presionado.
     * @param evt Evento del mouse.
     */
    private void BtnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIngresarMouseEntered
        ImageIcon estatoDos = new ImageIcon("src\\libreria\\municipal\\btn_acceder_pressed.png");
        BtnIngresar.setIcon(estatoDos);
    }//GEN-LAST:event_BtnIngresarMouseEntered

    /*
     * Método para manejar el evento cuando el cursor sale del botón de ingresar.
     * Restaura el ícono del botón a su estado normal.
     * @param evt Evento del mouse.
     */
    private void BtnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIngresarMouseExited
        ImageIcon estatoUno = new ImageIcon("src\\libreria\\municipal\\btn_acceder.png");
        BtnIngresar.setIcon(estatoUno);
    }//GEN-LAST:event_BtnIngresarMouseExited

    /*
     * Método para manejar el evento cuando se hace clic en el botón de registrar.
     * Abre la ventana de registro y cierra la ventana actual de inicio de sesión.
     * @param evt Evento del mouse.
     */
    private void BtnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegistrarMouseClicked
        Registrar secScreen = new Registrar();
        secScreen.setVisible(true);
        this.dispose();// Cierra la ventana actual de login
    }//GEN-LAST:event_BtnRegistrarMouseClicked

    /*
     * Método para manejar el evento cuando el cursor entra en el botón de registrar.
     * Cambia el ícono del botón a su estado presionado.
     * @param evt Evento del mouse.
     */
    private void BtnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegistrarMouseEntered
        ImageIcon estatoDosRe = new ImageIcon("src\\libreria\\municipal\\btn_registrar_pressed.png");
        BtnRegistrar.setIcon(estatoDosRe);
    }//GEN-LAST:event_BtnRegistrarMouseEntered

    /*
     * Método para manejar el evento cuando el cursor sale del botón de registrar.
     * Restaura el ícono del botón a su estado normal.
     * @param evt Evento del mouse.
     */
    private void BtnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegistrarMouseExited
        ImageIcon estadoUnoRe = new ImageIcon("src\\libreria\\municipal\\btn_registrar.png");
        BtnRegistrar.setIcon(estadoUnoRe);
    }//GEN-LAST:event_BtnRegistrarMouseExited

    /*
     * Método para manejar el evento cuando se hace clic en el botón de ingresar.
     * Valida el usuario y la contraseña ingresados, y muestra la ventana correspondiente según el tipo de usuario.
     * @param evt Evento del mouse.
     */
    private void BtnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIngresarMouseClicked
        if (campoUsuario.getText().isEmpty() || campoContra.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos.");
            campoUsuario.setText("");
            campoContra.setText("");
            campoUsuario.requestFocus();
            return; // Salir del método si algún campo está vacío
        }

        String nombreIngresado = campoUsuario.getText();
        String contraseñaIngresada = new String(campoContra.getPassword());
        String tipoUsuario = campoTipo.getSelectedItem().toString();

        if (tipoUsuario.equals("Cliente")) {
            Usuario usuario = Usuario.validarUsuario(nombreIngresado, contraseñaIngresada);
            if (usuario != null) {
                JOptionPane.showMessageDialog(null, "¡Bienvenido Cliente!");
                Home firstScreen = new Home(usuario);
                firstScreen.setVisible(true);
                this.dispose(); // Cierra la ventana actual de login
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
                campoContra.setText("");
                campoUsuario.requestFocus();
            }
        } else if (tipoUsuario.equals("Admin")) {
            AdminC admin = AdminC.validarAdmin(nombreIngresado, contraseñaIngresada);
            if (admin != null) {
                JOptionPane.showMessageDialog(null, "¡Bienvenido Admin!");
                Admin thirdScreen = new Admin();
                thirdScreen.setVisible(true);
                this.dispose(); // Cierra la ventana actual de login
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
                campoContra.setText("");
                campoUsuario.requestFocus();
            }
        }
    }//GEN-LAST:event_BtnIngresarMouseClicked

    /*
     * Método principal que inicia la aplicación.
     * @param args Argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true); // Crea una instancia de la ventana de login y la muestra
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JPasswordField campoContra;
    private javax.swing.JComboBox<String> campoTipo;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtContra;
    private javax.swing.JLabel txtContra1;
    private javax.swing.JLabel txtInicioSesion;
    private javax.swing.JLabel txtMensaje1;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
