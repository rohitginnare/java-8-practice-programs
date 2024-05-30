import java.util.*;
//class MyComparator implements Comparator<Integer>
//{
//	public int compare(Integer I1, Integer I2)
//	{
//		return (I1<I2)?-1:(I1>I2)?1:0;
//	}
//}

class ComparatorInterfaceWithLambdaExp
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
		Comparator<Integer> c = (I1,I2) -> (I1<I2)?-1:(I1>I2)?1:0;
		Collections.sort(l, c);
		System.out.println(l);
	}
}