import java.util.*;

public class FindMaxInt {
			public static void main(String... args) {
					Scanner input = new Scanner(System.in);
				
					System.out.println("Please enter three integers: ");
					do { 
						List<Integer> list = new ArrayList<>();
					}	while(input.hasNext()) {
						list.add(input.nextInt());
					}
				
				if(list.get(0) > list.get(1) && list.get(0) > list.get(2)) {
					System.out.println("Largest number: " + list.get(0));
				} else if(list.get(1) > list.get(0) && list.get(1) > list.get(2))  {
					System.out.println("Largest number: " + list.get(1));
				} else {
					System.out.println("Largest number: " + list.get(2));
				}
		}
}				
