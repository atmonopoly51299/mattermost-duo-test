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

WebUI.click(findTestObject('Page_(2)  tringuyen - Bumblebee Mattermost/button_thutran_CENTER_button_o91nwjhej78b3y_41b030 (1)'))

WebUI.click(findTestObject('Object Repository/4_Send_Message/Page_(2)  tringuyen - Bumblebee Mattermost/button_Edit'))

WebUI.click(findTestObject('Object Repository/4_Send_Message/Page_(2)  tringuyen - Bumblebee Mattermost/div_bold_italic_strike inline codepreformat_23e595'))

WebUI.setText(findTestObject('Page_(2)  tringuyen - Bumblebee Mattermost/textarea_stuck_out_tongue_closed_eyes aston_994d01 (1)'), 
    ':stuck_out_tongue_closed_eyes: :astonished: dad ')

WebUI.setText(findTestObject('Object Repository/4_Send_Message/Page_(2)  tringuyen - Bumblebee Mattermost/textarea_stuck_out_tongue_closed_eyes aston_bf0b1e'), 
    ':stuck_out_tongue_closed_eyes: :astonished: dad **bold**')

WebUI.setText(findTestObject('Object Repository/4_Send_Message/Page_(2)  tringuyen - Bumblebee Mattermost/textarea_stuck_out_tongue_closed_eyes aston_bf0b1e_1'), 
    ':stuck_out_tongue_closed_eyes: :astonished: dad **bold** ')

WebUI.setText(findTestObject('Object Repository/4_Send_Message/Page_(2)  tringuyen - Bumblebee Mattermost/textarea_stuck_out_tongue_closed_eyes aston_a4d2c7'), 
    ':stuck_out_tongue_closed_eyes: :astonished: dad **bold** f')

WebUI.setText(findTestObject('Object Repository/4_Send_Message/Page_(2)  tringuyen - Bumblebee Mattermost/textarea_stuck_out_tongue_closed_eyes aston_846f1c'), 
    ':stuck_out_tongue_closed_eyes: :astonished: dad **bold** fs')

WebUI.setText(findTestObject('Object Repository/4_Send_Message/Page_(2)  tringuyen - Bumblebee Mattermost/textarea_stuck_out_tongue_closed_eyes aston_2a5486'), 
    ':stuck_out_tongue_closed_eyes: :astonished: dad **bold** fsf')

WebUI.click(findTestObject('Object Repository/4_Send_Message/Page_(2)  tringuyen - Bumblebee Mattermost/span_Save'))

not_run: WebUI.closeBrowser()

