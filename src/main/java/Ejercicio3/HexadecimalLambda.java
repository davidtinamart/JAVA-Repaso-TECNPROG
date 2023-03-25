package Ejercicio3;
import java.util.Scanner;

public class HexadecimalLambda {

    public static String convertir(int num, int base) {
        String resultado = "";
        while (num > 0) { // Mientras el número sea mayor que 0
            int resto = num % base; // Obtenemos el resto de la división
            if (resto < 10) { // Si el resto es menor que 10
                resultado = resto + resultado;  // Lo añadimos al resultado
            } else {
                resultado = (char) (resto + 55) + resultado; // Si no, lo añadimos como un carácter (A=65, B=66, C=67, etc.)
            }
            num = num / base;
        }
        return resultado;
    }

}