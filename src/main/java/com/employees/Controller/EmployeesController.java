package com.employees.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

//import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employees.entity.Employees;
import com.employees.service.EmployeesService;

@RestController
//@RequestMapping("/api")
public class EmployeesController {
	@Autowired
 EmployeesService es;
 
 @PostMapping(value="/post")
 public String getnamevalue(@RequestBody Employees j) {
	 return es.getnamevalue(j);
 }

 @PostMapping(value="/postlist")
 public String getvalue(@RequestBody List<Employees> emp) {
	 return es.getservice(emp);
 }
 
 @PutMapping(value="/putlist")
 public String getchange(@RequestBody Employees emp) {
	 return es.getchange(emp);
 }
 
}
