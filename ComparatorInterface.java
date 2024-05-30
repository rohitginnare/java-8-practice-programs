import java.util.*;
class MyComparator implements Comparator<Integer>
{
	public int compare(Integer I1, Integer I2)
	{
		if(I1<I2)
		{
			return -1;
		}else if(I1>I2)
		{
			return +1;
		}else
		{
			return 0;
		}
	}
}

class ComparatorInterface
{
	public static void main(String args[])
	{
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(20);
		l.add(5);
		l.add(10);
		l.add(30);
		l.add(15);
		l.add(35);
		l.add(25);
		Collections.sort(l, new MyComparator());
		System.out.println(l);
	}
}