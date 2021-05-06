
package calculadora;

public class Resta extends Operaciones{
    double resta;
    
    public Resta(double valor1, double valor2){
        super(valor1, valor2,'-');
        this.resta= valor1-valor2;
        this.setReultado(this.resta);       
    }
}
