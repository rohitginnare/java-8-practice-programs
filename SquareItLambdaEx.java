//Q. Write a lambda expression that calculates the square of a given integer.
interface I1
{
	public int square(int i);
}
class SquareItLambdaEx
{
	
	
	public static void main(String args[])
	{
		I1 obj = n -> n*n;
		int result = obj.square(5);
		System.out.println(result);
	}
	
}