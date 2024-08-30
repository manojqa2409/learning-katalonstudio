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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.util.KeywordUtil



WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.ControlSystemURL)

WebUI.setText(findTestObject('Object Repository/CS_Login_OR/Page_Logiwaste Control System/input_Email_j_username'), GlobalVariable.CSAdminUsername, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Object Repository/CS_Login_OR/Page_Logiwaste Control System/input_Password_j_password'), 
    GlobalVariable.CSAdminPassword, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CS_Login_OR/Page_Logiwaste Control System/input_Password_btn btn-theme pull-right'))

if (WebUI.verifyTextPresent('Overview', false, FailureHandling.CONTINUE_ON_FAILURE) ==true) {
	WebUI.click(findTestObject('Object Repository/CS_Login_OR/Page_Logiwaste Control System/span_Overview'))
	KeywordUtil.logInfo("User is able to login successfully")

}else {
	
	KeywordUtil.logInfo("User is not able to login successfully")
	
}

WebUI.click(findTestObject('Object Repository/CS_Login_OR/Page_Logiwaste Control System/span_Log Out'))

WebUI.closeBrowser()

