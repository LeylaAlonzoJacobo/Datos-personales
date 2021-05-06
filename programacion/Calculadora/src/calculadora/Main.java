
package calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
   double valor1=0, valor2=0;
     int opcion=0;
     
      do {
          System.out.println("\n");
          System.out.println("CALCULADORA DE PÈRACIONES");
          System.out.println("1. Suma");
          System.out.println("2. Resta");
          System.out.println("3. Multiplicacion");
          System.out.println("4. Division");
          System.out.println("5. Salir");
          System.out.println("Seleccione una opcion: ");
          opcion=sc.nextInt();
          if(opcion !=5){
                   
                System.out.println("Ingrese el primer valor: \n");
                valor1= sc.nextDouble();
                System.out.println("Ingrese el segundo salor: \n");
                 
                valor2= sc.nextDouble();
                System.out.println("\n");
                   if(valor1>valor2){
                System.out.println("El mayor ="+valor1+" el menor ="+valor2);          
          } else{
                   System.out.println("El mayor ="+valor2+" el menor ="+valor1);
                  }
                 
                  }
                       
                  
          switch(opcion){
              
              case 1:
              
                  Suma sum= new Suma(valor1, valor2);
                  System.out.println("El Resultado de la Suma es: ");
                  sum.mostrarOperacion();
                  break;
              case 2:
                
                  Resta res= new Resta(valor1, valor2);
                  System.out.println("El Resultado de la resta es: ");
                  res.mostrarOperacion();
                  break;
              case 3:
                 
                  Multiplicacion mult= new Multiplicacion(valor1, valor2);
                  System.out.println("El Resultado de la multiplicacion es: ");
                  mult.mostrarOperacion();
                  break;
              case 4: 
                
                  Division div= new Division(valor1, valor2);
                  System.out.println("El Resultado de la Divicion es: ");
                  div.mostrarOperacion();
                  break;
                  
                  
                          
          }
      
               
      } while(opcion !=5);
        System.out.println("Ah elegido salir de la calculadora");
        
      }
      }
    
   
          
        
 
    

