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

Mobile.waitForElementPresent(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/field_NamaDepan'), 10)

Mobile.takeScreenshotAsCheckpoint('Sebelum Input Data Diri', [])

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/field_NamaDepan'), findTestData('Buka Rekening Pandai').getValue(
		2, 1), 0)

Mobile.verifyElementExist(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/field_NamaTengah'), 10)

Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/field_NamaTengah'), findTestData('Buka Rekening Pandai').getValue(
		3, 1), 0)

Mobile.verifyElementExist(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/field_NamaBelakang'), 10)

Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/field_NamaBelakang'), findTestData('Buka Rekening Pandai').getValue(
		4, 1), 0)

Mobile.verifyElementExist(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/field_AlamatEmail'), 10)

Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/field_AlamatEmail'), findTestData('Buka Rekening Pandai').getValue(
		5, 1), 0)

Mobile.hideKeyboard()

Mobile.verifyElementExist(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/field_JenisKelamin'), 10)

Mobile.tap(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/field_JenisKelamin'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/Jenis Kelamin/select_LakiLaki'), 0, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'utilsKeywordPackage.UtilsKeyword.swipeDown'(2)

Mobile.verifyElementExist(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/field_StatusKawin'), 5)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/field_StatusKawin'), 0)

Mobile.tap(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/Status Kawin/select_BelumMenikah'), 0)

Mobile.verifyElementExist(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/field_TempatLahir'), 5)

Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/field_TempatLahir'), findTestData('Buka Rekening Pandai').getValue(
		6, 1), 0)

Mobile.hideKeyboard()

Mobile.verifyElementExist(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/field_TanggalLahir'), 5)

Mobile.tap(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/field_TanggalLahir'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/TanggalLahir/select_EdtiDate'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/TanggalLahir/input_Date'), findTestData('Buka Rekening Pandai').getValue(
		7, 1), 0)

Mobile.tap(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/TanggalLahir/btn_ok'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'utilsKeywordPackage.UtilsKeyword.swipeDown'(2)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/field_NoKTP'), findTestData('Buka Rekening Pandai').getValue(
		8, 1), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.checkElement(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/Masa Berlaku KTP/check_MasaBerlakuKTP_SeumurHidup'),
	0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(200, 340)

Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Data Diri/field_NPWP'), findTestData('Buka Rekening Pandai').getValue(
		9, 1), 0)

Mobile.tapAtPosition(200, 340)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Berhasil Input Data Diri', [])

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Buka Rekening BNI Pandai/btn_Lanjutkan'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)