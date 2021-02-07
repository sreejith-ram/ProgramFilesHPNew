import java.util.Collections;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<Employee> l=new LinkedList<>();
		l.add(new Employee("101","Sachin"));
		l.add(new Employee("101","Sachin"));
		Collections.sort(l);
		System.out.println("Sort by emp number");
		System.out.println(l);

		System.out.println("sort by name");

		Collections.sort(l, new SortByName());
		System.out.println(l);

	}

}