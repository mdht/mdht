/*******************************************************************************
 * Copyright (c) 2009 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir (JKMSoftware) - initial implementation
 *     
 * $Id$
 *******************************************************************************/

package org.openhealthtools.mdht.uml.hdf.ui.properties;

import org.eclipse.uml2.uml.Enumeration;

public interface IVocabularySelectionDelegate {
	
	static public enum Constraint {
	    CONCEPTS,CODESYSTEMS,VALUESSETS,ENUMERATIONS   	
	}
	
	static public final String EXTENSION_POINT="org.openhealthtools.mdht.uml.hdf.vocabularyprovider";
	
	static public final String CONFIGURATION_ELEMENT = "vocabularyprovider";
	
	static public final String SELECTION_DELEGATE="selectiondelegate";
	
	
	public IVocabularyConstraint chooseVocabularyConstraint(org.eclipse.swt.widgets.Shell shell, org.eclipse.uml2.uml.Property property,Constraint constraint );
	
	public interface IVocabularyConstraint
	{
		
	}
	
	public interface IConceptConstraint extends IVocabularyConstraint {
		String getConcept();
	}
	
	public interface ICodeSystemConstraint extends IVocabularyConstraint {
		String getSystemOid();
		String getCode();
		String getCodePrintName();
		String getSystemName();
		String getSystemVersion();
		
	}
	
	public interface IValueSetConstraint extends IVocabularyConstraint 
	{
		String getID();
		String getName();
		String getVersionDate();
		
	}
	
	public interface IEnumerationsConstraint extends IVocabularyConstraint 
	{
		Enumeration getEnumeration();
	}
	
	

}
