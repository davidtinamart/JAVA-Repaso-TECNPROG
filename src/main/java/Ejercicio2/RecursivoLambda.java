package Ejercicio2;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class RecursivoLambda {  //atributos independientes para cada metodo

    public static void funcion1(int num, int divisor) { //Función recursiva a la que se le pasa el número y el divisor
        if (num > 1) {                         //Si el número es mayor que 1
            if ((num % divisor) == 0) {             //Si el resto es 0
                System.out.println(divisor);
                funcion1(num / divisor, divisor);    //Llamada recursiva
            } else {
                funcion1(num, divisor + 1);      //Llamada recursiva
            }
        }
    }















}
