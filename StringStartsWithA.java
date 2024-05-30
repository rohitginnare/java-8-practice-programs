//Given a list of strings, 
//filter out the strings that start with the letter "A" and print them.
import java.util.*;
import java.util.stream.*;

class StringStartsWithA
{
	public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("ZB");
		al.add("ABAC");
		al.add("BCD");
		
		List<String> l1 = al.stream().filter(x-> x.startsWith("A")).collect(Collectors.toList());
		
		System.out.println(l1);
	}
}	