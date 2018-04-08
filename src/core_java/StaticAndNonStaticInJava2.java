package core_java;

public class StaticAndNonStaticInJava2
{
	int i;
	static int j;
	//in non static method we have call static and non static variable 
	public void test()
	{
		System.out.println(j);
		System.out.println(i);
	}
	public static void test2()
	{
		//System.out.println(i);
	  System.out.println(j);	
	}

}
