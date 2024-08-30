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
		
		WebUI.setText(findTestObject('Object Repository/611/Page_Logiwaste Control System/input_Email_j_username'), 'logiwaste@gmail.com')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/611/Page_Logiwaste Control System/input_Password_j_password'), 'tzH6RvlfSTg=')
		
		WebUI.click(findTestObject('Object Repository/611/Page_Logiwaste Control System/input_Password_btn btn-theme pull-right'))
		
		WebUI.click(findTestObject('611/Page_Logiwaste Control System/Settings_MainMenu'))
		
		WebUI.click(findTestObject('611/Page_Logiwaste Control System/Settings_Email-Config_DropDownOption'))
		
		WebUI.click(findTestObject('Object Repository/611/Page_Logiwaste Control System/a_Email-List'))
		
		WebUI.click(findTestObject('611/Page_Logiwaste Control System/EmailList_Add_NewRow_Button'))
		
		WebUI.click(findTestObject('611/Page_Logiwaste Control System/EmailList_Status_CheckBox'))
		
		WebUI.setText(findTestObject('611/Page_Logiwaste Control System/EmailList_Name_TextBox'), 'Manoj1')
		
		WebUI.setText(findTestObject('611/Page_Logiwaste Control System/EmailList_Address_TextBox'), 'manoj.kumar@logiwaste.se')
		
		WebUI.click(findTestObject('611/Page_Logiwaste Control System/EmailList_Save_Button'))
		
			if (WebUI.verifyTextPresent('Manoj1', false, FailureHandling.OPTIONAL)== true && WebUI.verifyTextPresent('manoj.kumar@logiwaste.se', false, FailureHandling.OPTIONAL)== true){
				println ("Added name saved successfully")
			} else {
				println ("Added name does not saved successfully")
			}
		WebUI.click(findTestObject('611/Page_Logiwaste Control System/EmailList_None selected_Button'))
		
		WebUI.click(findTestObject('Object Repository/611/Page_Logiwaste Control System/input'))
		
		WebUI.click(findTestObject('611/Page_Logiwaste Control System/EmailList_Save_Button'))
		
		WebUI.click(findTestObject('611/Page_Logiwaste Control System/EmailList_Status_CheckBox'))
		
		WebUI.click(findTestObject('611/Page_Logiwaste Control System/EmailList_Save_Button'))
		
		WebUI.click(findTestObject('Settings/Page_Logiwaste Control System/EmailList_Delete_Icon'))
		
		WebUI.click(findTestObject('611/Page_Logiwaste Control System/EmailList_Save_Button'))
		
		WebUI.closeBrowser()
