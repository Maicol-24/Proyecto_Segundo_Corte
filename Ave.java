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

    public String getTipoVuelo() { return tipoVuelo; }
    public void setTipoVuelo(String tipoVuelo) { this.tipoVuelo = tipoVuelo; }
    public int getEnvergaduraCm() { return envergaduraCm; }
    public void setEnvergaduraCm(int envergaduraCm) { this.envergaduraCm = envergaduraCm; }
    public double getVelocidadVuelo() { return velocidadVuelo; }
    public void setVelocidadVuelo(double velocidadVuelo) { this.velocidadVuelo = velocidadVuelo; }
    public boolean isMigratoria() { return migratoria; }
    public void setMigratoria(boolean migratoria) { this.migratoria = migratoria; }

    @Override
    public String toString() {
        return "Ave [" + super.toString() + ", Tipo de vuelo: " + tipoVuelo
                + ", Envergadura: " + envergaduraCm + " cm, Velocidad de vuelo: "
                + velocidadVuelo + " km/h, Migratoria: " + migratoria + "]";
    }
}
