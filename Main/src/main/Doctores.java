
package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Doctores extends JFrame implements ActionListener {
    
    protected JTextField codigoDoc;
    protected JPasswordField contraDoc;
    protected JButton boton;
    
    public Doctores(){
        //Etiqueta de Bienvenida
        JLabel tittleLabel = new JLabel("Bienbenido Doctor");
        tittleLabel.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        tittleLabel.setBounds(150, 0, 200, 25);
        this.add(tittleLabel);
        // cargar imagen
        ImageIcon imagenIcon =  new ImageIcon(getClass().getResource("../img/imgdoc.png"));
        Image imageDimension = imagenIcon.getImage().getScaledInstance(120, 100, Image.SCALE_SMOOTH);
        ImageIcon adjustedImageIcon = new ImageIcon(imageDimension);
        
        //labe Imagen 
        JLabel imageLabel = new JLabel(adjustedImageIcon);
        imageLabel.setBounds(190, 30, 120, 100);
        this.add(imageLabel);
        //Parte datos codigo
        JLabel codigodoc = new JLabel("Codigo: ");
        codigodoc.setBounds(50, 160, 80, 20);
        this.add(codigodoc);
        
        codigoDoc = new JTextField();
        codigoDoc.setBounds(130, 160, 260, 25);
        this.add(codigoDoc);
        
        //Parte contraseña administrador
        JLabel contraAd = new JLabel("Contraseña: ");
        contraAd.setBounds(50, 220, 80, 20);
        this.add(contraAd);
        
        contraDoc = new JPasswordField();
        contraDoc.setBounds(130, 220, 260, 25);
        this.add(contraDoc);
        //Boton
        boton = new JButton("Iniciar Sesión");
        boton.setBounds(160, 280, 150, 25);
        boton.setBackground(new Color(243, 232, 121));
        boton.addActionListener(this);
        this.add(boton);
        
        
        //Interfaz ventana
        this.setTitle("Doctores");
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
        
    }
    
}
