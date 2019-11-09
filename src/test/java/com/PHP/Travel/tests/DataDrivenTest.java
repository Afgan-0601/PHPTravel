package com.PHP.Travel.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PHP.library.ExcelManager;
import com.PHP.library.phpBase;

public class DataDrivenTest extends phpBase {
	private int counter = 0;

	@DataProvider(name = "PHPTestData")
	private Object[][] calculatorData() {
		ExcelManager excelReader = new ExcelManager("src/test/resources/TestData/PHPData1.xlt");
		Object[][] data;
		data = excelReader.getExcelData("PHPCustomer");
		return data;
	}

	@Test(dataProvider = "PHPTestData")
	public void dataDrivenTest(String userName, String password, String expectedResult) {

	}
}
