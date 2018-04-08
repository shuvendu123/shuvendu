package constrocter;

public class TestConstructor {
	int a;
	int b;
	TestConstructor() {
		System.out.println("Default constructor ");
	}
	TestConstructor(int a) {
		this.a=a;
	//	this.b=b;
		System.out.println("Parameterize constructor ");
	}
	TestConstructor(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("Parameterize constructor ");
	}
	public void sum()
	{
		int c=a+b;
		System.out.println("sum of two number is :"+" "+c);
	}
	public void display()
	{
		System.out.println("default value of a:"+"  "+ a);
	}
	public static void main(String[] args) {
		TestConstructor obj1=new TestConstructor();
		obj1.display();
		TestConstructor obj=new TestConstructor(10);
		obj.display();
		
		TestConstructor obj3=new TestConstructor(10,5);
		obj3.sum();
	}
}
