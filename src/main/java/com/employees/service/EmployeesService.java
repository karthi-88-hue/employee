package com.employees.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.employees.deo.Employeesdao;
import com.employees.entity.Employees;

@Service
public class EmployeesService {
@Autowired
Employeesdao ed;

public String getnamevalue(Employees j) {
	 return ed.getnamevalue(j);
}

public String getservice(List<Employees> emp) {
	return ed.getdao(emp);
}
public String getchange(Employees emp) {
	return ed.getchange(emp);
}

}
