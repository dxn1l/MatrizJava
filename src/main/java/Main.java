import Matriz.Matriz;

public class Main {
    public static void main(String[] args) {
        Matriz m = new Matriz(new int[][]{{1, 2}, {3, 4}});
        System.out.println("Matriz original:");
        m.imprimir();

        Matriz transpuesta = m.transpuesta();
        System.out.println("Matriz transpuesta:");
        transpuesta.imprimir();
    }
}
