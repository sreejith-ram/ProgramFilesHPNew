import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		
		LinkedList obj3=new LinkedList<>();
		//HASHSET CODING//
		HashSet<Integer> obj=new HashSet<>();
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter three values for HashSet: ");
		obj.add(sc.nextInt());
		obj.add(sc.nextInt());
		obj.add(sc.nextInt());
		//HASHSET CODING//
		
		
		//LINKEDHASHSET CODING//
		LinkedHashSet<Integer> obj1=new LinkedHashSet<>();
		System.out.println("Enter three values for LinkedHashSet: ");
		obj1.add(sc.nextInt());
		obj1.add(sc.nextInt());
		obj1.add(sc.nextInt());
		//LINKEDHASHSET CODING//
		
		
		//TREESET//
		TreeSet<Integer> obj2=new TreeSet<>();
		System.out.println("Enter three values for TreeSet: ");
		obj2.add(sc.nextInt());
		obj2.add(sc.nextInt());
		obj2.add(sc.nextInt());
		//TREESET//
		
		
		//PRINTING ALL OUTPUTS//
		System.out.println("Printing the output of the HashSet: "+obj);
		System.out.println("Printing the output of the LinkedHashSet: "+obj1);
		System.out.println("Printing the output of the TreeSet: "+obj2);
		System.out.println("Print using enhanced for loop");
		for(Integer i:obj)
		{
			System.out.println(i);
		}
		System.out.println("Using index position");
		//for(int i=0;i<obj.size();i++)
		//{
		//	System.out.println(obj.get(i));
		//}
		java.util.Iterator it=obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//PRINTING ALL OUTPUTS//

	}

}
