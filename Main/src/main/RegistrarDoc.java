package main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarDoc extends JFrame implements ActionListener{
    
    private JTextField codigo;
    private JTextField apellido;
    private JTextField especialidad;
    private JTextField contraseña;
    private JTextField genero;
    private JTextField telefono;
    private JTextField edad;
    private JComboBox<String> genderComboBox;
    JButton docregis;
        
    public RegistrarDoc(){
        Font font = new Font("Times New Roman", Font.BOLD, 14);
        //Label Titulo Registro
        JLabel registrodoc = new JLabel("NUEVO DOCTOR");
        registrodoc.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        registrodoc.setBounds(180, -70, 200, 200);
        this.add(registrodoc);
        
        //Boton Y texto para nombre
        JLabel nombredoc = new JLabel("Codigo");
        nombredoc.setBounds(50, 50, 80, 25);
        nombredoc.setFont(font);
        this.add(nombredoc);
        
        codigo = new JTextField();
        codigo.setBounds(150, 50, 260, 25);
        this.add(codigo);
        
        //Boton Y texto para apellido
        JLabel apellidodoc = new JLabel("Nombre Completo");
        apellidodoc.setBounds(50, 90, 80, 25);
        apellidodoc.setFont(font);
        this.add(apellidodoc);
        
        apellido = new JTextField();
        apellido.setBounds(150, 90, 260, 25);
        this.add(apellido);
        
        String [] genders = {"Masculino", "Femenino"};
        genderComboBox = new JComboBox<>(genders);
        genderComboBox.setBounds(150, 210, 260, 25);
        nombredoc.setFont(font);
        this.add(genderComboBox);
        
        //Boton Y texto para especialidad
        JLabel especialidaddoc = new JLabel("Especialidad");
        especialidaddoc.setBounds(50, 130, 80, 25);
        especialidaddoc.setFont(font);
        this.add(especialidaddoc);
        
        especialidad = new JTextField();
        especialidad.setBounds(150, 130, 260, 25);
        this.add(especialidad);
        
        //Boton Y texto para contraseña
        JLabel contraseñadoc = new JLabel("Contraseña");
        contraseñadoc.setBounds(50, 170, 80, 25);
        contraseñadoc.setFont(font);
        this.add(contraseñadoc);
        
        contraseña = new JTextField();
        contraseña.setBounds(150, 170, 260, 25);
        this.add(contraseña);
        
        //Boton Y texto para genero
        JLabel generodoc = new JLabel("Genero");
        generodoc.setBounds(50, 210, 80, 25);
        generodoc.setFont(font);
        this.add(generodoc);
        
        //Boton Y texto para telefono
        JLabel telefonodoc = new JLabel("Telefono");
        telefonodoc.setBounds(50, 250, 80, 25);
        telefonodoc.setFont(font);
        this.add(telefonodoc);
        
        telefono = new JTextField();
        telefono.setBounds(150, 250, 260, 25);
        this.add(telefono);
        
        //Boton Y texto para edad
        JLabel edaddoc = new JLabel("Edad");
        edaddoc.setBounds(50, 290, 80, 25);
        edaddoc.setFont(font);
        this.add(edaddoc);
        
        edad = new JTextField();
        edad.setBounds(150, 290, 260, 25);
        this.add(edad);
        
        //Boton Regitro
        docregis = new JButton("Registrarse");
        docregis.setBounds(200, 330, 150, 25);
        docregis.setFont(font);
        docregis.setForeground(Color.BLACK);
        docregis.setBackground(new Color(243, 232, 121));
        docregis.addActionListener(this);
        this.add(docregis);
        
        //Caracterisiticas de la ventana
        this.setTitle("Agregar Doctor");
        this.setSize(500, 400);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Establecer el color de fondo
    getContentPane().setBackground(new Color(173, 216, 230)); // Color celeste
        
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==docregis){
            String namedoc = codigo.getText();
            String lnamedoc = apellido.getText();
            String selectedGender = (String) genderComboBox.getSelectedItem();//VECTOR CHAR
            String datedoc = edad.getText();
            String espdoc = especialidad.getText();
            String teledoc = telefono.getText();
            String contradoc = contraseña.getText();
            
            
            
            principal.agregardoc(namedoc, lnamedoc, espdoc, contradoc, selectedGender, teledoc, datedoc);
            principal.contador++;
            this.dispose();
            VentanaAdministrador regdoc = new VentanaAdministrador();
        }
        
    }
    
}
