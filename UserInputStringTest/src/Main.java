import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String userInput;
		
		System.out.println("What is your favorite color?");
		userInput = input.next();
		
		System.out.println("Your favorite color is: " + userInput);
		
	}
	
}

class Line {
	
	public static void main(String[] args) {
		
		Scanner nextInput = new Scanner(System.in);
		String nextUserInput;
		
		System.out.println("What is your address?");
		nextUserInput = nextInput.nextLine();
		
		System.out.println("Your address is: " + nextUserInput);
		
	}
	
}
