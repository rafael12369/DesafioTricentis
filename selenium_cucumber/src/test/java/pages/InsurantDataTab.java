package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InsurantDataTab {
	
	WebDriver driver;
	
	// selectors
	By first_name_field = By.cssSelector("#firstname");
	By last_name_field = By.cssSelector("#lastname");
	By birthdate_field = By.cssSelector("#birthdate");
	By gender_male_option = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span");
	By street_address = By.cssSelector("#streetaddress");
	By country_brazil_option = By.cssSelector("#country > option:nth-child(32)");
	By zip_code_field = By.cssSelector("#zipcode");
	By city_field = By.cssSelector("#city");
	By occupation_unemployed_option = By.cssSelector("#occupation > option:nth-child(5)");
	By hobbies_speeding_option = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");
	By website_field = By.cssSelector("#website");
	By next_insurant_data_button = By.cssSelector("#nextenterproductdata");
	
	// constructor
	public InsurantDataTab(WebDriver driver) {
		this.driver = driver;
	}
	
	
	// methods
	public void waitAndFillFirstName(String firstname) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(first_name_field));
		driver.findElement(first_name_field).sendKeys(firstname);
	}
	
	public void waitAndFillLastName(String lastname) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(last_name_field));
		driver.findElement(last_name_field).sendKeys(lastname);
	}
	
	public void waitAndFillBirthdate(String mmddyyyy) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(birthdate_field));
		driver.findElement(birthdate_field).sendKeys(mmddyyyy);
	}

	public void waitAndClickGenderMale() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(gender_male_option));
		driver.findElement(gender_male_option).click();
	}
	
	public void waitAndFillStreetAddress(String streetAddress) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(street_address));
		driver.findElement(street_address).sendKeys(streetAddress);
	}
	
	public void waitAndClickCountryOption() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(country_brazil_option));
		driver.findElement(country_brazil_option).click();
	} 
	
	public void waitAndFillZipCode(String zipcode) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(zip_code_field));
		driver.findElement(zip_code_field).sendKeys(zipcode);
	} 
	
	public void waitAndFillCity(String city) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(city_field));
		driver.findElement(city_field).sendKeys(city);
	} 
	
	public void waitAndClickOccupationOption() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(occupation_unemployed_option));
		driver.findElement(occupation_unemployed_option).click();
	} 
	
	public void waitAndClickSpeendingHobby() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(hobbies_speeding_option));
		driver.findElement(hobbies_speeding_option).click();
	}
	
	public void waitAndFillWebsite(String website) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(website_field));
		driver.findElement(website_field).sendKeys(website);
	}
		
	public void waitAndClickInsurantDataTabNextButton() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(next_insurant_data_button));
		driver.findElement(next_insurant_data_button).click();
	
	}
	
}
