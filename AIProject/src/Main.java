import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			inputTest();

		}

	}
	public static void inputTest() {
		Scanner user_input = new Scanner(System.in);
		String message = input.nextLine();
		String name;
		
		// User asks about system
		if (message.equalsIgnoreCase("About")) {
			System.out.println("This program is meant to give a basic example of artificial intelligence.");
			System.out.println("It is not meant to be like Siri.");
		
		}
		// User wants to know the system's name
		if (message.replace("?","").equalsIgnoreCase("What is your name")) {
			System.out.println("I am called Daniel Bockrath.");
			
		}
		// User asks about the date
		if (message.replace("?","").equalsIgnoreCase("What is the date")) {
			System.out.println("06-07-16");
			
		}
		// User asks about the location of the trash can
		if (message.replace("?","").equalsIgnoreCase("Where is the trash can")) {
			int random = (int) Math.round(Math.random() * 2);
			System.out.print("");
			if (random == 1) {
				System.out.println("Don't throw out your paper, you should recycle it.");
				
			}
			if (random == 2) {
				System.out.println("The trash can is in the back of the room by the teacher's desk.");
				
			}
			
		}
		// User asks if the system can speak in French
		if (message.replace("?","").equalsIgnoreCase("Can you speak in French")) {
			int random = (int) Math.round(Math.random() * 3);
			System.out.print("");
			if (random == 1) {
				System.out.println("Je parle français");
				
			}
			if (random == 2) {
				System.out.println("I can't seem to understand French.");
				
			}
			if (random == 3) {
				System.out.println("Yes, I can speak in every language.");
				
			}
			
		}
		// User wants to know if cats are better than dogs
		if (message.replace("?","").equalsIgnoreCase("Are cats better than dogs")) {
			int random = (int) Math.round(Math.random() * 3);
			System.out.print("");
			if (random == 1) {
				System.out.println("Dogs are far superior to cats.");
				
			}
			if (random == 2) {
				System.out.println("Cats are so much better than dogs.");
				
			}
			if (random == 3) {
				System.out.println("That is classified, I can't tell you.");
				
			}
			
		}
		// User writes "Hi"
		if (message.equalsIgnoreCase("Hi")) {
			System.out.println("Hello! What is your name?");
			name = user_input.next();
			System.out.println("Nice to meet you, " + name + "!");
			System.out.println("Is there anything I can help you with?");

		}
		// User writes "Hello"
		if (message.equalsIgnoreCase("Hello")) {
			System.out.println("Hello! What is your name?");
			name = user_input.next();
			System.out.println("Nice to meet you, " + name + "!");
			System.out.println("Is there anything I can help you with?");
			
		}
		// User wants to know how to make a good ice cream sandwich
		if (message.replace("?","").equalsIgnoreCase("How do you make an ice cream sandwich")) {
			System.out.println("Step 1: Go to the store and buy potato bread and ice cream of your choice.");
			System.out.println("Step 2: Get two pieces of bread out and spread the ice cream over the bread like peanut butter.");
			System.out.println("Step 3: Place the second piece of bread on top.");
			System.out.println("Step 4: Enjoy!");
			
		}
		// User wants to know what you do in your free time
		if (message.replace("?","").equalsIgnoreCase("What do you do in your free time")) {
			System.out.println("I like to dance, sing, and swim in the pool."); 
			System.out.println("What do you like to do in your free time?");
			
		}
		// User wants system to sing
		if (message.replace("!","").replace(".","").equalsIgnoreCase("Sing")) {
			System.out.println("Sorry, I am incapable of singing at the moment.");
			System.out.println("This device doesn't support applets at the moment.");
			
		}
		// User wants to know if Jonathan Livingston Seagull is Jesus
		if (message.replace("?","").equalsIgnoreCase("Is Jonathan Livingston Seagull Jesus")) {
			int random = (int) Math.round(Math.random() * 2);
			System.out.print("");
			if (random == 1) {
				System.out.println("That could be debated.");
				System.out.println("I guess since both names start with 'J' the answer is yes.");
				
			}
			if (random == 2) {
				System.out.println("Ask Henry, he probably knows.");
				
			}
			
		}
		// User asks what the area of his/her triangle is
		if (message.replace(".","").replace("?","").equalsIgnoreCase("What is the area of my triangle")) {
			double base;
			double height;
			System.out.println("Enter the base of your triangle: ");
			base = sc.nextDouble();
			System.out.println("Enter the height of your triangle: ");
			height = sc.nextDouble();
			double area = (1/2.0) * base * height;
			System.out.println("The area of your triangle is: " + area + " units squared");

		}
		// User asks to generate a random number
		if (message.replace(".","").equalsIgnoreCase("Generate a random number")) {
			double number;
			System.out.println("Between 0 and what number?");
			number = sc.nextDouble();
			int random = (int) Math.round(Math.random() * number);
			System.out.println("Your number is: " + random);

		}

	}

}
