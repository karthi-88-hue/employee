package com.employees.deo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employees.entity.Employees;
import com.employees.repository.EmployeesRepository;

@Repository
public class Employeesdao {
@Autowired
EmployeesRepository er;

public String getnamevalue(Employees j) {
	 er.save(j);
	 return "Post Success";
}

public String getdao(List<Employees>emp) {
	er.saveAll(emp);
	return "post success";
}

public String getchange(Employees emp) {
	er.save(emp);
	return "update success";
}

}
