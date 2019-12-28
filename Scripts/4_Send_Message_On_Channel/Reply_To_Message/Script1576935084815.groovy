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

WebUI.navigateToUrl('https://mattermost-duo-test-yen.herokuapp.com/bumblebee/messages/@tringuyen')

WebUI.click(findTestObject('4_Send_Message/Reply_To_Message/Page_tringuyen - Bumblebee Mattermost/button_ngocyen_CENTER_button_1epijiw7yf8t3d_d76de3'))

WebUI.click(findTestObject('4_Send_Message/Reply_To_Message/Page_tringuyen - Bumblebee Mattermost/button_Reply'))

WebUI.setText(findTestObject('4_Send_Message/Reply_To_Message/Page_tringuyen - Bumblebee Mattermost/textarea_I'), 
    'I')

WebUI.setText(findTestObject('4_Send_Message/Reply_To_Message/Page_tringuyen - Bumblebee Mattermost/textarea_I_1'), 
    'I ')

WebUI.setText(findTestObject('4_Send_Message/Reply_To_Message/Page_tringuyen - Bumblebee Mattermost/textarea_I h'), 
    'I h')

WebUI.setText(findTestObject('4_Send_Message/Reply_To_Message/Page_tringuyen - Bumblebee Mattermost/textarea_I ha'), 
    'I ha')

WebUI.setText(findTestObject('4_Send_Message/Reply_To_Message/Page_tringuyen - Bumblebee Mattermost/textarea_I hat'), 
    'I hat')

WebUI.setText(findTestObject('4_Send_Message/Reply_To_Message/Page_tringuyen - Bumblebee Mattermost/textarea_I hate'), 
    'I hate')

WebUI.setText(findTestObject('4_Send_Message/Reply_To_Message/Page_tringuyen - Bumblebee Mattermost/textarea_I hate_1'), 
    'I hate ')

WebUI.setText(findTestObject('4_Send_Message/Reply_To_Message/Page_tringuyen - Bumblebee Mattermost/textarea_I hate t'), 
    'I hate t')

WebUI.setText(findTestObject('4_Send_Message/Reply_To_Message/Page_tringuyen - Bumblebee Mattermost/textarea_I hate th'), 
    'I hate th')

WebUI.setText(findTestObject('4_Send_Message/Reply_To_Message/Page_tringuyen - Bumblebee Mattermost/textarea_I hate thi'), 
    'I hate thi')

WebUI.setText(findTestObject('4_Send_Message/Reply_To_Message/Page_tringuyen - Bumblebee Mattermost/textarea_I hate this'), 
    'I hate this')

WebUI.click(findTestObject('4_Send_Message/Reply_To_Message/Page_tringuyen - Bumblebee Mattermost/input_Help_btn btn-primary comment-btn pull-right'))

not_run: WebUI.closeBrowser()

