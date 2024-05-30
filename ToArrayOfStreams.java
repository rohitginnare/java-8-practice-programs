//Program to convert the list of objects into an array

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
class ToArrayOfStreams
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
		Integer[] i =l.stream().toArray(Integer[]::new);  //{Constructor Reference}. toArray Method Alwayss takes the object of an Array
															// that's why we have passes the constructor reference here 
		for(Integer i1 : i)
		{
			System.out.println(i1);
		}
	}
}