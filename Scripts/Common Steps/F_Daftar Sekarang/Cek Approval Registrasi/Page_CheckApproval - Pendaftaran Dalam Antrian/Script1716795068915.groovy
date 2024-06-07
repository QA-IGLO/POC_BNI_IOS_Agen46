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

Mobile.takeScreenshotAsCheckpoint('Sebelum Input Datat Approval Registration', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register Online/field_NamaBelakang'), 2)

Mobile.setText(findTestObject('Register Online/field_NamaBelakang'), findTestData('Approval Registrasi').getValue(1, 1), 
    0)

Mobile.hideKeyboard()

Mobile.verifyElementExist(findTestObject('Register Online/field_KodeRegistrasi'), 2)

Mobile.setText(findTestObject('Register Online/field_KodeRegistrasi'), findTestData('Approval Registrasi').getValue(2, 1), 
    0)

Mobile.hideKeyboard()

Mobile.takeScreenshotAsCheckpoint('Berhasil Input Data Approval Registrasi', [])

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

