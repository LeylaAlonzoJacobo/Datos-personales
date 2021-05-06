
package calculadora;

public class Multiplicacion extends Operaciones{
    double multiplicacion;
    
    public Multiplicacion(double valor1, double valor2){
        super(valor1, valor2,'*');
        this.multiplicacion= valor1*valor2;
        this.setReultado(this.multiplicacion);       
    }
}

    

