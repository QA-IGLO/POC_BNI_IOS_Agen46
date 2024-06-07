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

Mobile.verifyElementVisible(findTestObject('Pemesanan Tiket/veirfy_titleFerizy'), 3)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Sebelum Input Data Ferizy', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/field_PelabuhanAsal'), 2)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/PelabuhanAsal/select_PelabuhanAsal_Merak'), 2)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/field_PelabuhanTujuan'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'Ferizy.select_Layanan'('Express')

CustomKeywords.'Ferizy.select_PenggunaJasa'('Kendaraan')

CustomKeywords.'Ferizy.select_GolonganKendaraan'('Golongan IVA')

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'Ferizy.input_Jadwal'('05/31/2024')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/field_Jam'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.checkElement(findTestObject('Pemesanan Tiket/Ferizy/Jam/check_TermandCondition'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.checkElement(findTestObject('Pemesanan Tiket/Ferizy/Jam/btn_Lanjut'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/Jam/select_Jam2210'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'utilsKeywordPackage.UtilsKeyword.swipeDown'(1)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/field_Penumpang'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/Penumpang/addDewasa'), 3)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/Penumpang/addBayi'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/btn_Simpan'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Berhasil Input Data Ferizy', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/btn_Lanjut'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

