package com.spring.hibernate.tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="student")
//@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {
	@Id
	@Column(name="id")
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator",strategy = "increment")
	public 	Integer id;
	
	@Column(name="sid")
	public String sid;
	
	@Column(name="firstname")
	public 	String first;
	
	@Column(name="lastname")
	public 	String last;
	
	@Column(name="gender")
	public 	String gender;
	
	@Column(name="email")
	public 	String email;
	
	@Column(name="date_of_birth")
	public 	String date_of_birth;
	
//	@Column(name="student_status_id")
//	public Integer student_status_id;
	
	@ManyToOne
	@JoinColumn(name="student_status_id")
	public StudentStatus status;
	
//	@OneToOne(mappedBy="student")
//	public StudentStatus status;
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + " id="+id+" firstName="+first+" lastName="+last+"]";
	}
}
