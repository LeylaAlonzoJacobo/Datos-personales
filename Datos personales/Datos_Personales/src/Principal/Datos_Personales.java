// atributos de los datos personales
package Principal;


public class Datos_Personales {
    private int DPI;
    private String nombre; 
    private String apellido;
    private String direccion; 
    private String telefono;
    private String edad;
    private String sexo;
    
    //crear un constructor vacio
    public Datos_Personales(){
    }
   //creacion de un contructor
    public Datos_Personales(int DPI, String nombre, String apellido, String direccion, String telefono, String edad, String sexo) {
        this.DPI = DPI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.sexo = sexo;
      
        // Set y Get

   
    }

    public int getDPI() {
        return DPI;
    }

    public void setDPI(int DPI) {
        this.DPI = DPI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

 
}
