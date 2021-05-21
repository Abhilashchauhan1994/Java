// simply print List using functional Approach
package programming;

import java.util.Arrays;
import java.util.List;

public class FP01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> listToPrint = Arrays.asList(1,2,3,4,5,7,10,12,15,12);
		printListUsingFunctionalApproach(listToPrint);
		printEvenListUsingFunctionalApproach(listToPrint);
		printOddListUsingFunctionalApproach(listToPrint);
	}
	
	private static void printList(int listNumber) {
		System.out.println(listNumber);
	}
	
	private static boolean isEven(int number) {
		return number%2==0;
	}

	private static void printListUsingFunctionalApproach(List<Integer> listToPrint) {
		//Creating sequential Stream of List 
		listToPrint.stream().forEach(FP01::printList);// we are using method reference inside for each to store elements and print. 
		listToPrint.stream().forEach(System.out::println);// Using this system reference method we can avoid printList method define above.
		
	}
	
	private static void printEvenListUsingFunctionalApproach(List<Integer> listToPrint) {
		//here we use filters to filter data
		listToPrint.stream().filter(FP01::isEven).forEach(System.out::println);
		//Using Lambda Expression to filter
		listToPrint.stream().filter(number -> number%2 ==0).forEach(System.out::println);
	}
	
	private static void printOddListUsingFunctionalApproach(List<Integer> listToPrint) {
		//Using Lambda Expression to filter
		listToPrint.stream().filter(number -> number%2 !=0).forEach(System.out::println);
	}

}
