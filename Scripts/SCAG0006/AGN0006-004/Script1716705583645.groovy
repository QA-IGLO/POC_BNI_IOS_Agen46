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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'BlockService.insertServiceBlock'('transferBNIInquiry')

WebUI.callTestCase(findTestCase('Common Steps/Page_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Steps/F_Page Beranda/Page_Beranda_LayananKeuangan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Steps/F_Buka Rekening BNI Pandai/F_SubMenu_LayananKeuangan/Page_LayananKeuangan_Transfer'), 
    [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Buka Rekening BNI Pandai/subMenu_TransferBNI'), 0)

WebUI.callTestCase(findTestCase('Common Steps/F_Block Service/Message_PeningkatanLayananUntukAnda'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'BlockService.deleteServiceBlock'('transferBNIInquiry')

Mobile.closeApplication()

