package CoreJava;

public class Class5
{
	int i;
	int j;
	int k;
	
	public Class5()
	{
		System.out.println("Hii i am the Constructor");
	}
	public void sum(int a,int b)
	{
		i = a;
		j = b;
		k = i+j;
		
		System.out.println("Sum of two numbers--->"+k);
	}
	public static void main(String args[])
	{
		System.out.println("Enter the main function");
		
		Class5 obj = new Class5();
		obj.sum(10,20);
		
		System.out.println("Exit from the main function");
	}
}

	


