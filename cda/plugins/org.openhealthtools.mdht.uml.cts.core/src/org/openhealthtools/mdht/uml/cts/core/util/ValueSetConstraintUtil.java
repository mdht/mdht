/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *    
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cts.core.util;

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

public class ValueSetConstraintUtil {
	public static final String getOCL(Property property) {
		StringBuffer body = new StringBuffer();
		boolean needsAnd = false;
		
		Stereotype valueSetConstraint = CTSProfileUtil.getAppliedCTSStereotype(property, 
				ICTSProfileConstants.VALUE_SET_CONSTRAINT);
		Enumeration reference = (Enumeration) property.getValue(valueSetConstraint, 
				ICTSProfileConstants.VALUE_SET_CONSTRAINT_REFERENCE);
		if (reference != null) {
			// get code system ID from ValueSet stereotype
			Enumeration valueSet = (Enumeration) property.getValue(
					valueSetConstraint, ICTSProfileConstants.VALUE_SET_CONSTRAINT_REFERENCE);
			Stereotype valueSetStereotype = null;
			if (valueSet != null) {
				valueSetStereotype = CTSProfileUtil.getAppliedCTSStereotype(
						valueSet, ICTSProfileConstants.VALUE_SET_VERSION);
			}
			if (valueSetStereotype != null) {
//				
//				String codeSystemId = (String) valueSet.getValue(valueSetStereotype, 
//						ICTSProfileConstants.VALUE_SET_CODE_SYSTEM_ID);
				String codeSystemId = null;
			
				if (codeSystemId != null && codeSystemId.length() > 0) {
					if (needsAnd) {
						body.append(" and ");
					}
					body.append("value.codeSystem = '");
					body.append(codeSystemId);
					body.append("'");
					needsAnd = true;
				}
			}
		}
		
		return body.toString();
	}
}
