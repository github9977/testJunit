package com.test.TestJunitBasics;

import java.util.Arrays;
import java.util.Collection;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;






@RunWith(Parameterized.class)
public class TestJUnit {
	@Rule
	public ErrorCollector ec = new ErrorCollector();
	
	public int col1;
	public int col2;
		
	public TestJUnit(int col, int coll){
		this.col1 = col;
		this.col2 = coll;
	
	}
	
	@BeforeClass
	public void beforeClass(){
		
	}
	
	@Parameters
	public static Collection<Object[]> data(){
		
	    
		ExcelReader excel = new ExcelReader("C:\\Users\\lenovo\\Desktop\\Java\\Selenium Webdriver\\projects\\TestJunitBasics\\src\\test\\TestSuit.xlsx");
		int rows = excel.getRowCount("jUnit");
		int cols = excel.getColumnCount("jUnit");
		Object[][] data = new Object[rows][cols];
		
			
		return Arrays.asList(data);
	
	}
	
	@Test
	public void junitTest(){
		try{
		System.out.println(col1);
		System.out.println(col2);
		}catch(Throwable t){
			ec.addError(t);
		}
	}

	@AfterClass
    public void afterClass(){
    	
    }

}
