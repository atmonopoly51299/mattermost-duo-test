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

WebUI.navigateToUrl('https://mattermost-duo-test-yen.herokuapp.com/bumblebee/channels/town-square')

WebUI.click(findTestObject('Object Repository/2_Create_Channel/Page_(2)  Town Square - Bumblebee Mattermost/span_'))

WebUI.click(findTestObject('Object Repository/2_Create_Channel/Page_(2)  Town Square - Bumblebee Mattermost/div_URL  (Edit)'))

WebUI.setText(findTestObject('Object Repository/2_Create_Channel/Page_(2)  Town Square - Bumblebee Mattermost/input_Name_newChannelName'), 
    Channel_Name)

WebUI.setText(findTestObject('Object Repository/2_Create_Channel/Page_(2)  Town Square - Bumblebee Mattermost/textarea_hello'), 
    Channel_Purpose)

WebUI.setText(findTestObject('Object Repository/2_Create_Channel/Page_(2)  Town Square - Bumblebee Mattermost/textarea_No depending be convinced in unfee_db377f'), 
    Channel_Header)

WebUI.click(findTestObject('Object Repository/2_Create_Channel/Page_(2)  Town Square - Bumblebee Mattermost/span_Create New Channel'))

WebUI.delay(3)

not_run: WebUI.closeBrowser()

