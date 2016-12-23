package CoreJava;

public class Class2
{
	public void disp()
	{
		System.out.println("Welcome to NIIT");
	}
	public void exit()
	{
		System.out.println("Bye Bye");
	}
	public static void main(String args[])
	{
		System.out.println("In the main function....");
		
		Class2 obj = new Class2();
		obj.disp();
		obj.exit();
	}
}

