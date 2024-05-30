//Q. Create a lambda expression that checks if a string is empty or null.
interface I1
{
	public boolean isEmptyString(String s);
}
class IsEmptyString
{
	public static void main(String args[])
	{
		I1 obj = s -> s.isEmpty();
		boolean b=obj.isEmptyString("Rohit");
		boolean b1=obj.isEmptyString("");
		System.out.println(b+" "+b1);
	}
}