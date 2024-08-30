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

WebUI.setText(findTestObject('Object Repository/CS_Login_OR/Page_Logiwaste Control System/input_Email_j_username'), GlobalVariable.CSMaintenanceUsername, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Object Repository/CS_Login_OR/Page_Logiwaste Control System/input_Password_j_password'), GlobalVariable.CSMaintenancePassword, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CS_Login_OR/Page_Logiwaste Control System/input_Password_btn btn-theme pull-right'))

/*Verify the "Overview" link and respective data*/

if (WebUI.verifyTextPresent("Overview", false, FailureHandling.CONTINUE_ON_FAILURE) == true){
	WebUI.click(findTestObject('Object Repository/CS_Login_OR/Page_Logiwaste Control System/span_Overview'))
	WebUI.click(findTestObject('Object Repository/Alarm/Page_Logiwaste Control System/main-svg'))

	/*Verify the all components while clicking on their symbol which are showing on SVG after login*/
	/*Open Terminal & close*/
	WebUI.click(findTestObject('Object Repository/Alarm/Page_Logiwaste Control System/main-Terminal'))
	WebUI.click(findTestObject('Object Repository/Alarm/Page_Logiwaste Control System/main-svg-popup-cancelsymbol'))

	/*Open Shaft & close*/
	WebUI.click(findTestObject('Object Repository/Alarm/Page_Logiwaste Control System/main-shaft'))
	WebUI.click(findTestObject('Object Repository/Alarm/Page_Logiwaste Control System/main-svg-popup-cancelsymbol'))

	/*Open AirInlet Valve & close*/
	WebUI.click(findTestObject('Object Repository/Alarm/Page_Logiwaste Control System/main-airInletValve'))

	/*Open Service Mode popup*/
	WebUI.click(findTestObject('Object Repository/ServiceMode/Page_Logiwaste Control System/ToggleButton_ServiceMode'))

	/*Accept Service Mode popup*/
	WebUI.click(findTestObject('Object Repository/ServiceMode/Page_Logiwaste Control System/button_Confirm_ServiceMode'))

	/*Close Service Mode popup*/
	/*WebUI.click(findTestObject('Object Repository/ServiceMode/Page_Logiwaste Control System/ToggleButton_ServiceMode'))*/
	WebUI.click(findTestObject('Object Repository/ServiceMode/Page_Logiwaste Control System/button_Component_Close'))

		KeywordUtil.logInfo('Overview page find and clicked on it. Also, component popup opended successfully.')
	WebUI.click(findTestObject('Object Repository/CS_Login_OR/Page_Logiwaste Control System/span_Overview'))
	
	KeywordUtil.logInfo("Overview page find and clicked on it for Maintenanc :" + GlobalVariable.CSMaintenanceUsername)

} else {
	
	KeywordUtil.logInfo("Overview page didn't find")
}

/*Verify the "Alarm" link and respective data*/

if (WebUI.verifyTextPresent("Alarms", false, FailureHandling.CONTINUE_ON_FAILURE) == true){
	
	 WebUI.click(findTestObject('Object Repository/CS_Login_OR/Page_Logiwaste Control System/span_Alarms'))
		
		    /*Alarm verification which is generated in Overview*/
		    servicecode1 = WebUI.getText(findTestObject('Alarm/Page_Logiwaste Control System/alarm-code-column'))
		    servicename1 = WebUI.getText(findTestObject('Alarm/Page_Logiwaste Control System/alarm-name-column'))
		    servicedes1 = WebUI.getText(findTestObject('Alarm/Page_Logiwaste Control System/alarm-description-column'))
		
		    if ((WebUI.verifyMatch(servicecode1, 'B:3', true) || WebUI.verifyMatch(servicename1, 'A1-AV', true)) || WebUI.verifyMatch(
		        servicedes1, 'Notification: Component is in service mode.', true)) {
		        KeywordUtil.logInfo(((('On Alarm page, alarm is generated for:' + servicename1) + '(') + servicedes1) + ')')
		
		        WebUI.click(findTestObject('Alarm/Page_Logiwaste Control System/alarm_acknowledge_checkbox'))
		        WebUI.click(findTestObject('Alarm/Page_Logiwaste Control System/alarm_fixed_checkbox'))
		        KeywordUtil.logInfo('Alarms page find and clicked on it. Also acknowledge and fixed the alarms')
		
		        WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)
		    } else {
		        KeywordUtil.logInfo(((('On Alarm page, alarm is not generated for:' + servicename1) + '(') + servicedes1) + ')')
		    }

} else {
	
	KeywordUtil.logInfo("Alarms page didn't find")
}

/*Verify the "Reports" link and respective data*/

if (WebUI.verifyTextPresent("Reports", false, FailureHandling.CONTINUE_ON_FAILURE) == true){
	
	WebUI.click(findTestObject('Object Repository/CS_Report_OR/Page_Logiwaste Control System/a_Reports'))
		    WebUI.setText(findTestObject('Object Repository/CS_Report_OR/Page_Logiwaste Control System/input__reportingPeriodBegin'), '2020-08-01')
		    WebUI.setText(findTestObject('Object Repository/CS_Report_OR/Page_Logiwaste Control System/input__reportingPeriodEnd'),   '2020-08-10')
		    WebUI.click(findTestObject('Object Repository/CS_Report_OR/Page_Logiwaste Control System/div_Create a new Report'))
		    WebUI.click(findTestObject('Object Repository/CS_Report_OR/Page_Logiwaste Control System/button_Generate Report'))
		    KeywordUtil.logInfo('Reports page find and clicked on it. Also, report has been generated successfully')
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

