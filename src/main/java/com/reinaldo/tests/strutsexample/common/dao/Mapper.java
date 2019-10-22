package com.reinaldo.tests.strutsexample.common.dao;

import com.reinaldo.tests.strutsexample.common.form.PersonForm;

//name;age;cod;random
public class Mapper {
	
	private Mapper() {}
	
	public static final PersonForm str2obj(final String str) {
		try {
			final PersonForm p = new PersonForm();
			final String[] vec = str.split(";");
			p.setName(vec[0]);
			p.setAge(Integer.parseInt(vec[1]));
			p.setCod(Integer.parseInt(vec[2]));
			p.setRandom(vec[3]);
			
			return p;
		} catch (Exception ex) {
			System.out.println("ERROR line["+str+"] msg["+ex.getMessage()+"]");
			return null;
		}
	}
		

	public static final String obj2str(final PersonForm p) {
		final StringBuilder sb = new StringBuilder();
		
		sb.append(p.getName()).append(";");
		sb.append(p.getAge()).append(";");
		sb.append(p.getCod()).append(";");
		sb.append(p.getRandom()).append(";");
		
		return sb.toString();
	}

}
