// simply print List using functional Approach
package programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FP02WithStreams {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> listToSum = Arrays.asList(12,2,33,4,5,7,10,12,15,12);
		int sum= printSumOfList(listToSum);
		System.out.println("The Sum of List elements is: "+ sum);
		
		printdistinctelementsofList(listToSum);
	}
	
private static void printdistinctelementsofList(List<Integer> listToSum) {
		// printing distinct elements of List
		listToSum.stream().distinct().forEach(System.out::println);
		System.out.println("Sorted List:");
		//listToSum.stream().distinct().sorted().forEach(System.out::println);
		listToSum.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);// sorting list in reverse Order
		
		
		
	}

//	private static int sumList(int number,int number1) {
//		return number+number1;
//	}
	

	private static int printSumOfList(List<Integer> listToSum) {
		// TODO Auto-generated method stub
		//return listToSum.stream().reduce(0,FP02WithStreams::sumList); // using reduce method within streams
		//return listToSum.stream().reduce(0,(num1,num2)->num1+num2); // using Lambda expression
		//return listToSum.stream().reduce(0,Integer::sum); // using method refernce of Integer class
		
		// find square of every number in  List and sum of those elements.
		//return listToSum.stream().map(number ->number*number).reduce(0, Integer::sum);
		
		// find cubes of every number in  List and sum of those elements.
		//return listToSum.stream().map(number ->number*number*number).reduce(0, Integer::sum);
		
		// find odd number in  List and sum of those elements.
		return listToSum.stream().filter(number -> number%2 != 0).reduce(0, Integer::sum);
		
	}

}
