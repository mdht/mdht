/*******************************************************************************
 * Copyright (c) 2011 David A Carlson.
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
package org.openhealthtools.mdht.uml.cda.transform;

import org.eclipse.emf.common.util.BasicEList.UnmodifiableEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint;
import org.openhealthtools.mdht.uml.term.core.util.TermProfileUtil;


public class GenDomainProperty extends TransformAbstract {

	public GenDomainProperty(EcoreTransformerOptions options) {
		super(options);
	}
	
	public Object caseProperty(Property property) {
		if (isRemoved(property)) {
			return null;
		}
		
		// only process properties that are owned by a Class
		if (property.getClass_() == null) {
			return null;
		}
		
		// if greenCDA style interfaces, omit all operations for fixed values
		if (isFixedValue(property) && !transformerOptions.isIncludeFixedValueGetters()) {
			return null;
		}
		
		// TODO omit classCode, moodCode for now due to incompatible enum types with CDA base model
		// also, most or all class/mood codes should be defaulted in greenCDA
		if (property.getType() instanceof Enumeration) {
			return null;
		}
		
		Interface domainInterface = getDomainInterface(property.getClass_());
		Type domainType = property.getType();
		if (UMLUtil.isSameModel(property.getType(), property.getClass_())) {
			domainType = getDomainInterface(property.getType());
		}
		
		String businessName = normalizeCodeName(property.getLabel(false));

		/* TODO
		 * 	- 
		 */
		
		// "getter" operation
		Operation getOperation = null;
		if (property.getAssociation() != null) {
			getOperation = GenMethodHelper.genAssociationGetterOperation(property, domainType);
			if (getOperation != null) {
				domainInterface.getOwnedOperations().add(getOperation);

				// copy comments for use in Javadoc
				for (Comment comment : property.getAssociation().getOwnedComments()) {
					Comment clone = EcoreUtil.copy(comment);
					clone.getAnnotatedElements().add(getOperation);
					getOperation.getOwnedComments().add(clone);
				}
			}
		}
		else {
			String getOperationName = "get";
			getOperationName += ((property.getUpper() == 1) ? capitalize(businessName) : capitalize(pluralize(businessName)));
			getOperation = domainInterface.createOwnedOperation(getOperationName, null, null, domainType);
			getOperation.setIsQuery(true);	// make this a query method
			getOperation.setUpper(property.getUpper());

			// copy comments for use in Javadoc
			for (Comment comment : property.getOwnedComments()) {
				Comment clone = EcoreUtil.copy(comment);
				clone.getAnnotatedElements().add(getOperation);
				getOperation.getOwnedComments().add(clone);
			}
		}
		
		if (getOperation != null) {
			// TODO get full XPath of this element in CDA
			// add simple comment so that OCL does not display as short javadoc summary
			// add as first comment so that it is always displayed as method summary
			Property docProperty = CDAModelUtil.getCDAProperty(property);
			if (docProperty == null) {
				docProperty = property;
			}
			Comment comment = UMLFactory.eINSTANCE.createComment();
			getOperation.getOwnedComments().add(0, comment);
			comment.getAnnotatedElements().add(getOperation);
			String xpath = docProperty.getQualifiedName();
			comment.setBody(xpath + ".");
		}
		
		// update operations
		if (!isFixedValue(property)) {
			Operation createOperation = null;
			Operation updateOperation = null;

			// "create" operation for non-datatype properties
			if (!CDAModelUtil.isDatatypeModel(domainType)) {
				String operationName = "create" + capitalize(businessName);
				createOperation = domainInterface.createOwnedOperation(operationName, null, null, domainType);
			}
			
			// "setter" operation
			if (property.getUpper() == 1) {
				String operationName = "set" + capitalize(businessName);
				String[] paramNamesArray = {"value"};
				EList<String> parmNames = new UnmodifiableEList<String>(1, paramNamesArray);
				Type[] paramTypesArray = {domainType};
				EList<Type> parmTypes = new UnmodifiableEList<Type>(1, paramTypesArray);
				
				// "fluent" API style, returns self
//				updateOperation = domainInterface.createOwnedOperation(operationName, parmNames, parmTypes, domainInterface);
				updateOperation = domainInterface.createOwnedOperation(operationName, parmNames, parmTypes, null);
			}
			
			// "add" operation
			if (property.getUpper() > 1 || property.getUpper() == -1) {
				String operationName = "add" + capitalize(businessName);
				String[] paramNamesArray = {"value"};
				EList<String> parmNames = new UnmodifiableEList<String>(1, paramNamesArray);
				Type[] paramTypesArray = {domainType};
				EList<Type> parmTypes = new UnmodifiableEList<Type>(1, paramTypesArray);
				
				// "fluent" API style, returns self
				updateOperation = domainInterface.createOwnedOperation(operationName, parmNames, parmTypes, domainInterface);
			}

			// add UML comment with CDA conformance rule expression
			String conformanceText = CDAModelUtil.computeConformanceMessage(property, true);
			if (!conformanceText.endsWith(".")) {
				// for Javadoc to terminate short description
				conformanceText += ".";
			}
			if (createOperation != null) {
				Comment conformanceRule = createOperation.createOwnedComment();
				conformanceRule.getAnnotatedElements().add(createOperation);
				conformanceRule.setBody(conformanceText);
			}
			if (updateOperation != null) {
				Comment conformanceRule = updateOperation.createOwnedComment();
				conformanceRule.getAnnotatedElements().add(updateOperation);
				conformanceRule.setBody(conformanceText);
			}
		}
		
		return property;
	}
	
	private boolean isFixedValue(Property property) {
		if (property.isReadOnly()) {
			return true;
		}
		else if (SEVERITY_ERROR.equals(CDAModelUtil.getValidationSeverity(property))) {
			// SHALL contain a specific code
			CodeSystemConstraint codeSystemConstraint = TermProfileUtil.getCodeSystemConstraint(property);
			if (codeSystemConstraint != null) {
				String code= codeSystemConstraint.getCode();
				if (code != null) {
					return true;
				}
			}
		}
		
		return false;
	}
}
