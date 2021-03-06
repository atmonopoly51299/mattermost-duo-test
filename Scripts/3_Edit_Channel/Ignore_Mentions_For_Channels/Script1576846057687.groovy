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

WebUI.click(findTestObject('3_Edit_Channel/Ignore_Mentions_For_Channels/Page_CS420 - Bumblebee Mattermost/span_CS420_channelHeaderDropdownIcon'))

WebUI.click(findTestObject('3_Edit_Channel/Ignore_Mentions_For_Channels/Page_CS420 - Bumblebee Mattermost/button_Notification Preferences'))

WebUI.click(findTestObject('3_Edit_Channel/Ignore_Mentions_For_Channels/Page_CS420 - Bumblebee Mattermost/span_Edit'))

WebUI.click(findTestObject('3_Edit_Channel/Ignore_Mentions_For_Channels/Page_CS420 - Bumblebee Mattermost/input_Ignore mentions for channel here and _e66082'))

WebUI.click(findTestObject('3_Edit_Channel/Ignore_Mentions_For_Channels/Page_CS420 - Bumblebee Mattermost/span_Save'))

WebUI.click(findTestObject('3_Edit_Channel/Ignore_Mentions_For_Channels/Page_CS420 - Bumblebee Mattermost/span_'))

WebUI.delay(1)

WebUI.click(findTestObject('3_Edit_Channel/Ignore_Mentions_For_Channels/Page_CS420 - Bumblebee Mattermost/span_CS420_channelHeaderDropdownIcon'))

WebUI.click(findTestObject('3_Edit_Channel/Ignore_Mentions_For_Channels/Page_CS420 - Bumblebee Mattermost/button_Notification Preferences'))

WebUI.click(findTestObject('3_Edit_Channel/Ignore_Mentions_For_Channels/Page_CS420 - Bumblebee Mattermost/span_Edit'))

WebUI.click(findTestObject('3_Edit_Channel/Ignore_Mentions_For_Channels/Page_CS420 - Bumblebee Mattermost/input_On_ignoreChannelMentions'))

WebUI.click(findTestObject('3_Edit_Channel/Ignore_Mentions_For_Channels/Page_CS420 - Bumblebee Mattermost/span_Save'))

WebUI.click(findTestObject('3_Edit_Channel/Ignore_Mentions_For_Channels/Page_CS420 - Bumblebee Mattermost/span_'))

WebUI.delay(1)

not_run: WebUI.closeBrowser()

