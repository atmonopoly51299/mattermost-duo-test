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

WebUI.click(findTestObject('Object Repository/4_Send_Message/Page_(2)  tringuyen - Bumblebee Mattermost/svg'))

WebUI.click(findTestObject('Object Repository/4_Send_Message/Page_(2)  tringuyen - Bumblebee Mattermost/img_People_emoji-1f61d'))

WebUI.click(findTestObject('Object Repository/4_Send_Message/Page_(2)  tringuyen - Bumblebee Mattermost/span_stuck_out_tongue_closed_eyes_emojiPick_1a1d51'))

WebUI.click(findTestObject('Object Repository/4_Send_Message/Page_(2)  tringuyen - Bumblebee Mattermost/img_People_emoji-1f632'))

WebUI.setText(findTestObject('Object Repository/4_Send_Message/Page_(2)  tringuyen - Bumblebee Mattermost/textarea_stuck_out_tongue_closed_eyes astonished d'), 
    ':stuck_out_tongue_closed_eyes: :astonished: d')

WebUI.setText(findTestObject('Object Repository/4_Send_Message/Page_(2)  tringuyen - Bumblebee Mattermost/textarea_stuck_out_tongue_closed_eyes aston_f4fceb'), 
    ':stuck_out_tongue_closed_eyes: :astonished: da')

WebUI.setText(findTestObject('Object Repository/4_Send_Message/Page_(2)  tringuyen - Bumblebee Mattermost/textarea_stuck_out_tongue_closed_eyes aston_994d01'), 
    ':stuck_out_tongue_closed_eyes: :astonished: dad')

not_run: WebUI.closeBrowser()

