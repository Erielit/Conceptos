package conceptos.transportes;

public class Aereo extends Transporte {

    private double velocidadKm;
    private double altitudDeVuelo;
    private int cantidadPersonas;
    private Rendimiento rendimiento;
    private CombustiblePromedio combustible;

    @Override
    double calcularDistanciaPosible() {
        return (this.rendimiento.getRedimientoKmL() * this.combustible.getLitros());
    }

    public Aereo() {
    }

    public Aereo(double velocidadKm, double altitudDeVuelo, int cantidadPersonas, Rendimiento rendimiento, CombustiblePromedio combustible) {
        this.velocidadKm = velocidadKm;
        this.altitudDeVuelo = altitudDeVuelo;
        this.cantidadPersonas = cantidadPersonas;
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

    public double getAltitudDeVuelo() {
        return altitudDeVuelo;
    }

    public void setAltitudDeVuelo(double altitudDeVuelo) {
        this.altitudDeVuelo = altitudDeVuelo;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public Rendimiento getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(Rendimiento rendimiento) {
        this.rendimiento = rendimiento;
    }

}
