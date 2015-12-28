package com.praveen.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;



public class DayOffInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handlers) throws Exception{
		
		
		Calendar cal = Calendar.getInstance();
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK);
		if(dayOfWeek==2){
			response.getWriter().write("Sorry you can only access it on Weekends except Sunday..!!");
			return false;
		}
		
		
		return true;
		
	}
	
	
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handlers,ModelAndView modelAndView) throws Exception{
		
		System.out.println("Inside postHandler Method");
			}
	
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handlers,Exception ex) throws Exception{
		
		System.out.println("Inside afterCompletion Method");
		
			}


}
