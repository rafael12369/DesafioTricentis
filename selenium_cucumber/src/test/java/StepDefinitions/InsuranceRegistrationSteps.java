package StepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InsurantDataTab;
import pages.PriceOptionTab;
import pages.ProductDataTab;
import pages.SendQuoteTab;
import pages.VehicleDataTab;

public class InsuranceRegistrationSteps {
	
	String url;
	WebDriver driver;
	
	@Before
	public void setup() {
		url = "http://sampleapp.tricentis.com/101/app.php";
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chrome/103/chromedriver.exe");
		driver =  new ChromeDriver();
	}
	
	@After
	public void teardown() { 
		driver.quit();
	}
	
	@Given("the user opens the trincentis website")
	public void the_user_opens_the_trincentis_website() {
		driver.manage().window().maximize();
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("he fills in the form on the “Enter Vehicle Data” tab and press next")
	public void he_fills_in_the_form_on_the_enter_vehicle_data_tab_and_press_next() {
		VehicleDataTab vehicleDataTab = new VehicleDataTab(driver);
		vehicleDataTab.waitAndClickMakeFieldBmwOption();
		vehicleDataTab.waitAndClickModelFieldMotorcycleOption();
		vehicleDataTab.waitAndFillCylinderField("313");
		vehicleDataTab.waitAndFillEngineField("25");
		vehicleDataTab.waitAndFillDateOfManufactoryField("06/01/2022");
		vehicleDataTab.waitAndClickNumberOfSeatsOption();
		vehicleDataTab.waitAndClickRightHandOption();
		vehicleDataTab.waitAndClickNumberOfSeatsOption2();
		vehicleDataTab.waitAndClickFuelTypePetrolOption();
		vehicleDataTab.waitAndFillPayloadField("169");
		vehicleDataTab.waitAndFillTotalWeightField("344");
		vehicleDataTab.waitAndFillPriceField("5945");
		vehicleDataTab.waitAndFillLicenseField("1234");
		vehicleDataTab.waitAndFillAnnualMilleageField("22000");
		vehicleDataTab.waitAndClickVehicleDataTabNextButton();
	}

	@When("he fills in the form on the “Enter Insurant Data” tab and press next")
	public void he_fills_in_the_form_on_the_enter_insurant_data_tab_and_press_next() {
		InsurantDataTab insurantDataTab = new InsurantDataTab(driver);
		insurantDataTab.waitAndFillFirstName("Rafael");
		insurantDataTab.waitAndFillLastName("Martinez");
		insurantDataTab.waitAndFillBirthdate("05/01/2003");
		insurantDataTab.waitAndClickGenderMale();
		insurantDataTab.waitAndFillStreetAddress("Rua guilherme ribeiro de faria");
		insurantDataTab.waitAndClickCountryOption();
		insurantDataTab.waitAndFillZipCode("11674290");
		insurantDataTab.waitAndFillCity("Caraguatatuba");
		insurantDataTab.waitAndClickOccupationOption();
		insurantDataTab.waitAndClickSpeendingHobby();
		insurantDataTab.waitAndFillWebsite("https://www.linkedin.com/in/rafaelmartinezqa/");
		insurantDataTab.waitAndClickInsurantDataTabNextButton();
	}

	@When("he fills in the form on the “Enter Product Data” tab and press next")
	public void he_fills_in_the_form_on_the_enter_product_data_tab_and_press_next() {
		ProductDataTab productDataTab = new ProductDataTab(driver);
		productDataTab.waitAndFillStartDate("07/04/2023");
		productDataTab.waitAndClickInsuranceSumOption();
		productDataTab.waitAndClickMeritRatingOption();
		productDataTab.waitAndClickDamageInsuranceOption();
		productDataTab.waitAndClickOptionalProductsOption();
		productDataTab.waitAndClickCourtesyCarOption();
		productDataTab.waitAndClickProductDataNextButton();
	}

	@When("he fills in the form on the “Select Price Option” tab and press next")
	public void he_fills_in_the_form_on_the_select_price_option_tab_and_press_next() {
	   PriceOptionTab priceOptionTab = new PriceOptionTab(driver);
	   priceOptionTab.waitAndClickUltimateOption();
	   priceOptionTab.waitAndClicPriceOptionTabNextButton();	
	}

	@When("he fills in the form on the “Send Quote” tab and press send")
	public void he_fills_in_the_form_on_the_send_quote_tab_and_press_send() {
		SendQuoteTab sendQuoteTab = new SendQuoteTab(driver);
	    sendQuoteTab.waitAndFillEmail("rafaelmartinez.qa@gmail.com");
	    sendQuoteTab.waitAndFillPhone("12981787456");
	    sendQuoteTab.waitAndFillUsername("RafaelQA");
	    sendQuoteTab.waitAndFillPassword("RafaelQA12!");
	    sendQuoteTab.waitAndFillConfirmPassword("RafaelQA12!");
	    sendQuoteTab.waitAndFillComments("Hire me :D");
	    sendQuoteTab.waitAndClickSendButton();
	}

	@Then("he checks the message “Sending email successfully!” on the screen")
	public void he_checks_the_message_sending_email_successfully_on_the_screen() {
		SendQuoteTab sendQuoteTab = new SendQuoteTab(driver);
		sendQuoteTab.waitAndVerifyEmailSucessMessage();	
	}


	
}
