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

WebUI.navigateToUrl('https://mattermost-duo-test-yen.herokuapp.com/bumblebee/channels/cs420')

WebUI.click(findTestObject('Object Repository/3_Edit_Channel/View_Channel_Info/Page_CS420 - Bumblebee Mattermost/span_CS420_channelHeaderDropdownIcon'))

WebUI.click(findTestObject('Object Repository/3_Edit_Channel/View_Channel_Info/Page_CS420 - Bumblebee Mattermost/button_View Info'))

WebUI.click(findTestObject('Object Repository/3_Edit_Channel/View_Channel_Info/Page_CS420 - Bumblebee Mattermost/div_A channel to work on AI homework'))

WebUI.click(findTestObject('Object Repository/3_Edit_Channel/View_Channel_Info/Page_CS420 - Bumblebee Mattermost/a_httpscoursesfithcmuseduvnctdbloginindexphp'))

WebUI.click(findTestObject('Object Repository/3_Edit_Channel/View_Channel_Info/Page_CS420 - Bumblebee Mattermost/div_httpsmattermost-duo-test-yenherokuappco_afcfce'))

WebUI.click(findTestObject('Object Repository/3_Edit_Channel/View_Channel_Info/Page_CS420 - Bumblebee Mattermost/p_ID caj1nt34k3n6xkdyrsha7cbooh'))

WebUI.click(findTestObject('Object Repository/3_Edit_Channel/View_Channel_Info/Page_CS420 - Bumblebee Mattermost/span_'))
