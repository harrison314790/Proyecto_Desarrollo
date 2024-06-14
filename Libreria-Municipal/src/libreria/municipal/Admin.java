/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package libreria.municipal;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Clase Admin que representa la interfaz gráfica de administración de la biblioteca.
 * Extiende JFrame para proporcionar una interfaz gráfica de usuario (GUI).
 */
public class Admin extends javax.swing.JFrame {
    private Connection connection;
    private DefaultTableModel mt;
    private DefaultTableModel modeloSolicitudes;
    
    /*
     * Crea una nueva instancia de Admin y establece la conexión con la base de datos.
     */
    public Admin() {
        connection = new CConexion().conectar();
        initComponents();
        cargarTabla();
        mostrarLibrosSolicitados();
        agregarListenerComboBox();
    }

    /*
     * Se definen todos y cada uno de los componentes que conforman la GUI y sus propiedades
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        JbActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtaLibros = new javax.swing.JTable();
        JbAgregar = new javax.swing.JButton();
        JbEliminar = new javax.swing.JButton();
        JtfEstado = new javax.swing.JTextField();
        JtfAutor = new javax.swing.JTextField();
        JtfCategoria = new javax.swing.JTextField();
        JtfAñoLanza = new javax.swing.JTextField();
        JtfTitulo = new javax.swing.JTextField();
        JtfCodigo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        JtaMostrarSolicitudes = new javax.swing.JTable();
        JbPrestar = new javax.swing.JButton();
        JbDevolver1 = new javax.swing.JButton();
        JbVolver = new javax.swing.JButton();
        JtfFechaDevolucion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JcbEstados = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(920, 620));

        jPanel1.setBackground(new java.awt.Color(239, 41, 51));

        txtTitulo.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("LIBRERIA MUNICIPAL");

        JbActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libreria/municipal/btn_actualizar.png"))); // NOI18N
        JbActualizar.setBorderPainted(false);
        JbActualizar.setContentAreaFilled(false);
        JbActualizar.setMaximumSize(new java.awt.Dimension(108, 50));
        JbActualizar.setMinimumSize(new java.awt.Dimension(108, 50));
        JbActualizar.setPreferredSize(new java.awt.Dimension(108, 50));
        JbActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JbActualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JbActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JbActualizarMouseExited(evt);
            }
        });

        JtaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Título", "Estado", "Categoría", "Autor", "Año de Lanzamiento"
            }
        ));
        jScrollPane1.setViewportView(JtaLibros);

        JbAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libreria/municipal/btn_agregar.png"))); // NOI18N
        JbAgregar.setBorderPainted(false);
        JbAgregar.setContentAreaFilled(false);
        JbAgregar.setMaximumSize(new java.awt.Dimension(108, 50));
        JbAgregar.setMinimumSize(new java.awt.Dimension(108, 50));
        JbAgregar.setPreferredSize(new java.awt.Dimension(108, 50));
        JbAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JbAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JbAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JbAgregarMouseExited(evt);
            }
        });

        JbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libreria/municipal/btn_eliminar.png"))); // NOI18N
        JbEliminar.setBorderPainted(false);
        JbEliminar.setContentAreaFilled(false);
        JbEliminar.setMaximumSize(new java.awt.Dimension(108, 50));
        JbEliminar.setMinimumSize(new java.awt.Dimension(108, 50));
        JbEliminar.setPreferredSize(new java.awt.Dimension(108, 50));
        JbEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JbEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JbEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JbEliminarMouseExited(evt);
            }
        });

        JtfEstado.setForeground(new java.awt.Color(153, 153, 153));
        JtfEstado.setText("Estado");
        JtfEstado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JtfEstadoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JtfEstadoFocusLost(evt);
            }
        });
        JtfEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtfEstadoMouseClicked(evt);
            }
        });

        JtfAutor.setForeground(new java.awt.Color(153, 153, 153));
        JtfAutor.setText("Autor");
        JtfAutor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JtfAutorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JtfAutorFocusLost(evt);
            }
        });
        JtfAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtfAutorMouseClicked(evt);
            }
        });

        JtfCategoria.setForeground(new java.awt.Color(153, 153, 153));
        JtfCategoria.setText("Categoria");
        JtfCategoria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JtfCategoriaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JtfCategoriaFocusLost(evt);
            }
        });
        JtfCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtfCategoriaMouseClicked(evt);
            }
        });

        JtfAñoLanza.setForeground(new java.awt.Color(153, 153, 153));
        JtfAñoLanza.setText("Año Lanzamiento");
        JtfAñoLanza.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JtfAñoLanzaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JtfAñoLanzaFocusLost(evt);
            }
        });
        JtfAñoLanza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtfAñoLanzaMouseClicked(evt);
            }
        });

        JtfTitulo.setForeground(new java.awt.Color(153, 153, 153));
        JtfTitulo.setText("Titulo");
        JtfTitulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JtfTituloFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JtfTituloFocusLost(evt);
            }
        });
        JtfTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtfTituloMouseClicked(evt);
            }
        });

        JtfCodigo.setForeground(new java.awt.Color(153, 153, 153));
        JtfCodigo.setText("Codigo");
        JtfCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JtfCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JtfCodigoFocusLost(evt);
            }
        });
        JtfCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtfCodigoMouseClicked(evt);
            }
        });

        JtaMostrarSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "código ", "Título", "Fecha Préstamo", "Fecha Devolución", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(JtaMostrarSolicitudes);

        JbPrestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libreria/municipal/btn_prestar.png"))); // NOI18N
        JbPrestar.setBorderPainted(false);
        JbPrestar.setContentAreaFilled(false);
        JbPrestar.setMaximumSize(new java.awt.Dimension(108, 50));
        JbPrestar.setMinimumSize(new java.awt.Dimension(108, 50));
        JbPrestar.setPreferredSize(new java.awt.Dimension(108, 50));
        JbPrestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JbPrestarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JbPrestarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JbPrestarMouseExited(evt);
            }
        });

        JbDevolver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libreria/municipal/btn_devolver.png"))); // NOI18N
        JbDevolver1.setBorderPainted(false);
        JbDevolver1.setContentAreaFilled(false);
        JbDevolver1.setMaximumSize(new java.awt.Dimension(108, 50));
        JbDevolver1.setMinimumSize(new java.awt.Dimension(108, 50));
        JbDevolver1.setPreferredSize(new java.awt.Dimension(108, 50));
        JbDevolver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JbDevolver1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JbDevolver1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JbDevolver1MouseExited(evt);
            }
        });

        JbVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libreria/municipal/btn_volver.png"))); // NOI18N
        JbVolver.setBorderPainted(false);
        JbVolver.setContentAreaFilled(false);
        JbVolver.setMaximumSize(new java.awt.Dimension(108, 50));
        JbVolver.setMinimumSize(new java.awt.Dimension(108, 50));
        JbVolver.setPreferredSize(new java.awt.Dimension(108, 50));
        JbVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JbVolverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JbVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JbVolverMouseExited(evt);
            }
        });

        JtfFechaDevolucion.setForeground(new java.awt.Color(153, 153, 153));
        JtfFechaDevolucion.setText("YYYY-MM-DD");
        JtfFechaDevolucion.setToolTipText("");
        JtfFechaDevolucion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JtfFechaDevolucionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JtfFechaDevolucionFocusLost(evt);
            }
        });
        JtfFechaDevolucion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtfFechaDevolucionMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Fecha Devolucion");

        JcbEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Prestado", "Pendiente" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(JbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JbEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JtfAñoLanza, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtfCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(100, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JcbEstados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(JbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(JtfFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE)))))
                            .addComponent(JbDevolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JbPrestar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(JbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JtfFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JbPrestar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JbDevolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JcbEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(JbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(JtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JtfCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JtfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JtfAñoLanza, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(JbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(txtTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(txtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 981, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Acción al clickear en el boton "Actualizar"
    private void JbActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbActualizarMouseClicked
        // Obtiene la fila seleccionada de la tabla
        int selectedRow = JtaLibros.getSelectedRow();
        if (selectedRow != -1) {
            // Verifica y obtiene los valores de los campos de texto
            String codigo = JtfCodigo.getText().equals("Codigo") ? generarCodigoUnico() : JtfCodigo.getText();
            String titulo = JtfTitulo.getText().isEmpty() ? null : JtfTitulo.getText();
            String estado = JtfEstado.getText().isEmpty() ? null : JtfEstado.getText();
            String categoria = JtfCategoria.getText().isEmpty() ? null : JtfCategoria.getText();
            String autor = JtfAutor.getText().isEmpty() ? null : JtfAutor.getText();
            String anioText = JtfAñoLanza.getText().isEmpty() ? null : JtfAñoLanza.getText();
            
            // Verifica si alguno de los campos tiene el valor predeterminado
            if (titulo.equals("Titulo")||estado.equals("Estado")||categoria.equals("Categoria")||autor.equals("Autor")) {
                JOptionPane.showMessageDialog(this, "Por favor llene los capos.");
                // Limpia y enfoca los campos incorrectos
                if(titulo.equals("Titulo")){
                    JtfTitulo.setText("");
                    JtfTitulo.requestFocus();
                    return;
                }
                if(estado.equals("Estado")){
                    JtfEstado.setText("");
                    JtfEstado.requestFocus();
                    return;
                }
                if(categoria.equals("Categoria")){
                    JtfCategoria.setText("");
                    JtfCategoria.requestFocus();
                    return;
                }
                if(autor.equals("Autor")){
                    JtfAutor.setText("");
                    JtfAutor.requestFocus();
                    return;
                }
            }

            // Verifica si el código es único
            if (codigo != null) {
                try (PreparedStatement ps = connection.prepareStatement("SELECT COUNT(*) FROM libros WHERE codigo = ?")) {
                    ps.setString(1, codigo);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next() && rs.getInt(1) > 0) {
                        JOptionPane.showMessageDialog(this, "El código del libro ya existe en el catálogo. Por favor, ingrese un código diferente.");
                        JtfCodigo.setText("");
                        JtfCodigo.requestFocus();
                        return;
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            // Convierte el año a un entero, si es posible
            Integer anio = null;
            if (anioText != null) {
                try {
                    anio = Integer.parseInt(anioText);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Por favor, Ingrese el año de lanzamiento.");
                    JtfAñoLanza.setText("");
                    JtfAñoLanza.requestFocus();
                    return;
                }
            }

            // Obtiene el código del libro seleccionado
            String codigoSeleccionado = (String) mt.getValueAt(selectedRow, 0);

            // Actualiza la información del libro en la base de datos
            try (PreparedStatement ps = connection.prepareStatement(
                "UPDATE libros SET codigo = ?, titulo = ?, estado = ?, categoria = ?, autor = ?, ano_lanzamiento = ? WHERE codigo = ?")) {
                ps.setString(1, codigo);
                ps.setString(2, titulo);
                ps.setString(3, estado);
                ps.setString(4, categoria);
                ps.setString(5, autor);
                if (anio != null) {
                    ps.setInt(6, anio);
                } else {
                    ps.setNull(6, Types.INTEGER);
                }
                ps.setString(7, codigoSeleccionado);
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // Limpia los campos de texto después de la actualización
            JtfTitulo.setText("");
            JtfEstado.setText("");
            JtfCategoria.setText("");
            JtfAutor.setText("");
            JtfAñoLanza.setText("");
            JtfCodigo.setText("");

            JOptionPane.showMessageDialog(this, "El libro ha sido actualizado exitosamente.");
            cargarTabla();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un libro para actualizar.");
        }
    }//GEN-LAST:event_JbActualizarMouseClicked

    // Acción al clickear en el boton "Eliminar"
    private void JbEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbEliminarMouseClicked
        // Obtiene la fila seleccionada de la tabla
        int selectedRow = JtaLibros.getSelectedRow();
        if (selectedRow != -1) {
            String codigo = (String) mt.getValueAt(selectedRow, 0);

             // Elimina el libro de la base de datos
            try (PreparedStatement ps = connection.prepareStatement("DELETE FROM libros WHERE codigo = ?")) {
                ps.setString(1, codigo);
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            JOptionPane.showMessageDialog(this, "El libro ha sido eliminado exitosamente.");
            cargarTabla();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un libro para eliminar.");
        }
    }//GEN-LAST:event_JbEliminarMouseClicked

    // Acción al clickear en el boton "Agregar"
    private void JbAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbAgregarMouseClicked
        // Obtiene los valores de los campos de texto
        String titulo = JtfTitulo.getText();
        String estado = JtfEstado.getText();
        String categoria = JtfCategoria.getText();
        String autor = JtfAutor.getText();
        String anioText = JtfAñoLanza.getText();
        String codigo = JtfCodigo.getText();

        // Verifica que todos los campos estén completos
        if (codigo.isEmpty() || titulo.isEmpty() || estado.isEmpty() || categoria.isEmpty() || autor.isEmpty() || anioText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos antes de agregar un libro.");
            return;
        }

        // Verifica si el código es único
        try (PreparedStatement ps = connection.prepareStatement("SELECT COUNT(*) FROM libros WHERE codigo = ?")) {
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                JOptionPane.showMessageDialog(this, "El código del libro ya existe en el catálogo. Por favor, ingrese un código diferente.");
                JtfCodigo.setText("");
                JtfCodigo.requestFocus();
                return;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Convierte el año a un entero
        int anio;
        try {
            anio = Integer.parseInt(anioText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El año ingres// Limpia los campos de texto después de agregar el libroado no es válido. Por favor, ingrese un número.");
            JtfAñoLanza.setText("");
            JtfAñoLanza.requestFocus();
            return;
        }

        // Inserta el nuevo libro en la base de datos
        try (PreparedStatement ps = connection.prepareStatement(
            "INSERT INTO libros (codigo, titulo, estado, categoria, autor, ano_lanzamiento) VALUES (?, ?, ?, ?, ?, ?)")) {
            ps.setString(1, codigo);
            ps.setString(2, titulo);
            ps.setString(3, estado);
            ps.setString(4, categoria);
            ps.setString(5, autor);
            ps.setInt(6, anio);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Limpia los campos de texto después de agregar el libro
        JtfTitulo.setText("");
        JtfEstado.setText("");
        JtfCategoria.setText("");
        JtfAutor.setText("");
        JtfAñoLanza.setText("");
        JtfCodigo.setText("");

        JOptionPane.showMessageDialog(this, "El libro ha sido agregado exitosamente.");
        cargarTabla();
    }//GEN-LAST:event_JbAgregarMouseClicked

    // Acción al clickear en el boton "Prestar"
    private void JbPrestarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbPrestarMouseClicked
        // Verifica si se ha seleccionado una solicitud de préstamo
        if (JtaMostrarSolicitudes.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un usuario con su libro que desea Prestar.");
            return;
        }

        int selectedRow = JtaMostrarSolicitudes.getSelectedRow();
        String codigoLibro = (String) JtaMostrarSolicitudes.getValueAt(selectedRow, 1);

        // Verifica si se ha ingresado una fecha de devolución
        if (JtfFechaDevolucion.getText().isEmpty() || JtfFechaDevolucion.getText().equals("YYYY-MM-DD")) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una fecha de devolución.");
            JtfFechaDevolucion.requestFocus();
            return;
        }

        // // Obtiene la fecha de devolución ingresada
        LocalDate fechaDevolucion = LocalDate.parse(JtfFechaDevolucion.getText());

        // Verifica y actualiza el estado del libro en la base de datos
        try {
            connection.setAutoCommit(false);

            // Verifica si el libro ya está prestado
            try (PreparedStatement ps = connection.prepareStatement("SELECT estado FROM prestamos WHERE id = ? AND estado = 'Prestado'")) {
                ps.setInt(1, Integer.parseInt(codigoLibro));
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "El libro no se encuentra disponible para préstamo.");
                    JtfFechaDevolucion.setText("");
                    connection.rollback();
                    return;
                }
            }

            // Actualiza el estado del libro en la tabla prestamos
            try (PreparedStatement ps = connection.prepareStatement("UPDATE prestamos SET estado = 'Prestado', fecha_prestamo = ?, fecha_devolucion = ? WHERE codigo_libro = ?")) {
                ps.setDate(1, Date.valueOf(LocalDate.now()));
                ps.setDate(2, Date.valueOf(fechaDevolucion));
                ps.setString(3, codigoLibro);
                ps.executeUpdate();
            }

            // Actualiza el estado del libro en la tabla libros
            try (PreparedStatement ps = connection.prepareStatement("UPDATE libros SET estado = 'Prestado' WHERE codigo = ?")) {
                ps.setString(1, codigoLibro);
                ps.executeUpdate();
            }

            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        JtfFechaDevolucion.setText("");
        JtfFechaDevolucion.requestFocus();
        cargarTabla();
        mostrarLibrosSolicitados();
    }//GEN-LAST:event_JbPrestarMouseClicked
    
    // Método ejecutado al hacer clic en el botón "Devolver"
    private void JbDevolver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbDevolver1MouseClicked
        // Verifica si se ha seleccionado una solicitud de devolución
        if (JtaMostrarSolicitudes.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un usuario con su prestamo que desea devolver.");
            return;
        }

        int selectedRow = JtaMostrarSolicitudes.getSelectedRow();
        String codigoLibro = (String) JtaMostrarSolicitudes.getValueAt(selectedRow, 1);

        // Actualiza el estado del libro en la base de datos
        try {
            connection.setAutoCommit(false);

            // Elimina el préstamo de la tabla 'prestamos'
            try (PreparedStatement ps = connection.prepareStatement("DELETE FROM prestamos WHERE codigo_libro = ?")) {
                ps.setString(1, codigoLibro);
                ps.executeUpdate();
            }

            // Actualiza el estado del libro a 'Disponible' en la tabla 'libros'
            try (PreparedStatement ps = connection.prepareStatement("UPDATE libros SET estado = 'Disponible' WHERE codigo = ?")) {
                ps.setString(1, codigoLibro);
                ps.executeUpdate();
            }

            connection.commit();
        } catch (SQLException e) {
            // Si ocurre un error, se hace rollback a la transacción
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            // Restaura el auto-commit al estado original
            try {
                connection.setAutoCommit(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // Recarga las tablas para reflejar los cambios
        cargarTabla();
        mostrarLibrosSolicitados();
    }//GEN-LAST:event_JbDevolver1MouseClicked

    // Método ejecutado al ganar foco el campo de texto 'Fecha Devolución'
    private void JtfFechaDevolucionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtfFechaDevolucionFocusGained
            if(JtfFechaDevolucion.getText().equals("YYYY-MM-DD")){
            JtfFechaDevolucion.setText("");
            JtfFechaDevolucion.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_JtfFechaDevolucionFocusGained

    // Método ejecutado al perder foco el campo de texto 'Fecha Devolución'
    private void JtfFechaDevolucionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtfFechaDevolucionFocusLost
        if(JtfFechaDevolucion.getText().equals("")){
            JtfFechaDevolucion.setText("YYYY-MM-DD");
            JtfFechaDevolucion.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_JtfFechaDevolucionFocusLost

    // Método ejecutado al hacer clic en el campo de texto 'Fecha Devolución'
    private void JtfFechaDevolucionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtfFechaDevolucionMouseClicked
        JtfFechaDevolucion.setForeground(Color.black);
    }//GEN-LAST:event_JtfFechaDevolucionMouseClicked

    // Método ejecutado al hacer clic en el botón 'Volver'
    private void JbVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbVolverMouseClicked
        Login secScreen = new Login();
        secScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JbVolverMouseClicked

    // Métodos ejecutados al hacer uso y al dejar de hacerlo en el campo de texto 'Código'
    private void JtfCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtfCodigoFocusGained
        if(JtfCodigo.getText().equals("Codigo")){
            JtfCodigo.setText("");
            JtfCodigo.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_JtfCodigoFocusGained

    private void JtfCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtfCodigoFocusLost
        if(JtfCodigo.getText().equals("")){
            JtfCodigo.setText("Codigo");
            JtfCodigo.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_JtfCodigoFocusLost

    private void JtfCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtfCodigoMouseClicked
        JtfCodigo.setForeground(Color.black);
    }//GEN-LAST:event_JtfCodigoMouseClicked

    // Métodos ejecutados al darle uso y al dejar de hacerlo en el campo de texto 'Titulo'
    private void JtfTituloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtfTituloFocusGained
        if(JtfTitulo.getText().equals("Titulo")){
            JtfTitulo.setText("");
            JtfTitulo.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_JtfTituloFocusGained

    private void JtfTituloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtfTituloFocusLost
        if(JtfTitulo.getText().equals("")){
            JtfTitulo.setText("Titulo");
            JtfTitulo.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_JtfTituloFocusLost

    private void JtfTituloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtfTituloMouseClicked
        JtfTitulo.setForeground(Color.black);
    }//GEN-LAST:event_JtfTituloMouseClicked

    // Métodos ejecutados al hacer uso y al dejar de hacerlo en el campo de texto 'Estado'
    private void JtfEstadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtfEstadoFocusGained
        if(JtfEstado.getText().equals("Estado")){
            JtfEstado.setText("");
            JtfEstado.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_JtfEstadoFocusGained

    private void JtfEstadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtfEstadoFocusLost
        if(JtfEstado.getText().equals("")){
            JtfEstado.setText("Estado");
            JtfEstado.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_JtfEstadoFocusLost

    private void JtfEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtfEstadoMouseClicked
        JtfEstado.setForeground(Color.black);
    }//GEN-LAST:event_JtfEstadoMouseClicked

    // Métodos ejecutados al hacer uso y al dejar de hacerlo en el campo de texto 'Categoria'
    private void JtfCategoriaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtfCategoriaFocusGained
        if(JtfCategoria.getText().equals("Categoria")){
            JtfCategoria.setText("");
            JtfCategoria.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_JtfCategoriaFocusGained

    private void JtfCategoriaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtfCategoriaFocusLost
        if(JtfCategoria.getText().equals("")){
            JtfCategoria.setText("Categoria");
            JtfCategoria.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_JtfCategoriaFocusLost

    private void JtfCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtfCategoriaMouseClicked
        JtfCategoria.setForeground(Color.black);
        
    }//GEN-LAST:event_JtfCategoriaMouseClicked

    // Métodos ejecutados al hacer uso y al dejar de hacerlo en el campo de texto 'Autor'
    private void JtfAutorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtfAutorFocusGained
        if(JtfAutor.getText().equals("Autor")){
            JtfAutor.setText("");
            JtfAutor.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_JtfAutorFocusGained

    private void JtfAutorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtfAutorFocusLost
        if(JtfAutor.getText().equals("")){
            JtfAutor.setText("Autor");
            JtfAutor.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_JtfAutorFocusLost

    private void JtfAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtfAutorMouseClicked
        JtfAutor.setForeground(Color.black);
    }//GEN-LAST:event_JtfAutorMouseClicked

    // Métodos ejecutados al hacer uso y al dejar de hacerlo en el campo de texto 'Año lanzamiento'
    private void JtfAñoLanzaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtfAñoLanzaFocusGained
        if(JtfAñoLanza.getText().equals("Año Lanzamiento")){
            JtfAñoLanza.setText("");
            JtfAñoLanza.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_JtfAñoLanzaFocusGained

    private void JtfAñoLanzaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtfAñoLanzaFocusLost
        if(JtfAñoLanza.getText().equals("")){
            JtfAñoLanza.setText("Año Lanzamiento");
            JtfAñoLanza.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_JtfAñoLanzaFocusLost

    private void JtfAñoLanzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtfAñoLanzaMouseClicked
        JtfAñoLanza.setForeground(Color.black);
    }//GEN-LAST:event_JtfAñoLanzaMouseClicked

    // Métodos para cambiar el icono del botón cuando el raton entra y sale del área del botón
    private void JbActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbActualizarMouseEntered
        ImageIcon estatoDosRe = new ImageIcon("src\\libreria\\municipal\\btn_actualizar_pressed.png");
        JbActualizar.setIcon(estatoDosRe);
    }//GEN-LAST:event_JbActualizarMouseEntered

    private void JbActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbActualizarMouseExited
        ImageIcon estadoUnoRe = new ImageIcon("src\\libreria\\municipal\\btn_actualizar.png");
        JbActualizar.setIcon(estadoUnoRe);
    }//GEN-LAST:event_JbActualizarMouseExited

    private void JbAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbAgregarMouseEntered
        ImageIcon estatoDosRe = new ImageIcon("src\\libreria\\municipal\\btn_agregar_pressed.png");
        JbAgregar.setIcon(estatoDosRe);
    }//GEN-LAST:event_JbAgregarMouseEntered

    private void JbAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbAgregarMouseExited
        ImageIcon estadoUnoRe = new ImageIcon("src\\libreria\\municipal\\btn_agregar.png");
        JbAgregar.setIcon(estadoUnoRe);
    }//GEN-LAST:event_JbAgregarMouseExited

    private void JbEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbEliminarMouseEntered
        ImageIcon estatoDosRe = new ImageIcon("src\\libreria\\municipal\\btn_eliminar_pressed.png");
        JbEliminar.setIcon(estatoDosRe);
    }//GEN-LAST:event_JbEliminarMouseEntered

    private void JbEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbEliminarMouseExited
        ImageIcon estadoUnoRe = new ImageIcon("src\\libreria\\municipal\\btn_eliminar.png");
        JbEliminar.setIcon(estadoUnoRe);
    }//GEN-LAST:event_JbEliminarMouseExited

    private void JbPrestarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbPrestarMouseEntered
        ImageIcon estatoDosRe = new ImageIcon("src\\libreria\\municipal\\btn_prestar_pressed.png");
        JbPrestar.setIcon(estatoDosRe);
    }//GEN-LAST:event_JbPrestarMouseEntered

    private void JbPrestarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbPrestarMouseExited
        ImageIcon estadoUnoRe = new ImageIcon("src\\libreria\\municipal\\btn_prestar.png");
        JbPrestar.setIcon(estadoUnoRe);
    }//GEN-LAST:event_JbPrestarMouseExited

    private void JbDevolver1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbDevolver1MouseEntered
        ImageIcon estatoDosRe = new ImageIcon("src\\libreria\\municipal\\btn_devolver_pressed.png");
        JbDevolver1.setIcon(estatoDosRe);
    }//GEN-LAST:event_JbDevolver1MouseEntered

    private void JbDevolver1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbDevolver1MouseExited
        ImageIcon estadoUnoRe = new ImageIcon("src\\libreria\\municipal\\btn_devolver.png");
        JbDevolver1.setIcon(estadoUnoRe);
    }//GEN-LAST:event_JbDevolver1MouseExited

    private void JbVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbVolverMouseEntered
        ImageIcon estatoDosRe = new ImageIcon("src\\libreria\\municipal\\btn_volver_pressed.png");
        JbVolver.setIcon(estatoDosRe);
    }//GEN-LAST:event_JbVolverMouseEntered

    private void JbVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbVolverMouseExited
        ImageIcon estatoDosRe = new ImageIcon("src\\libreria\\municipal\\btn_volver.png");
        JbVolver.setIcon(estatoDosRe);
    }//GEN-LAST:event_JbVolverMouseExited
    
    // Método para generar un codigo unico de libro
    private String generarCodigoUnico() {
        String codigo;
        Random random = new Random();
        do {
            codigo = String.format("%04d", random.nextInt(10000)); // Genera un número aleatorio de 4 dígitos
            try (PreparedStatement ps = connection.prepareStatement("SELECT COUNT(*) FROM libros WHERE codigo = ?")) {
                ps.setString(1, codigo);
                ResultSet rs = ps.executeQuery();
                if (!rs.next() || rs.getInt(1) == 0) {
                    break; // Si el código no existe en la base de datos, sale del bucle
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } while (true);
        return codigo;
    }
    
    //Método para cargar los datos de la tabla 'Libros' en la tabla de la interfaz de usuario
    private void cargarTabla() {
        // Obtener el modelo de la tabla 'JtaLibros' y vaciar su contenido actual
        mt = (DefaultTableModel) JtaLibros.getModel();
        mt.setRowCount(0);

        // Consulta SQL para obtener todos los registros de la tabla 'libros'
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM libros")) {

            // Iterar sobre los resultados de la consulta y agregar filas al modelo de la tabla
            while (rs.next()) {
                mt.addRow(new Object[]{
                    rs.getString("codigo"),
                    rs.getString("titulo"),
                    rs.getString("estado"),
                    rs.getString("categoria"),
                    rs.getString("autor"),
                    rs.getInt("ano_Lanzamiento")
                });
            }
        } catch (SQLException e) {
            // Manejo de excepciones en caso de error durante la consulta
            e.printStackTrace();
        }
    }
    
    // Método para mostrar las solicitudes de libros en la interfaz de usuario
    private void mostrarLibrosSolicitados() {
        // Definir el modelo de la tabla para mostrar las solicitudes
        modeloSolicitudes = new DefaultTableModel(
            new Object[][]{},
            new String[]{"Usuario", "Código", "Título", "Fecha Préstamo", "Fecha Devolución", "Estado"}
        ) {
            boolean[] canEdit = new boolean[]{false, false, false, false, false, true};

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        JtaMostrarSolicitudes.setModel(modeloSolicitudes);

        // Consulta SQL para obtener los préstamos y los nombres de los usuarios asociados
        try (Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT p.*, u.nombre FROM prestamos p INNER JOIN usuarios u ON p.dni_usuario = u.dni")) {

            // Iterar sobre los resultados de la consulta y agregar filas al modelo de la tabla
           while (rs.next()) {
               modeloSolicitudes.addRow(new Object[]{
                   rs.getString("nombre"), // Obtener el nombre del usuario
                   rs.getString("codigo_libro"), 
                   obtenerTituloLibroPorCodigo(rs.getString("codigo_libro")),
                   rs.getDate("fecha_prestamo") != null ? rs.getDate("fecha_prestamo").toLocalDate().toString() : "N/A",
                   rs.getDate("fecha_devolucion") != null ? rs.getDate("fecha_devolucion").toLocalDate().toString() : "N/A",
                   rs.getString("estado")
               });
           }
       } catch (SQLException e) {
           // Manejo de excepciones en caso de error durante la consulta
           e.printStackTrace();
       }
    }
    
    // Método para obtener el título de un libro dado su código
    private String obtenerTituloLibroPorCodigo(String codigoLibro) {
        // Consulta SQL para obtener el título del libro por su código
        try (PreparedStatement ps = connection.prepareStatement("SELECT titulo FROM libros WHERE codigo = ?")) {
            ps.setString(1, codigoLibro);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getString("titulo");
            }
        } catch (SQLException e) {
            // Manejo de excepciones en caso de error durante la consulta
            e.printStackTrace();
        }
        return "Título no encontrado";
    }

    // Método para agregar un listener al combo box de estados
    private void agregarListenerComboBox() {
        JcbEstados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Filtrar las solicitudes de libros según el estado seleccionado
                filtrarSolicitudesPorEstado();
            }
        });
    }
    
    // Método para filtrar las solicitudes de libros según el estado seleccionado
    private void filtrarSolicitudesPorEstado() {
        String estadoSeleccionado = (String) JcbEstados.getSelectedItem();
        if (estadoSeleccionado.equals("Todos")) {
            mostrarLibrosSolicitados();
            return;
        }
        
        // Consulta SQL para obtener las solicitudes de libros con un estado específico
        String sql = "SELECT p.*, u.nombre AS nombre_usuario " +
                 "FROM prestamos p " +
                 "JOIN usuarios u ON p.dni_usuario = u.dni " +
                 "WHERE p.estado = ?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, estadoSeleccionado);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel modeloFiltrado = new DefaultTableModel();
            modeloFiltrado.addColumn("Usuario");
            modeloFiltrado.addColumn("Código");
            modeloFiltrado.addColumn("Título");
            modeloFiltrado.addColumn("Fecha Préstamo");
            modeloFiltrado.addColumn("Fecha Devolucion");
            modeloFiltrado.addColumn("Estado");

            // Iterar sobre los resultados de la consulta y agregar filas al modelo de la tabla filtrada
            while (rs.next()) {
                modeloFiltrado.addRow(new Object[]{
                    rs.getString("nombre_usuario"),
                    rs.getString("codigo_libro"),
                    obtenerTituloLibroPorCodigo(rs.getString("codigo_libro")),
                    rs.getDate("fecha_prestamo") != null ? rs.getDate("fecha_prestamo").toLocalDate().toString() : "N/A",
                    rs.getDate("fecha_devolucion") != null ? rs.getDate("fecha_devolucion").toLocalDate().toString() : "N/A",
                    rs.getString("estado")
                });
            }
            JtaMostrarSolicitudes.setModel(modeloFiltrado);
        } catch (SQLException e) {
            // Manejo de excepciones en caso de error durante la consulta
            e.printStackTrace();
        }
    }
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbActualizar;
    private javax.swing.JButton JbAgregar;
    private javax.swing.JButton JbDevolver1;
    private javax.swing.JButton JbEliminar;
    private javax.swing.JButton JbPrestar;
    private javax.swing.JButton JbVolver;
    private javax.swing.JComboBox<String> JcbEstados;
    private javax.swing.JTable JtaLibros;
    private javax.swing.JTable JtaMostrarSolicitudes;
    private javax.swing.JTextField JtfAutor;
    private javax.swing.JTextField JtfAñoLanza;
    private javax.swing.JTextField JtfCategoria;
    private javax.swing.JTextField JtfCodigo;
    private javax.swing.JTextField JtfEstado;
    private javax.swing.JTextField JtfFechaDevolucion;
    private javax.swing.JTextField JtfTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
 
}
