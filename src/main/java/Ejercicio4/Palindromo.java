package Ejercicio4;

public class Palindromo {

    private static String palindromoIterativo(String cadena) {
        if (cadena.length() == 0 || cadena.length() == 1) { //Si la cadena es de 0 o 1 caracteres
            return "Sí es un palindromo"; //Es palíndromo
        }
        if (cadena.charAt(0) == cadena.charAt(cadena.length() - 1)) { //Si el primer y último caracter son iguales
            return palindromoIterativo(cadena.substring(1, cadena.length() - 1)); //Llamada recursiva IMPORTANTE
        }
        //EN EL ANTERIOR IF SE HACE LA LLAMADA RECURSIVA, POR LO QUE SI NO SE CUMPLE, NO SE HACE LA LLAMADA RECURSIVA

        return "No es un palindromo";
    }

    public static void main(String[] args) {
        String cadena1 = "DABALEARROZALAZORRAELABAD";
        String cadena2 = "DAVIDTINAUT";

        System.out.println("La cadena " + cadena1 + " es palíndromo?: " + palindromoIterativo(cadena1));
        System.out.println("La cadena " + cadena2 + " es palíndromo?: " + palindromoIterativo(cadena2));
    }

}

