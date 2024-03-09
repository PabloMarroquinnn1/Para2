package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
//import java.util.ArrayList};

public class VentanaAdministrador extends JFrame implements ActionListener {
    
    JButton regresar, crear, eliminar, actualizar;
    JTable tabladoc;
    DefaultTableModel modelTable;
    public VentanaAdministrador() {
        
        
        
        // Interfaz ventana
        this.setTitle("Administrador");
        this.setSize(900, 450);
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(173, 216, 230)); // Color celeste
        
        // Creacion Pestañas de Panel
        JTabbedPane paneldoc = new JTabbedPane(JTabbedPane.TOP);
        
        JPanel pestaña1 = new JPanel(null);
        JPanel pestaña2 = new JPanel(null);
        JPanel pestaña3 = new JPanel(null);
        
        // Establecer colores de fondo para cada panel
        pestaña1.setBackground(new Color(173, 216, 230)); // Celeste
        pestaña2.setBackground(Color.YELLOW); // Puedes cambiar el color a tu elección
        pestaña3.setBackground(Color.GREEN);
        
        getContentPane().add(paneldoc);
        paneldoc.addTab("Doctores", pestaña1);
        paneldoc.addTab("Pacientes", pestaña2);
        paneldoc.addTab("Productos", pestaña3);
        // Título para la pestaña1
        JLabel tituloPestaña1 = new JLabel("Listado de Doctores");
        tituloPestaña1.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        tituloPestaña1.setBounds(20, 10, 250, 25);
        pestaña1.add(tituloPestaña1);
        
        //Creacion Tablas
        Object[] columDoc = {"Códdigo", "Nombre Completo", "Género", "Edad", "Especialidad ", "Telefono"};
        modelTable = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
               //all cells false
               return false;
            }
        };
        modelTable.setDataVector(principal.convertirDatosDocs(), columDoc);
        tabladoc = new JTable(modelTable);
        
        
        //Agregar Escrul () coloca los margenes a la tabla
        JScrollPane scrolldoc = new JScrollPane(tabladoc);
        
        scrolldoc.setBounds(20, 40, 600, 300);
        pestaña1.add(scrolldoc);
        
        //boton registro
        crear = new JButton("Crear");
        crear.setBounds(650, 50, 100, 30);
        crear.setVisible(true);
        crear.setBackground(new Color(243, 232, 121));
        crear.setEnabled(true);//activar o desactivar boton
        crear.addActionListener(this);
        pestaña1.add(crear);
        //boton Editar
        actualizar = new JButton("Actualizar");
        actualizar.setBounds(750, 50, 100, 30);
        actualizar.setVisible(true);
        actualizar.setBackground(new Color(243, 232, 121));
        actualizar.setEnabled(true);//activar o desactivar boton
        actualizar.addActionListener(this);
        pestaña1.add(actualizar);
        //boton Eliminar
        eliminar = new JButton("Eliminar");
        eliminar.setBounds(650,100, 100, 30);
        eliminar.setVisible(true);
        eliminar.setBackground(new Color(243, 232, 121));
        eliminar.setEnabled(true);//activar o desactivar boton
        eliminar.addActionListener(this);
        pestaña1.add(eliminar);
        //Creacion de boton para regresar al menu
        regresar = new JButton("Regresar");
        regresar.setBounds(750, 100, 100, 30);
        regresar.setVisible(true);
        regresar.setBackground(new Color(243, 232, 121));
        regresar.addActionListener(this);
        pestaña1.add(regresar);
        
        // Copiar el contenido de la pestaña 1 a la pestaña 3
        // Título para la pestaña1
        JLabel tituloPestaña3 = new JLabel("Listado de Productos");
        tituloPestaña3.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        tituloPestaña3.setBounds(20, 10, 250, 25);
        pestaña3.add(tituloPestaña3);
        pestaña3.add(new JLabel(tituloPestaña3.getText()));
        JTable tabladocCopia = new JTable(principal.convertirDatosDocs(), columDoc);
        JScrollPane scrolldocCopia = new JScrollPane(tabladocCopia);
        scrolldocCopia.setBounds(20, 40, 600, 300);
        pestaña3.add(scrolldocCopia);
        JButton crearCopia = new JButton("Crear");
        crearCopia.setBounds(650, 50, 100, 30);
        crearCopia.setVisible(true);
        crearCopia.setBackground(new Color(243, 232, 121));
        crearCopia.setEnabled(true);
        crearCopia.addActionListener(this);
        pestaña3.add(crearCopia);
        JButton actualizarCopia = new JButton("Actualizar");
        actualizarCopia.setBounds(750, 50, 100, 30);
        actualizarCopia.setVisible(true);
        actualizarCopia.setBackground(new Color(243, 232, 121));
        actualizarCopia.setEnabled(true);
        actualizarCopia.addActionListener(this);
        pestaña3.add(actualizarCopia);
        JButton eliminarCopia = new JButton("Eliminar");
        eliminarCopia.setBounds(650, 100, 100, 30);
        eliminarCopia.setVisible(true);
        eliminarCopia.setBackground(new Color(243, 232, 121));
        eliminarCopia.setEnabled(true);
        eliminarCopia.addActionListener(this);
        pestaña3.add(eliminarCopia);
        JButton regresarCopia = new JButton("Regresar");
        regresarCopia.setBounds(750, 100, 100, 30);
        regresarCopia.setVisible(true);
        regresarCopia.setBackground(new Color(243, 232, 121));
        regresarCopia.addActionListener(this);
        pestaña3.add(regresarCopia);
        
        
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //if (e.getSource()==regresar){
          //  this.dispose();
            //MainMenu regreso = new MainMenu();
        //}
        if (e.getSource()==crear){
            this.dispose();
            RegistrarDoc  regdoc = new RegistrarDoc();
        }else if(e.getSource() == eliminar){
            int posicion = tabladoc.getSelectedRow();
            principal.listadoctores.remove(posicion);
            modelTable.removeRow(posicion);
        }
    }
}