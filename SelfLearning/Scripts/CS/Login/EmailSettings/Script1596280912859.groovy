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

import org.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi.sm3WithSM2
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:8080/logiwaste-controlsystem/#/login')

WebUI.setText(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/input_Email_j_username'), 'logiwaste@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/input_Password_j_password'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/input_Password_btn btn-theme pull-right'))

WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/MainMenu_Settings'))


/*commented code for Email-configuration*/
/*WebUI.click(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/TextBox_SMTPHost'))
		
		WebUI.setText(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/TextBox_SMTPHost'), GlobalVariable.CSEmailConfig_SMTPHost)
		
		WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/Save_SMTPHost'))
		
		WebUI.click(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/TextBox_Username'))
		
		WebUI.setText(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/TextBox_Username'), GlobalVariable.CSEmailConfig_Username)
		
		WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/Save_Username'))
		
		WebUI.click(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/TextBox_Password'))
		
		WebUI.setEncryptedText(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/TextBox_Password'), GlobalVariable.CSEmailConfig_Password)
		
		WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/Save_Password'))
		
		WebUI.click(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/TextBox_Port'))
		
		WebUI.setText(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/TextBox_Port'), GlobalVariable.CSEmailConfig_Port)
		
		WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/Save_Port'))
		
		WebUI.click(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/TextBox_Postfix'))
		
		WebUI.setText(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/TextBox_Postfix'), GlobalVariable.CSEmailConfig_PostfixText)
		
		WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/Save_Postfix'))
		
		WebUI.click(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/TextBox_Prefix'))
		
		WebUI.setText(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/TextBox_Prefix'), GlobalVariable.CSEmailConfig_PrefixText)
		
		WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/Save_Prefix'))
		
		WebUI.click(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/TextBox_Sender'))
		
		WebUI.setText(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/TextBox_Sender'), GlobalVariable.CSEmailConfig_Sender)
		
		WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/Save_Sender'))
		
		WebUI.click(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/TextBox_EmailSubject'))
		
		WebUI.setText(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/TextBox_EmailSubject'), GlobalVariable.CSEmailConfig_EmailSubject)
		
		WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/Save_EmailSubject'))
		
		WebUI.click(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/TextBox_Interval'))
		
		WebUI.setText(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/TextBox_Interval'), GlobalVariable.CSEmailConfig_Interval)
		
		WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/Save_Interval'))*/


WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/dropdown_settings'))

WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/Dropdown_Option_3_EmailList'))

WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/button_Add_EmailList'))

WebUI.click(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/span_Action_lw-checkmark'))

WebUI.setText(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/input_Action_user'), GlobalVariable.CSEmailListName)

WebUI.setText(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/input_Action_email'), GlobalVariable.CSEmailListAddress)

WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/AlarmType_A_Combo'))

WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/AlarmType_A_CommunicationLost'))

WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/AlarmType_B_Combo'))

WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/AlarmType_B_ServiceMode'))

WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/AlarmType_C_Combo'))

WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/AlarmType_C_BufferAlmostFull'))

WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/Click_OtherPlaceOfEmailList'))

WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/button_Save_EmailList'))

WebUI.refresh()




/*Again click on Settings Dropdown and select Email-List*/
WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/MainMenu_Settings'))
WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/Dropdown_Settings'))
WebUI.click(findTestObject('EmailSettings/Page_Logiwaste Control System/Dropdown_Option_3_EmailList'))

email = WebUI.getText(findTestObject('EmailSettings/Page_Logiwaste Control System/input_Action_email'))
/*Verify the added email address that is existing ot not*/

if (WebUI.verifyMatch(email, 'manoj.kumar@logiwaste.se', true)){
	KeywordUtil.logInfo("Added Email address:" + GlobalVariable.CSEmailListAddress)
} else {
	KeywordUtil.logInfo("Added email addres is not displaying")

}


WebUI.click(findTestObject('Object Repository/EmailSettings/Page_Logiwaste Control System/a_Log Out'))

WebUI.closeBrowser()
