package testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamatersInTestNG 
{
    @Test
    @Parameters({"username","password"})
    public void loginTest(@Optional("usernameOptional")String username,@Optional("passwordOptional")String password)
    {
    	System.out.println("username is-"+username+"password is-"+password);
    }
}
