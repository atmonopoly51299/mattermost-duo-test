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

WebUI.navigateToUrl('http://localhost:8065/')

WebUI.click(findTestObject('Object Repository/7_Account_Settings/Edit_Email/Page_1HDHFClGY4 - Bumblebee Mattermost/svg'))

WebUI.click(findTestObject('Object Repository/7_Account_Settings/Edit_Email/Page_1HDHFClGY4 - Bumblebee Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Object Repository/7_Account_Settings/Edit_Email/Page_1HDHFClGY4 - Bumblebee Mattermost/span_Edit'))

WebUI.setText(findTestObject('Object Repository/7_Account_Settings/Edit_Email/Page_1HDHFClGY4 - Bumblebee Mattermost/input_New Email_primaryEmail'), 
    'new_email@gmail.com')

WebUI.setText(findTestObject('Object Repository/7_Account_Settings/Edit_Email/Page_1HDHFClGY4 - Bumblebee Mattermost/input_Confirm Email_confirmEmail'), 
    'new_email@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/7_Account_Settings/Edit_Email/Page_1HDHFClGY4 - Bumblebee Mattermost/input_Current Password_currentPassword'), 
    'o2DLlA8X+7c=')

WebUI.click(findTestObject('Object Repository/7_Account_Settings/Edit_Email/Page_1HDHFClGY4 - Bumblebee Mattermost/span_Save'))

WebUI.click(findTestObject('Object Repository/7_Account_Settings/Edit_Email/Page_1HDHFClGY4 - Bumblebee Mattermost/span_'))

not_run: WebUI.closeBrowser()

