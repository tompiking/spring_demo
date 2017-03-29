package com.spring.hibernate.service;

import java.util.Map;

import org.hibernate.SessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateManager {
	@Autowired
    protected SessionFactory sessionFactory;
	@Autowired
	protected SqlSessionTemplate sqlSession;
	
	public void save(Object bean){
		sessionFactory.getCurrentSession().save(bean);
	}
	
	public <T> T selectById(Integer id,Class<T> clazz){
		System.out.println("==========="+sqlSession);
		String statement = "com.qingke.mybatis.mapping.student.selectOneStudent";
		Object a = sqlSession.selectOne(statement, 4);
		System.out.println(a);
		
		return sessionFactory.getCurrentSession().get(clazz, id);
	}
}
