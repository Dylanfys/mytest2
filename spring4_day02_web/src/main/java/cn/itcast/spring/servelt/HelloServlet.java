package cn.itcast.spring.servelt;

import cn.itcast.spring.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//传统方式：
		//new service
		//HelloService helloService = new HelloService();
		//spring方式：只要看到new，你就想到spring容器中的<bean>
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloService helloService = (HelloService) applicationContext.getBean("helloService");
        WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        HelloService helloService1 = ac.getBean(HelloService.class);
        helloService1.sayHello();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}