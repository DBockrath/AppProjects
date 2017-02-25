import java.util.*;
import java.math.BigDecimal;
public class Main {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		double total;
		double numbers;
		double mean;
		double add;
		
		System.out.println("Enter the total number of numbers");
		total = scanner.nextDouble();
		System.out.println("Enter the numbers");
		numbers = scanner.nextDouble();
		
		add = numbers;
		
		mean = add/total;
		System.out.println("The mean is " + mean);
		
	}
	
}
