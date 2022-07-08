package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PriceOptionTab {
	
	WebDriver driver;
	
	// selectors
	By ultimate_option = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(4) > span");
	By price_option_next_button = By.cssSelector("#nextsendquote");

	
	// constructor
	public PriceOptionTab(WebDriver driver) {
		this.driver = driver;
	}
	
	// methods
	
	public void waitAndClickUltimateOption() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ultimate_option));
		driver.findElement(ultimate_option).click();
	}
	
	public void waitAndClicPriceOptionTabNextButton() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(price_option_next_button));
		driver.findElement(price_option_next_button).click();
	}
	

	
}