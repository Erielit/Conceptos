package conceptos;

public class Guitarra extends InstrumentoMusical {

    int cuerdas = 6;

    @Override
    public void tocarInstrumento() {
        System.out.println("Tocando guitarra...");
    }

    @Override
    public void esDeCuerdas() {
        System.out.println("Es de cuerdas: " + ((cuerdas > 0) ? "Sí" : "No"));
    }

}
