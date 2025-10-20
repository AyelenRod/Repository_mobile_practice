import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Character[][] laberinto = {
                {'S', '.', '.', '#', '.', '.'},
                {'#', '#', '.', '#', '.', '#'},
                {'.', '.', '.', '.', '.', '.'},
                {'.', '#', '#', '#', '#', '.'},
                {'.', '.', '.', '.', 'T', '.'}
        };

        // Crea el buscador: (laberinto, valorCamino, valorPared, valorTesoro)
        BuscadorDeLaberinto<Character> buscador =
                new BuscadorDeLaberinto<>(laberinto, '.', '#', 'T');

        System.out.println("Laberinto inicial:");
        buscador.imprimirLaberinto(); // imprime el laberinto antes de buscar (visitado = false)

        boolean encontrado = buscador.buscarCamino(0, 0); // punto de inicio (fila 0, columna 0)
        System.out.println("\n¿Tesoro encontrado? " + encontrado);

        System.out.println("\nLaberinto recorrido (\"*\" = camino usado para llegar al tesoro):");
        buscador.imprimirLaberinto(); // imprime marcando con '*' el camino hasta el tesoro
    }

    public static class BuscadorDeLaberinto<T> {
        private final Object[][] laberinto; // guardamos la matriz recibida como Object[][]
        private final T camino;
        private final T pared;
        private final T tesoro;
        private final boolean[][] visitado; // para marcar visitadas durante la búsqueda

        public BuscadorDeLaberinto(T[][] laberinto, T camino, T pared, T tesoro) {
            if (laberinto == null || laberinto.length == 0 || laberinto[0].length == 0) {
                throw new IllegalArgumentException("Laberinto inválido");
            }
            this.laberinto = laberinto; // está permitido asignar T[][] a Object[][]
            this.camino = camino;
            this.pared = pared;
            this.tesoro = tesoro;
            this.visitado = new boolean[laberinto.length][laberinto[0].length];
        }

        @SuppressWarnings("unchecked")
        private T getValor(int fila, int columna) {
            return (T) laberinto[fila][columna];
        }

        /**
         * Busca el tesoro recursivamente desde (fila, columna).
         * Devuelve true si encuentra el tesoro.
         */
        public boolean buscarCamino(int fila, int columna) {
            // Caso base: fuera de límites
            if (fila < 0 || fila >= laberinto.length || columna < 0 || columna >= laberinto[0].length) {
                return false;
            }

            // Si ya fue visitado, no volver a evaluar
            if (visitado[fila][columna]) {
                return false;
            }

            T valor = getValor(fila, columna);

            // Si es pared, no se puede avanzar
            if (Objects.equals(valor, pared)) {
                return false;
            }

            // Si es el tesoro, marcar y devolver true
            if (Objects.equals(valor, tesoro)) {
                visitado[fila][columna] = true;
                return true;
            }

            // Marcar como visitado (posible parte del camino)
            visitado[fila][columna] = true;

            // Probar las 4 direcciones: arriba, abajo, izquierda, derecha
            boolean encontrado =
                    buscarCamino(fila - 1, columna) ||
                            buscarCamino(fila + 1, columna) ||
                            buscarCamino(fila, columna - 1) ||
                            buscarCamino(fila, columna + 1);

            if (encontrado) {
                return true; // si alguna ruta encontró el tesoro, conservar la marca
            }

            // Backtracking: si no encontró por aquí, desmarcar y retroceder
            visitado[fila][columna] = false;
            return false;
        }

        /**
         * Imprime el laberinto en consola.
         * Si una celda fue marcada como visitada y forma parte del camino exitoso,
         * se imprime '*' en su lugar; en caso contrario se imprime su valor original.
         */
        public void imprimirLaberinto() {
            for (int i = 0; i < laberinto.length; i++) {
                for (int j = 0; j < laberinto[0].length; j++) {
                    if (visitado[i][j]) {
                        System.out.print("* ");
                    } else {
                        System.out.print(getValor(i, j) + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
