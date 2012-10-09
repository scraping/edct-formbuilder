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
package com.healthcit.cacure.xforms;

public class XFormsConstructionException extends RuntimeException
{
	private static final long serialVersionUID = 1907830304815767153L;

	public XFormsConstructionException()
	{
		super();
	}

	public XFormsConstructionException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public XFormsConstructionException(String message)
	{
		super(message);
	}

	public XFormsConstructionException(Throwable cause)
	{
		super(cause);
	}

}
