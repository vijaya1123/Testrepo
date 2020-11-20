package com.data.Dataprovider;

import java.util.Scanner;

public class Testprogram {

	public static void main(String[] args) {
		
		//System.out.println("in test1");
		//duplicate words in a string
		Scanner sc = new Scanner(System.in);
		String st= sc.nextLine();
		char []char1= st.toCharArray();
		int count;
		for(int i=0;i<char1.length;i++)
		{
			for(int j=i+1;j<char1.length;j++)
			{
				if(char1[i]==char1[j] && char1[i]!=' '){
					count++;
				
				char1[j]=0;
					
			}
			}
			if(count>1 && char1[i]!='0')
			{
			System.out.println(char1[i]);
		}
		
	
		}
	}
	

