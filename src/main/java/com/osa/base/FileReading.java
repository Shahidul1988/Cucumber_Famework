package com.osa.base;
	import java.io.File;
	import java.io.FileInputStream;
	import java.util.Properties;
	public class FileReading {
	public static Properties readFromProperties(String path) {
			Properties pro = null;
			try {
				File read = new File(path);
				FileInputStream input = new FileInputStream(read);
				 pro = new Properties();
				 pro.load(input);
				 
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			return pro;
		}
}
