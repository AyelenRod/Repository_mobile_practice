//Ayelen Monse. Rodriguez Flores - 243681
//Fernando Duran Vazquez -243827

public class ExponenciacionPorCuadrados {

    // Método recursivo para calcular a^b usando exponenciación por cuadrados
    public static long potenciaRapida(long base, long exponente) {
        // Caso base
        if (exponente == 0) {
            return 1;
        }

        // Si el exponente es par
        if (exponente % 2 == 0) {
            return potenciaRapida(base * base, exponente / 2);
        } else { // Si es impar
            return base * potenciaRapida(base * base, (exponente - 1) / 2);
        }
    }

    public static void main(String[] args) {
        long base = 9;
        long exponente = 13;

        long resultado = potenciaRapida(base, exponente);

        System.out.println(base + "^" + exponente + " = " + resultado);
    }
}