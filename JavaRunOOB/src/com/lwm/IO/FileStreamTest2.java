package com.lwm.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class FileStreamTest2 {

	public static void main(String[] args) throws IOException {
		File f = new File("d://a.txt");
		OutputStream os = new FileOutputStream(f);
		
		OutputStreamWriter writer = new OutputStreamWriter(os, "UTF-8");
		writer.append("÷–Œƒ ‰»Î");
		writer.append("\r\n");
		writer.append("English");
		
		writer.close();
		os.close();
		
		FileInputStream is = new FileInputStream(f);
		InputStreamReader reader = new InputStreamReader(is, "UTF-8");
		StringBuffer sb = new StringBuffer();
		while(reader.ready()){
			sb.append((char)reader.read());
		}
		System.out.println(sb.toString());
		reader.close();
		is.close();
	}

}
