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

Mobile.startApplication('/Users/isfahani/Downloads/APIDemos.apk', true)

Mobile.scrollToText('Views')

Mobile.tap(findTestObject('Application/Views/android.widget.TextView - Views'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Views/DragDrop/android.widget.TextView - Drag and Drop'), 0)

Mobile.longPress(findTestObject('Application/Views/DragDrop/android.view.View (1)'), 5)

Mobile.verifyElementExist(findTestObject('Application/Views/DragDrop/android.widget.TextView - No drop'), 5)

Mobile.dragAndDrop(findTestObject('Application/Views/DragDrop/android.view.View (1)'), findTestObject('Application/Views/DragDrop/android.view.View (2)'), 
    5)

Mobile.verifyElementExist(findTestObject('Application/Views/DragDrop/android.widget.TextView - Dropped'), 5)

Mobile.closeApplication()

