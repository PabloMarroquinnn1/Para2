
package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Administrador extends JFrame implements ActionListener{
    
    protected JTextField codigo;
    protected JTextField nombre;
    protected JPasswordField contraAdmin;
    protected JButton boton;
    protected VentanaAdministrador nuevaVentana;
    
    public Administrador(){
        Font font = new Font("Times New Roman", Font.BOLD, 14);
        //Labael bienvenida 
        JLabel tittleLabel = new JLabel("Bienbenido");
        tittleLabel.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        tittleLabel.setBounds(200, 0, 200, 25);
        this.add(tittleLabel);
        // cargar imagen
        ImageIcon imagenIcon =  new ImageIcon(getClass().getResource("../img/imgadmin.png"));
        Image imageDimension = imagenIcon.getImage().getScaledInstance(120, 100, Image.SCALE_SMOOTH);
        ImageIcon adjustedImageIcon = new ImageIcon(imageDimension);
        
        //labe Imagen 
        JLabel imageLabel = new JLabel(adjustedImageIcon);
        imageLabel.setBounds(190, 30, 120, 100);
        this.add(imageLabel);
        //Parte datos codigo
        JLabel codigoAd = new JLabel("Codigo: ");
        codigoAd.setBounds(50, 160, 80, 20);
        codigoAd.setFont(font);
        this.add(codigoAd);
        
        codigo = new JTextField();
        codigo.setBounds(130, 160, 260, 25);
        this.add(codigo);
        
        //Parte datos nombre
        JLabel nombreAd = new JLabel("Nombre: ");
        nombreAd.setBounds(50, 200, 80, 20);
        nombreAd.setFont(font);
        this.add(nombreAd);
        
        nombre = new JTextField();
        nombre.setBounds(130, 200, 260, 25);
        this.add(nombre);
        
        //Parte contraseña administrador
        JLabel contraAd = new JLabel("Contraseña: ");
        contraAd.setBounds(50, 240, 80, 20);
        contraAd.setFont(font);
        this.add(contraAd);
        
        contraAdmin = new JPasswordField();
        contraAdmin.setBounds(130, 240, 260, 25);
        this.add(contraAdmin);
        
        //Boton
        boton = new JButton("Iniciar Sesión");
        boton.setBounds(180, 280, 150, 25);
        boton.setBackground(new Color(243, 232, 121));
        boton.addActionListener(this);
        this.add(boton);
        
        //Interfaz ventana
        this.setTitle("Login Administrador");
        this.setSize(500, 400);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(173, 216, 230));
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            String codigoIngresado = codigo.getText();
            String nombreIngresado = nombre.getText();
            String contraAdminIngresada = new String(contraAdmin.getPassword());

            if (codigoIngresado.equals("0") && nombreIngresado.equals("0") && contraAdminIngresada.equals("0")) {
                JOptionPane.showMessageDialog(null, "Datos correctos");
                nuevaVentana = new VentanaAdministrador();
                nuevaVentana.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
            }
        }
    }


    
}