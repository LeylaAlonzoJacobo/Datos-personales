
package cajero;


public class Saldos extends Cuentas {
    double Nocuenta;
    double Cantidad;
    String Tcuenta;
    String Nombrecuenta;
    
    public Saldos(double Cantidad, double copcion, double Nocuenta, String Tcuenta, String Nombrecuenta){
        super(Cantidad, copcion, Nocuenta, Tcuenta, Nombrecuenta);
        this.Cantidad=Cantidad;
        this.Nocuenta=Nocuenta;
        this.Tcuenta=Tcuenta;
        this.Nombrecuenta=Nombrecuenta;
        this.setCantidad(this.Cantidad);
        this.setNocuenta(this.Nocuenta);
        this.setTcuenta(this.Tcuenta);
        this.setNombrecuenta(this.Nombrecuenta);
        
        
    }
    
}
