package BcdefProject;

import org.openqa.selenium.By;

public class LoginPage extends Utils {
    LoadProp loadProp = new LoadProp();

    //find locator for username,password,LoginButton

    private By _userName =By.xpath("//input[@id='Email']");
    private By _password =By.xpath("//input[@id='Password']");
    private By _LogInButton =By.xpath("//input[@class='button-1 longin-button]");

    //method enter username,password and click the Longin Button

    public void userFilleUserNamePaswordAndClickLoginButton(String Email,String Password){

        Utils.enterText(_userName,Email);
        Utils.enterText(_password,Password);
        Utils.clickElemenetBY(_LogInButton);
    }
}
