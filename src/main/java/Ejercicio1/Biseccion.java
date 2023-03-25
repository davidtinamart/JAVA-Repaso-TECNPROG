package Ejercicio1;

public class Biseccion {

    private static final double N = 2;
    private static final double PREC = 1e-6;

    private static double f(double x){
        return x*x-N;
    }

    public static double biseccionrecursiva(double min, double max){            // Bisección recursiva
        double med = (min + max) / 2;                                           // Se calcula el punto medio
        if(max-min < PREC){                                                    // Si la diferencia entre los puntos es menor a la precisión
            return med;                                                      // Se devuelve el punto medio
        }else if(f(min)*f(med) < 0){                                         // Si el producto es menor que 0, entonces hay cambio de signo
            return biseccionrecursiva(min, med);                            // Llamada recursiva
        }else{
            return biseccionrecursiva(med, max);                            // Llamada recursiva
        }
    }
}
