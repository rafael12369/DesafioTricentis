package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendQuoteTab {
	
	WebDriver driver;
	
	
	// selectors
	
	By email_field = By.cssSelector("#email");
	By phone_field = By.cssSelector("#phone");
	By username_field = By.cssSelector("#username");
	By password_field = By.cssSelector("#password");
	By confirm_password_field = By.cssSelector("#confirmpassword");
	By comments_field = By.cssSelector("#Comments");
	By send_button = By.cssSelector("#sendemail");
	By sending_email_sucesss_message = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2");
	

	// constructor
	
	public SendQuoteTab(WebDriver driver) {
		this.driver = driver;
	}
	
	// methods
	
	public void waitAndFillEmail(String email) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(email_field));
		driver.findElement(email_field).sendKeys(email);
	}
	
	public void waitAndFillPhone(String phone) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(phone_field));
		driver.findElement(phone_field).sendKeys(phone);
	}
	
	public void waitAndFillUsername(String username) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(username_field));
		driver.findElement(username_field).sendKeys(username);
	}
	
	public void waitAndFillPassword(String password) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(password_field));
		driver.findElement(password_field).sendKeys(password);
	}
	
	public void waitAndFillConfirmPassword(String confirmPassword) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(confirm_password_field));
		driver.findElement(confirm_password_field).sendKeys(confirmPassword);
	}
	
	public void waitAndFillComments(String comments) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(comments_field));
		driver.findElement(comments_field).sendKeys(comments);
	}
	
	public void waitAndClickSendButton() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(send_button));
		driver.findElement(send_button).click();
	}
	
	
	public void waitAndVerifyEmailSucessMessage() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(sending_email_sucesss_message));
		assertEquals("Sending e-mail success!", driver.findElement(sending_email_sucesss_message).getText());
	}
	

	
}