package programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Courses{
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;
	
	public Courses(String name, String category, int reviewScore, int noOfStudents) {
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}
	
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getReviewScore() {
		return reviewScore;
	}
	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	@Override
	public String toString() {
		return "Courses [name=" + name + ", category=" + category + ", reviewScore=" + reviewScore + ", noOfStudents="
				+ noOfStudents + "]";
	}	
	
}

public class FP05CustomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Courses> course = Arrays.asList(
				new Courses("Spring","Framework",90,20000),
				new Courses("AWS","Cloud",94,24000),
				new Courses("Azure","Cloud",90,25000),
				new Courses("Microservices","Microservices",90,20000),
				new Courses("Java","Programming",98,28000),
				new Courses("Django","Framework",94,24000));
		
		Predicate<Courses> greaterThan92predicate = courses ->courses.getReviewScore()>92;
		Predicate<Courses> lessThan90predicate = courses ->courses.getReviewScore()>90;
		Predicate<Courses> greaterThan94predicate = courses ->courses.getReviewScore()>92;
		//Use of allMatch ,noneMatch,anyMatch --- these are boolean function.
//		System.out.println(course.stream().allMatch(greaterThan92predicate));
//		System.out.println(course.stream().noneMatch(lessThan90predicate));
//		System.out.println(course.stream().anyMatch(greaterThan94predicate));
		
		//End
		//Use of sorting for these courses
		Comparator<Courses> compareStudentascOrder= Comparator.comparingInt(Courses::getNoOfStudents); // here we have defined our own sorting algo.
		Comparator<Courses> compareSTudentdescOrder= Comparator.comparingInt(Courses::getNoOfStudents).reversed(); // here we have defined our own sorting algo.
//		
//		System.out.println(course.stream().sorted(compareStudentascOrder).collect(Collectors.toList()));
//		System.out.println(course.stream().sorted(compareSTudentdescOrder).collect(Collectors.toList()));
		
		// sorting using ratings for Courses
		Comparator<Courses> compareReviwascOrder= Comparator.comparingInt(Courses::getReviewScore); // here we have defined our own sorting algo.
		Comparator<Courses> compareReviewdescOrder= Comparator.comparingInt(Courses::getReviewScore).reversed(); // here we have defined our own sorting algo.
		
//		System.out.println(course.stream().sorted(compareReviwascOrder).collect(Collectors.toList()));
//		System.out.println(course.stream().sorted(compareReviewdescOrder).collect(Collectors.toList()));
		
		// Sorting with Mix-criteria
		Comparator<Courses> compareStudentascOrderAndReview= Comparator.comparingInt(Courses::getNoOfStudents).thenComparingInt(Courses::getReviewScore).reversed();//to reverse ReviewScore; // here we have defined our own sorting algo.
		//System.out.println(course.stream().sorted(compareStudentascOrderAndReview).collect(Collectors.toList()));
		///Sorting end
		
		//We now use Limits skip utilities of Stream.
		System.out.println(course.stream().sorted(compareStudentascOrderAndReview).limit(3).collect(Collectors.toList()));// here we limit our output to Top 3;
		System.out.println(course.stream().sorted(compareStudentascOrderAndReview).skip(3).collect(Collectors.toList()));// here we skip our output by top 3;
		
		//We now use max, min, find first and other methods
		
		
		
		
	}

}


