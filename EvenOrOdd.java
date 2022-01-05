import java.util.*;

public class EvenOrOdd {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a range as an integer: ");
		int range = input.nextInt();
	
		for(int i = 0; i < range; i++) {
			displayEvenOrOdd(i);
	}
	
	public static void displayEvenOrOdd(int a) {
		if(a % 2 == 0) {
			System.out.println(a + " EVEN");
		} else {
			System.out.println(a + " ODD");
		}
	}
