//crear, modificar, Eliminar
package Principal;

import java.util.ArrayList;


public class PrecesoDatos {
    
    private ArrayList<Object> a = new ArrayList<Object>();
    //contructor vacio
    public PrecesoDatos(){       
}
    public PrecesoDatos(ArrayList<Object> a){
    this.a = a;
}   
    //crear un nuevo registro en un archivo plano
   public void crearRegistro(Datos_Personales p) {
       this.a.add(p);
}
   //modificar Registro
   public void modificarRegistro (int i, Datos_Personales p) {
       this.a.set(i,p);
   }
   //eliminar Registros
   public void eliminarRegistro(int i){
       this.a.remove(i); 
}
   // Recorrido y obtener los Datos Pesonales
   public Datos_Personales obtenerRegistro(int i){
   return (Datos_Personales)a.get(i);
}
   //crear una clase que detemine la cantidad de registros encontrados 
   public int cantidadRegistros(){
       return this.a.size();
}
   //Crear un Buscador
   public int buscarDPI(int DPI){
   for(int i=0; i<cantidadRegistros();i++){
       if (DPI == obtenerRegistro(i).getDPI())return i;
   }
   return -1;
   

   }
    }
   