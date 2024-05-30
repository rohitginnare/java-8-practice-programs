import java.util.*;
import java.util.stream.*;
import java.util.function.*;
class StreamDotOfMethodStreams
{
	public static void main(String args[])
	{
		Stream<Integer> s=Stream.of(9,99,999,9999);
		s.forEach(System.out::println);
	
		Integer[] i={10,0,3,4,50};
		Stream.of(i).forEach(System.out::println); //Stream API is also applicable for other group of object than Collection intwerface
	}
}