package com.data.regression;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testparametrisation {
	
	public static ExcelReader excel=null;
	
	@Test(dataProvider="getData")
	public void testData(Hashtable<String,String>data) 
	{
		//System.out.println(usernm+ "---" +pass +" ---"+"is correct");
		System.out.println(data.get("usernm"));
	}
	
	@DataProvider
	public Object[][] getData(){
		if(excel==null){
			excel=new ExcelReader("C:\\testing\\testdata1.xlsx");
		}
		String sheetnm="loginTest";
		int rows= excel.getRowCount(sheetnm);
		int cols= excel.getRowCount(sheetnm);
		Object [][]data= new Object[rows-1][cols];
		Hashtable<String,String>table=null;
		for(int rownum=2;rownum<rows;rows++)
		{
			table=new Hashtable<String,String>();
			for(int colnum=2;colnum<cols;cols++)
			{
				//data[rownum-2][colnum]= excel.getCellData(sheetnm, colnum, rownum);
				table.put(excel.getCellData(sheetnm,colnum,1), excel.getCellData(sheetnm, colnum, rownum));
			   data[rownum-2][0]=table;
			}

		}
		return data;
	}
	

}
