package testNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest 
{
 @DataProvider(name="data")
 public Object[][] dataProvidertest()
 {
	 Object[][] obj=new Object[3][2];
	 obj[0][0]="UserName1";
	 obj[0][1]="Password1";
	 
	 obj[1][0]="UserName1";
	 obj[1][1]="Password1";
	 
	 obj[2][0]="UserName1";
	 obj[2][1]="Password1";
	 
	 return obj;
 }
 @Test(dataProvider="data")
 public void test(String a,String b)
 {
	 System.out.println("username"+"password");
 }
 
}
