package newpackage
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class registration {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User open Web browser and navigate to the Website")
	def open_browser() {
		WebUI.openBrowser("https://demo.wpeverest.com/user-registration/form-3/")
	}

	@When("user type (.*) and (.*)")
	def fullname(String First_Name, String Last_Name) {
		WebUI.setText(findTestObject('Object Repository/Page_Advanced Form  User Registration/input_First Name_first_name'),First_Name)
		WebUI.setText(findTestObject('Object Repository/Page_Advanced Form  User Registration/input_Last Name_last_name'),Last_Name)
	}

	@And("User type (.*) and (.*) and (.*) and (.*)")
	def Details(String user_email, String website, String password, String con_password) {
		WebUI.setText(findTestObject('Object Repository/Page_Advanced Form  User Registration/input__user_email'),user_email)
		WebUI.setText(findTestObject('Object Repository/Page_Advanced Form  User Registration/input_Website_user_url'),website)
		WebUI.setText(findTestObject('Object Repository/Page_Advanced Form  User Registration/input__user_pass'),password)
		WebUI.setText(findTestObject('Object Repository/Page_Advanced Form  User Registration/input_Confirm Password_user_confirm_password'),con_password)
	}

	@And("User Click the Check box")
	def check() {
		WebUI.check(findTestObject('Object Repository/Page_Advanced Form  User Registration/input_Checkbox_check_box_1530100860'))
	}

	@And("user Click on Radio button")
	def radio() {
		WebUI.check(findTestObject('Object Repository/Page_Advanced Form  User Registration/input_Radio_radio_1530100861'))
	}

	@And("User Select (.*)")
	def country(String country) {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/countryselect'),country,false)
	}

	@And("User choose a Number (.*)")
	def number(String number) {
		WebUI.setText(findTestObject('Object Repository/Page_Advanced Form  User Registration/input_Number_number_box_1507716030'),number)
	}

	@And("User select (.*)")
	def option(String option) {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Advanced Form  User Registration/select_Option1Option 2Option 3'),option, false)
	}

	@And("the User enters some Text (.*)")
	def text(String text) {
		WebUI.sendKeys(findTestObject('Object Repository/Page_Advanced Form  User Registration/input_Input Field_input_box_1507714764'),text)
	}

	@And("User click on Submit button")
	def submit() {
		WebUI.click(findTestObject('Object Repository/Page_Advanced Form  User Registration/button_Submit'))
	}

	@Then("User should be complete the registration")
	def verify_submit() {
		WebUI.verifyTextPresent('successfully', false)
	}
}