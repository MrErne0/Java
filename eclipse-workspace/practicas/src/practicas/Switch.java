package practicas;
import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Elige una opci�n ");
	String enter = s.nextLine();
	
	switch (enter){
		case"1":
			System.out.println("Elegiste opci�n uno");
			break;
		case "2":
			System.out.println("Elegiste opci�n dos");
			default:
				System.out.println("Elecci�n incorrecta");
				
	
			
	}
	}

}
