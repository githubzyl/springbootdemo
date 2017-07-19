package com.example.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class TestFile {

	@Test
	public void test() throws Exception {
		String filePath = "F:\\ismapp\\temp\\img\\4DAB07B20FD924B834D8802514DDAE76.jpg";
		// getCreateTime(filePath);
		// getModifiedTime(filePath);
		//File file = new File("F:/ismapp/temp");
		//removeFiles(file, 30);
//		test32("2*60*60*1000");
		for(int i = 0 ; i < 10 ; i++){
			System.out.println((0.5-Math.random())*100);
		}
	}

	public static void removeFiles(File file, long expiration) {
		File[] files = file.listFiles();
		long currentTime = new Date().getTime();
		for (File f : files) {
			if (f.exists()) {
				if (f.isFile()) {// 如果是文件
					long createTime = f.lastModified();
					if (currentTime - createTime > expiration) {
						f.delete();
					}
				} else if (f.isDirectory()) {
					if (f.listFiles().length == 0) {
						f.delete();
					} else {
						removeFiles(f, expiration);
					}
				}
			}
		}
	}

	/**
	 * 读取文件创建时间
	 */
	public static void getCreateTime(String filePath) {
		String strTime = null;
		try {
			Process p = Runtime.getRuntime().exec("cmd /C dir " + filePath + "/tc");
			InputStream is = p.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String line;
			while ((line = br.readLine()) != null) {
				if (line.endsWith(".jpg")) {
					strTime = line.substring(0, 20);
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("创建时间    " + strTime);
		// 输出：创建时间 2009-08-17 10:21
	}

	/**
	 * 读取修改时间的方法2
	 */
	public static void getModifiedTime(String filePath) {
		File file = new File(filePath);
		Calendar cal = Calendar.getInstance();
		long time = file.lastModified();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		cal.setTimeInMillis(time);
		System.out.println("修改时间[2] " + formatter.format(cal.getTime()));
		// 输出：修改时间[2] 2009-08-17 10:32:38
	}

	public static void test32(String str) throws Exception {
		String[] xyStr = str.split("[+-/*]");
		float x = Float.parseFloat(xyStr[0]);
		float y = Float.parseFloat(xyStr[1]);
		float r = 0;
		char opt = '+';
		if (str.contains("+")) {
			opt = '+';
			r = x + y;
		} else if (str.contains("-")) {
			opt = '-';
			r = x - y;
		} else if (str.contains("*")) {
			opt = '*';
			r = x * y;
		} else if (str.contains("/")) {
			opt = '/';
			r = x / y;
		}
		System.out.println(x + "" + opt + y + "=" + r);
	}

}
