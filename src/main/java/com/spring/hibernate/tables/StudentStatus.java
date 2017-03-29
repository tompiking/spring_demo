package com.spring.hibernate.tables;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.boot.CacheRegionDefinition.CacheRegionType;
@Entity
@Table(name="student_status")
//@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class StudentStatus {
	@Id
	@Column(name="id")
	public Integer id;
	
	@Column(name="name")
	public String name;
	
	@OneToMany
	@JoinColumn(name="student_status_id")
	public List<Student> students;

//	@OneToOne
//	@PrimaryKeyJoinColumn
//	public Student student;
	
	@Override
	public String toString() {
		return "StudentStatus [id=" + id + ", name=" + name + "]";
	}
}
