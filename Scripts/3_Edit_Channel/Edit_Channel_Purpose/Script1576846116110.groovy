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

WebUI.click(findTestObject('Object Repository/3_Edit_Channel/Edit_Channel_Purpose/Page_CS420 - Bumblebee Mattermost/span_CS420_channelHeaderDropdownIcon'))

WebUI.click(findTestObject('Object Repository/3_Edit_Channel/Edit_Channel_Purpose/Page_CS420 - Bumblebee Mattermost/button_Edit Channel Purpose'))

WebUI.setText(findTestObject('Object Repository/3_Edit_Channel/Edit_Channel_Purpose/Page_CS420 - Bumblebee Mattermost/textarea_A channel to work on AI homewor'), 
    'A channel to work on AI homewor.')

WebUI.setText(findTestObject('Object Repository/3_Edit_Channel/Edit_Channel_Purpose/Page_CS420 - Bumblebee Mattermost/textarea_A channel to work on AI homewo'), 
    'A channel to work on AI homewo.')

WebUI.setText(findTestObject('Object Repository/3_Edit_Channel/Edit_Channel_Purpose/Page_CS420 - Bumblebee Mattermost/textarea_A channel to work on AI homew'), 
    'A channel to work on AI homew.')

WebUI.setText(findTestObject('Object Repository/3_Edit_Channel/Edit_Channel_Purpose/Page_CS420 - Bumblebee Mattermost/textarea_A channel to work on AI home'), 
    'A channel to work on AI home.')

WebUI.setText(findTestObject('Object Repository/3_Edit_Channel/Edit_Channel_Purpose/Page_CS420 - Bumblebee Mattermost/textarea_A channel to work on AI hom'), 
    'A channel to work on AI hom.')

WebUI.setText(findTestObject('Object Repository/3_Edit_Channel/Edit_Channel_Purpose/Page_CS420 - Bumblebee Mattermost/textarea_A channel to work on AI ho'), 
    'A channel to work on AI ho.')

WebUI.setText(findTestObject('Object Repository/3_Edit_Channel/Edit_Channel_Purpose/Page_CS420 - Bumblebee Mattermost/textarea_A channel to work on AI h'), 
    'A channel to work on AI h.')

WebUI.setText(findTestObject('Object Repository/3_Edit_Channel/Edit_Channel_Purpose/Page_CS420 - Bumblebee Mattermost/textarea_A channel to work on AI'), 
    'A channel to work on AI .')

WebUI.setText(findTestObject('Object Repository/3_Edit_Channel/Edit_Channel_Purpose/Page_CS420 - Bumblebee Mattermost/textarea_A channel to work on AI b'), 
    'A channel to work on AI b.')

WebUI.setText(findTestObject('Object Repository/3_Edit_Channel/Edit_Channel_Purpose/Page_CS420 - Bumblebee Mattermost/textarea_A channel to work on AI bi'), 
    'A channel to work on AI bi.')

WebUI.setText(findTestObject('Object Repository/3_Edit_Channel/Edit_Channel_Purpose/Page_CS420 - Bumblebee Mattermost/textarea_A channel to work on AI big'), 
    'A channel to work on AI big.')

WebUI.setText(findTestObject('Object Repository/3_Edit_Channel/Edit_Channel_Purpose/Page_CS420 - Bumblebee Mattermost/textarea_A channel to work on AI big (1)'), 
    'A channel to work on AI big .')

WebUI.setText(findTestObject('Object Repository/3_Edit_Channel/Edit_Channel_Purpose/Page_CS420 - Bumblebee Mattermost/textarea_A channel to work on AI big p'), 
    'A channel to work on AI big p.')

WebUI.setText(findTestObject('Object Repository/3_Edit_Channel/Edit_Channel_Purpose/Page_CS420 - Bumblebee Mattermost/textarea_A channel to work on AI big pr'), 
    'A channel to work on AI big pr.')

WebUI.setText(findTestObject('Object Repository/3_Edit_Channel/Edit_Channel_Purpose/Page_CS420 - Bumblebee Mattermost/textarea_A channel to work on AI big pro'), 
    'A channel to work on AI big pro.')

WebUI.setText(findTestObject('Object Repository/3_Edit_Channel/Edit_Channel_Purpose/Page_CS420 - Bumblebee Mattermost/textarea_A channel to work on AI big proj'), 
    'A channel to work on AI big proj.')

WebUI.setText(findTestObject('Object Repository/3_Edit_Channel/Edit_Channel_Purpose/Page_CS420 - Bumblebee Mattermost/textarea_A channel to work on AI big proje'), 
    'A channel to work on AI big proje.')

WebUI.setText(findTestObject('Object Repository/3_Edit_Channel/Edit_Channel_Purpose/Page_CS420 - Bumblebee Mattermost/textarea_A channel to work on AI big projec'), 
    'A channel to work on AI big projec.')

WebUI.setText(findTestObject('Object Repository/3_Edit_Channel/Edit_Channel_Purpose/Page_CS420 - Bumblebee Mattermost/textarea_A channel to work on AI big project'), 
    'A channel to work on AI big project.')

WebUI.click(findTestObject('Object Repository/3_Edit_Channel/Edit_Channel_Purpose/Page_CS420 - Bumblebee Mattermost/span_Save'))

