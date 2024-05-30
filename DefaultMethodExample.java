interface I
{
	public void m1();
	default void m2()
	{
		System.out.println("Default Method");
	}
}
class DefaultMethodExample implements I
{
	
		public void m1()
		{
		System.out.println("inside m1");
		}
		
		public void m2()
		{
		System.out.println("Overridding version of defalut method...");
		
		}
	public static void main(String args[])
		{
		DefaultMethodExample dm= new DefaultMethodExample();
		dm.m2();
		}
}