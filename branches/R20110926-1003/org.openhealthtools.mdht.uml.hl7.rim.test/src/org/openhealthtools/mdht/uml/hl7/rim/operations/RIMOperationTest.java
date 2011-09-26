/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.rim.operations;

import org.eclipse.emf.ecore.EObject;

/**
 * This class is the super class of all JUnit 4 test cases for RIM operations
 */
public abstract class RIMOperationTest {

	protected abstract EObject getObjectToTest();

	/**
	 * This is not currently used, but is implemented in many subclasses.
	 * 
	 * @return the initialized EObject instance to test
	 */
	protected EObject getObjectInitToTest() {
		return null;
	}

} // RimOperationTest
