# UnaMasPorFavor_DavidTinaut
Una más, por favor.

 * Mi repositorio: https://github.com/davidtinamart/UnaMasPorFavor_DavidTinaut.git
 
# Ejercicios repaso
# 1. Dado el siguiente fragmento de código C:
![image](https://user-images.githubusercontent.com/113375951/227747484-b75df89f-f977-4426-bc21-c55fb463ced8.png)


a) ¿Qué calcula la llamada a la función recursiva bisect(0,N)? Si cambiamos el
valor de N, ¿qué estaríamos calculando? ¿Y si cambiásemos la función f(x)?

b) Implemente un algoritmo iterativo equivalente.

 # 2. Dado el siguiente algoritmo recursivo:
 ![image](https://user-images.githubusercontent.com/113375951/227747512-f956ca50-5f9f-440e-843f-e82a9aaa4bbd.png)

 
a) Dado un número cualquiera x, ¿qué nos muestra por pantalla la llamada a la función
recursiva f(x,2)? ¿Cuál sería un nombre más adecuado para la función f?

b) Implemente un algoritmo iterativo y uno implementado mediante expresiones lambda
equivalentes.

# 3. Construya una función que convierta un número decimal...

en una cadena que represente el valor del número en hexadecimal (base 16). A continuación, generalice la función para
convertir un número decimal en un número en base B (con B<10). Resuélvalo mediante expresiones lambda.


Recordatorio: El cambio de base se realiza mediante divisiones sucesivas por 16
en las cuales los restos determinan los dígitos hexadecimales del número según
la siguiente correspondencia:

![image](https://user-images.githubusercontent.com/113375951/227747646-74f05cec-d513-45f5-a2b8-c53da7cbe41c.png)


# 4. Implemente, tanto de forma recursiva como de forma iterativa, una función que nos diga
si una cadena de caracteres es simétrica (un palíndromo). Por ejemplo,
“DABALEARROZALAZORRAELABAD” es un palíndromo.

# 5. Implemente, tanto de forma recursiva como de forma iterativa y con expresiones lambda,
una función que nos devuelva el máximo común divisor de dos números enteros
utilizando el algoritmo de Euclides.

* ALGORITMO DE EUCLIDES
Dados dos números enteros positivos m y n, tal que m > n,
para encontrar su máximo común divisor
(es decir, el mayor entero positivo que divide a ambos):
- Dividir m por n para obtener el resto r (0 ≤ r < n)
- Si r = 0, el MCD es n.
- Si no, el máximo común divisor es MCD(n,r).
