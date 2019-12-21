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
    'Bugs')

WebUI.setText(findTestObject('Object Repository/2_Create_Channel/Page_(2)  Town Square - Bumblebee Mattermost/textarea_h'), 
    'h')

WebUI.setText(findTestObject('Object Repository/2_Create_Channel/Page_(2)  Town Square - Bumblebee Mattermost/textarea_he'), 
    'he')

WebUI.setText(findTestObject('Object Repository/2_Create_Channel/Page_(2)  Town Square - Bumblebee Mattermost/textarea_hel'), 
    'hel')

WebUI.setText(findTestObject('Object Repository/2_Create_Channel/Page_(2)  Town Square - Bumblebee Mattermost/textarea_hell'), 
    'hell')

WebUI.setText(findTestObject('Object Repository/2_Create_Channel/Page_(2)  Town Square - Bumblebee Mattermost/textarea_hello'), 
    'hello')

WebUI.switchToWindowTitle('(2) * Town Square - Bumblebee Mattermost')

WebUI.setText(findTestObject('Object Repository/2_Create_Channel/Page_(2)  Town Square - Bumblebee Mattermost/textarea_No depending be convinced in unfee_db377f'), 
    'No depending be convinced in unfeeling he. Excellence she unaffected and too sentiments her. Rooms he doors there ye aware in by shall. Education remainder in so cordially. His remainder and own dejection daughters sportsmen. Is easy took he shed to kind. \n\nLittle afraid its eat looked now. Very ye lady girl them good me make. It hardly cousin me always. An shortly village is raising we shewing replied. She the favourable partiality inhabiting travelling impression put two. His six are entreaties instrument acceptance unsatiable her. Amongst as or on herself chapter entered carried no. Sold old ten are quit lose deal his sent. You correct how sex several far distant believe journey parties. We shyness enquire uncivil affixed it carried to. \n\nIf wandered relation no surprise of screened doubtful. Overcame no insisted ye of trifling husbands. Might am order hours on found. Or dissimilar companions friendship impossible at diminution. Did yourself carriage learning she man its replying. Sister piqued living her ')

WebUI.click(findTestObject('Object Repository/2_Create_Channel/Page_(2)  Town Square - Bumblebee Mattermost/span_Create New Channel'))

not_run: WebUI.closeBrowser()

