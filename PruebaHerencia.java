public class PruebaHerencia {
    public static void main(String[] args) {
        Persona p1 = new Persona("Sofia", 'F');
        Alumno a1 = new Alumno("Sofia", 'F', 1009);
        a1.setNombre("Julio");
        
        System.out.println(p1);
        System.out.println(a1);
    }
}
