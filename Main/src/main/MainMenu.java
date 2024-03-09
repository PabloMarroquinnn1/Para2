
package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame implements ActionListener {
    // Components
    private JButton adminButton, doctorsButton, patientsButton;

    // Constructor
    public MainMenu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    // Initialize components
    private void initComponents() {
        Font font = new Font("Times New Roman", Font.BOLD, 14);
        //Labael
        JLabel tittleLabel = new JLabel("Bienbenido");
        tittleLabel.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        tittleLabel.setBounds(180, 80, 200, 25);
        this.add(tittleLabel);
        
        // Create components
        adminButton = new JButton("Administrador");
        doctorsButton = new JButton("Doctores");
        patientsButton = new JButton("Pacientes");
        
        // Establecer el tipo de letra a los botones
        adminButton.setFont(font);
        doctorsButton.setFont(font);
        patientsButton.setFont(font);

        // Add action listener to components
        adminButton.addActionListener(this);
        doctorsButton.addActionListener(this);
        patientsButton.addActionListener(this);

        adminButton.setBounds(160, 140, 150, 25);
        adminButton.setForeground(Color.black);
        adminButton.setBackground(new Color(243, 232, 121));
        adminButton.addActionListener(this);
        this.add(adminButton);
        
        doctorsButton.setBounds(160, 180, 150, 25);
        doctorsButton.setForeground(Color.black);
        doctorsButton.setBackground(new Color(243, 232, 121));
        doctorsButton.addActionListener(this);
        this.add(doctorsButton);
        
        patientsButton.setBounds(160, 220, 150, 25);
        patientsButton.setForeground(Color.black);
        patientsButton.setBackground(new Color(243, 232, 121));
        patientsButton.addActionListener(this);
        this.add(patientsButton);
        // Configura el diseño del JFrame
        setLayout(new FlowLayout());
        // Configura las propiedades del JFrame
        setTitle("Menu Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        
        // Set frame properties
        
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(173, 216, 230));
        // Finalmente, haz visible la ventana después de configurar todo
        this.setVisible(true);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button clicks here
        if (e.getSource() == adminButton) {
            Administrador admin = new Administrador();
            admin.setVisible(true);
            this.dispose();
        } else if (e.getSource() == doctorsButton) {
            Doctores doc = new Doctores();
            doc.setVisible(true);
            this.dispose();
        } else if (e.getSource() == patientsButton) {
            Pacientes paci = new Pacientes();
            paci.setVisible(true);
            this.dispose();
        }
    }

   
}
