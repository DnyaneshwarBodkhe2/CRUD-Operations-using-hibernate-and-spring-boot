package com.CRUD.CurdApi.Controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.CRUD.CurdApi.Model.EmployeeDetail;

@Controller
public class EmployeeController {
	@Autowired
	SessionFactory sf;

	@RequestMapping("second")
	public String get() {
		return "first";

	}

	@RequestMapping("saveinformation")
	public String m3(EmployeeDetail emp) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.persist(emp);
		t.commit();
		return "first";
	}

	@RequestMapping("updatedata")
	public String m4(EmployeeDetail emp) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.update(emp);
		t.commit();
		return "first";
	}

	@RequestMapping("deletedata")
	public String m5(String id) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		EmployeeDetail ed = s.get(EmployeeDetail.class, id);
		s.delete(ed);
		t.commit();

		return "first";

	}
}
