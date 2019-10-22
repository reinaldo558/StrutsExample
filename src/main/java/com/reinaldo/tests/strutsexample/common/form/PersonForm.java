package com.reinaldo.tests.strutsexample.common.form;

import org.apache.struts.action.ActionForm;

public class PersonForm extends ActionForm implements Comparable<PersonForm>{
	
	private static final long serialVersionUID = 4052468199314643985L;
	
	private String name;
	private int age;
	private int cod;
	private String random;
	
	public PersonForm() {}
	
	public void invalidate() {
		name = null;
		age = 0;
		cod = 0;
		random = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getRandom() {
		return random;
	}

	public void setRandom(String random) {
		this.random = random;
	}

	@Override
	public int compareTo(PersonForm param) {
		final Integer o1 = getCod();
		final Integer o2 = param.getCod();
		return o1.compareTo(o2);
	}
	
	
	
		
}