import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.clio.com/')

WebUI.click(findTestObject('Login/a_Login'))

WebUI.click(findTestObject('Login/a_Sign in to Clio Manage'))

WebUI.setText(findTestObject('Login/input_Email_email'), UserEmail)

WebUI.click(findTestObject('Login/button_Next Password'))

WebUI.setText(findTestObject('Login/input_Show_password'), UserPassword)

'Recapcha :)'
WebUI.click(findTestObject('Login/input_Cancel_commit'))

WebUI.verifyElementVisible(findTestObject('Login/span_Personal Dashboard'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Feature New Time Entry/a_Activities'))

WebUI.click(findTestObject('Feature New Time Entry/button_New time entry'))

WebUI.setText(findTestObject('Feature New Time Entry/input__activityTimeEntryMatter_input'), '00001-alwabaru')

WebUI.setText(findTestObject('Feature New Time Entry/input__timeEntryDatePicker'), '09/18/2024')

WebUI.setText(findTestObject('Feature New Time Entry/input__userFieldAutocomplete_input'), 'Alwazir Fitrah')

WebUI.setText(findTestObject('Feature New Time Entry/input__rateField'), Rate)

WebUI.click(findTestObject('Feature New Time Entry/button_Save entry'))

WebUI.verifyElementVisible(findTestObject('Login/a_Dashboard'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Login/UserAccount'))

WebUI.click(findTestObject('Login/a_Sign out'))

WebUI.closeBrowser()

