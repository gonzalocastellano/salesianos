package Tarea5;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número real: ");
		double num1 = entrada.nextDouble();
		System.out.println("Introduce otro número real: ");
		double num2 = entrada.nextDouble();
		if ((num1 >= 0 && num1 <= 1) && (num2 >= 0 && num2 <= 1)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
	}	
	}