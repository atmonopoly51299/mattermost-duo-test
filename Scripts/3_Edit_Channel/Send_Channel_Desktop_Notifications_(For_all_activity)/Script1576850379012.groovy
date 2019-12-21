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

WebUI.navigateToUrl('https://mattermost-duo-test-yen.herokuapp.com/bumblebee/channels/cs420/')

WebUI.click(findTestObject('Object Repository/3_Edit_Channel/Send_Channel_Desktop_Notifications_(For_all_activity)/Page_CS420 - Bumblebee Mattermost/span_CS420_channelHeaderDropdownIcon'))

WebUI.click(findTestObject('Object Repository/3_Edit_Channel/Send_Channel_Desktop_Notifications_(For_all_activity)/Page_CS420 - Bumblebee Mattermost/button_Notification Preferences'))

WebUI.click(findTestObject('Object Repository/3_Edit_Channel/Send_Channel_Desktop_Notifications_(For_all_activity)/Page_CS420 - Bumblebee Mattermost/span_Edit'))

WebUI.click(findTestObject('Object Repository/3_Edit_Channel/Send_Channel_Desktop_Notifications_(For_all_activity)/Page_CS420 - Bumblebee Mattermost/input_)_channelDesktopNotifications'))

WebUI.click(findTestObject('Object Repository/3_Edit_Channel/Send_Channel_Desktop_Notifications_(For_all_activity)/Page_CS420 - Bumblebee Mattermost/span_Save'))

WebUI.click(findTestObject('Object Repository/3_Edit_Channel/Send_Channel_Desktop_Notifications_(For_all_activity)/Page_CS420 - Bumblebee Mattermost/span_'))

