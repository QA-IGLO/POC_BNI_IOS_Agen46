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

Mobile.takeScreenshotAsCheckpoint('Sebelum Insert Penumpang Dewasa 1', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/Informasi Penumpang/Folder_FieldPenumpang/select_Penumpang1Dewasa'), 10)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHold(findTestObject('Pemesanan Tiket/Ferizy/Informasi Penumpang/Titel/field_Titel'), 5, 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/Informasi Penumpang/Titel/select_Titel_Tuan'), 5)

Mobile.verifyElementExist(findTestObject('Pemesanan Tiket/Ferizy/Informasi Penumpang/field_Namalengkap'), 5, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Pemesanan Tiket/Ferizy/Informasi Penumpang/field_Namalengkap'), findTestData('Data Pemesanan Tiket Penyeberangan/Informasi Penumpang Dewasa').getValue(
        1, 1), 0)

Mobile.verifyElementExist(findTestObject('Pemesanan Tiket/Ferizy/Informasi Penumpang/JenisIdentitas/field_JenisIdentitas'), 
    5)

Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/Informasi Penumpang/JenisIdentitas/field_JenisIdentitas'), 0)

Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/Informasi Penumpang/JenisIdentitas/select_jenisIdentitas_KTP'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Pemesanan Tiket/Ferizy/Informasi Penumpang/field_NomorIdentitas'), findTestData('Data Pemesanan Tiket Penyeberangan/Informasi Penumpang Dewasa').getValue(
        2, 1), 0)

Mobile.setText(findTestObject('Pemesanan Tiket/Ferizy/Informasi Penumpang/field_Usia'), findTestData('Data Pemesanan Tiket Penyeberangan/Informasi Penumpang Dewasa').getValue(
        3, 1), 3)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/Informasi Penumpang/KotaKabupaten/field_KotaKabupaten'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/Informasi Penumpang/KotaKabupaten/select_KotaKabupaten_JakartaPusat'), 
    0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Berhasil Insert Penumpang Dewasa 1', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/btn_Simpan'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

