package com.ljw.spring.start.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class SecurityFilter extends HttpServlet implements Filter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public final String www_url_encode= "application/x-www-form-urlencoded";
	public final String mul_data= "multipart/form-data ";
	public final String txt_pla= "text/plain";
	public final String txt_htm= "text/html";
	public final String application_json= "application/json";

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {

		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		
		String contenType=httpServletRequest.getHeader("Content-Type");
		
		if(contenType!=null
				&&!contenType.equals("")
				&&!contenType.equalsIgnoreCase(www_url_encode)
				&&!contenType.equalsIgnoreCase(mul_data)
				&&!contenType.equalsIgnoreCase(txt_pla)
				&&!contenType.equalsIgnoreCase(txt_htm)
				&&!contenType.equalsIgnoreCase(application_json)
				&&contenType.indexOf(www_url_encode)!=0
				&&contenType.indexOf(mul_data)!=0
				&&contenType.indexOf(txt_pla)!=0
				&&contenType.indexOf(txt_htm)!=0
				&&contenType.indexOf(application_json)!=0){
			
			
			
			httpServletResponse.setContentType("text/html;charset=UTF-8");
			httpServletResponse.getWriter().write("非法请求Content-Type");
			return;
		}
		filterChain.doFilter(httpServletRequest, httpServletResponse);
	}

	public void init(FilterConfig arg0) throws ServletException {

	}

}
