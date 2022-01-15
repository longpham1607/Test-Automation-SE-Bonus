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

WebUI.setText(findTestObject('Object Repository/Page_moodle1 Log in to the site/input_Username_username'), 'longpham1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_moodle1 Log in to the site/input_Password_password'), 'zJvTfOQanFbyjFg46cox5g==')

WebUI.click(findTestObject('Object Repository/Page_moodle1 Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Site home'))

WebUI.click(findTestObject('Object Repository/Page_moodle1/a_Mon hoc'))

WebUI.click(findTestObject('Object Repository/Page_Course Mon hoc/span_quiz_test'))

WebUI.click(findTestObject('Object Repository/Page_CS123 quiz_test/button_Attempt quiz now'))

WebUI.click(findTestObject('Object Repository/Page_CS123 quiz_test/input_Time limit_submitbutton'))

WebUI.setText(findTestObject('Object Repository/Page_quiz_test/input_Answer_q21_answer'), '20')

WebUI.click(findTestObject('Object Repository/Page_quiz_test/input_Answer_next'))

WebUI.click(findTestObject('Object Repository/Page_quiz_test Attempt summary/button_Submit all and finish'))

WebUI.click(findTestObject('Object Repository/Page_quiz_test Attempt summary/input_Once you submit, you will no longer b_7682fc'))

WebUI.closeBrowser()

