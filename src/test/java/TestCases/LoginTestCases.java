package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.LoginPage;

public class LoginTestCases extends TestBase {

    LoginPage login= new LoginPage();

    @BeforeMethod
    public void setup() throws Exception {
    	initalization();
        login = new LoginPage();
    }

@Test (enabled = true,priority =1)
    public void WelcomeHeadingTest() throws Exception {
        login.verifyWelcomeHeading();
        System.out.println("Done");
    }

@Test (enabled = false,priority =2)
    public void verifyUsernameTest() throws Exception {
        login.verifyUsername();
    }

@Test (enabled = false,priority =3)
    public void PasswordTest() {
        login.verifyPassword();
    }

@Test (enabled = false,priority =4)
    public void SigninButtonTest() throws Exception {
        login.verifySigninButton();
    }

@Test (enabled = false,priority =5)
    public void loginToAppTest() throws Exception {
        login.loginToApp();
    }

@AfterMethod
    public void tearDown() {
    	driver.close();
    }
}
