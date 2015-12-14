/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package traceability.presentation.table;

/**
 * Represents a value of a cell, when a cell can have multiple values used in different projects compared to each other
 */
public class TableCellDifference {

	/**
	 * The Eclipse project name
	 */
	private String project;

	/**
	 * The cell value as string
	 */
	private String cellText;

	/**
	 * Indicating deletion / addition
	 */
	private String diffText;

	public TableCellDifference(String cellText, String project, String diffText) {
		this.cellText = cellText;
		this.project = project;
		this.diffText = diffText;
	}

	public String getDiffText() {
		return diffText;
	}

	public String getProject() {
		return project;
	}

	public String getCellText() {
		return cellText;
	}

	public void setDiffText(String dIFF_UNEQUAL) {
		diffText = dIFF_UNEQUAL;

	}

}
