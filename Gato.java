public class Gato extends Animal {
    private String colorPelaje;
    private int vidasRestantes;
    private double longitudBigotes;
    private boolean usaArenero;

    public Gato(String nombre, int edad, double peso, boolean esMamifero,
            String colorPelaje, int vidasRestantes, double longitudBigotes,
            boolean usaArenero) {
        super(nombre, edad, peso, esMamifero);
        this.colorPelaje = colorPelaje;
        this.vidasRestantes = vidasRestantes;
        this.longitudBigotes = longitudBigotes;
        this.usaArenero = usaArenero;
    }

    public Gato(String nombre, int edad, String colorPelaje, boolean usaArenero) {
        super(nombre, edad);
        this.colorPelaje = colorPelaje;
        this.vidasRestantes = 9;
        this.longitudBigotes = 8.0;
        this.usaArenero = usaArenero;
    }

    public Gato(String nombre, double peso, String colorPelaje, int vidasRestantes) {
        super(nombre, peso);
        this.colorPelaje = colorPelaje;
        this.vidasRestantes = vidasRestantes;
        this.longitudBigotes = 8.0;
        this.usaArenero = true;
    }

    @Override
    public String toString() {
        return "Gato [" + super.toString() + ", Color de pelaje: " + colorPelaje
                + ", Vidas restantes: " + vidasRestantes + ", Longitud de bigotes: "
                + longitudBigotes + " cm, Usa arenero: " + usaArenero + "]";
    }
}