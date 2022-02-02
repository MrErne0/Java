package practicas;
import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Elige una opción ");
	String enter = s.nextLine();
	
	switch (enter){
		case"1":
			System.out.println("Elegiste opción uno");
			break;
		case "2":
			System.out.println("Elegiste opción dos");
			default:
				System.out.println("Elección incorrecta");
				
	
			
	}
	}

}
