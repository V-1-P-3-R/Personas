public class Persona1 {
    String nombre;
    String piel;
    int edad;
    double altura;

    // Constructor para inicializar una persona con altura, edad, nombre y piel
    public Persona1(String nombre, int edad, double altura, String piel) {
        this.altura = altura;
        this.edad = edad;
        this.nombre = nombre;
        this.piel = piel;
    }
    // Imprime los datos de la persona
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Piel: " + piel);

    }
    //Para verificar si es mayor de edad o no
    public boolean esMayorEdad() {
        return edad >= 18;
    }



    // Ejecucion principal 1.0
    public static void main(String[] args) {
        // Se crea el primer objeto "Persona1"
        Persona1 persona1 = new Persona1("Jose", 22, 1.74, "black");
        persona1.mostrarDetalles();  // Datos de la persona
        System.out.println("¿Es mayor de edad?: " + (persona1.esMayorEdad() ? "Sí" : "No"));
    }

























}
