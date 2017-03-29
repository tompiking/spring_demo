package com.spring.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.hibernate.tables.Student;

@Service
@Transactional
public class StudentDao {
	@Autowired
    private HibernateManager hibernateManager;
	
	public void save(Student bean){
		hibernateManager.save(bean);
	}
	
	public Student selectById(Integer id){
		return hibernateManager.selectById(id,Student.class);
	}
	
}
