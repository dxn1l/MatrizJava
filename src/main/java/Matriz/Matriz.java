package Matriz;

public class Matriz {

    private int[][] elementos;

    public Matriz(int[][] elementos) {
        // Copia profunda para evitar aliasing externo
        this.elementos = new int[elementos.length][];
        for (int i = 0; i < elementos.length; i++) {
            this.elementos[i] = elementos[i].clone();
        }
    }

    public void imprimir() {
        for (int[] fila : elementos) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public Matriz transpuesta() {
        int filas = elementos.length;
        int columnas = elementos[0].length;

        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = elementos[i][j];
            }
        }

        return new Matriz(transpuesta);
    }
}
