// simply print List using functional Approach
package programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FP02CollectStream {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> listToPrint = Arrays.asList(1,2,3,4,5,7,10);
		List<Integer> collectEvenList =collectEvenListElelements(listToPrint);
		List<Integer> collectSquareList =collectSquareListElelements(listToPrint);
		
		System.out.println("The Even List is :"+ collectEvenList);
		System.out.println("The square List is :"+ collectSquareList);
		
	}

	private static List<Integer> collectSquareListElelements(List<Integer> listToPrint) {
		// TODO Auto-generated method stub
		return listToPrint.stream().map(number -> number*number).collect(Collectors.toList());
	}

	private static List<Integer> collectEvenListElelements(List<Integer> listToPrint) {
		// collecting even numbers from list and return them using collect method within stream
		return listToPrint.stream().filter(number -> number%2 ==0).collect(Collectors.toList());
	}
	
	
}
