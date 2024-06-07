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

public class Ferizy {

	@Keyword
	def select_Layanan(String layanan){

		Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/field_Layanan'), 0)

		Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)


		if(layanan == "Express") {

			Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/Layanan/select_LayananExpress'), 0)
		} else {

			Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/Layanan/select_Layanan_ExpressPlus'), 0)
		}

		Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/btn_Simpan'), 0)

		Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def select_PenggunaJasa(String penggunaJasa){

		Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/field_PenggunaJasa'), 0)

		Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)


		if(penggunaJasa == "Pejalan Kaki") {

			Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/PenggunaJasa/select_PenggunaJasa_PejalanKaki'), 0)
		} else {

			Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/PenggunaJasa/select_PenggunaJasa_Kendaraan'), 0)
		}

		Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/btn_Simpan'), 0)

		Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def select_GolonganKendaraan(String golonganKendaraan){

		Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/field_GolonganKendaraan'), 0)

		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)


		if(golonganKendaraan == "Golongan I") {

			Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/GolonganKendaraan/select_GolonganI'), 0)
		} else if (golonganKendaraan == "Golongan II") {

			Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/GolonganKendaraan/select_GolonganII'), 0)
		} else if (golonganKendaraan == "Golongan III") {

			Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/GolonganKendaraan/select_GolonganIII'), 0)
		} else if (golonganKendaraan == "Golongan IVA") {

			Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/GolonganKendaraan/select_GolonganIVA'), 0)
		}

		Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def input_Jadwal(String jadwal){

		//		format : MM/DD/YYYY : 05/31/2024


		Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/field_Jadwal'), 3)

		Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/Jadwal/select_EdtiDate'), 0)

		Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

		Mobile.setText(findTestObject('Pemesanan Tiket/Ferizy/Jadwal/input_Date'), jadwal, 3)

		Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Pemesanan Tiket/Ferizy/Jadwal/btn_ok'), 0)

		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
	}
}
