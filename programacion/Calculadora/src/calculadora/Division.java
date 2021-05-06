
package calculadora;

public class Division extends Operaciones{
    double division;
    
    public Division(double valor1, double valor2){
        super(valor1, valor2,'/');
        this.division= valor1/valor2;
        this.setReultado(this.division);       
    }
}

