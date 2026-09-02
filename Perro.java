public class Perro extends Animal {
    private String raza;
    private int nivelEnergia;
    private boolean entrenado;
    private char tamanio;

    public Perro(String nombre, int edad, double peso, boolean esMamifero,
            String raza, int nivelEnergia, boolean entrenado, char tamanio) {
        super(nombre, edad, peso, esMamifero);
        this.raza = raza;
        this.nivelEnergia = nivelEnergia;
        this.entrenado = entrenado;
        this.tamanio = tamanio;
    }

    public Perro(String nombre, int edad, String raza, char tamanio) {
        super(nombre, edad);
        this.raza = raza;
        this.nivelEnergia = 5;
        this.entrenado = false;
        this.tamanio = tamanio;
    }

    public Perro(String nombre, double peso, String raza, boolean entrenado) {
        super(nombre, peso);
        this.raza = raza;
        this.nivelEnergia = 5;
        this.entrenado = entrenado;
        this.tamanio = 'M';
    }

    @Override
    public String toString() {
        return "Perro [" + super.toString() + ", Raza: " + raza
                + ", Nivel de energia: " + nivelEnergia + ", Entrenado: "
                + entrenado + ", Tamano: " + tamanio + "]";
    }
}