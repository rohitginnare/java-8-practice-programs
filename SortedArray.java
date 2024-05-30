//Program to print the elements in sorted form of the length
import java.util.*;
import java.util.stream.*;
class SortedArray 
{
	public static void main(String args[])
	{
		ArrayList<String> l=new ArrayList<>();
		l.add("Rohit");
		l.add("Chetan");
		l.add("Amit");
		l.add("Abhishek");
		l.add("Rohan Sohani");
		l.add("Swaraj Vishva");
		
		Comparator<String> c = (s1,s2)-> {
			int l1=s1.length();
			int l2=s2.length();
			if(l1<l2) return -1;
			else if(l1>l2) return 1;
			else return s1.compareTo(s2);
		};
		
		//List<String> sortedStrings= l.stream().sorted(c).collect(Collectors.toList());
		//System.out.println("Sorted Elements according to their length : "+sortedStrings);
		
		List<String> sortedStrings= l.stream().sorted(c).collect(Collectors.toList());
		System.out.println("Reverse Sorted Elements according to their length : "+sortedStrings);
	}
}