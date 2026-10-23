public class Persona {
   private String nombre;
   private char sexo;
   /* constructor sin parametros */
   public Persona() {
   }
   /* constructor con parametros */
   public Persona(String nombre, char sexo) {
    this.nombre = nombre;
    this.sexo = sexo;
   }
   /* getters y setters */
   public String getNombre() {
    return nombre;
   }
   public void setNombre(String nombre) {
    this.nombre = nombre;
   }
   public char getSexo() {
    return sexo;
   }
   public void setSexo(char sexo) {
    this.sexo = sexo;
   }
   @Override
   public String toString() {
    return "Nombre: " + getNombre() + ", Sexo: " + getSexo();
   }
   
}
