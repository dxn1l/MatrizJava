package Matriz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrizTest {

    @Test
    void testImprimirNoLanzaExcepciones() {
        int[][] datos = {{1, 2}, {3, 4}};
        Matriz matriz = new Matriz(datos);
        assertDoesNotThrow(matriz::imprimir);
    }

    @Test
    void testTranspuestaCorrecta() {
        int[][] datos = {{1, 2}, {3, 4}};
        Matriz matriz = new Matriz(datos);
        Matriz transpuesta = matriz.transpuesta();

        // Crear la transpuesta esperada
        int[][] esperada = {{1, 3}, {2, 4}};
        Matriz matrizEsperada = new Matriz(esperada);

        // Comparar las matrices usando reflexión (acceso a campo privado)
        assertArrayEquals(esperada, getElementos(transpuesta));
    }

    // Método auxiliar para acceder a los datos de la matriz
    private int[][] getElementos(Matriz matriz) {
        try {
            var campo = Matriz.class.getDeclaredField("elementos");
            campo.setAccessible(true);
            return (int[][]) campo.get(matriz);
        } catch (Exception e) {
            fail("No se pudo acceder al campo 'elementos'");
            return null;
        }
    }
}
