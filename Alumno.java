public class Alumno extends Persona{
    private int matricula;
    /* constructor sin parametros */
    public Alumno() {
        super();
        this.matricula = 0;
    }
    /* constructor con parametros */
    public Alumno(String nombre, char sexo, int matricula) {
        super(nombre, sexo);
        this.matricula = matricula;
    }
    /* getters y setters */
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    @Override
    public void setNombre(String nombre){
        nombre = "Bachiller " + nombre;
        /* hacer que aparezca el uevo nombre con sobreescritura de metodos y que salga el bachiller: */
    }
    @Override
    public String toString() {
        return " Nombre: " + getNombre() + ", Matricula: " + getMatricula() + ", Sexo: " + getSexo();
    }
    
}
