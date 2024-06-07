package utilsKeywordPackage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class UtilsKeyword {


	@Keyword
	def swipeDown(int times){

		for(def iteration : times) {

			Mobile.swipe(180, 400, 180, 200, FailureHandling.STOP_ON_FAILURE)
		}
	}

	@Keyword
	def swpieRight(int times){

		Mobile.delay(1)

		for(int i = 0; i < times ; i++) {

			Mobile.swipe(180, 280, 100, 280, FailureHandling.STOP_ON_FAILURE)

			Mobile.delay(1)
		}
	}

	@Keyword
	def swipeDown_DropdownPenumpang(int times){

		for(def iteration : times) {

			Mobile.swipe(180, 550, 180, 350, FailureHandling.STOP_ON_FAILURE)
		}
	}

	@Keyword
	def select_Provinsi(String provinsi){


		Mobile.tap(findTestObject('Buka Rekening BNI Pandai/F_Alamat/F_Provinsi/field_Provinsi'), 2)

		Mobile.delay(3)

		Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Alamat/F_Provinsi/field_SearchBox'), provinsi, 2, FailureHandling.STOP_ON_FAILURE)

		Mobile.delay(2)

		Mobile.tap(findTestObject('Buka Rekening BNI Pandai/F_Alamat/F_Provinsi/select_Provinsi'), 2)

		Mobile.delay(2)
	}

	@Keyword
	def select_KotaKabupaten(String kota_kabupaten){


		Mobile.tap(findTestObject('Buka Rekening BNI Pandai/F_Alamat/F_Kota kabupaten/field_KotaKabupaten'), 2)

		Mobile.delay(2)

		Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Alamat/F_Kota kabupaten/field_SearchBox'), kota_kabupaten, 2, FailureHandling.STOP_ON_FAILURE)

		Mobile.delay(2)

		Mobile.tap(findTestObject('Buka Rekening BNI Pandai/F_Alamat/F_Kota kabupaten/select_KotaKabupaten'), 2)

		Mobile.delay(2)
	}

	@Keyword
	def select_Kecamatan(String kecamatan){

		println("Berhasil Masuk Select kecamatan")



		Mobile.verifyElementExist(findTestObject('Buka Rekening BNI Pandai/F_Alamat/F_Kecamatan/field_Kecamatan'), 2)

		Mobile.tap(findTestObject('Buka Rekening BNI Pandai/F_Alamat/F_Kecamatan/field_Kecamatan'), 2)

		Mobile.delay(2)

		Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Alamat/F_Kecamatan/field_SearchBox'), kecamatan, 2, FailureHandling.STOP_ON_FAILURE)

		Mobile.delay(2)

		Mobile.tap(findTestObject('Buka Rekening BNI Pandai/F_Alamat/F_Kecamatan/select_Kecamatan'), 2)

		Mobile.delay(2)
	}

	@Keyword
	def select_DesaKelurahann(String desa_kelurahan){


		Mobile.tap(findTestObject('Buka Rekening BNI Pandai/F_Alamat/F_Desa Kelurahan/field_Desakelurahan'), 2)

		Mobile.delay(2)

		Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Alamat/F_Desa Kelurahan/field_SearchBox'), desa_kelurahan, 2, FailureHandling.STOP_ON_FAILURE)

		Mobile.delay(2)

		Mobile.tap(findTestObject('Buka Rekening BNI Pandai/F_Alamat/F_Desa Kelurahan/select_DesaKelurahan'), 2)

		Mobile.delay(5)
	}

	@Keyword
	def select_KodePos(String kode_pos){

		Mobile.delay(2)

		Mobile.tap(findTestObject('Buka Rekening BNI Pandai/F_Alamat/F_Kode Pos/field_KodePos'), 2)

		Mobile.delay(2)

		//		Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Alamat/F_Kode Pos/field_SearchBox'), kode_pos, 2, FailureHandling.STOP_ON_FAILURE)
		//
		//		Mobile.delay(2)

		Mobile.tap(findTestObject('Buka Rekening BNI Pandai/F_Alamat/F_Kode Pos/select_KodePos'), 2)

		Mobile.delay(5)
	}


	@Keyword
	def select_Pekerjaan(String pedagang){

		println("Berhasil Masuk Select Pekerjaan")

		Mobile.delay(2)

		Mobile.tap(findTestObject('Buka Rekening BNI Pandai/F_Kontak Nasabah/F_Pekerjaan/field_Pekerjaan'), 2)

		Mobile.delay(2)

		Mobile.setText(findTestObject('Buka Rekening BNI Pandai/F_Kontak Nasabah/F_Pekerjaan/field_SearchBox'), pedagang, 2, FailureHandling.STOP_ON_FAILURE)

		Mobile.delay(2)

		Mobile.tap(findTestObject('Buka Rekening BNI Pandai/F_Kontak Nasabah/F_Pekerjaan/select_Pekerjaan'), 2)

		Mobile.delay(5)
	}

	@Keyword
	def inputTanggalLahir(String tanggalLahir){

		//		format : MM/DD/YYYY : 05/31/2024

		Mobile.tap(findTestObject('Lupa Password Login/field_TanggalLahir'), 0)

		Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Lupa Password Login/Tanggal Lahir/select_EdtiDate'), 0)

		Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

		Mobile.setText(findTestObject('Lupa Password Login/Tanggal Lahir/input_Date'), tanggalLahir, 0)

		Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Lupa Password Login/Tanggal Lahir/btn_ok'), 0)

		Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
	}


	@Keyword
	def waitAfterInsertManualOTP_Registration(int timeout){


		Mobile.waitForElementPresent(findTestObject('Register Online/Normal Registrasi Online/field_AlamatDataUsaha'), timeout)
	}
}
