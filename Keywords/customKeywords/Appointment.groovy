package customKeywords

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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Appointment {

	@Keyword
	public static void clickCheckBox(TestObject applyReadmission) {
		boolean readmission = GlobalVariable.appointmentReadmission
		
		if (readmission) {
			WebUI.click(applyReadmission)
		}
	}

	@Keyword
	public static void clickRdBtn(TestObject radioButtonMedicare, TestObject radioButtonMedicaid, TestObject radioButtonNone) {
		String healthcareProgram = GlobalVariable.appointmentHealthcareProgram
		
		if (healthcareProgram == 'Medicare') {
			WebUI.click(radioButtonMedicare)
		}
		else if (healthcareProgram== 'Medicaid') {
			WebUI.click(radioButtonMedicaid)
		}
		else if (healthcareProgram == 'None') {
			WebUI.click(radioButtonNone)
		}
		else {
			WebUI.comment('Healthcare program not found')
		}
	}
}
