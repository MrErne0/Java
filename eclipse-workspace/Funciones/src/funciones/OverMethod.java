package funciones;

public class OverMethod {
	
	static int myMethod(int age) {
		return age;
	}
	static float myMethod(float height) {
		return height;
	}
	static double myMethod(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		
		System.out.println("Mi edad es: " + myMethod(34));
		System.out.println("Mi estatura es: " + myMethod(1.7f));
		System.out.println("La suma de dos n�meros aleatorios es: " + myMethod(10,2));

	}

}
