package com.reinaldo.tests.strutsexample.common.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
	
	private static final String FILE = "C:\\Users\\reinaldo.silva\\Downloads\\Struts-Hello-World-Example\\StrutsExample\\db.txt";

	private FileManager() {}
	
	protected static List<String> readAll() throws Exception {
		final List<String> list = new ArrayList<String>();
		
		String line = "";
		final BufferedReader br = new BufferedReader(new FileReader(new File(FILE)));
		while ((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close();
		
		return list;
	}
	
	
	protected static void saveAppend(final String newLine) throws Exception {
		final BufferedWriter bw = new BufferedWriter(new FileWriter(new File(FILE), true));
		bw.append(newLine);
		bw.newLine();
		bw.close();
	}
	
	
}
