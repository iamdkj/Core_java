package CoreJava;

public class Class3
{
	int i = 10;
	int j = 20;
	int k;
	
	public void sum()
	{
		k=i+j;
		System.out.println("Sum of two numbers--->"+k);
	}
	public static void main(String args[])
	{
		System.out.println("Enter the main function");
		
		Class3 obj = new Class3();
		obj.sum();
		
		System.out.println("Exit from the main function");
	}
}
		


	

