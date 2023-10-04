package comparator;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		Set<Student> set1 = new TreeSet<Student>(new MyComparator());
		
		set1.add(new Student(101,"Don"));
		set1.add(new Student(102,"Adam"));
		set1.add(new Student(104,"Ravi"));
		set1.add(new Student(103,"Sonal"));
		
		System.out.println(set1);
		
		

	}

}
