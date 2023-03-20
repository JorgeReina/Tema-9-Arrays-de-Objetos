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

    for (int i = 0; i < 4; i++) {

      System.out.print("Introduce el nombre: ");
      String introduceNombre = datos.nextLine();

      System.out.print("Introduce el sexo: ");
      String sexo = datos.nextLine();

      System.out.print("Introduce el color: ");
      String color = datos.nextLine();

      System.out.print("Introduce cuantas sardinas va a comer: ");
      int comida = datos.nextInt();

      int edad = (int)(Math.random()*10+1);

      cat[i] = new Gatos(introduceNombre, edad, sexo, color, comida);

    }

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

    System.out.println("Introduce cuantas sardinas hay disponibles: ");
    int sardinas = datos.nextInt();

    int contadorSardinas = 0;

    
    for (int i = 0; i < cat.length; i++) {
      cat[i].comer(sardinas, cat[i].getSardinas(), contadorSardinas);
      contadorSardinas += cat[i].getSardinas();
    }
    

  }
}
