package com.reinaldo.tests.strutsexample.common.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import com.reinaldo.tests.strutsexample.common.form.PersonForm;

public class DAO {
	
	private final static Map<Integer, PersonForm> personMap = new HashMap<Integer, PersonForm>();
	private final static Random R = new Random();
	private final static String charset = "abcdefghijklmnopqrstuvwxzyz01234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ012345678900";
	private final static int charsetsize = (charset.length() - 1);
	
	private static int nextCod = 1;
	
	
	public static PersonForm create(final PersonForm p) {
		try {
			if (personMap.isEmpty()) populateMap();
			
			p.setCod(nextCod++);
			p.setRandom(getRandom());
			
			final String line = Mapper.obj2str(p);
			
			FileManager.saveAppend(line);
			
			personMap.put(p.getCod(), p);
			
			return p;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	public static boolean delete(final PersonForm p) {
		try {
			if (personMap.isEmpty()) populateMap();		
			
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	public static boolean update(final PersonForm p) {
		try {
			if (personMap.isEmpty()) populateMap();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	public static PersonForm getPerson(final int cod) {
		try {
			if (personMap.isEmpty()) populateMap();		
			return personMap.get(cod);
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	public static List<PersonForm> listPerson() {
		try {
			populateMap();
			
			final List<PersonForm> l = new ArrayList<PersonForm>(personMap.values());
			Collections.sort(l);
			return l;
			
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	
	private static void populateMap() throws Exception {
		personMap.clear();
		
		final List<String> file = FileManager.readAll();
		if (file != null && !file.isEmpty()) {
			file.forEach(line -> {
				final PersonForm p = Mapper.str2obj(line);
				personMap.put(p.getCod(), p);
				
				if (p.getCod() >= nextCod) {
					nextCod = p.getCod() + 1;
				}
			});
		}
	}
	
	private static String getRandom() {
		final StringBuilder sb = new StringBuilder();
		for (int i = 0 ; i < 30 ; i++) {
			sb.append(charset.charAt(R.nextInt(charsetsize)));
		}
		return sb.toString();
	}
	

}
