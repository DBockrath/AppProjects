import java.util.Scanner;
public class Main{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		// Declare variables to hold the base and height
		double base;
		double height;
		// Variables created
		System.out.print("Enter the triangle's base: ");
		base = sc.nextDouble();
		// Base hase been declared and filled in
		System.out.print("Enter the triangle's height: ");
		height = sc.nextDouble();
		// Both areas are filled in
		double area = (1/2.0) * base * height;
		// Area has been calculated
		System.out.println("The area of your triangle is: " + area);
		
	}
	
}
