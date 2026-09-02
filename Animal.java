public class Animal {
    private String nombre;
    private int edad;
    private double peso;
    private boolean esMamifero;

    // Constructor 1: Recibe todos los atributos
    public Animal(String nombre, int edad, double peso, boolean esMamifero) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.esMamifero = esMamifero;
    }

    // Constructor 2: Usa this() para reutilizar lógica
    public Animal(String nombre, int edad) {
        this(nombre, edad, 1.0, true);
    }

    // Constructor 3: Recibe nombre y peso
    public Animal(String nombre, double peso) {
        this.nombre = nombre;
        this.edad = 2;
        this.peso = peso;
        this.esMamifero = true;
    }

    public Animal(String nombre, int edad, boolean esMamifero) {
        this(nombre, edad, 1.0, esMamifero);
    }

    public Animal(String nombre, double peso, boolean esMamifero) {
        this(nombre, 2, peso, esMamifero);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    public boolean isEsMamifero() { return esMamifero; }
    public void setEsMamifero(boolean esMamifero) { this.esMamifero = esMamifero; }

    @Override
    public String toString() {
        return "Animal [Nombre: " + nombre + ", Edad: " + edad + " años, Peso: " + peso + " kg, Es Mamífero: " + esMamifero + "]";
    }
}