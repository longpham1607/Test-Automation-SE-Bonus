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

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Site administration'))

WebUI.click(findTestObject('Object Repository/Page_moodle Administration Search/a_Users'))

WebUI.click(findTestObject('Object Repository/Page_moodle Administration Search/a_Browse list of users'))

WebUI.click(findTestObject('Object Repository/Page_moodle Administration Users Accounts B_dce4f5/a_long pham'))

WebUI.click(findTestObject('Object Repository/Page_long pham Public profile/a_Users'))

WebUI.click(findTestObject('Object Repository/Page_moodle Participants/i_hoangson123gmail.com_icon fa fa-pencil fa-fw'))

WebUI.click(findTestObject('Object Repository/Page_moodle Participants/span_'))

WebUI.click(findTestObject('Object Repository/Page_moodle Participants/i_concat(Nguyen Hoang Son, , s role assignm_359be3'))

WebUI.closeBrowser()

