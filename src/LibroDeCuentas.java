import java.util.ArrayList;

public class LibroDeCuentas {
    ArrayList<Gasto> lista = new ArrayList<Gasto>();
    private final static int TOP = 0;

    public void anadirGasto(Gasto element) {
        lista.add(TOP, element);
    }

    public void verListaDeGastos() {
        if (lista.size() == 0) {
            System.out.println("No hay gastos");
        } else {
            System.out.println("Lista de gastos:");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i));
            }
        }
    }
}
