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

Mobile.verifyElementExist(findTestObject('Buka Rekening BNI Pandai/F_Kontak Nasabah/field_NomorHP'), 10)

Mobile.takeScreenshotAsCheckpoint('Sebelum Input Kontak Nasabah', [])

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Kontak Nasabah/field_NomorHP'), findTestData('Buka Rekening Pandai').getValue(
		20, 1), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'utilsKeywordPackage.UtilsKeyword.select_Pekerjaan'('Pedagang')

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Buka Rekening BNI Pandai/F_Kontak Nasabah/field_DeskripsiPekerjaan'), 10)

Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Kontak Nasabah/field_DeskripsiPekerjaan'), findTestData('Buka Rekening Pandai').getValue(
		22, 1), 0)

Mobile.hideKeyboard()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Buka Rekening BNI Pandai/F_Kontak Nasabah/field_Penghasilan'), 10)

Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Kontak Nasabah/field_Penghasilan'), findTestData('Buka Rekening Pandai').getValue(
		23, 1), 0)

Mobile.tapAndHoldAtPosition(200, 365, 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Berhasil Input Kontak Nasabah', [])

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Buka Rekening BNI Pandai/btn_Lanjutkan'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)