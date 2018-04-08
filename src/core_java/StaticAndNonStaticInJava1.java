package core_java;

public class StaticAndNonStaticInJava1
{
	public static void main(String[] args) 
	{
		//non static
		StaticAndNonStaticInJava obj=new StaticAndNonStaticInJava();
		obj.test2();
		obj.test3();
		
		//static
		StaticAndNonStaticInJava.test1();
		StaticAndNonStaticInJava.test4();
		
		//non static
		StaticAndNonStaticInJava obj1=new StaticAndNonStaticInJava();
		obj1.test2();
		obj1.test3();
		
		//static
		StaticAndNonStaticInJava.test1();
		StaticAndNonStaticInJava.test4();
				
		
	}

}
