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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:8080/logiwaste-controlsystem/#/login')

WebUI.setText(findTestObject('Object Repository/Settings/Page_Logiwaste Control System/input_Email_j_username'), 'logiwaste@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Settings/Page_Logiwaste Control System/input_Password_j_password'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Settings/Page_Logiwaste Control System/input_Password_btn btn-theme pull-right'))

WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/MainMenu_Settings'))

/*WebUI.click(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/Dropdown_Option_0_EmailConfig'))

WebUI.click(findTestObject('Object Repository/Settings/Page_Logiwaste Control System/EmailConfig_SMTPHost_Value'))

WebUI.click(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/TextBox_SMTPHost'))*/

smtphost_value = WebUI.getText(findTestObject('Settings/Page_Logiwaste Control System/EmailConfig_SMTPHost_Value'))


WebUI.verifyMatch(smtphost_value, "smtp.office365.com", false, FailureHandling.STOP_ON_FAILURE)


WebUI.click(findTestObject('Object Repository/Settings/Page_Logiwaste Control System/a_Log Out'))

WebUI.closeBrowser()

