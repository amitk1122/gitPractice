package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.model.Employee;
import com.company.service.HomeService;

@Controller
public class HomeController 
{
	@Autowired
	HomeService hs;
	
	@RequestMapping("/")
	public String preLogin()
	{
                System.out.println("amit11");
		return "login";
	}
	
	@RequestMapping("/regi")
	public String preRegis()
	{
		return "registration";
	}
	
	@RequestMapping("/reg")
	public String regData(@ModelAttribute Employee e)
	{
		hs.saveData(e);
		
		return "login";
	}
	
	@RequestMapping("/log")
	public String loginCheck(@RequestParam("uname") String un,@RequestParam("password")String ps,Model m)
	{
		Employee e=hs.loginCheck(un,ps);
		Iterable<Employee> list=hs.displayAllData();
		m.addAttribute("data", list);
		return "success";
	}
	
	@RequestMapping("/delete")
	public String deleteData(@ModelAttribute Employee e,Model m)
	{
		hs.deleteData(e);
		Iterable<Employee> list=hs.displayAllData();
		m.addAttribute("data", list);
		return"success";
	}
	
	@RequestMapping("/edit")
	public String editData(@RequestParam("id") int id,Model m)
	{
		Employee e=hs.editData(id);
		m.addAttribute("data", e);
		return "edit";
	}
	
	@RequestMapping("/update")
	public String updateData(@ModelAttribute Employee e,Model m)
	{
		hs.saveData(e);
		Iterable<Employee> list=hs.displayAllData();
		m.addAttribute("data", list);
		return "success";
	}
	
	

}
