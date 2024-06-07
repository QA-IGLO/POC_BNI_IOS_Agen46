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

WebUI.callTestCase(findTestCase('Common Steps/Page_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Steps/F_Page Beranda/Page_Beranda_BayarBeli'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Steps/F_Pemesanan Tiket Penyebrangan ASDP/F_TabBayarBeli/Page_BayarBeli_TiketTransportasi'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Steps/F_Pemesanan Tiket Penyebrangan ASDP/F_MenuTiketTransportasi/Page_TiketTransportasi_Ferizy'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Steps/F_Pemesanan Tiket Penyebrangan ASDP/F_Ferizy/Page_Ferizy_GolonganIVA'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Steps/F_Pemesanan Tiket Penyebrangan ASDP/Page_TermandConditionCovid'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Steps/F_Pemesanan Tiket Penyebrangan ASDP/Alamat Email Penumpang'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Steps/F_Pemesanan Tiket Penyebrangan ASDP/Informasi Kendaraan'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'utilsKeywordPackage.UtilsKeyword.swipeDown'(1)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Steps/F_Pemesanan Tiket Penyebrangan ASDP/F_InsertPenumpang/Page_InsertPenumpangDewasa1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Steps/F_Pemesanan Tiket Penyebrangan ASDP/F_InsertPenumpang/Page_InsertPenumpangDewasa2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Steps/F_Pemesanan Tiket Penyebrangan ASDP/F_InsertPenumpang/Page_InsertPenumpangBayi'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/btn_Lanjut'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/btn_Lanjut'), 0)

WebUI.callTestCase(findTestCase('Common Steps/F_Pemesanan Tiket Penyebrangan ASDP/F_VerifikasiPenumpang/Page_VerifikasiPenumpang-AGN0001-005'), 
    [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'utilsKeywordPackage.UtilsKeyword.swipeDown'(2)

WebUI.callTestCase(findTestCase('Common Steps/F_Pemesanan Tiket Penyebrangan ASDP/Password Transaksi'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Steps/F_Pemesanan Tiket Penyebrangan ASDP/Verify Transaksi Berhasil'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

