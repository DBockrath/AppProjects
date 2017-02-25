import java.util.*;
import java.math.BigDecimal;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers");
		String string = scanner.nextLine();
		List<BigDecimal> numbers = new ArrayList<>();
		for (String number : string.split(" "))
		numbers.add(new BigDecimal (number));
		Collections.sort(numbers);
		for (BigDecimal number : numbers)
		System.out.print(number + " ");
		
	}
	
}
