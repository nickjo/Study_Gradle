package com.dynamic.tutorial;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.dynamic.tutorial.config.TutorialConfig;

public class TutorialInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(final ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		registerDispatcherServlet(servletContext);
	}
	
	private void registerDispatcherServlet(ServletContext servletContext){
		WebApplicationContext dispatcherContext = createContext(TutorialConfig.class);
		DispatcherServlet dispatcherServlet = new DispatcherServlet(dispatcherContext);
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", dispatcherServlet);
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("*.do");
	}
	
	private WebApplicationContext createContext(Class<?>... annotatedClasses){
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(annotatedClasses);
		return context;
	}
	

}
