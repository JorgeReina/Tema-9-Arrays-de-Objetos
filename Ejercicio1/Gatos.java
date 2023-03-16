package ArraysDeObjetos.Ejercicio1;



public class Gatos {
  
  private String nombre;
  private int edad;
  private String sexo;
  private String color;

  public String getNombre(String nombre) {
    this.nombre = nombre;
    return nombre;
  }

  public void setNombre(String introduceNombre) {
    this.nombre = nombre;
  }

  public int getEdad(int edad) {
    this.edad = edad;
    return edad;
  }

  public void setEdad() {
    this.edad = edad;
  }

  public String getSexo(String sexo) {
    this.sexo = sexo;
    return sexo;
  }

  public void setSexo() {
    this.sexo = sexo;
  }

  public String getColor(String color) {
    this.color = color;
    return color;
  }

  public void setColor() {
    this.color = color;
  }

  public void comer() {
    System.out.println("ÑamÑam");
  }
}
