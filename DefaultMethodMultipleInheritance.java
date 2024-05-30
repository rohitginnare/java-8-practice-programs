interface Left
{
	default void m1()
	{
	System.out.println("Left class m1 method ");
	}
}
interface Right
{
	default void m1()
	{
	System.out.println("Right class m1 method ");
	}
}
class DefaultMethodMultipleInheritance implements Left,Right 
{
	public void m1()
	{
	//	System.out.println("Our own implementation of m1");
		//Left.super.m1();
		Right.super.m1();
	}
	public static void main(String args[])
	{
		DefaultMethodMultipleInheritance t= new DefaultMethodMultipleInheritance();
		t.m1();
	}
}