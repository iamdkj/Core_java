package CoreJava;

public class Class7 
{
	int data=50;
	void change(Class7 op)
	{
		op.data=op.data+100; //changes will be in the instance variable
		System.out.println("in the change function --> "+data);
	}
	public static void main(String args[])
	{
		Class7 op=new Class7();
		
		System.out.println("Before change "+op.data);
		op.change(op);
		System.out.println("After change "+op.data);
	}
}
