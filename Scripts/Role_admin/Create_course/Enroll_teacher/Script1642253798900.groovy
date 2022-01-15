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

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Site administration'))

WebUI.click(findTestObject('Object Repository/Page_moodle Administration Search/a_Courses'))

WebUI.click(findTestObject('Object Repository/Page_moodle Administration Search/a_Manage courses and categories'))

WebUI.click(findTestObject('Object Repository/Page_Course and category management/a_Mon hoc'))

WebUI.click(findTestObject('Object Repository/Page_Course and category management/a_Enrolled users'))

WebUI.click(findTestObject('Object Repository/Page_CS123 Participants/input_Participants_btn btn-secondary my-1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CS123 Participants/select_Manager            Teacher          _ffc00f'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Page_CS123 Participants/span_'))

WebUI.click(findTestObject('Object Repository/Page_CS123 Participants/small_tungdo123gmail.com'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CS123 Participants/select_pham long    longpham1gmail.com     _bc07f6'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Page_CS123 Participants/button_Enrol users'))

WebUI.closeBrowser()

