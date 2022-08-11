package com.security.Validation.serviceimpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.Validation.Empservice.Empservice;
import com.security.Validation.Entity.Employee;
import com.security.Validation.Repository.Empregisterrepository;
import com.security.Validation.empEntity.Empregister;


@Service
public class Empserviceimpl implements Empservice {
	
	@Autowired
	Empregisterrepository repo;

	@Override
	public void saveemp(Employee e) {
		Empregister reg=new Empregister();
		BeanUtils.copyProperties(e, reg);
		 repo.save(reg);
		 
	}

}
