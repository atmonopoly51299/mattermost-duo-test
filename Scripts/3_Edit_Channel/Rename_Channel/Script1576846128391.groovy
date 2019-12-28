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

WebUI.click(findTestObject('3_Edit_Channel/Rename_Channel/Page_CS420-bigproj - Bumblebee Mattermost/span_CS420-bigproj_channelHeaderDropdownIcon'))

WebUI.click(findTestObject('3_Edit_Channel/Rename_Channel/Page_CS420-bigproj - Bumblebee Mattermost/button_Rename Channel'))

WebUI.doubleClick(findTestObject('3_Edit_Channel/Rename_Channel/Page_CS420-bigproj - Bumblebee Mattermost/input_Display Name_display_name'))

WebUI.setText(findTestObject('3_Edit_Channel/Rename_Channel/Page_CS420-bigproj - Bumblebee Mattermost/input_Display Name_display_name'), 
    'CS420')

WebUI.click(findTestObject('3_Edit_Channel/Rename_Channel/Page_CS420-bigproj - Bumblebee Mattermost/span_Save'))

not_run: WebUI.closeBrowser()

