package com.SpringBootPractice2.SpringBootFurnitureStore.FurnitureController;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.SpringBootPractice2.SpringBootFurnitureStore.Model.Furniture;


import jakarta.persistence.Query;


@Controller
public class FurnitureController {

	@Autowired
	SessionFactory sf;

	@RequestMapping("/")
	public String name() {
		return "save";
	}

	@RequestMapping("/save")
	public ModelAndView save(Furniture furniture) {
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("save");
		ss.save(furniture);
		tx.commit();
		return mv;
	}
	@RequestMapping("/update")
	public ModelAndView Update(Furniture furniture) {
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("save");
		ss.update(furniture);
		tx.commit();
		return mv;
	}

	@RequestMapping("/delete")
	public ModelAndView Delete(int id) {
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Furniture furniture = ss.get(Furniture.class, id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("save");
		ss.delete(furniture);
		tx.commit();
		return mv;
	}

	@RequestMapping("/viewtable")
	public ModelAndView viewtable() {
		Session ss = sf.openSession();
		Query query = ss.createQuery("from Furniture");
		List<Furniture> al = ((org.hibernate.query.Query) query).list();
		ModelAndView view = new ModelAndView();
		view.addObject("al", al);
		System.out.println(al);
		view.setViewName("viewtable");
		return view;
	}
}
