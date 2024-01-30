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

//WebUI.openBrowser('')
//WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
//WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))
//WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_username'), UserName)

//WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_password'), Password)

//WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_form-control'))
WebUI.callTestCase(findTestCase('Test Cases/TC_CURA_Login_001'), [('UserName') : 'John Doe', ('Password') : 'ThisIsNotAPassword'],
	FailureHandling.STOP_ON_FAILURE)


//WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.verifyOptionSelectedByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', false, 20)

// CustomKeywords.'com.example.WebUICustomKeywords.CheckDropDownListElementExist'(findTestObject, null)
CustomKeywords.'com.example.WebUICustomKeywords.printHello'()

//WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_hospital_readmission'))
unchecked = WebUI.verifyElementNotChecked(findTestObject('Object Repository/Page_CURA Healthcare Service/input_hospital_readmission'), 
    0)

if (unchecked == true) {
    System.out.println('element uncheckeck')

    WebUI.check(findTestObject('Object Repository/Page_CURA Healthcare Service/input_hospital_readmission'))

    System.out.println('element checkeck')
}

WebUI.delay(3)

WebUI.verifyElementChecked(findTestObject('Object Repository/Page_CURA Healthcare Service/input_hospital_readmission'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_programs'))

WebUI.check(findTestObject('Object Repository/Page_CURA Healthcare Service/input_programs'))

'Check the None Radio Button'
WebUI.verifyElementChecked(findTestObject('Object Repository/Page_CURA Healthcare Service/input_programs'), 30)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/span_glyphicon glyphicon-calendar'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/td_16'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'))

//WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/TL_TC_AppointmentConfirmation'), true)

//Present = WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Appointment Confirmation'), 
   // 'Appointment Confirmation')

//if (Present == true) {
//    System.out.println('Appointment Confirmed')
//}

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Appointment Confirmation'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Go to Homepage'))

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

