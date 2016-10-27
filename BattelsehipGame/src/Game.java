import java.util.*;

public class Game {
	
	private ArrayList<Ship> ship = new ArrayList<Ship>();
	int numGuess = 0;
	
	public static void main(String[] args) {
		
		Game game = new Game();
		game.setUp();
		
	}
	
	private void setUp() {
		
		ship.add(new Ship("Sub", 3));
		ship.add(new Ship("Battleship", 3));
		ship.add(new Ship("War Machine", 3));
		
		System.out.println("Welcome to Battleship\nYour goal is to sink all of the ships as fast as possible\nGood Luck!");
		
		play();
		
	}
	
	private void play() {
		
		String guess, result;
		Scanner input = new Scanner(System.in);
		
		while (!ship.isEmpty()) {
			
			result = "Miss";
			numGuess++;
			
			System.out.println("Enter a Guess");
			guess = input.nextLine();
			guess = guess.toUpperCase();
			
			for (int i =0; i < ship.size(); i++) {
				
				result = ship.get(i).check(guess);
				
				if (result.equals("Kill")) {
					
					result = ("You sunk my " + ship.get(i).getName());
					ship.remove(i);
					break;
					
				}
				
				else if (result.equals("Hit")) {
					
					break;
					
				}
				
			}
			
			System.out.println(result);
			
		}
		
		input.close();
		finish();
		
	}
	
	private void finish() {
		
		if (numGuess == 9) {
			
			System.out.println("Congradulations! You got a perfect score!!");
			
		}
		
		else if (numGuess < 20) {
			
			System.out.println("Congradulations! You did great!! It took you " + numGuess + " guesses");
			
		}
		
		else if (numGuess < 30) {
			
			System.out.println("You did so so. It took you " + numGuess + " guesses");
			
		}
		
		else {
			
			System.out.println("You're terrible! It took you " + numGuess + " guesses");
			
		}
		
	}
	
	private void setLocations() {
		
		Random rand = new Random();
		ArrayList<String> locationToSet = new ArrayList<String>();
		
		ArrayList<String> temp = null;
		
		int let, num, incl, incn;
		String alpha = "ABCDEFG";
		boolean worked;
		
		for (int i = 0; i < ship.size(); i++) {
			
			worked = false;
			
			start:
			
			while (!worked) {
				
				locationToSet.clear();
				
				worked = true;
				
				let = rand.nextInt(5);
				num = 1 + rand.nextInt(5);
				
				if (num % 2 == 0) {
					
					incl = 1;
					incn = 0;
					
				}
				
				else {
					
					incl = 0;
					incn = 1;
					
				}
				
				for (int j = 0; j < ship.get(i).getSize(); j++) {
					
					String loc = "" + alpha.charAt(let) + num;
					
					let+= incl;
					num += incn;
					
					for (int t = 0; t < ship.size(); t++) {
						
						if (t != i) {
							
							temp = ship.get(t).getLocations();
							
							if (temp.contains(loc)) {
								
								worked = false;
								
								continue start;
								
							}
							
						}
						
					}
					
					locationToSet.add(loc);
					
				}
				
				ship.get(i).setLocation(locationToSet);
				
			}
			
		}
		
	}
	
}
