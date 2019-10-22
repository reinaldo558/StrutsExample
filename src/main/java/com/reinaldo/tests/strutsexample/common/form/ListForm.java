package com.reinaldo.tests.strutsexample.common.form;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts.action.ActionForm;

public class ListForm extends ActionForm {

	private static final long serialVersionUID = -5069098153271666252L;

	public ListForm() {}
	
	private List<PersonForm> persons = new ArrayList<PersonForm>();

	public List<PersonForm> getPersons() {
		return persons;
	}

	public void setPersons(List<PersonForm> persons) {
		this.persons = persons;
	}
	
	
	
}
