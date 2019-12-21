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

WebUI.navigateToUrl('https://www.facebook.com/groupcall/MESSENGER:2289674351136615/?call_id=1854582726&users_to_ring=100005152995529%2C100004720743597&has_video=0&initialize_video=0&nonce=f2c8c46ba77f01c&ext=1576933053&hash=AeQd0R_93vxAwdEE')

WebUI.setText(findTestObject('Object Repository/4_Send_Message/Page_(2)  tringuyen - Bumblebee Mattermost/textarea_'), '@')

WebUI.setText(findTestObject('Object Repository/4_Send_Message/Page_(2)  tringuyen - Bumblebee Mattermost/textarea_tringuyen h'), 
    '@tringuyen h')

WebUI.setText(findTestObject('Object Repository/4_Send_Message/Page_(2)  tringuyen - Bumblebee Mattermost/textarea_tringuyen hi'), 
    '@tringuyen hi')

not_run: WebUI.closeBrowser()

