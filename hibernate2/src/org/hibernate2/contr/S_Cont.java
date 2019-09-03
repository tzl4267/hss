package org.hibernate2.contr;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.MapKey;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate2.pojo.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@Transactional
@RequestMapping(value="/contr")
@SessionAttributes(names="list")
public class S_Cont {
	
	
	@Resource
	private SessionFactory sf;
	
	@ModelAttribute(value="list")
	public List get_emp(){
		List list = new ArrayList<>();
		
		System.err.println("srr");
		return list;
	}
	
	@RequestMapping(value="/show")
	public String show(@ModelAttribute("list") List list){
		Session session = sf.openSession();
		
		
		Emp e = new Emp();
		
		
		e = session.get(Emp.class, 3);
		list.add(e);
		
		return "show";
	}
}
