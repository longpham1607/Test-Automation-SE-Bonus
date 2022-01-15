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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/login/index.php')

WebUI.setText(findTestObject('Object Repository/Page_moodle1 Log in to the site/input_Username_username'), 'thanhtung')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_moodle1 Log in to the site/input_Password_password'), 'oc9LkzFykuvndJsPEFlM7g==')

WebUI.click(findTestObject('Object Repository/Page_moodle1 Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Calendar'))

WebUI.click(findTestObject('Object Repository/Page_moodle Calendar Detailed month view Ja_b2996f/div_No events, Saturday, 22 January        _e72aa9'))

WebUI.setText(findTestObject('Object Repository/Page_moodle Calendar Detailed month view Ja_b2996f/input_Event title_name'), 
    'Test add event on calendar')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_moodle Calendar Detailed month view Ja_b2996f/select_User            Course            Site'), 
    'course', true)

WebUI.click(findTestObject('Object Repository/Page_moodle Calendar Detailed month view Ja_b2996f/span_'))

WebUI.click(findTestObject('Object Repository/Page_moodle Calendar Detailed month view Ja_b2996f/li_Mon hoc'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_moodle Calendar Detailed month view Ja_b2996f/select_Mon hoc'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Page_moodle Calendar Detailed month view Ja_b2996f/button_Save'))

WebUI.closeBrowser()

