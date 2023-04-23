package assignment11.problem1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
			HashMap<Key, Student> map = new HashMap<>();
			for (Student s : students) {
				Key key = new Key(s.getFirstName(), s.getLastName());
				map.put(key, s);
			}
			return map;


	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
               //implements
		double sum = 0;
		for (Student s : maps.values()) {
			sum += s.getGpa();
		}
		return sum / maps.size();
}
}
