
public class Persona {

  public static void main(String[] args) {
    Persona p1 = new Persona("pepe", "Ruiz", 24);
    Persona p2 = new Persona("kate", "Longl", 20);
    p1.cumpleaños();
    p1.datosPersona("Kate", "Longl", 20);
    System.out.println(p1);
    System.out.println(p2);
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

  
  public String datosPersona(String nombre, String apellidos, int edad) {
    return nombre + apellidos + edad;
    
    
  }

  @Override
  public String toString() {
    return "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad ;
  }
  
}