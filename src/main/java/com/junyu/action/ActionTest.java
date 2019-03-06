package com.junyu.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class ActionTest {
	
	@RequestMapping("hello")
	public void test(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		try {
			PrintWriter printwriter = response.getWriter();
			printwriter.println("hello=="+name);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
