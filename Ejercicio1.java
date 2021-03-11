package Tarea5;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el 1º número: ");
		int num1 = entrada.nextInt();
		System.out.println("Introduce el 2º número: ");
		int num2 = entrada.nextInt();
		System.out.println("Introduce el 3º número: ");
		int num3 = entrada.nextInt();
		System.out.println("Introduce el 4º número: ");
		int num4 = entrada.nextInt();
		if (num1==num2 && num2==num3 && num3==num4) {
			System.out.println("Los números son iguales");
		} else {
			System.out.println("Los números no son iguales");
		}
	}
}
