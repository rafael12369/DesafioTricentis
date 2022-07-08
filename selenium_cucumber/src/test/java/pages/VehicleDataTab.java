package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VehicleDataTab {
	
	WebDriver driver;
	
	
	// selectors
	
	By make_field_bmw_option = By.cssSelector("#make > option:nth-child(3)");
	By model_field_motorcycle_option = By.cssSelector("#model > option:nth-child(5)");
	By cylinder_field = By.cssSelector("#cylindercapacity");
	By engine_field = By.cssSelector("#engineperformance");
	By date_of_manufacture = By.cssSelector("#dateofmanufacture");
	By number_of_seats_field_2 = By.cssSelector("#numberofseats > option:nth-child(3)");
	By right_hand_option = By.cssSelector("#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(1) > span");
	By number_of_seats_motorcycle_field = By.cssSelector("#numberofseatsmotorcycle > option:nth-child(3)");
	By fuel_type_field = By.cssSelector("#fuel > option:nth-child(2)");
	By payload_field = By.cssSelector("#payload");
	By total_weight_field = By.cssSelector("#totalweight");
	By list_price_field = By.cssSelector("#listprice");
	By license_plate_field = By.cssSelector("#licenseplatenumber");
	By annual_milleage_field = By.cssSelector("#annualmileage");
	By vehicle_data_next_button = By.cssSelector("#nextenterinsurantdata");
	
	
	// constructor
	
	public VehicleDataTab(WebDriver driver) {
		this.driver = driver;
	}
	
	// methods
	
	public void waitAndClickMakeFieldBmwOption() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(make_field_bmw_option));
		driver.findElement(make_field_bmw_option).click();
	}
	
	public void waitAndClickModelFieldMotorcycleOption() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(model_field_motorcycle_option));
		driver.findElement(model_field_motorcycle_option).click();
	
	}
	
	public void waitAndFillCylinderField(String cylinderNumber) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(cylinder_field));
		driver.findElement(cylinder_field).sendKeys(cylinderNumber);

	}

	public void waitAndFillEngineField(String engineNumber) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(engine_field));
		driver.findElement(engine_field).sendKeys(engineNumber);

	}
	
	public void waitAndFillDateOfManufactoryField(String dateMMDDYYYY) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(date_of_manufacture));
		driver.findElement(date_of_manufacture).sendKeys(dateMMDDYYYY);

	}
	
	public void waitAndClickNumberOfSeatsOption() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(number_of_seats_field_2));
		driver.findElement(number_of_seats_field_2).click();
		
	} 
	
	public void waitAndClickRightHandOption() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(right_hand_option));
		driver.findElement(right_hand_option).click();
		
	} 
	
	public void waitAndClickNumberOfSeatsOption2() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(number_of_seats_motorcycle_field));
		driver.findElement(number_of_seats_motorcycle_field).click();
		
	} 
	
	public void waitAndClickFuelTypePetrolOption() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(fuel_type_field));
		driver.findElement(fuel_type_field).click();

	}
	
	public void waitAndFillPayloadField(String payloadNumber) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(payload_field));
		driver.findElement(payload_field).sendKeys(payloadNumber);

	}
	
	public void waitAndFillTotalWeightField(String totalWeightNumber) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(total_weight_field));
		driver.findElement(total_weight_field).sendKeys(totalWeightNumber);
	
	}
	
	public void waitAndFillPriceField(String priceNumber) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(list_price_field));
		driver.findElement(list_price_field).sendKeys(priceNumber);
	
	}
	
	public void waitAndFillLicenseField(String licenseNumber) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(payload_field));
		driver.findElement(license_plate_field).sendKeys(licenseNumber);
	
	}
	
	public void waitAndFillAnnualMilleageField(String annualMilleageNumber) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(annual_milleage_field));
		driver.findElement(annual_milleage_field).sendKeys(annualMilleageNumber);
	
	}
	
	public void waitAndClickVehicleDataTabNextButton() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(vehicle_data_next_button));
		driver.findElement(vehicle_data_next_button).click();
	
	}
	
	
	

	
	
	
}
