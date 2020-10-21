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

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/button_LOG IN'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Login to your Isha Profile/div_Or, Login using Email ID'))

WebUI.setText(findTestObject('Object Repository/Navigation/Page_Login to your Isha Profile/input_Login using your email_email'), 
    'ashabc.bc@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Navigation/Page_Login to your Isha Profile/input_Email_txtPassword'), 
    'aipkg3AkVw9ygKoi50PAqg==')

WebUI.click(findTestObject('Object Repository/Navigation/Page_Login to your Isha Profile/a_Login'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/span_My Sessions (1)'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/div_.vc-container .ytp-time-display   displ_0a16ee'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/div_What is the difference between hallucin_ac0c6f'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/footer_2019. Inner Engineering Terms and Co_2ec528'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/span_Bonus Videos'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/div_Bonus videos will be available after co_8e2443'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/i_Skip _lni-close'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/span_Help'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/h2_FAQ'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/section_Accreditation                      _a395f4'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/footer_2019. Inner Engineering Terms and Co_2ec528'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/span_Asha  Vin'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/a_Edit Profile'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/div_First Name                             _db4e02'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/footer_2019. Inner Engineering Terms and Co_2ec528'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/span_Asha  Vin'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/span_Next Steps'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/div_Next Steps                             _0d649d'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/div_Other Programs                         _94935b'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/span_Asha  Vin'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/span_Donate'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/div_It is Sadhgurus vision to raise human c_1933aa'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/i_Privacy Policy_lni-close'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/span_Asha  Vin'))

WebUI.click(findTestObject('Object Repository/Navigation/Page_Isha Foundation  Online Classes/span_Sign Out'))

WebUI.closeBrowser()

