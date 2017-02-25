import java.util.Scanner;
import java.util.Random;

public class Main {
	
	
	
}

public class SimpleShipTest {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		SimpleShip ship = new SimpleShip();
		String userGuess = "2";
		int numOfGuess = 0;
		boolean isAlive = true;
		int temp = rand.nextInt(5) + 1;
		int [] locations = {temp,++temp,++temp};
		ship.setLocations(locations);
		
		while (isAlive) {
			
			String result;
			System.out.println("Enter a guess");
			userGuess = input.nextLine();
			result = ship.checkGuess(userGuess);
			numOfGuess++;
			if (result.equals("kill")) {
				
				isAlive = false;
				
			}
			
		}
		
	}
	
}

public class SimpleShip {
	
	private int [] location;
	private int numOfHits;
	
	public void setLocations(int [] loc) {
		
		location = loc;
		
	}
	
	public String checkGuess(String guess) {
		
		String result = "miss";
		
		int guess = Integer.parseInt(guess);
		
		for (int loc : location) {
			
			if (guess == loc) {
				
				numOfHits++;
				
				result = numOfHits == location.length ? "kill" : "hit";
				break;
				
			}
			
		}
		System.out.println(result);
		
		return result;
		
	}
	
}
