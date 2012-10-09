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
package com.healthcit.cacure.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;

@Entity
@Table(name="table_columns_vw")
public class TableColumn {

	@Id
//	@SequenceGenerator(name="genericSequence", sequenceName="\"GENERIC_ID_SEQ\"", allocationSize=1)
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="genericSequence")
	protected Long id;

	@ManyToOne
//	@JoinColumn(name="table_id", insertable=false, updatable=false)
	@Formula(value="(select table_id from table_columns_vw where table_id=table limit 1)")
	private TableElement table;

	@Formula(value="(select value from table_columns_vw  limit 1)")
	private String value;
	
	@Formula(value="(select heading from table_columns_vw  limit 1)")
	private String heading;
	
	@Column(name="ord", nullable=false)
	private int order;
	
	public static void copy(TableColumn source, TableColumn target)
	{
		target.setHeading(source.getHeading());
		target.setOrder(source.getOrder());
		target.setValue(source.getValue());
	}
	
	public TableColumn clone() {
		TableColumn o = new TableColumn();
		copy(this, o);
		return o;
	}
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setValue(String value)
	{
		this.value = value;
	}
	
	public String getValue()
	{
		return this.value;
	}
	public void setHeading(String text)
	{
		heading = text;
	}
	
	public String getHeading()
	{
		return heading;
	}
	
	public void setOrder(int order)
	{
		this.order = order;
	}
	
	public int getOrder()
	{
		return order;
	}
	
	public TableElement getTable()
	{
		return table;
	}
	
	public void setTable(TableElement table)
	{
		this.table = table;
	}
	
}
