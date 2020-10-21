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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa-ieo.innerengineering.com/ieo/v4/')

WebUI.click(findTestObject('Object Repository/Page_Isha Foundation  Online Classes/button_LOG IN'))

WebUI.click(findTestObject('Object Repository/Page_Login to your Isha Profile/div_Or, Login using Email ID'))

WebUI.setText(findTestObject('Object Repository/Page_Login to your Isha Profile/input_Login using your email_email'), 'ashabc.bc@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login to your Isha Profile/input_Email_txtPassword'), 'aipkg3AkVw9ygKoi50PAqg==')

WebUI.click(findTestObject('Object Repository/Page_Login to your Isha Profile/a_Login'))

