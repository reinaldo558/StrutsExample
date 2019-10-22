package com.reinaldo.tests.strutsexample.common.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.reinaldo.tests.strutsexample.common.dao.DAO;
import com.reinaldo.tests.strutsexample.common.form.ListForm;

public class ReadAction extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		ListForm list = (ListForm) form;
		list.getPersons().addAll(DAO.listPerson());

		return mapping.findForward("read1");
	}

}
