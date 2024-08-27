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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:8080/logiwaste-controlsystem/#/login')

WebUI.setText(findTestObject('Object Repository/UserCreate/Page_Logiwaste Control System/input_Email_j_username'), 'logiwaste@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/UserCreate/Page_Logiwaste Control System/input_Password_j_password'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/UserCreate/Page_Logiwaste Control System/input_Password_btn btn-theme pull-right'))

WebUI.click(findTestObject('Object Repository/UserCreate/Page_Logiwaste Control System/a_Users'))


if (WebUI.verifyTextPresent('adminuser@gmail.com', false, FailureHandling.OPTIONAL) == true) {
	KeywordUtil.logInfo('User is already exist')
	
	/*First delete the user*/
	
	WebUI.click(findTestObject('Object Repository/UserDelete/Page_Logiwaste Control System/a_AdminUser'))
	
	WebUI.click(findTestObject('Object Repository/UserDelete/Page_Logiwaste Control System/span_Delete User'))
	
	WebUI.click(findTestObject('Object Repository/UserDelete/Page_Logiwaste Control System/button_Delete'))
	
	/*Now create after delete*/
	
	WebUI.click(findTestObject('Object Repository/UserCreate/Page_Logiwaste Control System/a_Add new user'))
	
	WebUI.setText(findTestObject('Object Repository/UserCreate/Page_Logiwaste Control System/input__firstName'), Firstname)
	
	WebUI.setText(findTestObject('Object Repository/UserCreate/Page_Logiwaste Control System/input__lastName'), Lastname)
	
	WebUI.setText(findTestObject('Object Repository/UserCreate/Page_Logiwaste Control System/input__emailAddress'), Emailaddress)
	
	WebUI.setText(findTestObject('Object Repository/UserCreate/Page_Logiwaste Control System/input__emailAddress2'), Confirmemailaddress)
	
	WebUI.setEncryptedText(findTestObject('Object Repository/UserCreate/Page_Logiwaste Control System/input__password'), Password)
	
	WebUI.setEncryptedText(findTestObject('Object Repository/UserCreate/Page_Logiwaste Control System/input__password2'), Confirmpassword)
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/UserCreate/Page_Logiwaste Control System/select_AdministratorMaintenanceOperatorGues_59545b'),
		'number:1', true)
	
	WebUI.click(findTestObject('Object Repository/UserCreate/Page_Logiwaste Control System/button_Save'))
	
} else {
	KeywordUtil.logInfo('User is not exist, need to create')

	WebUI.click(findTestObject('Object Repository/UserCreate/Page_Logiwaste Control System/a_Add new user'))
	
	WebUI.setText(findTestObject('Object Repository/UserCreate/Page_Logiwaste Control System/input__firstName'), Firstname)
	
	WebUI.setText(findTestObject('Object Repository/UserCreate/Page_Logiwaste Control System/input__lastName'), Lastname)
	
	WebUI.setText(findTestObject('Object Repository/UserCreate/Page_Logiwaste Control System/input__emailAddress'), Emailaddress)
	
	WebUI.setText(findTestObject('Object Repository/UserCreate/Page_Logiwaste Control System/input__emailAddress2'), Confirmemailaddress)
	
	WebUI.setEncryptedText(findTestObject('Object Repository/UserCreate/Page_Logiwaste Control System/input__password'), Password)
	
	WebUI.setEncryptedText(findTestObject('Object Repository/UserCreate/Page_Logiwaste Control System/input__password2'), Confirmpassword)
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/UserCreate/Page_Logiwaste Control System/select_AdministratorMaintenanceOperatorGues_59545b'), 
	    'number:1', true)
	
	WebUI.click(findTestObject('Object Repository/UserCreate/Page_Logiwaste Control System/button_Save'))

}

WebUI.refresh()

if (WebUI.verifyTextPresent('adminuser@gmail.com', false, FailureHandling.OPTIONAL) == true) {
    KeywordUtil.logInfo('User is created successfully')
} else {
    KeywordUtil.logInfo('User is not created successfully')
}

WebUI.click(findTestObject('Object Repository/UserCreate/Page_Logiwaste Control System/a_Log Out'))

WebUI.closeBrowser()

