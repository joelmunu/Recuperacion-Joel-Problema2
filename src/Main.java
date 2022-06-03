import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        LibroDeCuentas miLibroDeCuentas = new LibroDeCuentas();

        while (salir == false) {
            System.out.println("1. Añadir un gasto");
            System.out.println("2. Ver lista de gastos");
            System.out.println("4. Salir");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Escribe el concepto: ");
                    String concepto = sc.nextLine();
                    System.out.print("Introduce el importe: ");
                    Float importe = sc.nextFloat();
                    sc.nextLine();
                    miLibroDeCuentas.anadirGasto(new Gasto(concepto, importe));
                    break;

                case 2:
                    miLibroDeCuentas.verListaDeGastos();
                    break;

                case 4:
                    salir = true;
                    break;
            }
        }


        sc.close();
    }
}