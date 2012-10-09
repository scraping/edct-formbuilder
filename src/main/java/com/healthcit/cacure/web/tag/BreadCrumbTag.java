/*******************************************************************************
 * Copyright (c) 2012 HealthCare It, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the BSD 3-Clause license
 * which accompanies this distribution, and is available at
 * http://directory.fsf.org/wiki/License:BSD_3Clause
 * 
 * Contributors:
 *     HealthCare It, Inc - initial API and implementation
 ******************************************************************************/
package com.healthcit.cacure.web.tag;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;

import com.healthcit.cacure.model.breadcrumb.BreadCrumb;
import com.healthcit.cacure.model.breadcrumb.BreadCrumb.Link;

public class BreadCrumbTag extends TagSupport {

	private static final long serialVersionUID = 1L;

	private BreadCrumb breadCrumb;
	
	public void setBreadCrumb(BreadCrumb breadCrumb) {
		this.breadCrumb = breadCrumb;
	}
	
	@Override
	public int doStartTag() throws JspException {
		StringBuilder breadCrumbString = new StringBuilder();
		Link link = this.breadCrumb.getLink();
		String contextPath = ((HttpServletRequest) this.pageContext.getRequest()).getContextPath();
		breadCrumbString.append("<div id=\"tocDiv\">");
		while(link != null)
		{
			if(link.hasChild())
			{
				breadCrumbString
						.append("<a href=\"")
						.append(contextPath)
						.append(link.getUrl()).append("\">");
				breadCrumbString.append(link.getName());
				breadCrumbString.append("</a>");
				breadCrumbString.append("<span class='breadcrumb_next_level_arrow' name_all_json_src='");
				breadCrumbString.append(contextPath);
				breadCrumbString.append(link.getNameAllUrl());
				breadCrumbString.append("'>&nbsp;&nbsp;</span>");
			} else {
				breadCrumbString.append("<span>").append(link.getName()).append("</span>");
			}
			
			link = link.getChildLink();
		}
		breadCrumbString.append("</div>");
		try {
			this.pageContext.getOut().write(breadCrumbString.toString());
		} catch (IOException e) {
			throw new JspTagException("Error: IOException while writing to the user");
		}
		return SKIP_BODY;
	}
}
