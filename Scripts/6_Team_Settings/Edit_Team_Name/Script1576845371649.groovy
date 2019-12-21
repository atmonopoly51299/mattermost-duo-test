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

WebUI.navigateToUrl('https://www.youtube.com/watch?v=BVomQtrtMTM&list=RDm_qlgFQs7E4&index=3')

WebUI.click(findTestObject('6_Team_Settings/5.6_Edit_Team_Name/Page_Town Square - TRIII Mattermost/svg'))

WebUI.click(findTestObject('6_Team_Settings/5.6_Edit_Team_Name/Page_Town Square - TRIII Mattermost/button_Team Settings'))

WebUI.click(findTestObject('6_Team_Settings/5.6_Edit_Team_Name/Page_Town Square - TRIII Mattermost/button_General'))

WebUI.click(findTestObject('6_Team_Settings/5.6_Edit_Team_Name/Page_Town Square - TRIII Mattermost/span_Edit'))

WebUI.doubleClick(findTestObject('6_Team_Settings/5.6_Edit_Team_Name/Page_Town Square - TRIII Mattermost/input_Team Name_teamName'))

WebUI.setText(findTestObject('6_Team_Settings/5.6_Edit_Team_Name/Page_Town Square - TRIII Mattermost/input_Team Name_teamName'), 
    'New Team Name')

WebUI.click(findTestObject('6_Team_Settings/5.6_Edit_Team_Name/Page_Town Square - TRIII Mattermost/span_Save'))

not_run: WebUI.closeBrowser()

