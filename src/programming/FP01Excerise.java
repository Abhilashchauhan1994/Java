// simply print List using functional Approach
package programming;

import java.util.Arrays;
import java.util.List;

public class FP01Excerise {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listToPrint = Arrays.asList("Spring","Spring Boot","API","AWS","Azure");
		listToPrint.stream().map(str ->str.toUpperCase()).forEach(System.out::println);// here we have Method Reference in For each
		listToPrint.stream().map(String::toUpperCase).forEach(System.out::println);// here we have Method Reference in Map also with For Each.
		
	}	
}

