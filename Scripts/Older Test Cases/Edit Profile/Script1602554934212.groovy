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

WebUI.callTestCase(findTestCase('Older Test Cases/IEO Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Isha Foundation  Online Classes/a_Asha  Vin                                _aa1da2'))

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Isha Foundation  Online Classes/span_Edit Profile'))

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Isha Foundation  Online Classes/input_Street_street'))

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Isha Foundation  Online Classes/input_Street_street'))

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Isha Foundation  Online Classes/input_Street_street'), 
    street)

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Isha Foundation  Online Classes/input_Street 2_add2'))

//WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Isha Foundation  Online Classes/input_Street 2_add2'), 
//    street 2)

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Isha Foundation  Online Classes/input_Street_street'))

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Isha Foundation  Online Classes/input_City _city'), city)

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Isha Foundation  Online Classes/input_Zip _zip'), zip)

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Isha Foundation  Online Classes/input_State _u-state-text'), 
    state)

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Isha Foundation  Online Classes/span_Male'))

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Isha Foundation  Online Classes/input_Mobile Phone _pPhone'), 
    mobile phone)

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Isha Foundation  Online Classes/input_Profession_profession'))

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Isha Foundation  Online Classes/input_Profession_profession'), 
    profession)

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Isha Foundation  Online Classes/input_Company_company'), 
    company)

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Isha Foundation  Online Classes/div_Company_col-md-12 pl-0 mt-50'))

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Isha Foundation  Online Classes/input_Company_font-weight-bold font-size-16_d8998a'))

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Isha Foundation  Online Classes/div_Profile Updated'))

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Isha Foundation  Online Classes/i_Asha  Vin_fa fa-angle-down'))

WebUI.click(findTestObject('Object Repository/Edit Profile/Page_Isha Foundation  Online Classes/span_Sign Out'))

WebUI.closeBrowser()

