import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double number;
		System.out.println("This program will generate a random number");
		System.out.println("Between 0 and which number do you wish to generate a random number?");
		number = sc.nextDouble();
		int random = (int) Math.round(Math.random() * number);
		System.out.println("Your number is: " + random);
		
	}
	
}
