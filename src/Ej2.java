/*Ejercicio 2:
Escribe un programa Java que realice lo siguiente: 
	- declarar una variable N de tipo int;
	- declarar una variable A de tipo double;
	- declarar una variable C de tipo char;
	- asignar valor a cada una de ellas.
A continuación, muetra por pantalla:
	- El valor de cada variable;
	La suma de N+A;
	La diferencia de A-N;
	El valor numérico correspondiente al carácter que contiene la variable C.*/

public class Ej2 {
	public static void main (String args[]) {
		int n=1;
		double a=1.2;
		char c='A';
		
		System.out.println("Variable n es " +n);
		System.out.println("Variable a es " +a);
		System.out.println("Variable c es "+c);
		System.out.println("La suma de n + a es "+(n+a));
		System.out.println("La resta de a - n es "+(a-n));
		System.out.println("El valor numerico de c es "+Character.getNumericValue(c));
		
	}

}
