package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pacientes extends JFrame implements ActionListener{
    
    protected JTextField codigoPa;
    protected JPasswordField contraPa;
    protected JButton boton;
    
    public Pacientes(){
        Font font = new Font("Times New Roman", Font.BOLD, 14);
        //Etiqueta de Bienvenida
        JLabel tittleLabel = new JLabel("Bienbenido");
        tittleLabel.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        tittleLabel.setBounds(200, 10, 200, 25);
        this.add(tittleLabel);
        // cargar imagen
        ImageIcon imagenIcon =  new ImageIcon(getClass().getResource("../img/hola.png"));
        Image imageDimension = imagenIcon.getImage().getScaledInstance(120, 100, Image.SCALE_SMOOTH);
        ImageIcon adjustedImageIcon = new ImageIcon(imageDimension);
        
        //labe Imagen 
        JLabel imageLabel = new JLabel(adjustedImageIcon);
        imageLabel.setBounds(190, 30, 120, 100);
        this.add(imageLabel);
        
        //Parte datos codigo
        JLabel codigopa = new JLabel("Codigo: ");
        codigopa.setBounds(50, 140, 80, 25);
        codigopa.setFont(font);
        this.add(codigopa);
        
        codigoPa = new JTextField();
        codigoPa.setBounds(130, 140, 260, 25);
        this.add(codigoPa);
        
        //Parte contraseña administrador
        JLabel contraAd = new JLabel("Contraseña: ");
        contraAd.setBounds(50, 180, 80, 25);
        contraAd.setFont(font);
        this.add(contraAd);
        
        contraPa = new JPasswordField();
        contraPa.setBounds(130, 180, 260, 25);
        this.add(contraPa);
        
        // Boton Iniciar Sesión
        JButton loginBoton = new JButton("Iniciar Sesión");
        loginBoton.setBounds(100, 220, 150, 25);
        loginBoton.setForeground(Color.black);
        loginBoton.setBackground(new Color(243, 232, 121));
        loginBoton.addActionListener(this);
        this.add(loginBoton);

        // Boton Registrarse
        JButton registrBoton = new JButton("Registrarse");
        registrBoton.setBounds(260, 220, 150, 25);
        registrBoton.setForeground(Color.black);
        registrBoton.setBackground(new Color(158, 236, 240));
        registrBoton.setOpaque(false); // Hacer el botón transparente
        registrBoton.setContentAreaFilled(false);
        registrBoton.setBorderPainted(false);
        registrBoton.addActionListener(this);
        this.add(registrBoton);
        
        //Interfaz ventana
        this.setTitle("Pacientes");
        this.setSize(500, 350);
        this.setResizable(false);
        this.setLayout(null);
        this.setBounds(100, 200, 500,350);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(173, 216, 230));
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
    
}
