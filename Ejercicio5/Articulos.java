package Ejercicio5;

public class Articulos {
  
  private int codigo = 0;
  private String descripcion = "Vacio";
  private double precioCompra = 0;
  private double precioVenta = 0;
  private int stock = 0;

  public Articulos(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
    this.codigo = codigo;
    this.descripcion = descripcion;
    this.precioCompra = precioCompra;
    this.precioVenta = precioVenta;
    this.stock = stock;
  }

  public int getCodigo() {
    return this.codigo;
  }

  public void setCodigo(int codigo){
    this.codigo = codigo;
  }

  public String getDescripcio() {
    return this.descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecioCompra() {
    return this.precioCompra;
  }

  public void setPrecioCompra(double precioCompra) {
    this.precioCompra = precioCompra;
  }

  public double getPrecioVenta() {
    return this.precioVenta;
  }

  public void setPrecioVenta(double precioVenta) {
    this.precioVenta = precioVenta;
  }
  
  public int getStock() {
    return this.stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public void listado() {

    int cantidad = 1;

    for (int i = 0; i < cantidad; i++) {
      //Solo va a mostrar los articulos registrados(Todos aquellos que su codigo sea mayor a 0)
      if (this.codigo > 0) {
        System.out.printf("Codigo: %d   Descripcion: %s   P.Compra: %.2f    P.Venta: %.2f   Stock: %d\n", getCodigo(), getDescripcio(), getPrecioCompra(), getPrecioVenta(), getStock());
      }
    }
  }

}
