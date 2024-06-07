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

public class RegistrasiOnline {

	@Keyword
	def select_Provinsi(String provinsi){

		Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

		Mobile.waitForElementPresent(findTestObject('Register Online/Normal Registrasi Online/Alamat/F_Provinsi/field_Provinsi'),
				10)

		Mobile.tap(findTestObject('Register Online/Normal Registrasi Online/Alamat/F_Provinsi/field_Provinsi'), 0)

		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.setText(findTestObject('Register Online/Normal Registrasi Online/Alamat/F_Provinsi/field_SearchBox'), provinsi,
				0)

		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Register Online/Normal Registrasi Online/Alamat/F_Provinsi/select_Provinsi'), 0)
	}

	@Keyword
	def select_KotaKabupaten(String kota_kabupaten){

		Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

		Mobile.waitForElementPresent(findTestObject('Register Online/Normal Registrasi Online/Alamat/F_Kota Kabupaten/field_KotaKabupaten'),
				10)

		Mobile.tap(findTestObject('Register Online/Normal Registrasi Online/Alamat/F_Kota Kabupaten/field_KotaKabupaten'), 0)

		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.setText(findTestObject('Register Online/Normal Registrasi Online/Alamat/F_Provinsi/field_SearchBox'), kota_kabupaten,
				0)

		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Register Online/Normal Registrasi Online/Alamat/F_Kota Kabupaten/select_KotaKabupaten'), 0)
	}

	@Keyword
	def select_Kecamatan(String kecamatan){

		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

		Mobile.waitForElementPresent(findTestObject('Register Online/Normal Registrasi Online/Alamat/F_Kecamatan/field_Kecamatann'),
				10)

		Mobile.tap(findTestObject('Register Online/Normal Registrasi Online/Alamat/F_Kecamatan/field_Kecamatann'), 3)

		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.setText(findTestObject('Register Online/Normal Registrasi Online/Alamat/F_Provinsi/field_SearchBox'), kecamatan,
				3)

		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Register Online/Normal Registrasi Online/Alamat/F_Kecamatan/select_Kecamatan'), 0)
	}

	@Keyword
	def select_DesaKelurahann(String desa_kelurahan){


		Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

		Mobile.waitForElementPresent(findTestObject('Register Online/Normal Registrasi Online/Alamat/F_Desa Kelurahan/field_DesaKelurahan'), 10)

		Mobile.tap(findTestObject('Register Online/Normal Registrasi Online/Alamat/F_Desa Kelurahan/field_DesaKelurahan'), 0)

		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.setText(findTestObject('Register Online/Normal Registrasi Online/Alamat/F_Provinsi/field_SearchBox'), desa_kelurahan,
				0)

		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Register Online/Normal Registrasi Online/Alamat/F_Desa Kelurahan/select_DesaKelurahan'), 0)
	}

	@Keyword
	def select_KodePos(String kode_pos){

		Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

		Mobile.waitForElementPresent(findTestObject('Register Online/Normal Registrasi Online/Alamat/F_Kode Pos/field_KodePos'),
				10)

		Mobile.tap(findTestObject('Register Online/Normal Registrasi Online/Alamat/F_Kode Pos/field_KodePos'), 0)

		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Register Online/Normal Registrasi Online/Alamat/F_Kode Pos/select_KodePos'), 0)
	}


	@Keyword
	def select_KantorCabangPadanan(String kantorCabangPadanan) {

		Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

		Mobile.waitForElementPresent(findTestObject('Register Online/Kantor Cabang Terdekat/F_KantorCabangPadanan/field_KantorCabangPadanan'),
				10)

		Mobile.tap(findTestObject('Register Online/Kantor Cabang Terdekat/F_KantorCabangPadanan/field_KantorCabangPadanan'), 0)

		Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

		Mobile.setText(findTestObject('Register Online/Kantor Cabang Terdekat/F_KantorCabangPadanan/field_SearchBox'), kantorCabangPadanan,
				0)

		Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Register Online/Kantor Cabang Terdekat/F_KantorCabangPadanan/select_KantorCabangPadanan'), 0)
	}

	@Keyword
	def select_OutletBNITerdekat(String outletBNITerdekat) {

		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

		Mobile.waitForElementPresent(findTestObject('Register Online/Kantor Cabang Terdekat/F_OutletBNITerdekat/field_OutletBNITerdekat'),
				10)

		Mobile.tap(findTestObject('Register Online/Kantor Cabang Terdekat/F_OutletBNITerdekat/field_OutletBNITerdekat'), 0)

		Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

		Mobile.setText(findTestObject('Register Online/Kantor Cabang Terdekat/F_OutletBNITerdekat/field_SearchBox'), outletBNITerdekat,
				0)

		Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Register Online/Kantor Cabang Terdekat/F_OutletBNITerdekat/select_OutletBNITerdekat'), 0)
	}
}
