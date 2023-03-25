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
    public static void factoresPrimosIterativo(int num){  //Función iterativa
        int div = 2;                            //Divisor
        while(num > 1){                        //Mientras el número sea mayor que 1
            if(num % div == 0){              //Si el resto es 0
                System.out.println(div);   //Se imprime el número
                num /= div;             //Se divide el número entre el divisor (forma acortada de num = num / div)
            }else{
                div++;
            }
        }
    }

    public static void factoresPrimosLambda(int num){   //Función recursiva
        IntConsumer f = n -> {                              //Función lambda
            if(num % n == 0){                            //Si el resto es 0
                System.out.println(n);                  //Se imprime el número
                factoresPrimosLambda(num / n);   //Llamada recursiva
            }
        };
        IntStream.rangeClosed(2, num).forEach(f);
    }















}
