import java.util.*;
public class AnonymousInnerClassExample
{
	public static void main(String args[])
	{
		Runnable r=new Runnable() //here new Runnable() is not an object of Runnable Interface, it is an object of Implementation Ineer class {AnonymousInnerClass} which does not have any name.
		{
			public void run()
			{
				for(int i=0;i<10;i++)
				{
				System.out.println("Child Thread...");
				}
			}
		};
		
		Thread t= new Thread(r);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread...");
		}
	}
}