public class Persona {
    String nombre;
    String piel;
    int edad;
    double altura;

    // Constructor para inicializar una persona con altura, edad, nombre y piel
    public Persona(String nombre, int edad, double altura, String piel) {
        this.altura = altura;
        this.edad = edad;
        this.nombre = nombre;
        this.piel = piel;
    }

    // Imprime los datos de la persona
    public void impresionDeDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Piel: " + piel);


    }

    //Para verificar si es mayor de edad o no
    public boolean muestraDeEdad() {

        return edad >= 18;
    }

    // Metodo para saber si puedes jubilarte o no y cuantos años te faltan
    public void anosParaJubilacion() {
        int edadJubilacion = 65;
        if (edad >= edadJubilacion) {
            System.out.println(nombre + " ya está en edad de jubilarse o puede jubilarse.");
        } else {
            System.out.println(nombre + " puede jubilarse en " + (edadJubilacion - edad) + " años.");
        }
    }


    // Ejecucion principal 1.0
    public static void main(String[] args) {
        // Se crea el primer objeto "Persona1"
        Persona persona1 = new Persona("Jose", 22, 1.74, "black");
        persona1.impresionDeDetalles();  // Datos de la persona
        System.out.println("¿Es mayor de edad?: " + (persona1.muestraDeEdad() ? "Sí" : "No"));
        persona1.anosParaJubilacion();

        // Ejecucion principal 2.0
        Persona Persona2 = new Persona("Ana", 87, 1.64, "black");
        Persona2.impresionDeDetalles();
        System.out.println("¿Es mayor de edad?: " + (persona1.muestraDeEdad() ? "Sí" : "No"));
        Persona2.anosParaJubilacion();
    }

}
