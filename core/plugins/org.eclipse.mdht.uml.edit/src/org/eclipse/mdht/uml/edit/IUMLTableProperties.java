/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.edit;

import org.eclipse.uml2.uml.UMLPackage;

/**
 *
 * @version $Id: $
 */
public class IUMLTableProperties {

	public static final int NAME_INDEX = 0;

	public static final int TYPE_INDEX = 1;

	public static final int MULTIPLICITY_INDEX = 2;

	public static final int AGGREGATION_INDEX = 3;

	public static final int VISIBILITY_INDEX = 4;

	public static final int ANNOTATION_INDEX = 5;

	public static final int DEFAULT_VALUE_INDEX = 6;

	public static final String NAME_PROPERTY = UMLPackage.eINSTANCE.getNamedElement_Name().getName();

	public static final String TYPE_PROPERTY = UMLPackage.eINSTANCE.getTypedElement_Type().getName();

	public static final String MULTIPLICITY_PROPERTY = "multiplicity";

	public static final String AGGREGATION_PROPERTY = UMLPackage.eINSTANCE.getProperty_Aggregation().getName();

	public static final String VISIBILITY_PROPERTY = UMLPackage.eINSTANCE.getNamedElement_Visibility().getName();

	public static final String ANNOTATION_PROPERTY = "annotation";

	public static final String DEFAULT_VALUE_PROPERTY = UMLPackage.eINSTANCE.getProperty_DefaultValue().getName();

}
