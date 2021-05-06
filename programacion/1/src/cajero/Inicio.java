
package cajero;

import java.util.Scanner;

public class Inicio {

   
    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in);
    Scanner teclado= new Scanner(System.in);
    double Nocuenta,copcionr, suma=0, copciond, opcions=0, cintentor=0, cintentoc=0;
    String user1, contra1,seguir;
    int operacion;
    double NocuentaP=123;
    String TcuentaP="Monetaria";
    double CantidadP=5000;
    String NombrecuentaP = "Alice Vega";
    String user="avega";
    String contra="159";
    double NocuentaP2=456;
    String TcuentaP2="Ahorro";
    double CantidadP2=3000;
    String NombrecuentaP2 = "Carlos Ruiz";
        do {
       System.out.println("Bienvenido al Cajero \n");
       System.out.println("Seleccione la opcion de la gestión que desea realizar \n");
       System.out.println("1. Retiro \n");
       System.out.println("2: Deposito \n");
       System.out.println("3: Consulta de cuentas \n");
       System.out.println("4: Salir \n");
       operacion=sc.nextInt();
  
       switch(operacion)
       {
       case 1:
        System.out.println("Por favor ingrese el numero de cuenta a realizar el retiro");
        Nocuenta=sc.nextDouble();
        if(Nocuenta==NocuentaP){
            System.out.println("Por favor ingrese su usuario");
            user1=sc.next();
            System.out.println("Por favor su contraseña");
            contra1=sc.next();
                if(user1.equals(user) && contra1.equals(contra)){
                if(cintentor<3){
                    System.out.println("Ingrese la cantidad a retirar \n");
                    copcionr=sc.nextInt();
           if(copcionr>3500 || suma>=3500){
             System.out.println("No puede retirar mas de 3500 al día \n");  
           } else {
           Retiro ret= new Retiro(CantidadP,copcionr,NocuentaP,TcuentaP,NombrecuentaP);
       System.out.println("Los detalles de su retiro son: ");
       ret.MostrarCuenta();
       CantidadP=CantidadP-copcionr;
       suma=suma+copcionr;
       
          System.out.println("Presione cualquier tecla para continuar...");
          seguir = teclado.nextLine();  
       
       } } else{
                  System.out.println("Cantidad de intentos de acceso superados (3) usuario bloqueado: "); 
               }
           } else {
               cintentor=cintentor+1;
               System.out.println("Usuario y/o contraseña incorrectos, valide de nuevo "+cintentor+" intento fallido \n");
               
           }
       } 
       if(Nocuenta==NocuentaP2){
          System.out.println("Esta cuenta es de ahorro, solo permite depositos \n");
          System.out.println("Favor de comunicarse con su banco para tramitar el retiro de esta cuenta de ahorro \n");
       }
       continue;
       case 2:
      System.out.println("Por favor ingrese el numero de cuenta a realizar el deposito");
       Nocuenta=sc.nextDouble();
       if(Nocuenta==NocuentaP){
           System.out.println("Ingrese la cantidad a depositar \n");
           copciond=sc.nextInt();
           if(copciond>5000|| copciond<50){
           System.out.println("Solo puede depositar entre rango de Q.50.00 a Q.5000.00 \n");
       } else {
           Deposito dep= new Deposito(CantidadP,copciond,NocuentaP,TcuentaP,NombrecuentaP);
           System.out.println("Los detalles de su deposito son: ");
           dep.MostrarCuenta();
           CantidadP=CantidadP+copciond;
           }
           }
       if(Nocuenta==NocuentaP2){
           System.out.println("Ingrese la cantidad a depositar \n");
           copciond=sc.nextInt();
           if(copciond>5000|| copciond<50){
           System.out.println("Solo puede depositar entre rango de Q.50.00 a Q.5000.00 \n");
       } else {
           Deposito dep= new Deposito(CantidadP2,copciond,NocuentaP2,TcuentaP2,NombrecuentaP2);
           System.out.println("Los detalles de su deposito son: ");
           dep.MostrarCuenta();
           CantidadP2=CantidadP2+copciond;
           }
       }
       continue;
       case 3:
           System.out.println("Por favor ingrese el numero de cuenta a realizar el consulta");
           Nocuenta=sc.nextDouble();
           if(Nocuenta==NocuentaP){
                System.out.println("Por favor ingrese su usuario");
                user1=sc.next();
                System.out.println("Por favor su contraseña");
                contra1=sc.next();
                if(user1.equals(user) && contra1.equals(contra)){
           Saldos sal= new Saldos(CantidadP,opcions,NocuentaP,TcuentaP,NombrecuentaP);
           System.out.println("Los detalles de su cuenta son: ");
           sal.MostrarCuenta();}
                else{
               System.out.println("Usuario y/o contraseña incorrectos, valide de nuevo "+cintentor+" intento fallido \n");
           }
           } 
           if(Nocuenta==NocuentaP2){
            Saldos sal= new Saldos(CantidadP2,opcions,NocuentaP2,TcuentaP2,NombrecuentaP2);
           System.out.println("Los detalles de su cuenta son: ");
           sal.MostrarCuenta();
       }
           continue;
           
       case 4:
           break;
           }
       } while(operacion<4);
    } 
}
