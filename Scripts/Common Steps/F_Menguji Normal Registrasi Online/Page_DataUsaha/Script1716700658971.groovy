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

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Sebelum Input Data Usaha', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register Online/Normal Registrasi Online/DataUsaha/field_NamaTokoUsaha'), 0)

Mobile.setText(findTestObject('Register Online/Normal Registrasi Online/DataUsaha/field_NamaTokoUsaha'), 'BNI 46', 0)

Mobile.hideKeyboard()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register Online/Normal Registrasi Online/DataUsaha/field_NPWP'), 0)

Mobile.setText(findTestObject('Register Online/Normal Registrasi Online/DataUsaha/field_NPWP'), '5171045311760007', 0)

Mobile.waitForElementPresent(findTestObject('Register Online/Normal Registrasi Online/DataUsaha/JenisUsaha/field_JenisUsaha'), 
    10)

Mobile.tap(findTestObject('Register Online/Normal Registrasi Online/DataUsaha/JenisUsaha/field_JenisUsaha'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Register Online/Normal Registrasi Online/Alamat/F_Provinsi/field_SearchBox'), 'Wiraswasta (Sembako/Kelontong)', 
    0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Register Online/Normal Registrasi Online/DataUsaha/JenisUsaha/select_JenisUsaha'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Register Online/Normal Registrasi Online/DataUsaha/Jenis Lokasi Usaha/field_JenisLokasiUsaha'), 
    10)

Mobile.tap(findTestObject('Register Online/Normal Registrasi Online/DataUsaha/Jenis Lokasi Usaha/field_JenisLokasiUsaha'), 
    0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Register Online/Normal Registrasi Online/Alamat/F_Provinsi/field_SearchBox'), 'Pemukiman/Perumahan', 
    0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Register Online/Normal Registrasi Online/DataUsaha/Jenis Lokasi Usaha/select_JenisLokasiUsaha'), 
    0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Register Online/Normal Registrasi Online/DataUsaha/check_AlamatUsahaSamaDenganIdentitas'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Berhasil Input Data Usaha', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Tap Button Lanjut', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Register Online/btn_Lanjut'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Tap Button Simpan Data Usaha', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Register Online/btn_SimpanDataUsaha'), 0)

