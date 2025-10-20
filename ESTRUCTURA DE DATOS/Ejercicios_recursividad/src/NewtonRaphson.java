
//Ayelen Monse. Rodriguez Flores - 243681
//Fernando Duran Vazquez -243827


public class NewtonRaphson {
    private static double function(double x) {
        // f(x) = x^2 - 4. La raíz es 2.
        return x * x - 4;
    }

    private static double derivative(double x) {
        // f'(x) = 2x
        return 2 * x;
    }

    // Implementación recursiva del método de Newton-Raphson
    public static double newtonRaphsonRecursive(double x_n, double tolerance, int maxIterations, int currentIteration) {
       // si la derivada es muy cercana a cero, no se puede continuar.
        if (Math.abs(derivative(x_n)) < 1e-9) {
            throw new ArithmeticException("La derivada es demasiado pequeña, no se puede continuar.");
        }

        double x_n_plus_1 = x_n - function(x_n) / derivative(x_n);

        // Si la diferencia entre la aproximación actual y la siguiente es menor que la tolerancia.
        if (Math.abs(x_n_plus_1 - x_n) < tolerance) {
            System.out.println("Aproximación final en la iteración " + currentIteration + ": " + x_n_plus_1);
            return x_n_plus_1;
        }

        //Si se ha alcanzado el número máximo de iteraciones.
        if (currentIteration >= maxIterations) {
            System.out.println("Se alcanzó el número máximo de iteraciones. Aproximación final: " + x_n_plus_1);
            return x_n_plus_1;
        }

        System.out.println("Iteración " + currentIteration + ": x = " + x_n_plus_1);

        // Llamada recursiva con la nueva aproximación
        return newtonRaphsonRecursive(x_n_plus_1, tolerance, maxIterations, currentIteration + 1);
    }

    public static void main(String[] args) {
        double initialGuess = 3.0;     // x_0
        double tolerance = 1e-6;       // Tolerancia de error
        int maxIterations = 100;       // Número máximo de iteraciones

        System.out.println("Buscando la raíz de x^2 - 4 = 0 con una estimación inicial de " + initialGuess);

        try {
            double root = newtonRaphsonRecursive(initialGuess, tolerance, maxIterations, 1);
            System.out.println("La raíz aproximada es: " + root);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}