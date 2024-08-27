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
import com.kms.katalon.core.webui.common.WebUiCommonHelper

WebUI.openBrowser('')
WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:8080/logiwaste-controlsystem/#/login')

WebUI.setText(findTestObject('Object Repository/ServiceMode/Page_Logiwaste Control System/input_Email_j_username'), 'logiwaste@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/ServiceMode/Page_Logiwaste Control System/input_Password_j_password'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Alarm/Page_Logiwaste Control System/button_Login'))

WebUI.click(findTestObject('Object Repository/Alarm/Page_Logiwaste Control System/main-svg'))

WebUI.click(findTestObject('Alarm/Page_Logiwaste Control System/main-airInletValve'))

/*Open Service Mode popup*/
WebUI.click(findTestObject('Object Repository/ServiceMode/Page_Logiwaste Control System/ToggleButton_ServiceMode'))

/*Accept Service Mode popup*/
WebUI.click(findTestObject('Object Repository/ServiceMode/Page_Logiwaste Control System/button_Confirm_ServiceMode'))

/*Close Service Mode popup*/
WebUI.click(findTestObject('Object Repository/ServiceMode/Page_Logiwaste Control System/ToggleButton_ServiceMode'))

WebUI.click(findTestObject('Object Repository/ServiceMode/Page_Logiwaste Control System/button_Component_Close'))

WebUI.click(findTestObject('Object Repository/ServiceMode/Page_Logiwaste Control System/span_Log Out'))

WebUI.closeBrowser()

