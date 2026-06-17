package context;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        //Entrada de datos
        int x = Integer.parseInt(
                JOptionPane.showInputDialog(
                        null,
                        "Digite el primer número:"
                )
        );

        int y = Integer.parseInt(
                JOptionPane.showInputDialog(
                        null,
                        "Digite el segundo número:"
                )
        );

        //Operaciones
        int a = suma(x, y);
        int b = resta(x, y);
        int c = multiplicacion(x, y);
        double d = division(x, y);

        //Resultados
        JOptionPane.showMessageDialog(
                null,
                "SUMA: " + a
                + "\nRESTA: " + b
                + "\nMULTIPLICACIÓN: " + c
                + "\nDIVISIÓN: " + d
        );
    }

    //Método Suma
    public static int suma(int x, int y) {
        return (x + y);
    }

    //Método Resta
    public static int resta(int x, int y) {
        return (x - y);
    }

    //Método Multiplicación
    public static int multiplicacion(int x, int y) {
        return (x * y);
    }

    //Método División
    public static double division(int x, int y) {
        return (double) x / y;
    }
}