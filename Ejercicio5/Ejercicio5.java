package Ejercicio5;

import java.util.Scanner;

/**
 * Ejercicio 5 Arrays de objetos, Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) 
 * para llevar el control de los artículos de un almacén. De cada artículo se debe saber el código,
 *  la descripción, el precio de compra, el precio de venta y el stock (número de unidades).
 * 
 * Nombre del fichero: Ejercicio5.java
 * 
 * @author Jorge Reina Romero
 */

public class Ejercicio5 {
  public static void main(String[] args) {

    Scanner datos = new Scanner(System.in);

    Articulos[] botellas = new Articulos[99];

    for (int i = 0; i < botellas.length; i++) {
      botellas[i] = new Articulos(0000, null,0 ,0 ,0);
    }

    //TO DO - Borar esta linea
    //Pruba del metodo listado
    botellas[0] = new Articulos(1111, "Coca-Cola", 1.99, 2.99, 10);

    System.out.println("*");
    System.out.println("** BIENVENIDO A GESTISIMAL **");
    System.out.println("*");
    System.out.println("* MENU");
    System.out.println("*");
    System.out.println("* 1. LISTADO");
    System.out.println("* 2. ALTA");
    System.out.println("* 3. BAJA");
    System.out.println("* 4. MODIFICACIÓN");
    System.out.println("* 5. ENTRADA DE MERCANCIA");
    System.out.println("* 6. SALIDA DE MERCANCIA");
    System.out.println("* 7. SALIR");
    System.out.println("*");
    System.out.println();
    System.out.print("Elige alguna operación: ");
    int opcion = datos.nextInt();

    System.out.println();

    switch (opcion) {
      case 1:
          System.out.println("Lista de Obejtos");
          System.out.println();
          for (int i = 0; i < botellas.length; i++) {
            botellas[i].listado();
          }
        break;
    
      default:
        break;
    }
    
  }
}
