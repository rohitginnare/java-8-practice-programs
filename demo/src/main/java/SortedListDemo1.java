import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedListDemo1 {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(21);
		l1.add(20);
		l1.add(15);
		l1.add(29);
		
		System.out.println(l1);
		
//		---Traditional Method-----
		//Sort this list 
		Collections.sort(l1);
		System.out.println(l1);
		
		//Sort in descending order
		Collections.reverse(l1);
		
//		-----Using Stream API------
		//Ascending order
		l1.stream().sorted().forEach(s->System.out.println(s));
		
		System.out.println("-------------Descending order------------");
		//Descending order
		l1.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
		
		
		//Sort on basis of a column of a class
//		l1.stream().sorted()
		
	}

}
