package practicas;
import java.util.Scanner;

public class controlDeFlujo {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Ingresa tu edad: ");
		int age = value.nextInt();
		
		if (age >= 18) {
			// Ejecutar declaraci�n de bloque;
			System.out.println("Eres mayor de edad: ");
			}
			else if(age>0 && age <18){
			// Ejecutar segunda declaraci�n de bloque de condici�n;
				System.out.println("Eres menor de edad: ");
			} else{
				System.out.println("Eres mayor de edad: ");
			}

		
	}

}
