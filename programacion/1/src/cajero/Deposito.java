
package cajero;


public class Deposito extends Cuentas{
    double deposito;
    double Nocuenta;
    String Tcuenta;
    String Nombrecuenta;
    
    public Deposito(double Cantidad, double copcion, double Nocuenta, String Tcuenta, String Nombrecuenta){
        super(Cantidad, copcion, Nocuenta, Tcuenta, Nombrecuenta);
        this.deposito=Cantidad+copcion;
        this.Nocuenta=Nocuenta;
        this.Tcuenta=Tcuenta;
        this.Nombrecuenta=Nombrecuenta;
        this.setCantidad(this.deposito);
        this.setNocuenta(this.Nocuenta);
        this.setTcuenta(this.Tcuenta);
        this.setNombrecuenta(this.Nombrecuenta);
    }
    
}
