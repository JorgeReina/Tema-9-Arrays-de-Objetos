package Ejercicio2;

import java.util.Scanner;

/**
 * Ejercicio 2 Arrays de objetos, Cambia el programa anterior de tal forma que los datos de los gatos
 * se introduzcan directamente en el código de la forma gatito[2].setColor("marrón") 
 * o bien mediante el constructor, de la forma gatito[3] = new Gato("Garfield", "naranja", "macho").
 * Muestra a continuación los datos de todos los gatos utilizando un bucle.
 * 
 * Nombre del fichero: Ejercicio2.java
 * 
 * @author Jorge Reina Romero
 */

public class Ejercicio2 {
  public static void main(String[] args) {

    Scanner datos = new Scanner(System.in);
    
    Gatos[] cat = new Gatos[4];

    System.out.println("Introduce la información de los gatos.");

    cat[0] = new Gatos("Jorge", 5, "M", "Blanco moteado", 5);
    cat[1] = new Gatos("Leonardo", 7, "M", "Gris", 3);
    cat[2] = new Gatos("Blanqui", 5, "H", "Blanco", 2);
    cat[3] = new Gatos(null, 0, null, null, 0);

    cat[3].setNombre("Martina");
    cat[3].setEdad(6);
    cat[3].setSexo("H");
    cat[3].setColor("Marron");
    cat[3].setSardinas(5);

    System.out.println();

    for (int a = 0; a < 4; a++) {
      
      System.out.println("Gato: " + a);
      System.out.println("Nombre: " + cat[a].getNombre());
      System.out.println("Edad: " + cat[a].getEdad());
      System.out.println("Sexo: " + cat[a].getSexo());
      System.out.println("Color: " + cat[a].getColor());
      System.out.println("Sardinas que va a comer: " + cat[a].getSardinas());

      System.out.println();

    }

    System.out.print("Introduce cuantas sardinas hay disponibles: ");
    int sardinas = datos.nextInt();

    int contadorSardinas = 0;

    
    for (int i = 0; i < cat.length; i++) {
      cat[i].comer(sardinas, cat[i].getSardinas(), contadorSardinas);
      contadorSardinas += cat[i].getSardinas();
    }
    

  }
}
