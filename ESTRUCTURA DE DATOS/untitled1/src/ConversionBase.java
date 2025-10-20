public class ConversionBase {

    // Cadena con los símbolos posibles de dígitos (soporta hasta base 36)
    private static final String DIGITS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String toBase(int n, int b) {
        if (b < 2 || b > DIGITS.length()) {
            throw new IllegalArgumentException("Base no soportada: " + b);
        }
        if (n == 0) {
            return "0";
        }

        // Manejo de números negativos
        boolean neg = n < 0;
        n = Math.abs(n);

        // Caso base
        if (n < b) {
            return (neg ? "-" : "") + DIGITS.charAt(n);
        }

        // Caso recursivo
        int q = n / b;
        int r = n % b;

        return (neg ? "-" : "") + toBase(q, b) + DIGITS.charAt(r);
    }

    public static void main(String[] args) {
        System.out.println(toBase(13, 2));   // 1101
        System.out.println(toBase(125, 16)); // 7D
        System.out.println(toBase(255, 8));  // 377
    }
}

