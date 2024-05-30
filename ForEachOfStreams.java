//Program to print the square of each element in an array using forEach Method of Streams API
import java.util.*;
import java.util.stream.*;
import java.util.function.*;
class ForEachOfStreams
{
	public static void main(String args[])
	{
		ArrayList<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(5);
		l.add(15);
		l.add(0);
		l.add(20);
		
		System.out.println(l);
		Consumer<Integer> c = i->{
			System.out.println(i*i);
		};
		l.stream().forEach(i->{
			System.out.println(i*i);
		}
		);

	}
}	