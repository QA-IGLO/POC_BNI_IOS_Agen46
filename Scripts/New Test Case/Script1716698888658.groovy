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

WebUI.openBrowser('http://192.168.139.47/ui-onboarding/')

WebUI.delay(4)

WebUI.waitForElementPresent(findTestObject('CXO/btn_checkSyaratdanKetentuan'), 60)

WebUI.delay(1)

WebUI.click(findTestObject('CXO/btn_checkSyaratdanKetentuan'))

WebUI.delay(1)

WebUI.click(findTestObject('CXO/btn_MegertiSyaratKetentuan'))

WebUI.delay(1)

WebUI.click(findTestObject('CXO/btn_Selanjutnya_Bawah'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('CXO/btn_BelummemilikiGiro'), 60)

WebUI.delay(1)

WebUI.click(findTestObject('CXO/btn_BelummemilikiGiro'))

WebUI.delay(3)

WebUI.click(findTestObject('CXO/dropdown_PembukaanRekening'))

WebUI.delay(3)

WebUI.click(findTestObject('CXO/select_Investasi'))

WebUI.delay(3)

WebUI.click(findTestObject('CXO/Field_GiroRupiah'))

WebUI.delay(1)

WebUI.click(findTestObject('CXO/btn_Selanjutnya_Bawah'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('CXO/btn_Selanjutnya_Atas'), 60)

WebUI.delay(1)

WebUI.click(findTestObject('CXO/btn_Selanjutnya_Atas'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('CXO/btn_Selanjutnya_Atas'), 60)

WebUI.delay(1)

WebUI.click(findTestObject('CXO/btn_Selanjutnya_Atas'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('CXO/btn_Selanjutnya_Atas'), 60)

WebUI.delay(1)

WebUI.click(findTestObject('CXO/btn_Selanjutnya_Atas'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('CXO/btn_Selanjutnya_Atas'), 60)

WebUI.delay(1)

WebUI.click(findTestObject('CXO/btn_Selanjutnya_Atas'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('CXO/btn_Selanjutnya_Atas'), 60)

WebUI.delay(1)

WebUI.click(findTestObject('CXO/btn_Selanjutnya_Atas'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('CXO/btn_Selanjutnya_Atas'), 60)

WebUI.delay(1)

WebUI.click(findTestObject('CXO/btn_Selanjutnya_Atas'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('CXO/btn_Selanjutnya_Atas'), 60)

WebUI.delay(1)

WebUI.click(findTestObject('CXO/btn_Selanjutnya_Atas'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('CXO/btn_Selanjutnya_Atas'), 60)

WebUI.delay(1)

WebUI.click(findTestObject('CXO/btn_Selanjutnya_Atas'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('CXO/btn_Selanjutnya_Atas'), 60)

WebUI.delay(1)

WebUI.click(findTestObject('CXO/btn_Selanjutnya_Atas'))

WebUI.delay(1)

