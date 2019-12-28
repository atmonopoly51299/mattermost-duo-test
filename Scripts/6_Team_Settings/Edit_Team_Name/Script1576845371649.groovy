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

WebUI.navigateToUrl('https://mattermost-duo-test-yen.herokuapp.com/ysbx0kffz/channels/town-square')

WebUI.click(findTestObject('6_Team_Settings/Edit_Team_Name/Page_Town Square - Ysbx0Kffz1 Mattermost/svg'))

WebUI.click(findTestObject('6_Team_Settings/Edit_Team_Name/Page_Town Square - Ysbx0Kffz1 Mattermost/button_Team Settings'))

WebUI.click(findTestObject('6_Team_Settings/Edit_Team_Name/Page_Town Square - Ysbx0Kffz1 Mattermost/span_Edit'))

WebUI.setText(findTestObject('6_Team_Settings/Edit_Team_Name/Page_Town Square - Ysbx0Kffz1 Mattermost/input_Team Name_teamName'), 
    'Ysbx0Kffz1')

WebUI.sendKeys(findTestObject('6_Team_Settings/Edit_Team_Name/Page_Town Square - Ysbx0Kffz1 Mattermost/input_Team Name_teamName'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('6_Team_Settings/Edit_Team_Name/Page_Town Square - Ysbx0Kffz Mattermost/span_'))

not_run: WebUI.closeBrowser()

