/*******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hdf.ui.clone;

import org.eclipse.uml2.uml.Class;

public class CloneClass {
	//the Class that constructed with the clone data
	private Class cloneData = null;
	
	//the stereotype that may be used to apply to the cloneData
	private Class stereotype = null;
	public Class getData() {
		return cloneData;
	}
	public void setData(Class data) {
		this.cloneData = data;
	}
	public Class getStereotype() {
		return stereotype;
	}
	public void setStereotype(Class stereotype) {
		this.stereotype = stereotype;
	}
}
