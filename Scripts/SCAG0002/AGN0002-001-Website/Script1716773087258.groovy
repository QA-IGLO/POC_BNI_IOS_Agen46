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

WebUI.openBrowser('https://192.168.152.220/loginQr')

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('Berhasil Akses Login QR Web BNI Agen 46')

WebUI.verifyElementPresent(findTestObject('Normal Hubungkan Perangkat/display_LogoBNIAgen46'), 60)

WebUI.waitForElementPresent(findTestObject('Normal Hubungkan Perangkat/popup_SuksesAksesWebBNIAgen46'), 800)

WebUI.delay(5)

WebUI.click(findTestObject('Normal Hubungkan Perangkat/button_OK'))

WebUI.delay(2)

WebUI.takeFullPageScreenshotAsCheckpoint('Berhasil Akses Web BNI Agen 46')

