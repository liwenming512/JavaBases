package com.lwm.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamTest {

	public static void main(String[] args) {
		try {
			byte bWrite[] = {11, 21, 3, 40, 5};
			OutputStream os = new FileOutputStream("d://test.txt");
			for(int x = 0; x < bWrite.length; x++){
				try {
					os.write(bWrite[x]);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try {
				os.close();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			InputStream is = new FileInputStream("d://test.txt");
			int size;
			try {
				size = is.available();
				for(int i = 0; i < size; i++){
					try {
						System.out.print((char)is.read() + "");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
