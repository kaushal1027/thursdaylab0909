package com.labtest;

import java.io.FileWriter;
import java.io.Writer;

public class TestLongestWord {

	public static void main(String[] args) {

		try
		{
			Writer w=new FileWriter("D:\\Java\\thursday0109.Txt");
			String Content="Longesttt Word";
			w.write(Content);
			w.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		


	}

}