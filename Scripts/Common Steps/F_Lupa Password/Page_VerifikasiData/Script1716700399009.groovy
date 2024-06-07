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

Mobile.takeScreenshotAsCheckpoint('Sebelum Input Data Verifikasi Data', [])

Mobile.verifyElementExist(findTestObject('Lupa Password Login/field_Username'), 5)

Mobile.setText(findTestObject('Lupa Password Login/field_Username'), findTestData('Lupa Password Login').getValue(1, 1),
	0)

Mobile.verifyElementExist(findTestObject('Lupa Password Login/field_EmailAgen'), 5)

Mobile.setText(findTestObject('Lupa Password Login/field_EmailAgen'), findTestData('Lupa Password Login').getValue(2, 1),
	0)

Mobile.verifyElementExist(findTestObject('Lupa Password Login/field_NoIdentitas'), 5)

Mobile.setText(findTestObject('Lupa Password Login/field_NoIdentitas'), findTestData('Lupa Password Login').getValue(3,
		1), 0)

Mobile.hideKeyboard()

Mobile.verifyElementExist(findTestObject('Lupa Password Login/field_NomorRekening'), 5)

Mobile.setText(findTestObject('Lupa Password Login/field_NomorRekening'), findTestData('Lupa Password Login').getValue(4,
		1), 5)

CustomKeywords.'utilsKeywordPackage.UtilsKeyword.swipeDown'(1)

CustomKeywords.'utilsKeywordPackage.UtilsKeyword.inputTanggalLahir'(findTestData('Lupa Password Login').getValue(5, 1))

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Berhasil Input Data Verifikasi Data', [])

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Lupa Password Login/btn_Lanjut'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)