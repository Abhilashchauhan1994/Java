// simply print List using functional Approach
package programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP03FunctionalIBehaviourParamaters {
	
	public static void main(String[] args) {
		List<Integer> listToPrint = Arrays.asList(1,2,3,4,5,7,10,12,15,12);
		
		filterAndPrint(listToPrint, x ->x%2 == 0);
		
		filterAndPrint(listToPrint, x ->x%2 == 1);
		
		List<Integer> listOfSquares = mapAndPrint(listToPrint,x -> x*x);
		List<Integer> listOfcubes = mapAndPrint(listToPrint,x -> x*x*x);
		List<Integer> listOfpower4 = mapAndPrint(listToPrint,x -> x*x*x*x);
		
		System.out.println("The Square of List: "+ listOfSquares);
		System.out.println("The Cube of List: "+ listOfcubes);
		System.out.println("The Power to 4 of List: "+ listOfpower4);
	}

	private static List<Integer> mapAndPrint(List<Integer> listToPrint,
			Function<? super Integer, ? extends Integer> function) {
		return listToPrint.stream().map(function).collect(Collectors.toList());
	}

	private static void filterAndPrint(List<Integer> listToPrint, Predicate<? super Integer> predicate) {
		listToPrint.stream().filter(predicate).forEach(System.out::println);
	}
	
	
}
