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
import customKeywords.Appointment as Appointment

WebUI.callTestCase(findTestCase('Login/Login - Success'), [:], FailureHandling.STOP_ON_FAILURE)

//Assert Make Appointment Page successfully opened
WebUI.comment('Verifying Already on Make Appointment Page')

WebUI.verifyElementPresent(findTestObject('Appointment Page/section_appointment'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Appointment Page/dropdown_facility'))

WebUI.selectOptionByValue(findTestObject('Appointment Page/dropdown_facility'), GlobalVariable.appointmentFacility, false)

WebUI.sendKeys(findTestObject('Appointment Page/dropdown_facility'), Keys.chord(Keys.ESCAPE))

Appointment.clickCheckBox(findTestObject('Appointment Page/checkbox_hospitalReadmission'))

Appointment.clickRdBtn(findTestObject('Appointment Page/rdBtn_medicare'), findTestObject('Appointment Page/rdBtn_medicaID'), findTestObject('Appointment Page/rdBtn_none'))

WebUI.click(findTestObject('Appointment Page/input_visitDate'))

WebUI.click(findTestObject('Appointment Page/date_data-29'))

WebUI.sendKeys(findTestObject('Appointment Page/dropdown_facility'), Keys.chord(Keys.ESCAPE))

WebUI.setText(findTestObject('Appointment Page/input_visitDate'), GlobalVariable.appointmentDate)

WebUI.setText(findTestObject('Appointment Page/input_comment'), GlobalVariable.appointmentComment)

WebUI.click(findTestObject('Appointment Page/btn_bookAppointment'))

//Assert Make Appointment Successfully Created
WebUI.comment('Verifying Create Appointment Success')

WebUI.verifyElementPresent(findTestObject('Appointment Page/header_confirmation'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.closeBrowser()

