package funciones;

import java.util.Scanner;

public class Calculadora {
	static double suma(double a, double b) {
		return a+b;
	}
	static double resta(double a, double b) {
		return a-b;
	}
	static double multiplicacion(double a, double b) {
		return a*b;
	}
	static double division(double a, double b) {
		return a/b;
	}
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		double x = s1.nextDouble();
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("Introduce el segundo número: ");
		double y = s2.nextDouble();
		
		double k = suma(x,y);
		double l = resta(x,y);
		double m = multiplicacion(x,y);
		double n = division(x,y);

		System.out.println("La suma es: " + k);
		System.out.println("La resta es: " + l);
		System.out.println("La multiplicación es: " + m);
		System.out.println("La división es: " + n);
	}

}

