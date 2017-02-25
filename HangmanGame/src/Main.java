import java.util.*;

class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String word = "ice";
		final String i = "i";
		final String c = "c";
		final String e = "e";
		String guess;
		boolean guessed = false;
		boolean iB = false;
		boolean cB = false;
		boolean eB = false;
		int numOfGuess;
		
		if (iB == true && cB == true && eB == true) {
			
			guessed = true;
			
		}
		
		if (guessed == true) {
			
			System.out.println("You Win!!!");	
			
		}
		
		else if (guessed = false) {
			
			System.out.println("Enter Guess:");
			guess = input.next();
			
			if (guess == i) {
				
				System.out.println("You guessed a letter!");
				iB = true;
				
			}
			
			if (guess == c) {
				
				System.out.println("You guessed a letter!");
				cB = true;
				
			}
			
			if (guess == e) {
				
				System.out.println("You guessed a letter!");
				eB = true;
				
			}
			
		}
		
	}
	
}
