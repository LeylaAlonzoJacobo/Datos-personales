//voy a generar la logica de lo que se necista
package calculadora;

public class Operaciones {
    //declaracion de variables
    private double valor1;
    private double valor2;
    private double resultado;
    private char operacion;

    //constructor que lleva a cabo la logica antes de presentar un resultado
    public Operaciones(double valor1, double valor2, char operacion) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.operacion = operacion;
    }

    public char getOperacion() {
        return operacion;
    }

    public void setOperacion(char operacion) {
        this.operacion = operacion;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getReultado() {
        return resultado;
    }

    public void setReultado(double reultado) {
        this.resultado = reultado;
    }
    //metodo para mostrar el resultado de la operacion
    public void mostrarOperacion(){
        System.out.println(this.valor1+" "+this.operacion+" "+this.valor2
                +" = "+this.resultado);
    }
  
}
