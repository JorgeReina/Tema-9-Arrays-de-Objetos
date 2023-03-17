package ArraysDeObjetos.Ejercicio1;



public class Gatos {
  
  private String nombre;
  private int edad;
  private String sexo;
  private String color;

  public Gatos(String n, int e, String s, String c) {
    this.nombre = n;
    this.edad = e;
    this.sexo = s;
    this.color = c;
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

  public void comer(int sardinas) {

    int contador = 0;

    for (int i = 0; i < sardinas+1; i++) {
      if (sardinas > contador) {
        contador += 1;
        System.out.println("ÑamÑam");
      } else {
        System.out.println("No quedan Sardinas");
      }
    }

    //System.out.println("ÑamÑam");
  }
}
