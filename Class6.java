package CoreJava;

public class Class6 
{

	int data=50;
	void change(int data)
	{
		data=data+100;
		System.out.println("In the change function --- "+data);
	}

		public static void main(String args[])
		{
			Class6 obj=new Class6();
				
			System.out.println("Before change "+obj.data);
			obj.change(500);
			System.out.println("After change "+obj.data );
		}
		
}


