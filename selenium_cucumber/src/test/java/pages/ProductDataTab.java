package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDataTab {
	
	WebDriver driver;

	// selectors
	
	By start_date_field = By.cssSelector("#startdate");
	By insurance_sum_option = By.cssSelector("#insurancesum > option:nth-child(4)");
	By merit_rating_option = By.cssSelector("#meritrating > option:nth-child(10)");
	By damage_insurance_option = By.cssSelector("#damageinsurance > option:nth-child(4)");
	By optional_products_option = By.cssSelector("#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");
	By courtesy_car_option = By.cssSelector("#courtesycar > option:nth-child(3)");
	By next_product_data_button = By.cssSelector("#nextselectpriceoption");
	
	// constructor
	
	public ProductDataTab(WebDriver driver) {
		this.driver = driver;
	}
	
	// methods
	
	public void waitAndFillStartDate(String dateMMDDYYYY) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(start_date_field));
		driver.findElement(start_date_field).sendKeys(dateMMDDYYYY);
	}
	
	public void waitAndClickInsuranceSumOption() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(insurance_sum_option));
		driver.findElement(insurance_sum_option).click();
	}
	
	public void waitAndClickMeritRatingOption() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(merit_rating_option));
		driver.findElement(merit_rating_option).click();
	}
	

	public void waitAndClickDamageInsuranceOption() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(damage_insurance_option));
		driver.findElement(damage_insurance_option).click();
	}
	
	public void waitAndClickOptionalProductsOption() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(optional_products_option));
		driver.findElement(optional_products_option).click();
	}
	
	
	public void waitAndClickCourtesyCarOption() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(courtesy_car_option));
		driver.findElement(courtesy_car_option).click();
	} 
	
	public void waitAndClickProductDataNextButton() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(next_product_data_button));
		driver.findElement(next_product_data_button).click();
	}
	
	
	
}
