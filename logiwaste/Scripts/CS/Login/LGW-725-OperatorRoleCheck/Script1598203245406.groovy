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

WebUI.setText(findTestObject('Object Repository/CS_Login_OR/Page_Logiwaste Control System/input_Email_j_username'), GlobalVariable.CSOperatorUsername, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Object Repository/CS_Login_OR/Page_Logiwaste Control System/input_Password_j_password'), GlobalVariable.CSOperatorPassword, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CS_Login_OR/Page_Logiwaste Control System/input_Password_btn btn-theme pull-right'))

/*Verify the "Overview" link and respective data*/

if (WebUI.verifyTextPresent("Overview", false, FailureHandling.CONTINUE_ON_FAILURE) == true){
	
	WebUI.click(findTestObject('Object Repository/CS_Login_OR/Page_Logiwaste Control System/span_Overview'))
	
	/*Open Service Mode popup*/
		if (WebUI.verifyElementClickable(findTestObject('Object Repository/ServiceMode/Page_Logiwaste Control System/ToggleButton_ServiceMode'), FailureHandling.CONTINUE_ON_FAILURE) == true){
			KeywordUtil.logInfo("Can not move compoenent in service mode.")
		}else {
			KeywordUtil.logInfo("Can move compoenent in service mode.")
		}
		
	} else {
	
	KeywordUtil.logInfo("Overview page didn't find")
}

/*Verify the "Alarm" link and respective data*/

if (WebUI.verifyTextPresent("Alarms", false, FailureHandling.CONTINUE_ON_FAILURE) == true){
	
	WebUI.click(findTestObject('Object Repository/CS_Login_OR/Page_Logiwaste Control System/span_Alarms'))
	
	KeywordUtil.logInfo("Alarms page find and clicked on it.")

} else {
	
	KeywordUtil.logInfo("Alarms page didn't find")
}

/*Verify the "Reports" link and respective data*/

if (WebUI.verifyTextPresent("Reports", false, FailureHandling.CONTINUE_ON_FAILURE) == true){
	
	WebUI.click(findTestObject('Object Repository/CS_Report_OR/Page_Logiwaste Control System/a_Reports'))
		    WebUI.setText(findTestObject('Object Repository/CS_Report_OR/Page_Logiwaste Control System/input__reportingPeriodBegin'), '2020-07-01')
		    WebUI.setText(findTestObject('Object Repository/CS_Report_OR/Page_Logiwaste Control System/input__reportingPeriodEnd'),   '2020-08-10')
		    WebUI.click(findTestObject('Object Repository/CS_Report_OR/Page_Logiwaste Control System/div_Create a new Report'))
		    WebUI.click(findTestObject('Object Repository/CS_Report_OR/Page_Logiwaste Control System/button_Generate Report'))
		    KeywordUtil.logInfo('Reports page find and clicked on it. Also, report has been generated successfully with User :' + GlobalVariable.CSOperatorUsername)
	
} else {
	
	KeywordUtil.logInfo("Reports page didn't find")
}

/*Verify the "Operations = Emptying from GUI" link and respective data*/

if (WebUI.verifyTextPresent("Operations", false, FailureHandling.CONTINUE_ON_FAILURE) == true){
	
	WebUI.click(findTestObject('Object Repository/CS_Login_OR/Page_Logiwaste Control System/span_Operations'))
	
	KeywordUtil.logInfo("Operations page find and clicked on it.")

} else {
	
	KeywordUtil.logInfo("Operations page didn't find")
}

WebUI.verifyTextNotPresent("Programs", false, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CS_Login_OR/Page_Logiwaste Control System/span_Log Out'))

WebUI.closeBrowser()