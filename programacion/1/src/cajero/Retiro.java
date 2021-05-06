
package cajero;


public class Retiro extends Cuentas{
    double retiro;
    double Nocuenta;
    String Tcuenta;
    String Nombrecuenta;
    
    public Retiro(double Cantidad, double copcion, double Nocuenta, String Tcuenta, String Nombrecuenta){
        super(Cantidad, copcion, Nocuenta, Tcuenta, Nombrecuenta);
        this.retiro=Cantidad-copcion;
        this.Nocuenta=Nocuenta;
        this.Tcuenta=Tcuenta;
        this.Nombrecuenta=Nombrecuenta;
        this.setCantidad(this.retiro);
        this.setNocuenta(this.Nocuenta);
        this.setTcuenta(this.Tcuenta);
        this.setNombrecuenta(this.Nombrecuenta);
    }
            
}





