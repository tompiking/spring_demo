package com.spring.hibernate.sevlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.spring.hibernate.service.StudentDao;
import com.spring.hibernate.tables.Student;
@WebServlet("/create")
public class CreateSevlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");
		WebApplicationContext wa = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		StudentDao sd = wa.getBean(StudentDao.class);
		System.out.println(sd);
		Integer i = 1;
		System.out.println(i);
		Student stu = sd.selectById(i);
		System.out.println(stu);
		System.out.println(stu.status);
		resp.getWriter().println("Ñ§Éú£º");
		resp.getWriter().println(stu);
		resp.getWriter().println("×´Ì¬£º");
		resp.getWriter().println(stu.status);
	}
}
