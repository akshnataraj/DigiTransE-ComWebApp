package com.niit.myshopfrontend.config;

import javax.servlet.ServletContext;
import javax.servlet.*;

import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;

public class SpringWebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
//		AnnotationConfigWebApplicationContext appContext= new AnnotationConfigWebApplicationContext();
//		appContext.register(ApplicationContextConfig.class);
//		
//		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("SpringDispatcher", new DispatcherServlet(appContext));
//		dispatcher.setLoadOnStartup(1);
//		dispatcher.addMapping("/");
		
	}
	
	
	

}