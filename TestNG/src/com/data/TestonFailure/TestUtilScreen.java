package com.data.TestonFailure;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TestUtilScreen extends BaseTest {
	
	public static String mailscreenshotpath;
	
	public static void capturescreenshot() throws  IOException{
		
		
		Calendar cal =new GregorianCalendar();
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int sec = cal.get(Calendar.SECOND);
		int min = cal.get(Calendar.MINUTE);
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.HOUR_OF_DAY);
		
		File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			mailscreenshotpath=System.getenv("user.dir")+"\\screenshot\\" +year+"_"+(month+1)+"_"+day+"_"+min+"_"+sec+"_"+".jpeg";
			FileUtils.copyFile(srcfile, new File(mailscreenshotpath));
		}catch(IOException e)
		{ System.out.println(e);
		e.printStackTrace();
		}
		}
	}


