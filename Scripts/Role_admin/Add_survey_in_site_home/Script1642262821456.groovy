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

WebUI.setText(findTestObject('Object Repository/Page_moodle1 Log in to the site/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_moodle1 Log in to the site/input_Password_password'), 'jvRAqNNay4UPzMtjgrqdBA==')

WebUI.click(findTestObject('Object Repository/Page_moodle1 Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Site home'))

WebUI.click(findTestObject('Object Repository/Page_moodle1/a_moodle1_action-menu-toggle-2'))

WebUI.click(findTestObject('Object Repository/Page_moodle1/a_Turn editing on'))

WebUI.click(findTestObject('Object Repository/Page_moodle1/span_Add an activity or resource'))

WebUI.click(findTestObject('Object Repository/Page_moodle1/img_Information about the SCORM package act_36b475'))

WebUI.setText(findTestObject('Object Repository/Page_Editing Survey/input_Name_name'), 'test create survey in site home')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Editing Survey/select_Choose.            ATTLS (20 item ve_6ae139'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Editing Survey/select_Choose.            ATTLS (20 item ve_6ae139'), 
    '5', true)

WebUI.click(findTestObject('Object Repository/Page_Editing Survey/input_Upon activity completion_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_test create survey in site home/input_What event surprised you most_btn btn_1c5d04'))

WebUI.click(findTestObject('Object Repository/Page_Survey saved/button_Continue'))

WebUI.closeBrowser()

