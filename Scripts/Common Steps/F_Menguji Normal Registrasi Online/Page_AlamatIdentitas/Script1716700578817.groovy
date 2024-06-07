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

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Sebelum Input Alamat Identitas', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'RegistrasiOnline.select_Provinsi'('DKI Jakarta')

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'RegistrasiOnline.select_KotaKabupaten'('Kota Jakarta Barat')

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'RegistrasiOnline.select_Kecamatan'('Palmerah')

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'RegistrasiOnline.select_DesaKelurahann'('Slipi')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'RegistrasiOnline.select_KodePos'('11410')

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Register Online/Normal Registrasi Online/Alamat/field_AlamatLengkap'), 'Jalan Kep sepuluh ribu', 
    0)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Buka Rekening BNI Pandai/F_Alamat/field_RT'), 5)

Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Alamat/field_RT'), '055', 0)

Mobile.verifyElementExist(findTestObject('Buka Rekening BNI Pandai/F_Alamat/field_RW'), 5)

Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Alamat/field_RW'), '022', 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Register Online/Normal Registrasi Online/Alamat/field_AlamatLengkap'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Berhasil Input Alamat Identitas', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Register Online/btn_Lanjut'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

