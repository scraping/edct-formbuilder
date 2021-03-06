/*L
 * Copyright HealthCare IT, Inc.
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/edct-formbuilder/LICENSE.txt for details.
 */


package com.healthcit.cacure.web.editors;

import java.beans.PropertyEditorSupport;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import com.healthcit.cacure.model.admin.GeneratedModuleDataDetail;

public class GeneratedModuleDataPropertyEditor extends PropertyEditorSupport {
	
	private static String MODULE_ID = "moduleId";
	private static String NUM_MODULE_INSTANCES = "numberOfModuleInstances";
	private static String NUMENTITIES = "numberOfEntities";
	private static String QUESTIONFIELDS = "questionFields";
	private static String COUCHDB_HOST = "couchDbHost";
	private static String COUCHDB_PORT = "couchDbPort";
	private static String COUCHDB_NAME = "couchDbName";
	
	/**
	 * Default constructor
	 */
	public GeneratedModuleDataPropertyEditor()
	{		
	}

	@Override
	public String getAsText() 
	{
		GeneratedModuleDataDetail data = ( GeneratedModuleDataDetail ) getValue();
		
		if ( data == null ) data = new GeneratedModuleDataDetail();
			
		return ( JSONObject.fromObject( data ).toString() );
	}

	@SuppressWarnings({"unchecked"})
	@Override
	public void setAsText(String text) throws IllegalArgumentException 
	{
		
		JSONObject jsonData = JSONObject.fromObject( text );
		
		GeneratedModuleDataDetail data = new GeneratedModuleDataDetail();
		
		// CouchDB Host
		data.setCouchDbHost( jsonData.getString( COUCHDB_HOST ) );
		
		// CouchDB Port
		data.setCouchDbPort( jsonData.getInt( COUCHDB_PORT ) );
		
		// CouchDB Name
		data.setCouchDbName( jsonData.getString( COUCHDB_NAME ) );
				
		// Module Id
		data.setModuleId( jsonData.getString( MODULE_ID ));
		
		// Number of documents
		data.setNumberOfModuleInstances( jsonData.getInt( NUM_MODULE_INSTANCES ) );
		
		// Number of entities
		data.setNumberOfEntities( jsonData.getInt( NUMENTITIES ) );
		
		// Questions				
		data.setQuestionFields( ( List<Map<String,Object>> )jsonData.get( QUESTIONFIELDS ) );
		
		// set value
		setValue( data );
	}	
}
