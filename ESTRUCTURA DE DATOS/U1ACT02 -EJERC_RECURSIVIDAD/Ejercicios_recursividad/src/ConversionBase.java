//Ayelen Monse. Rodriguez Flores - 243681
//Fernando Duran Vazquez -243827

public class ConversionBase {

    // Método recursivo para convertir un número n a base b
    public static String convertir(int n, int b) {
        // Caso base
        if (n == 0) {
            return "0";
        }

        // Caso recursivo
        int residuo = n % b;
        int cociente = n / b;

        if (cociente == 0) {
            return Integer.toString(residuo); // último dígito
        }

        return convertir(cociente, b) + Integer.toString(residuo);
    }

    public static void main(String[] args) {
        int numero = 13;
        int base = 2;

        String resultado = convertir(numero, base);

        System.out.println("El número " + numero + " en base " + base + " es: " + resultado);
    }
}