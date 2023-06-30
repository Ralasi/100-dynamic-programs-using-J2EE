package com.tutorialandexample;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class customTagHandler extends SimpleTagSupport {
	
	public void doTag() throws JspException,IOException
	{
	JspWriter jw=getJspContext().getOut();
	jw.println("<h2>JSP Custom Tag</h2>");
	}

}
