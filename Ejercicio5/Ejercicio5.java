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

    boolean salida = true;

    Articulos[] botellas = new Articulos[99];

    //Inicializamos el todas las botellas
    for (int i = 0; i < botellas.length; i++) {
      botellas[i] = new Articulos(0000, null, 0, 0, 0);
    }

    //Añadimos un articulo par que aparezca en el listado.
    botellas[0] = new Articulos(1111, "Coca-Cola", 1.99, 2.99, 10);

    System.out.println();

    while (salida != false) {

      System.out.println("*");
      System.out.println("** BIENVENIDO A GESTISIMAL **");
      System.out.println("*");
      System.out.println("* MENU");
      System.out.println("*");
      System.out.println("* 1. LISTADO");
      System.out.println("* 2. ALTA");
      System.out.println("* 3. BAJA");
      System.out.println("* 4. MODIFICACION");
      System.out.println("* 5. ENTRADA DE MERCANCIA");
      System.out.println("* 6. SALIDA DE MERCANCIA");
      System.out.println("* 7. SALIR");
      System.out.println("*");

      //Salto de linea
      System.out.println();
      System.out.print("Elige alguna operacion: ");
      int opcion = datos.nextInt();
      //Salto de linea
      System.out.println();

      switch (opcion) {
        case 1:
            System.out.println("Lista de Obejtos");
            System.out.println();
            for (int i = 0; i < botellas.length; i++) {
              botellas[i].listado();
            }
            
            System.out.println();
          break;
        case 2:
            System.out.println("Alta de Articulos");
            System.out.println();
  
            int botellaNueva;
            boolean ocupado = false;
  
            do {
              System.out.print("Introduce el Numero del Array en el que quieres crearlo: ");
              botellaNueva = datos.nextInt();
  
              System.out.println();
  
              if (botellas[botellaNueva].getCodigo() > 0) {
                System.out.println("Este array esta ocupado.");
                ocupado = true;
              } else {
                System.out.println("Este array esta libre y puede utilizarse.");
                ocupado = false;
              }
            } while (ocupado != false);
  
            System.out.println();
  
            System.out.printf("Introduce el Codigo del articulo: ");
            int codigoBotella = datos.nextInt();
            System.out.println();
  
            System.out.print("Introduce una descripcion(o Nombre) del Articulo: ");
            String descripcionBotella = datos.next();
            System.out.println();
  
            System.out.print("Introduce el precio de compra(formato: 0,00): ");
            double pCompra = datos.nextDouble();
            System.out.println();
  
            System.out.print("Introduce el precio de venta(formato: 0,00): ");
            double pVenta = datos.nextDouble();
            System.out.println();
  
            System.out.print("Introduce el Stok del articulo: ");
            int nStock = datos.nextInt();
            System.out.println();
  
            System.out.println("El articulo ha sido creado correctamente.");
  
            botellas[botellaNueva].setCodigo(codigoBotella);
            botellas[botellaNueva].setDescripcion(descripcionBotella);
            botellas[botellaNueva].setPrecioCompra(pCompra);
            botellas[botellaNueva].setPrecioVenta(pVenta);
            botellas[botellaNueva].setStock(nStock);
  
          break;
        case 3:
            System.out.print("Introduce el numero de array del Articulo que quieres dar de baja: ");
            int baja = datos.nextInt();

            botellas[baja].setCodigo(0);
            System.out.println();
          break;
        case 4:
            System.out.print("Introduce el numero de array del Articulo que quieres modificar: ");
            int modificar = datos.nextInt();

            System.out.println("* 1. CODIGO");
            System.out.println("* 2. DESCRIPCION");
            System.out.println("* 3. PRECIO COMPRA");
            System.out.println("* 4. PRECIO VENTA");
            System.out.println("* 5. STOCK");
            System.out.println();
            System.out.println("Elige que campo quieres modificar: ");
            int opcion2 = datos.nextInt();

            switch (opcion2) {
              case 1:
                  System.out.print("Introduce el Codigo Nuevo: ");
                  int modificarCodigo = datos.nextInt();
                  botellas[modificar].setCodigo(modificarCodigo);
                break;
              case 2:
                  System.out.print("Introduce la Descripcion Nueva: ");
                  String modificarDescripcion = datos.next();
                  botellas[modificar].setDescripcion(modificarDescripcion);
                break;
              case 3:
                  System.out.print("Introduce el Precio de Compra Nuevo: ");
                  double modificarCompra = datos.nextDouble();
                  botellas[modificar].setPrecioCompra(modificarCompra);
                break;
              case 4:
                  System.out.print("Introduce el Precio de Venta Nuevo: ");
                  double modificarVenta = datos.nextDouble();
                  botellas[modificar].setPrecioVenta(modificarVenta);
                break;
              case 5:
                  System.out.print("Introduce el Stock Nuevo: ");
                  int modificarStock = datos.nextInt();
                  botellas[modificar].setStock(modificarStock);
                break;
              default:
              System.out.println("Opcion incorecta.");
                break;
            }
            
          break;
        case 5:
            System.out.print("Seleccione el numero de array del articulo que entra: ");
            int entra = datos.nextInt();
            System.out.println();

            System.out.print("Que cantidad de stock entra: ");
            int cantidad = datos.nextInt();

            botellas[entra].setStock((cantidad + botellas[entra].getStock()));

            System.out.println();
            System.out.println("El stock se ha modificado correctamente.");
            System.out.println();

          break;
        case 6:
          System.out.print("Seleccione el numero de array del articulo que sale: ");
          int sale = datos.nextInt();
          System.out.println();

          System.out.println("El stock disponible de este articulo es de: " + botellas[sale].getStock());

          System.out.print("Que cantidad de stock sale: ");
          int cantidadSale = datos.nextInt();

          if (cantidadSale > botellas[sale].getStock()) {
            System.out.println("No hay sufiente Stock.");
          } else {

            botellas[sale].setStock((botellas[sale].getStock() - cantidadSale));

            System.out.println();
            System.out.println("El stock se ha modificado correctamente.");
            System.out.println();
          }

          break;
        case 7:
            salida = false;
          break;
      
        default:
          break;
      }
    }
    
  }
}
