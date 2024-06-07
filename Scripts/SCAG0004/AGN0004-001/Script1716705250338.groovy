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

WebUI.callTestCase(findTestCase('Common Steps/Page_Onboarding - Daftar Sekarang'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Steps/F_Daftar Sekarang/Daftar Sekarang/Nomor Rekening'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Steps/F_Daftar Sekarang/Daftar Sekarang/Nomor Kartu Tanda Penduduk'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Message Verifikasi Nomor - kirim melalui SMS', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Register Online/btn_KirimMelaluiSMS'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Input OTP Manual', FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'utilsKeywordPackage.UtilsKeyword.waitAfterInsertManualOTP_Registration'(240)

Mobile.takeScreenshotAsCheckpoint('Berhasil Input OTP Manual - Masuk Ke Kelengkapan Data', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Register Online/Normal Registrasi Online/field_AlamatDataUsaha'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Steps/F_Menguji Normal Registrasi Online/Page_AlamatIdentitas'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Steps/F_Menguji Normal Registrasi Online/Page_DataUsaha'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Berhasil Simpan Alamat dan Data Usaha', FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Steps/F_Menguji Normal Registrasi Online/Foto_IdentitasPemilikUsaha'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Steps/F_Menguji Normal Registrasi Online/Foto_SelfieIdentitas'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Steps/F_Menguji Normal Registrasi Online/Foto_Usaha'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Tap Button Lanjut', FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Register Online/btn_Lanjut'), 600)

Mobile.tap(findTestObject('Register Online/btn_Lanjut'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Berhasil Tap Button Lanjut', FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Steps/F_Menguji Normal Registrasi Online/Page_PilihkantorCabangTerdekat'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Steps/F_Menguji Normal Registrasi Online/Page_Username'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Steps/F_Menguji Normal Registrasi Online/Page_PasswordLogin'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Register Online/btn_Kirim'), 600)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Tap Button Kirim', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Register Online/btn_Kirim'), 2)

Mobile.delay(120, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Berhasil Registrasi Online', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

