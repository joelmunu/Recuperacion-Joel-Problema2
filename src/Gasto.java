public class Gasto {
    private String concepto;
    private float importe;

    public Gasto(String concepto, float importe) {
        this.concepto = concepto;
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Concepto: " + concepto + " | Importe: " + importe;
    }
}
