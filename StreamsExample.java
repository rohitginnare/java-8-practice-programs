import java.util.*;
import java.util.stream.Collectors;
class StreamsExample
{
	public static void main(String args[])
	{
	ArrayList<Integer> l=new ArrayList<>();
	l.add(5);
	l.add(10);
	l.add(15);
	l.add(20);
	l.add(25);
	l.add(13);
	
	List<Integer> l2= l.stream().filter(i->(i%2==0)).collect(Collectors.toList());
	
	System.out.println("Even numbers are : "+l2);
	}
}