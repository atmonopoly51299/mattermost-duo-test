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

WebUI.click(findTestObject('Object Repository/4_Send_Message/Edit_Message/Page_tringuyen - Bumblebee Mattermost/button_ngocyen_CENTER_button_qtycia1ehfd47d_938399'))

WebUI.click(findTestObject('Object Repository/4_Send_Message/Edit_Message/Page_tringuyen - Bumblebee Mattermost/button_Edit'))

WebUI.setText(findTestObject('Object Repository/4_Send_Message/Edit_Message/Page_tringuyen - Bumblebee Mattermost/textarea_Hello 1'), 
    'Hello :+1: ')

WebUI.setText(findTestObject('Object Repository/4_Send_Message/Edit_Message/Page_tringuyen - Bumblebee Mattermost/textarea_Hello 1 (1)'), 
    'Hello :+1: :')

WebUI.setText(findTestObject('Object Repository/4_Send_Message/Edit_Message/Page_tringuyen - Bumblebee Mattermost/textarea_Hello 1 _1'), 
    'Hello :+1: :+')

WebUI.setText(findTestObject('Object Repository/4_Send_Message/Edit_Message/Page_tringuyen - Bumblebee Mattermost/textarea_Hello 1 1'), 
    'Hello :+1: :+1')

WebUI.setText(findTestObject('Object Repository/4_Send_Message/Edit_Message/Page_tringuyen - Bumblebee Mattermost/textarea_Hello 1 1_1'), 
    'Hello :+1: :+1:')

WebUI.click(findTestObject('Object Repository/4_Send_Message/Edit_Message/Page_tringuyen - Bumblebee Mattermost/span_Save'))

not_run: WebUI.closeBrowser()

