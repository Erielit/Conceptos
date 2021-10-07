package conceptos.transportes;

public class Terrestre extends Transporte {

    private double velocidadKm;
    private int capacidadPersonas;
    private Rendimiento rendimiento;
    private CombustiblePromedio combustible;

    @Override
    double calcularDistanciaPosible() {
        return getRendimiento().getRedimientoKmL() * getCombustible().getLitros();
    }

    public Terrestre() {
    }

    public Terrestre(double velocidadKm, int capacidadPersonas, Rendimiento rendimiento, CombustiblePromedio combustible) {
        this.velocidadKm = velocidadKm;
        this.capacidadPersonas = capacidadPersonas;
        this.rendimiento = rendimiento;
        this.combustible = combustible;
    }

    public CombustiblePromedio getCombustible() {
        return combustible;
    }

    public void setCombustible(CombustiblePromedio combustible) {
        this.combustible = combustible;
    }

    public double getVelocidadKm() {
        return velocidadKm;
    }

    public void setVelocidadKm(double velocidadKm) {
        this.velocidadKm = velocidadKm;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }

    public Rendimiento getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(Rendimiento rendimiento) {
        this.rendimiento = rendimiento;
    }

}
