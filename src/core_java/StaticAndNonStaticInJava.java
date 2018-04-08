package core_java;

public class StaticAndNonStaticInJava 
{
  //when we say static member is class member.
  //when we say nonStatic member is object member.
	int a;
	int b;
	static int x;
	static int y;
	public static void test1()
	{
		System.out.println("test1 static");
	}
	public void test2()
	{
		System.out.println("test2 non static");
	}
	public void test3()
	{
		System.out.println("test3 non static");
	}
	public static void test4()
	{
		System.out.println("rest4 static");
	}
	public static void main(String[] args) 
	{
		StaticAndNonStaticInJava obj=new StaticAndNonStaticInJava();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.test2();
		obj.test3();
		StaticAndNonStaticInJava.test1();
		StaticAndNonStaticInJava.test4();
		System.out.println(StaticAndNonStaticInJava.x);
		System.out.println(StaticAndNonStaticInJava.y);
	}
}
