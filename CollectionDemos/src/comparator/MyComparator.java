package comparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
			String str1 = s1.toString();
			String str2 = s2.toString();
		
		return str1.compareTo(str2);
	}

	

}
