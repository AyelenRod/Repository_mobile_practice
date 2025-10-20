public class Recursividad {
    public static int gcd(int a, int b) {
        return (b==0) ? Math.abs(a) : gcd(b, a%b);
    }

    public static int gcd(int a, int b, int c) {
        return gcd(gcd(a, b), c);
    }

    public static void main(String[] args) {
        int a = 60;
        int b = 24;
        int c = 36;

        System.out.println("El MCD de " + a + ", " + b + " y " + c + " es: " + gcd(a, b, c));
    }
}


