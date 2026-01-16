package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
 private WebDriver driver;
 
 By usernameTextbox=By.id("Email");
 By passwordTextbox=By.id("Password");
 By LoginButton=By.xpath("//button[text()='Log in']");
 
 
 public LoginPage(WebDriver driver)
 {
	this.driver=driver;
 }
 
 public void enterUsername(String username) {
	 driver.findElement(usernameTextbox).clear();
	 driver.findElement(usernameTextbox).sendKeys(username);
 }
 
 public void enterPassword(String password) {
	 driver.findElement(passwordTextbox).clear();
	 driver.findElement(passwordTextbox).sendKeys(password);
 }
 
 public void clickLogin() {
	 driver.findElement(LoginButton).click();
 }
 
}
