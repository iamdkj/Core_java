package CoreJava;

public class Class4
{
	int i;
	int j;
	int k;
	
	public void sum(int a,int b)
	{
		i = a;
		j = b;
		k = i+j;
	
		System.out.println("Sum of two numbers--->"+k);
	}
	public static void main(String agrs[])
	{
		System.out.println("Enter the main function");
		
		Class4 obj = new Class4();
		obj.sum(20,10);
		
		System.out.println("Exit from the main function");
	}
}

	
		

	


