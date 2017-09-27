import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scaner scanner = new Scanner(System.in);
		
		int F;
		int G = 6.674 * 10^(-11);
		int m1;
		int m2;
		int r;
		
		System.out.println("Enter the force between masses in newtons: ");
		F = scanner.nextInt();
		System.out.println("Enter the mass of the first object in kilograms: ");
		m1 = scanner.nextInt();
		System.out.println("Enter the distance between the two objects in meters: ");
		r = scanner.nextInt();
		
		Int m2 = ((F / G) * ((r)^2)) / (m1);
		System.out.println("The mass of the second object is: " + m2);
		
	}
	
}
