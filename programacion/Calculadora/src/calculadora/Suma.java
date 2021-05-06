
package calculadora;

public class Suma extends Operaciones{
    double suma;
    
    public Suma(double valor1, double valor2){
        super(valor1, valor2,'+');
        this.suma= valor1+valor2;
        this.setReultado(this.suma);       
    }
}
