package Tarea5;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el 1� n�mero: ");
		int num1 = entrada.nextInt();
		System.out.println("Introduce el 2� n�mero: ");
		int num2 = entrada.nextInt();
		System.out.println("Introduce el 3� n�mero: ");
		int num3 = entrada.nextInt();
		System.out.println("Introduce el 4� n�mero: ");
		int num4 = entrada.nextInt();
		if (num1==num2 && num2==num3 && num3==num4) {
			System.out.println("Los n�meros son iguales");
		} else {
			System.out.println("Los n�meros no son iguales");
		}
	}
}
