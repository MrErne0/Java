package practicas;
import java.util.Scanner;

public class OperadorTernario {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Ingresa tu edad: ");
		int edad = s.nextInt();
		
		
		System.out.println(edad>= 0 && edad<18? "Eres menor de edad" :edad>=18 && edad<=150? "Eres mayor de edad" : "El rando de edad no es correcto" );
	}

}
