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
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.codehaus.groovy.tools.shell.completion.KeywordSyntaxCompletor
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement
import com.kms.katalon.core.util.KeywordUtil

WebUI.openBrowser('')
WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:8080/logiwaste-controlsystem/#/login')

WebUI.setText(findTestObject('Alarm/Page_Logiwaste Control System/input_Username'), 'logiwaste@gmail.com')

WebUI.setEncryptedText(findTestObject('Alarm/Page_Logiwaste Control System/input_Password'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Alarm/Page_Logiwaste Control System/button_Login'))

WebUI.delay(5)

/*WebElement terminal = WebUiCommonHelper.findWebElement(findTestObject('Alarm/Page_Logiwaste Control System/main-Terminal'),30)

WebUI.executeJavaScript("arguments[0].click()", terminal)*/

WebUI.click(findTestObject('Object Repository/Alarm/Page_Logiwaste Control System/main-svg'))

/*Generate Alarm from Overview for AirInlet Valve and verify the same in Alarm section*/

WebUI.click(findTestObject('Alarm/Page_Logiwaste Control System/main-airInletValve'))

			/*WebUI.click(findTestObject('Alarm/Page_Logiwaste Control System/servicemode_popup'))*/
						
			/*Open Service Mode popup*/
			WebUI.click(findTestObject('Object Repository/ServiceMode/Page_Logiwaste Control System/ToggleButton_ServiceMode'))
			
			/*Accept Service Mode popup*/
			WebUI.click(findTestObject('Object Repository/ServiceMode/Page_Logiwaste Control System/button_Confirm_ServiceMode'))
			
			/*Close Service Mode popup*/
			/*WebUI.click(findTestObject('Object Repository/ServiceMode/Page_Logiwaste Control System/ToggleButton_ServiceMode'))*/
			
			WebUI.click(findTestObject('Object Repository/ServiceMode/Page_Logiwaste Control System/button_Component_Close'))
	
	
	
WebUI.click(findTestObject('Object Repository/CS_Login_OR/Page_Logiwaste Control System/span_Alarms'))

	servicecode1 = WebUI.getText(findTestObject('Alarm/Page_Logiwaste Control System/alarm-code-column'))
	servicename1 = WebUI.getText(findTestObject('Alarm/Page_Logiwaste Control System/alarm-name-column'))
	servicedes1 = WebUI.getText(findTestObject('Alarm/Page_Logiwaste Control System/alarm-description-column'))
	
		if (WebUI.verifyMatch(servicecode1, 'B:3', true) || WebUI.verifyMatch(servicename1, 'A1-AV', true) || WebUI.verifyMatch(servicedes1, 'Notification: Component is in service mode.', true))  {
		
					KeywordUtil.logInfo("On Alarm page, alarm is generated for:" + servicename1 + "(" + servicedes1 +")")
					
					WebUI.click(findTestObject('Alarm/Page_Logiwaste Control System/alarm_acknowledge_checkbox'))
					WebUI.click(findTestObject('Alarm/Page_Logiwaste Control System/alarm_fixed_checkbox'))
					KeywordUtil.logInfo("Alarms page find and clicked on it. Also acknowledge and fixed the alarms")
					
				}	else {
						KeywordUtil.logInfo("On Alarm page, alarm is not generated for:" + servicename1 + "(" + servicedes1 +")")
			}
				

WebUI.click(findTestObject('Object Repository/Alarm/Page_Logiwaste Control System/a_Log Out'))

WebUI.closeBrowser()

