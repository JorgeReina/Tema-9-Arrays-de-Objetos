package Ejercicio2;

public class Gatos {
  
  private String nombre;
  private int edad;
  private String sexo;
  private String color;
  private int sardinas;

  public Gatos(String n, int e, String s, String c, int sa) {
    this.nombre = n;
    this.edad = e;
    this.sexo = s;
    this.color = c;
    this.sardinas = sa;
  }

  public String getNombre( ) {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return this.edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getSexo() {
    return this.sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getSardinas() {
    return this.sardinas;
  }

  public void setSardinas(int sardinas) {
    this.sardinas = sardinas;
  }

  public void comer(int saDisponibles, int sardinasGato, int contadorSardinas) {

    //La variable "saDisponibles" son las sardinas que hay disponibles.
    int contador = saDisponibles;
    contador -= contadorSardinas;

    for (int i = 0; i < sardinasGato; i++) {
      if (contador > 0) {
        System.out.println("ÑamÑam");
      } else {
        System.out.println("No quedan sardinas.");
      }
    }

  }
}
