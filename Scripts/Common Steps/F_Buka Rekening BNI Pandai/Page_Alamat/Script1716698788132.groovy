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

Mobile.verifyElementExist(findTestObject('Buka Rekening BNI Pandai/F_Alamat/field_AlamatLengkap'), 5)

Mobile.takeScreenshotAsCheckpoint('Sebelum Input Alamat', [])

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Alamat/field_AlamatLengkap'), findTestData('Buka Rekening Pandai').getValue(
        10, 1), 0)

Mobile.hideKeyboard()

Mobile.verifyElementExist(findTestObject('Buka Rekening BNI Pandai/F_Alamat/field_RT'), 5)

Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Alamat/field_RT'), findTestData('Buka Rekening Pandai').getValue(
        11, 1), 0)

Mobile.verifyElementExist(findTestObject('Buka Rekening BNI Pandai/F_Alamat/field_RW'), 5)

Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Alamat/field_RW'), findTestData('Buka Rekening Pandai').getValue(
        12, 1), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'utilsKeywordPackage.UtilsKeyword.select_Provinsi'(findTestData('Buka Rekening Pandai').getValue(13, 1))

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'utilsKeywordPackage.UtilsKeyword.select_KotaKabupaten'(findTestData('Buka Rekening Pandai').getValue(14, 
        1))

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'utilsKeywordPackage.UtilsKeyword.select_Kecamatan'(findTestData('Buka Rekening Pandai').getValue(15, 1))

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'utilsKeywordPackage.UtilsKeyword.select_DesaKelurahann'(findTestData('Buka Rekening Pandai').getValue(16, 
        1))

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'utilsKeywordPackage.UtilsKeyword.swipeDown'(2)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'utilsKeywordPackage.UtilsKeyword.select_KodePos'(findTestData('Buka Rekening Pandai').getValue(17, 1))

Mobile.verifyElementExist(findTestObject('Buka Rekening BNI Pandai/F_Alamat/field_KodeArea'), 5)

Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Alamat/field_KodeArea'), findTestData('Buka Rekening Pandai').getValue(
        18, 1), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Buka Rekening BNI Pandai/F_Alamat/field_NomorTelepon'), 5)

Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Alamat/field_NomorTelepon'), findTestData('Buka Rekening Pandai').getValue(
        19, 1), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(170, 400, 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Berhasil Input Alamat', [])

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Buka Rekening BNI Pandai/btn_Lanjutkan'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

