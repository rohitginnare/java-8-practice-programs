import java.util.*;
import java.util.stream.Collectors;
class StreamsSortedMethod
{
	public static void main(String args[])
	{
	ArrayList<Integer> l=new ArrayList<>();
	l.add(5);
	l.add(10);
	l.add(65);
	l.add(20);
	l.add(55);
	l.add(13);
	
	//List<Integer> l2= l.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
	//System.out.println("Elements in Natural Sorting order : "+l2);
	
	List<Integer> l2= l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
	
	System.out.println("Elements in Natural Sorting order(in reverse) : "+l2);
	}
}