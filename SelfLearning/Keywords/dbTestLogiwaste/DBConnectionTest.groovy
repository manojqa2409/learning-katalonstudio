package dbTestLogiwaste

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.security.PrivateKey

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

import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement
import java.sql.PreparedStatement
import java.sql.Connection
import java.sql.Driver

public class DBConnectionTest {
	private static Connection logiwastedb=null

	@Keyword
	def static exeDBQuery(String queryString) {
		if (logiwastedb !=null && !logiwastedb.isClosed()) {
			logiwastedb.close()
		}
		logiwastedb = DriverManager.getConnection("jdbc:mysql://localhost:3306/logiwaste", "root","Logiwaste!23")

		Statement stmt = logiwastedb.createStatement()
		ResultSet rs = stmt.executeQuery(queryString)
		rs.next()
		return rs
	}

	@Keyword
	def static closelogiwastedbConn() {
		if (logiwastedb !=null && !logiwastedb.isClosed()) {
			logiwastedb.close()
		}
		logiwastedb=null
	}
}
