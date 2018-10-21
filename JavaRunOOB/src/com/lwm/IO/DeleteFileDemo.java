package com.lwm.IO;

import java.io.File;

//递归删除目录和文件
public class DeleteFileDemo {
	public static void deleteFolder(File folder){
		File[] files = folder.listFiles();
		if (files != null){
			for(File file: files){
				if (file.isDirectory()){
					deleteFolder(file);
				}else{
					file.delete();
				}
			}
		}
		folder.delete();
	}
	
	public static void main(String[] args) {
		File folder = new File("tmp/java/");
		deleteFolder(folder);
	}

}
