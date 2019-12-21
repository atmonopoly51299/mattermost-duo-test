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

WebUI.navigateToUrl('https://mattermost-duo-test-yen.herokuapp.com/triii/channels/town-square')

WebUI.click(findTestObject('7_Account_Settings/Edit_Password/Page_Town Square - New_Team_Name Mattermost/path'))

WebUI.click(findTestObject('7_Account_Settings/Edit_Password/Page_Town Square - New_Team_Name Mattermost/button_Account Settings'))

WebUI.click(findTestObject('7_Account_Settings/Edit_Password/Page_Town Square - New_Team_Name Mattermost/button_Security'))

WebUI.click(findTestObject('7_Account_Settings/Edit_Password/Page_Town Square - New_Team_Name Mattermost/span_Edit'))

WebUI.setEncryptedText(findTestObject('7_Account_Settings/Edit_Password/Page_Town Square - New_Team_Name Mattermost/input_Current Password_currentPassword'), 
    'i0/aBnOaKaUS4hpCx5x3Fg==')

WebUI.setEncryptedText(findTestObject('7_Account_Settings/Edit_Password/Page_Town Square - New_Team_Name Mattermost/input_New Password_newPassword'), 
    'i0/aBnOaKaWJHHkicaSmSg==')

WebUI.setEncryptedText(findTestObject('7_Account_Settings/Edit_Password/Page_Town Square - New_Team_Name Mattermost/input_Retype New Password_confirmPassword'), 
    'i0/aBnOaKaWJHHkicaSmSg==')

WebUI.click(findTestObject('7_Account_Settings/Edit_Password/Page_Town Square - New_Team_Name Mattermost/button_Save'))

WebUI.closeBrowser()

