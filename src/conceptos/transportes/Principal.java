package conceptos.transportes;

enum CombustiblePromedio {
    AEREO(700.0),
    TERRESTRE(50.0),
    MARITIMO(700.0);
    double litros;

    private CombustiblePromedio(double litros) {
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }
}

enum Rendimiento {
    AEREO(56.3),
    TERRESTRE(15.0),
    MARITIMO(40.5);
    double redimientoKmL;

    private Rendimiento(double redimientoKmL) {
        this.redimientoKmL = redimientoKmL;
    }

    public double getRedimientoKmL() {
        return redimientoKmL;
    }
}

public class Principal {

    public static void main(String[] args) {
        Aereo aereo = new Aereo();
        aereo.setAltitudDeVuelo(10);
        aereo.setCantidadPersonas(200);
        aereo.setVelocidadKm(920);
        aereo.setRendimiento(Rendimiento.AEREO);
        aereo.setCombustible(CombustiblePromedio.AEREO);
        Terrestre terrestre = new Terrestre();
        terrestre.setCapacidadPersonas(50);
        terrestre.setVelocidadKm(180);
        terrestre.setCombustible(CombustiblePromedio.TERRESTRE);
        terrestre.setRendimiento(Rendimiento.TERRESTRE);
        Maritimo maritimo = new Maritimo();
        maritimo.setCapacidadPersonas(150);
        maritimo.setVelocidadKm(100);
        maritimo.setCombustible(CombustiblePromedio.MARITIMO);
        maritimo.setRendimiento(Rendimiento.MARITIMO);

        System.out.println(aereo.calcularDistanciaPosible());
        System.out.println(terrestre.calcularDistanciaPosible());
        System.out.println(maritimo.calcularDistanciaPosible());
    }
}
