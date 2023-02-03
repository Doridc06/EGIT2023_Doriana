
public class Persona {

  public static void main(String[] args) {
    Persona p1 = new Persona("pepe", "Ruiz", 24);
    p1.cumpleaños();
    System.out.println(p1);
  }
  
  private String nombre;
  private String apellidos;
  private int edad;
  
  
  public Persona(String nombre, String apellidos, int edad) {
    super();
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = edad;
  }
  
  
  public int cumpleaños() {
    return edad + 1;
  }


  @Override
  public String toString() {
    return "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad ;
  }
  
}