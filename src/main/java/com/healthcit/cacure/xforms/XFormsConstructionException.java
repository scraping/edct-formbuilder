/*L
 * Copyright HealthCare IT, Inc.
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/edct-formbuilder/LICENSE.txt for details.
 */


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
