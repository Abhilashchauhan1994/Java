// simply print List using functional Approach
package programming;

import java.util.Arrays;
import java.util.List;

public class FP04MethodRefernce {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listToPrint = Arrays.asList("Spring","Spring Boot","API","AWS","Azure");
		printListUsingFunctionalApproach(listToPrint);
		printContainsListUsingFunctionalApproach(listToPrint);
		printContainsAtLeast4lettersListUsingFunctionalApproach(listToPrint);
	}

	private static void printContainsAtLeast4lettersListUsingFunctionalApproach(List<String> listToPrint) {
		// TODO Auto-generated method stub
		listToPrint.stream().filter(course -> course.length()>=4).forEach(System.out::println);
	}

	private static void printContainsListUsingFunctionalApproach(List<String> listToPrint) {
		// TODO Auto-generated method stub
		listToPrint.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
	}

	private static void printListUsingFunctionalApproach(List<String> listToPrint) {
		// TODO Auto-generated method stub
		listToPrint.stream().forEach(System.out::println);
		
	}
	
	
}

