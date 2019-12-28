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

WebUI.navigateToUrl('https://mattermost-duo-test-yen.herokuapp.com/bumblebee/channels/1hdhfclgy4')

WebUI.click(findTestObject('Object Repository/3_Edit_Channel/Add_New_Member_To_Channel/Page_(1)  1HDHFClGY4 - Bumblebee Mattermost/span_Invite others to this channel'))

WebUI.click(findTestObject('Object Repository/3_Edit_Channel/Add_New_Member_To_Channel/Page_(1)  1HDHFClGY4 - Bumblebee Mattermost/div_thutran'))

WebUI.click(findTestObject('Object Repository/3_Edit_Channel/Add_New_Member_To_Channel/Page_(1)  1HDHFClGY4 - Bumblebee Mattermost/button_Add'))

WebUI.callTestCase(findTestCase('3_Edit_Channel/Remove_Member_From_Channel'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()

