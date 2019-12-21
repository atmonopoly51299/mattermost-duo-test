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

WebUI.navigateToUrl('https://mattermost-duo-test-yen.herokuapp.com/bumblebee/channels/bugs-private')

WebUI.click(findTestObject('Object Repository/2_Create_Channel/Page_(2)  Bugs Private - Bumblebee Mattermost/span_'))

WebUI.setText(findTestObject('Object Repository/2_Create_Channel/Page_(2)  Bugs Private - Bumblebee Mattermost/input_Name_newChannelName'), 
    'Bugs Again')

WebUI.setText(findTestObject('Object Repository/2_Create_Channel/Page_(2)  Bugs Private - Bumblebee Mattermost/textarea_a'), 
    'a')

WebUI.setText(findTestObject('Object Repository/2_Create_Channel/Page_(2)  Bugs Private - Bumblebee Mattermost/textarea_a_1'), 
    'a')

WebUI.click(findTestObject('Object Repository/2_Create_Channel/Page_(2)  Bugs Private - Bumblebee Mattermost/span_Cancel'))

not_run: WebUI.closeBrowser()
