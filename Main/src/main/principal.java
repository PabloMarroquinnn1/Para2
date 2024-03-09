/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class principal {
    
    public static ArrayList<infodocAdm> listadoctores = new ArrayList<>();
    public static ArrayList<infodocAdm2> listaproductos = new ArrayList<>();
    public static int contador = 1;
    
    public static void main(String[] args) {
        
        listadoctores.add(new infodocAdm("001", "Pablo Marroquin", "Masculino", "25", "Especialidad", "00000000", "Juan1234"));
        listaproductos.add(new infodocAdm2("001", "Pastillas", "100", "Desc1", "10."));
        
        new MainMenu().setVisible(true);
        
        //RegistrarDoc newdocs = new RegistrarDoc();
    }
    
    public static Object[][] convertirDatosDocs(){
        int filasdoc = listadoctores.size();
        Object[][] arreglo = new Object[filasdoc][7];//fila y columnas
        
        for (int i=0; i < filasdoc; i++){
            infodocAdm tempo_doc = listadoctores.get(i);
            
            arreglo[i][0] = tempo_doc.getNombre();
            arreglo[i][1] = tempo_doc.getApellido();
            arreglo[i][2] = tempo_doc.getEspecialidad();
            arreglo[i][3] = tempo_doc.getContraseña();
            arreglo[i][4] = tempo_doc.getGenero();
            arreglo[i][5] = tempo_doc.getTelefono();
           
        }
        return arreglo;
    }
    public static Object[][] convertirDatosDocs2(){
        int filasdoc = listaproductos.size();
        Object[][] arreglo = new Object[filasdoc][4];//fila y columnas
        
        for (int i=0; i < filasdoc; i++){
            infodocAdm2 tempo_doc = listaproductos.get(i);
            
            arreglo[i][0] = tempo_doc.getCodigo();
            arreglo[i][1] = tempo_doc.getNombre2();
            arreglo[i][2] = tempo_doc.getCantidad();
            arreglo[i][3] = tempo_doc.getDescripcion();
            arreglo[i][4] = tempo_doc.getPrecio();

        }
        return arreglo;
    }
    public static void agregardoc(String nombre, String apellido, String especialidad, String contraseña, String genero, String telefono, String edad){
        listadoctores.add(new infodocAdm(nombre, apellido, especialidad, contraseña, genero, telefono, edad));
        
    }
    public static void agregarproduc(String codigo, String nombre2, String cantidad, String descripcion, String precio){
        listaproductos.add(new infodocAdm2(codigo, nombre2, cantidad, descripcion, precio));
        
    }
    
}
