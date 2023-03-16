package ArraysDeObjetos.Ejercicio1;



import java.util.Scanner;

/**
 * Ejercicio 1 Arrays de objetos, Utiliza la clase Gato para crear un array 
 * de cuatro gatos e introduce los datos de cada uno de ellos mediante un bucle. 
 * Muestra a continuación los datos de todos los gatos utilizando también un bucle.
 * 
 * Nombre del fichero: Ejercicio1.java
 * 
 * @author Jorge Reina Romero
 */

public class Ejercicio1 {
  public static void main(String[] args) {

    Scanner datos = new Scanner(System.in);
    
    Gatos[] cat = new Gatos[4];

    System.out.println("Introduce la información de los gatos.");

    for (int i = 0; i < 3; i++) {

      cat[i] = new Gatos();
      System.out.println("Gato" + i);

      System.out.println("Nombre: ");
      String introduceNombre = datos.nextLine();
      (cat[i]).setNombre(introduceNombre);

    }

  }
}
