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
package com.healthcit.cacure.model.breadcrumb;

import com.healthcit.cacure.model.BaseForm;

/**
 * Breadcrumb for Add/Edit table question pages.
 *
 */
public class TableQuestionBreadCrumb extends FormDetailsBreadCrumb {
	
	private Action action;
	
	public TableQuestionBreadCrumb(BaseForm form, Action action) {
		super(form);
		this.action = action;
	}
	
	@Override
	public Link getLink() {
		Link link = super.getLink();
		Link currentLink = null;
		if(Action.ADD.equals(this.action))
		{
			currentLink = new Link("Add Table Question", null, this);
		} else if(Action.EDIT.equals(this.action)) {
			currentLink = new Link("Edit Table Question", null, this);
		}
		this.addLastChild(link, currentLink);
		return link;
	}
}
