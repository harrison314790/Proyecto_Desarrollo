/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package libreria.municipal;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class Admin extends javax.swing.JFrame {
    private Catalogo catalogo;
    private DefaultTableModel mt;
    private DefaultTableModel modeloSolicitudes;
    /**
     * Creates new form Admin
     */
    public Admin() {
        catalogo = new Catalogo();
        initComponents();
        cargarTabla();
        mostrarLibrosSolicitados();
        agregarListenerComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        JbActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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
        JtfFechaDevolucion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JcbEstados = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(920, 620));
        setPreferredSize(new java.awt.Dimension(930, 620));

        jPanel1.setBackground(new java.awt.Color(239, 41, 51));

        txtTitulo.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("LIBRERIA MUNICIPAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(txtTitulo)
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(txtTitulo)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        JbActualizar.setText("Actualizar");
        JbActualizar.setBorderPainted(false);
        JbActualizar.setContentAreaFilled(false);
        JbActualizar.setMaximumSize(new java.awt.Dimension(108, 50));
        JbActualizar.setMinimumSize(new java.awt.Dimension(108, 50));
        JbActualizar.setPreferredSize(new java.awt.Dimension(108, 50));
        JbActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JbActualizarMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        JbAgregar.setText("Agregar");
        JbAgregar.setBorderPainted(false);
        JbAgregar.setContentAreaFilled(false);
        JbAgregar.setMaximumSize(new java.awt.Dimension(108, 50));
        JbAgregar.setMinimumSize(new java.awt.Dimension(108, 50));
        JbAgregar.setPreferredSize(new java.awt.Dimension(108, 50));
        JbAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JbAgregarMouseClicked(evt);
            }
        });

        JbEliminar.setText("Eliminar");
        JbEliminar.setBorderPainted(false);
        JbEliminar.setContentAreaFilled(false);
        JbEliminar.setMaximumSize(new java.awt.Dimension(108, 50));
        JbEliminar.setMinimumSize(new java.awt.Dimension(108, 50));
        JbEliminar.setPreferredSize(new java.awt.Dimension(108, 50));
        JbEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JbEliminarMouseClicked(evt);
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

        JbPrestar.setText("Prestar");
        JbPrestar.setBorderPainted(false);
        JbPrestar.setContentAreaFilled(false);
        JbPrestar.setMaximumSize(new java.awt.Dimension(108, 50));
        JbPrestar.setMinimumSize(new java.awt.Dimension(108, 50));
        JbPrestar.setPreferredSize(new java.awt.Dimension(108, 50));
        JbPrestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JbPrestarMouseClicked(evt);
            }
        });

        JbDevolver1.setText("Devolver");
        JbDevolver1.setBorderPainted(false);
        JbDevolver1.setContentAreaFilled(false);
        JbDevolver1.setMaximumSize(new java.awt.Dimension(108, 50));
        JbDevolver1.setMinimumSize(new java.awt.Dimension(108, 50));
        JbDevolver1.setPreferredSize(new java.awt.Dimension(108, 50));
        JbDevolver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JbDevolver1MouseClicked(evt);
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
                        .addComponent(JbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JbPrestar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(JcbEstados, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JbDevolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JtfFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                                .addComponent(JbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JtfFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JbPrestar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JbDevolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JcbEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(JtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JtfCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JtfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JtfAñoLanza, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void JbActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbActualizarMouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            // Obtener los valores de los campos de texto
            String codigo = JtfCodigo.getText().isEmpty() ? null : JtfCodigo.getText();
            String titulo = JtfTitulo.getText().isEmpty() ? null : JtfTitulo.getText();
            String estado = JtfEstado.getText().isEmpty() ? null : JtfEstado.getText();
            String categoria = JtfCategoria.getText().isEmpty() ? null : JtfCategoria.getText();
            String autor = JtfAutor.getText().isEmpty() ? null : JtfAutor.getText();
            String anioText = JtfAñoLanza.getText().isEmpty() ? null : JtfAñoLanza.getText();
        
            if (catalogo.existeCodigo(codigo)) {
                // Mostrar un mensaje de error
                JOptionPane.showMessageDialog(this, "El código del libro ya existe en el catálogo. Por favor, ingrese un código diferente.");
                JtfCodigo.setText(""); // Limpiar el campo de texto del código
                JtfCodigo.requestFocus(); // Hacer focus en el campo de texto del código
                return; // Terminar la ejecución aquí
            }

            // Verificar si el año es un número
            Integer anio = null;
            if (anioText != null) {
                try {
                    anio = Integer.parseInt(anioText);
                } catch (NumberFormatException e) {
                    // Mostrar un mensaje de error
                    JOptionPane.showMessageDialog(this, "El año ingresado no es válido. Por favor, ingrese un número.");
                    JtfAñoLanza.setText(""); // Limpiar el campo de texto del año
                    JtfAñoLanza.requestFocus(); // Hacer focus en el campo de texto del año
                    return; // Terminar la ejecución aquí
                }
            }

            // Obtener el código del libro seleccionado
            String codigoSeleccionado = (String) mt.getValueAt(selectedRow, 0);

            // Actualizar el libro en el catálogo
            catalogo.actualizarCodigoLibroVacio(codigoSeleccionado, codigo, titulo, estado, categoria, autor, anio);

            // Limpiar los campos de texto
            JtfTitulo.setText("");
            JtfEstado.setText("");
            JtfCategoria.setText("");
            JtfAutor.setText("");
            JtfAñoLanza.setText("");
            JtfCodigo.setText("");

            // Mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(this, "El libro ha sido actualizado exitosamente.");

            // Actualizar la tabla
            cargarTabla();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un libro para actualizar.");
        }
    }//GEN-LAST:event_JbActualizarMouseClicked

    private void JbEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbEliminarMouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            // Obtener el código del libro seleccionado
            String codigo = (String) mt.getValueAt(selectedRow, 0);

            // Eliminar el libro del catálogo
            catalogo.eliminarLibro(codigo);

            // Mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(this, "El libro ha sido eliminado exitosamente.");

            // Actualizar la tabla
            cargarTabla();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un libro para eliminar.");
        }
    }//GEN-LAST:event_JbEliminarMouseClicked

    private void JbAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbAgregarMouseClicked
        // TODO add your handling code here:
        // Obtener los valores de los campos de texto
        String titulo = JtfTitulo.getText();
        String estado = JtfEstado.getText();
        String categoria = JtfCategoria.getText();
        String autor = JtfAutor.getText();
        String anioText = JtfAñoLanza.getText();
        String codigo = JtfCodigo.getText(); // Asumiendo que tienes un campo de texto para el código
        
        int anio;
            try {
                anio = Integer.parseInt(anioText);
            } catch (NumberFormatException e) {
                // Mostrar un mensaje de error
                JOptionPane.showMessageDialog(this, "El año ingresado no es válido. Por favor, ingrese un número.");
                JtfAñoLanza.setText(""); // Limpiar el campo de texto del año
                JtfAñoLanza.requestFocus(); // Hacer focus en el campo de texto del año
                return; // Terminar la ejecución aquí
            }

        // Verificar si el código está vacío o si ya existe en el catálogo
        if (codigo.isEmpty()) {
            // Generar un código único para el libro (por ejemplo, usando el tamaño del catálogo)
            codigo = "" + (catalogo.getLibros().size() + 1);
        } else if (catalogo.existeCodigo(codigo)) {
            // Mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "El código del libro ya existe en el catálogo. Por favor, ingrese un código diferente.");
            return; // Terminar la ejecución aquí
        }

        // Crear un nuevo objeto Libro
        Libro nuevoLibro = new Libro(codigo, titulo, estado, categoria, autor, anio);

        // Agregar el nuevo libro al catálogo
        catalogo.agregarLibro(nuevoLibro);

        // Limpiar los campos de texto
        JtfTitulo.setText("");
        JtfEstado.setText("");
        JtfCategoria.setText("");
        JtfAutor.setText("");
        JtfAñoLanza.setText("");
        JtfCodigo.setText(""); // Limpiar el campo de texto del código

        // Mostrar un mensaje de éxito
        JOptionPane.showMessageDialog(this, "El libro ha sido agregado exitosamente.");

        // Actualizar la tabla
        cargarTabla();
    }//GEN-LAST:event_JbAgregarMouseClicked

    private void JbPrestarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbPrestarMouseClicked
        // TODO add your handling code here:
        // Obtén el código del libro seleccionado en la tabla
        if (JtaMostrarSolicitudes.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un usuario con su libro que desea Prestar.");
            return;
        }
        // Verifica la fecha de devolución de cada préstamo
        Iterator<Prestamo> iterator = catalogo.getPrestamos().iterator();
        while (iterator.hasNext()) {
            Prestamo prestamo = iterator.next();
            // Si la fecha de devolución es null, salta a la siguiente iteración
            if (prestamo.getFechaDevolucion() == null) {
                continue;
            }
            // Si la fecha de devolución es anterior a la fecha actual, elimina el préstamo
            if (prestamo.getFechaDevolucion().isBefore(LocalDate.now())) {
                iterator.remove();
            }
        }
        
        int selectedRow = JtaMostrarSolicitudes.getSelectedRow();
        String codigoLibro = (String) JtaMostrarSolicitudes.getValueAt(selectedRow, 1);
        
        if (JtfFechaDevolucion.getText().isEmpty()||JtfFechaDevolucion.getText().equals("YYYY-MM-DD")) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una fecha de devolución.");
            JtfFechaDevolucion.requestFocus();
            return;
        }

        // Obtén la fecha de devolución ingresada en JtfFechaDevolucion
        LocalDate fechaDevolucion = LocalDate.parse(JtfFechaDevolucion.getText());

        // Actualiza el estado del libro en la lista de préstamos y en el catálogo
        for (Prestamo prestamo : catalogo.getPrestamos()) {
            if (prestamo.getCodigoLibro().equals(codigoLibro)) {
                // Verifica si el libro ya está prestado y tiene una fecha de devolución
                if (prestamo.getEstado().equals("Prestado") && prestamo.getFechaDevolucion() != null) {
                    JOptionPane.showMessageDialog(this, "El libro no se encuentra disponible para préstamo.");
                    JtfFechaDevolucion.setText("");
                    return;
                }
                prestamo.setEstado("Prestado");
                // Verifica si la fecha de préstamo ya está establecida antes de asignarle una nueva
                if (prestamo.getFechaPrestamo() == null) {
                    prestamo.setFechaPrestamo(LocalDate.now());
                }
                prestamo.setFechaDevolucion(fechaDevolucion);
            }
        }
        for (Libro libro : catalogo.getLibros()) {
            if (libro.getCodigo().equals(codigoLibro)) {
                libro.setEstado("Prestado");
            }
        }

        // Actualiza las tablas
        JtfFechaDevolucion.setText("");
        JtfFechaDevolucion.requestFocus();
        cargarTabla();
        mostrarLibrosSolicitados();
    }//GEN-LAST:event_JbPrestarMouseClicked

    private void JbDevolver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbDevolver1MouseClicked
        // Obtén el código del libro seleccionado en la tabla de solicitudes
        if (JtaMostrarSolicitudes.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un usuario con su prestamo que desea devolver.");
            return;
        }
        int selectedRow = JtaMostrarSolicitudes.getSelectedRow();
        String codigoLibro = (String) JtaMostrarSolicitudes.getValueAt(selectedRow, 1);

        // Actualiza el estado del libro en la lista de préstamos y en el catálogo
        Iterator<Prestamo> iterator = catalogo.getPrestamos().iterator();
        while (iterator.hasNext()) {
            Prestamo prestamo = iterator.next();
            if (prestamo.getCodigoLibro().equals(codigoLibro)) {
                prestamo.setFechaDevolucion(LocalDate.now());
                iterator.remove();  // Elimina el préstamo de la lista
            }
        }
        for (Libro libro : catalogo.getLibros()) {
            if (libro.getCodigo().equals(codigoLibro)) {
                libro.setEstado("Disponible");
            }
        }

        // Actualiza las tablas
        cargarTabla();
        mostrarLibrosSolicitados();
    }//GEN-LAST:event_JbDevolver1MouseClicked

    private void JtfFechaDevolucionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtfFechaDevolucionFocusGained
        // TODO add your handling code here:
        if(JtfFechaDevolucion.getText().equals("YYYY-MM-DD")){
            JtfFechaDevolucion.setText("");
            JtfFechaDevolucion.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_JtfFechaDevolucionFocusGained

    private void JtfFechaDevolucionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JtfFechaDevolucionFocusLost
        // TODO add your handling code here:
        if(JtfFechaDevolucion.getText().equals("")){
            JtfFechaDevolucion.setText("YYYY-MM-DD");
            JtfFechaDevolucion.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_JtfFechaDevolucionFocusLost

    private void JtfFechaDevolucionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtfFechaDevolucionMouseClicked
        // TODO add your handling code here:
        JtfFechaDevolucion.setForeground(Color.black);
    }//GEN-LAST:event_JtfFechaDevolucionMouseClicked
    
    
    private void cargarTabla() {
        mt = (DefaultTableModel) jTable1.getModel();
        mt.setRowCount(0);
        
        // Obtener los libros del catálogo
        for (Libro libro : catalogo.getLibros()) {
            // Agregar los libros a la tabla
            mt.addRow(new Object[]{libro.getCodigo(), libro.getTitulo(), libro.getEstado(), libro.getCategoria(), libro.getAutor(), libro.getAnoLanzamiento()});
        }
    }
    
    private void mostrarLibrosSolicitados() {
        modeloSolicitudes = new DefaultTableModel(
            new Object[][] {},
            new String[] { "Usuario", "Código", "Título", "Fecha Préstamo", "Fecha Devolución", "Estado" }
        ) {
            boolean[] canEdit = new boolean[] {false ,false, false, false, false, true };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        JtaMostrarSolicitudes.setModel(modeloSolicitudes);

        List<Prestamo> prestamos = catalogo.getPrestamos();
        for (Prestamo prestamo : prestamos) {
            String nombreUsuario = prestamo.getUsuario().getNombre();
            String codigoLibro = prestamo.getCodigoLibro();
            String estadoLibro = prestamo.getEstado();
            String tituloLibro = obtenerTituloLibroPorCodigo(codigoLibro);
            String fechaPrestamo = prestamo.getFechaPrestamo() != null ? prestamo.getFechaPrestamo().toString() : "N/A";
            String fechaDevolucion = prestamo.getFechaDevolucion() != null ? prestamo.getFechaDevolucion().toString() : "N/A";
            modeloSolicitudes.addRow(new Object[] {nombreUsuario, codigoLibro, tituloLibro, fechaPrestamo, fechaDevolucion, estadoLibro });
            
        }
    }
    
    private String obtenerTituloLibroPorCodigo(String codigoLibro) {
        for (Libro libro : catalogo.getLibros()) {
            if (libro.getCodigo().equals(codigoLibro)) {
                return libro.getTitulo();
            }
        }
        return "Título no encontrado";
    }
    
    private void agregarListenerComboBox() {
        JcbEstados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filtrarSolicitudesPorEstado();
            }
        });
    }
    
    private void filtrarSolicitudesPorEstado() {
        String estadoSeleccionado = (String) JcbEstados.getSelectedItem();
        if (estadoSeleccionado.equals("Todos")) {
            mostrarLibrosSolicitados();
            return;
        }
        
        // Obtener la lista de préstamos del catálogo
        List<Prestamo> prestamos = catalogo.getPrestamos();
        
        // Crear un nuevo modelo de tabla
        DefaultTableModel modeloFiltrado = new DefaultTableModel();
        
        // Agregar las columnas al modelo
        modeloFiltrado.addColumn("Usuario");
        modeloFiltrado.addColumn("Código");
        modeloFiltrado.addColumn("Título");
        modeloFiltrado.addColumn("Fecha Préstamo");
        modeloFiltrado.addColumn("Fecha Devolucion");
        modeloFiltrado.addColumn("Estado");
        
        // Agregar las filas al modelo
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getEstado().equals(estadoSeleccionado)) {
                Libro libro = catalogo.buscarLibroPorCodigo(prestamo.getCodigoLibro());
                if (libro != null) {
                    String fechaPrestamo = prestamo.getFechaPrestamo() != null ? prestamo.getFechaPrestamo().toString() : "N/A";
                    String fechaDevolucion = prestamo.getFechaDevolucion() != null ? prestamo.getFechaDevolucion().toString() : "N/A";
                    String titulo = libro.getTitulo();
                    modeloFiltrado.addRow(new Object[] { prestamo.getUsuario().getNombre(), prestamo.getCodigoLibro(), titulo, fechaPrestamo, fechaDevolucion, prestamo.getEstado() });
                }
            }
        }
        
        // Establecer el modelo de la tabla
        JtaMostrarSolicitudes.setModel(modeloFiltrado);
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
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
    private javax.swing.JComboBox<String> JcbEstados;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
 
}
