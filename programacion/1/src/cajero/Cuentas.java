
package cajero;


public class Cuentas {
    private double Nocuenta;
    private double Cantidad;
    private double copcion;
    private String Nombrecuenta;
    private String Tcuenta;
    private double opcion;
    

    public Cuentas(double Nocuenta, double Cantidad, double copcion, String Tcuenta, String Nombrecuenta) {
        this.Nocuenta = Nocuenta;
        this.Cantidad = Cantidad;
        this.copcion = copcion;
        this.Tcuenta = Tcuenta;
        this.Nombrecuenta = Nombrecuenta;
    }

    public double getNocuenta() {
        return Nocuenta;
    }

    public void setNocuenta(double Nocuenta) {
        this.Nocuenta = Nocuenta;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getCopcion() {
        return copcion;
    }

    public void setCopcion(double copcion) {
        this.copcion = copcion;
    }

    public String getNombrecuenta() {
        return Nombrecuenta;
    }

    public void setNombrecuenta(String Nombrecuenta) {
        this.Nombrecuenta = Nombrecuenta;
    }

    public String getTcuenta() {
        return Tcuenta;
    }

    public void setTcuenta(String Tcuenta) {
        this.Tcuenta = Tcuenta;
    }
    public double getOpcion() {
        return opcion;
    }

    public void setOpcion(double opcion) {
        this.opcion = opcion;
    }
    
     public void MostrarCuenta(){
         
        System.out.println("El numero de cuenta ingresado "+this.Nocuenta);
        System.out.println("El tipo de cuenta es "+this.Tcuenta);
        System.out.println("El saldo de la cuenta es "+this.Cantidad);
        System.out.println("A nombre de "+this.Nombrecuenta);
        }
        
   

    
    
}
