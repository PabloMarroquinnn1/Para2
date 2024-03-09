
package main;

public class infodocAdm {
    private String nombre;
    private String codigo;
    private String especialidad;
    private String contraseña;
    private String genero;
    private String telefono;
    private String edad;
    

    public infodocAdm(String nombre, String apellido, String especialidad, String contraseña, String genero, String telefono, String edad) {
        this.nombre = nombre;
        this.codigo = apellido;
        this.especialidad = especialidad;
        this.contraseña = contraseña;
        this.genero = genero;
        this.telefono = telefono;
        this.edad = edad;
    }
   

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return codigo;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return genero;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.genero = genero;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    
}
