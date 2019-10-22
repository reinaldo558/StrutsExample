package com.reinaldo.tests.strutsexample.common.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.reinaldo.tests.strutsexample.common.dao.DAO;
import com.reinaldo.tests.strutsexample.common.form.PersonForm;

public class CreateAction extends Action {
	
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		final String param = req.getParameter("action");
		
		if ("C2".equals(param)) {
			return create(mapping, form, req, res);
		} else {
			return prepareCreate(mapping, form, req, res);
		}
	}
	
	
	public ActionForward prepareCreate(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse res) throws Exception {
		((PersonForm) form).invalidate();
		return mapping.findForward("create1");
	}
	
	public ActionForward create(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		PersonForm person = (PersonForm) form;
		PersonForm newPerson = DAO.create(person);
		
		person.setCod(newPerson.getCod());
		person.setRandom(newPerson.getRandom());
		
		return mapping.findForward("create2");
	}

}
