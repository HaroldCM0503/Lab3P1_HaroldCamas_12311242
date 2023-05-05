/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_haroldcamas_12311242;
import java.util.Scanner;
/**
 *
 * @author harol
 */
public class Lab3P1_HaroldCamas_12311242 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        boolean seguir = true;
        while (seguir){
          System.out.println(" ");
          System.out.println("==Menu Lab 3==");
          System.out.println("1.) Serie Euclidiana");
          System.out.println("2.) Pokeball");
          System.out.println("3.) Generacion");
          System.out.println("4.) Salir");
          int ejercicio = 0;
          ejercicio = leer.nextInt();
          
          switch(ejercicio){
              
              case 1:
                  System.out.println("Ingrese el numero de puntos: ");
                  int limite = 0;
                  limite = leer.nextInt();
                  while (limite <=0){
                      System.out.println("Elija un numero valido");
                      limite = leer.nextInt();
                  }
                  
                  double x = 0;
                  double y = 0;
                  double acumulador = 0;
                  
                  for (int i = 1; i <= limite; i++){
                      System.out.println("Ingrese el x numero "+i+":");
                      x = leer.nextInt();
                      System.out.println("Ingrese el y numero "+i+":");
                      y = leer.nextInt();
                      acumulador += Math.pow(x-y,2);
                  }
                  acumulador = Math.sqrt(acumulador);
                  System.out.println("La distancia euclidiana es: "+acumulador);
                  break;
              
              case 2:
                  System.out.println("Ingrese el tamaño de la pokebola: ");
                  int alto = 0;
                  alto = leer.nextInt();
                  while (alto <=0){
                      System.out.println("Elija un numero valido");
                      alto = leer.nextInt();
                  }
                  int base = alto*2 - 1;
                  int mitad = alto/2;
                  
                  for (int i = 1; i <= alto; i++){
                      for (int j = 1; j <= base; j++){
                          //Imprimir los #
                          //Imprimir los # de la mitad arriba y abajo.
                          if ((mitad == i || i == mitad+2) && (j > base/3 && j <= 2*(base/3)+1)){
                              System.out.print("#");
                          }
                          //Imprimir los # del mero centro.
                          if (i == mitad+1 && (((j <= base/3) && j > 1) || ((j > 2*(base/3)+1) && j < base))){
                              System.out.print("#");
                          }
                          
                          //Imprimir los espacios.
                          //Espacios de la mera mitad.
                          if (i == mitad+1 && (j > base/3 && j < 2*(base/3)+2)){
                              System.out.print(" ");
                          }
                          //Espacios de la mitad arriba y abajo.
                          if ((i == mitad+2) && (((j <= base/3) && j > 1) || j > 2*(base/3)+2)){
                              System.out.print(" ");
                          }
                          //Resto de espacios.
                          if ((i > mitad+2 && i < alto) && (j > 1 && j < base )){
                              System.out.print(" ");
                          }
                          
                          //Imprimir los ***.
                          //Imprimir los *** de arriba, todo relleno.
                          if (i <= mitad-1){
                              System.out.print("*");
                          }
                          //Imprimir los *** del centro pegados a los ###.
                          if ((i == mitad) && (((j <= base/3) && j > 1) || j > 2*(base/3)+2)){
                              System.out.print("*");
                          }
                          //Imprimir los *** de los lados.
                          if ((i >= mitad && i < alto) && (j == 1 || j == base)){
                              System.out.print("*");
                          }
                          //Imprimir los *** de la base.
                          if (i == alto){
                              System.out.print("*");
                          }
                      }
                      System.out.println("");
                  }
                  break;

                  
              case 3:
                  System.out.println("Ingrese su año de nacimiento");
                  int fecha = 0;
                  fecha = leer.nextInt();
                  while (fecha <= 0 || fecha < 1946 || fecha > 2025){
                      System.out.println("Ingrese una fecha valida, no menor que 1946 y no mayor que 2025");
                      fecha = leer.nextInt();    
                  }
                  if (fecha < 1960){
                      System.out.println("Felicidades, su generacion es: Baby Boomer Gen");
                  }
                  else if (fecha < 1975 && fecha > 1960){
                      System.out.println("Felicidades, su generacion es: Generation X ");
                  }
                  else if (fecha < 1980 && fecha > 1975){
                      System.out.println("Felicidades, su generacion es: Xennials ");
                  }
                  else if (fecha < 1990 && fecha > 1980){
                      System.out.println("Felicidades, su generacion es: Millenials ");
                  }
                  else if (fecha < 2013 && fecha > 1990){
                      System.out.println("Felicidades, su generacion es: Gen Z");
                  }
                  else if (fecha < 2025 && fecha > 2013){
                      System.out.println("Felicidades, su generacion es: Gen Alpha ");
                  }
                  break;
                  
              case 4:
                  seguir = false;
                  break;
                  
              default:
                  System.out.println("Ingrese una opcion valida.");
                  break;
              
          }
        }
        
    }
    
}
