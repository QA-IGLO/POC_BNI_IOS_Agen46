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

Mobile.waitForElementPresent(findTestObject('Register Online/Kantor Cabang Terdekat/field_UsernameRegis'), 10)

Mobile.takeScreenshotAsCheckpoint('Sebelum Input Username', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Register Online/Kantor Cabang Terdekat/field_UsernameRegis'), 'AaBbCc123', 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Berhasil Input Username', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Register Online/btn_BuatUsername'), 10)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Register Online/btn_BuatUsername'), 10)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Register Online/popUp_UsernameBerhasilDibuat'), 10)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Username Berhasil Dibuat', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(180, 400, 0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

