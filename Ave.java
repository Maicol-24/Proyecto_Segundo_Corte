public class Ave extends Animal {
    private String tipoVuelo;
    private int envergaduraCm;
    private double velocidadVuelo;
    private boolean migratoria;

    public Ave(String nombre, int edad, double peso, boolean esMamifero,
            String tipoVuelo, int envergaduraCm, double velocidadVuelo,
            boolean migratoria) {
        super(nombre, edad, peso, esMamifero);
        this.tipoVuelo = tipoVuelo;
        this.envergaduraCm = envergaduraCm;
        this.velocidadVuelo = velocidadVuelo;
        this.migratoria = migratoria;
    }

    public Ave(String nombre, int edad, String tipoVuelo, boolean migratoria) {
        super(nombre, edad, false);
        this.tipoVuelo = tipoVuelo;
        this.envergaduraCm = 30;
        this.velocidadVuelo = 25.0;
        this.migratoria = migratoria;
    }

    public Ave(String nombre, double peso, String tipoVuelo, int envergaduraCm) {
        super(nombre, peso, false);
        this.tipoVuelo = tipoVuelo;
        this.envergaduraCm = envergaduraCm;
        this.velocidadVuelo = 25.0;
        this.migratoria = false;
    }

    @Override
    public String toString() {
        return "Ave [" + super.toString() + ", Tipo de vuelo: " + tipoVuelo
                + ", Envergadura: " + envergaduraCm + " cm, Velocidad de vuelo: "
                + velocidadVuelo + " km/h, Migratoria: " + migratoria + "]";
    }
}