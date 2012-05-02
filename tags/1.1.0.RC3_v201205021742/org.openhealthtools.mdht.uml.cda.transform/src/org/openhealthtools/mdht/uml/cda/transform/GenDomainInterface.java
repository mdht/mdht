/*******************************************************************************
 * Copyright (c) 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - eliminating duplicate comments from classes
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.transform;

import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelConsolidator;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;

public class GenDomainInterface extends TransformFacade {
	private GenDomainProperty genDomainProperty;

	public GenDomainInterface(TransformerOptions options, CDAModelConsolidator consolidator) {
		super(options, consolidator);
		this.genDomainProperty = new GenDomainProperty(transformerOptions, consolidator);
	}

	@Override
	public Object caseElementImport(ElementImport elementImport) {
		// a class may be imported into this domain facade interface
		Element element = elementImport.getImportedElement();
		if (element instanceof Class) {
			return caseClass((Class) element);
		}
		return null;
	}

	@Override
	public Object caseClass(Class umlClass) {
		if (CDAModelUtil.getCDAClass(umlClass) == null) {
			System.err.println("Does not inherit from CDA: " + umlClass.getQualifiedName());
			return null;
		}

		Classifier domainInterface = getDomainInterface(umlClass);
		if (consolidator != null) {
			consolidator.getImportedClassifiers().remove(umlClass);
			consolidator.addProcessedClassifier(umlClass);
		}

		if (transformerOptions.isIncludeInterfaceRealization() && domainInterface instanceof Interface) {
			umlClass.createInterfaceRealization(null, (Interface) domainInterface);
		}

		// copy comments for use in Javadoc
		for (Comment comment : umlClass.getOwnedComments()) {
			Comment clone = EcoreUtil.copy(comment);
			clone.getAnnotatedElements().clear();
			clone.getAnnotatedElements().add(domainInterface);
			domainInterface.getOwnedComments().add(clone);
		}

		// add hyperlink to implementation guide
		Comment igLink = domainInterface.createOwnedComment();
		igLink.getAnnotatedElements().add(domainInterface);
		// String igURL = "http://www.cdatools.org/infocenter/topic/org.openhealthtools.mdht.uml.cda.hitsp.doc/classes/DiagnosticResultsSection.html";
		String igURL = "http://www.cdatools.org/infocenter/index.jsp";
		igLink.setBody("<p>Refer to full implementation guide <a href=\"" + igURL + "\"/>specification</a>.</p>");

		// interface generalization
		for (Generalization generalization : umlClass.getGeneralizations()) {
			// TODO ultimately want to support domain interfaces in other models
			if (UMLUtil.isSameModel(umlClass, generalization.getGeneral())) {
				Classifier extendsInterface = getDomainInterface(generalization.getGeneral());
				if (extendsInterface != null) {
					domainInterface.createGeneralization(extendsInterface);
				}
			}
		}

		Class cdaType = CDAModelUtil.getCDAClass(umlClass);
		if (cdaType != null) {
			if (domainInterface instanceof Interface) {
				// toCDAType() operation
				String operationName = "getCDAType";
				Operation operation = ((Interface) domainInterface).createOwnedOperation(
					operationName, null, null, cdaType);
				operation.setIsQuery(true); // make this a query method

				// create body constraint to implement the operation
				StringBuffer operationBody = new StringBuffer();
				operationBody.append("self.oclAsType(" + cdaType.getQualifiedName() + ")");
				addBodyExpression(operation, "OCL", operationBody.toString());
			} else {
				((Class) domainInterface).createOwnedAttribute("cDAType", cdaType);
			}
		}

		List<Property> allProperties;
		if (consolidator != null) {
			allProperties = consolidator.getAllProperties(umlClass);
		} else {
			allProperties = umlClass.getOwnedAttributes();
		}
		for (Property property : allProperties) {
			genDomainProperty.addProperty(property, umlClass);
		}

		return domainInterface;
	}

	protected void addBodyAnnotation(Operation operation, String body) {
		EcoreUtil.setAnnotation(operation, "http://www.eclipse.org/emf/2002/GenModel", "body", body);
	}

	protected void addBodyExpression(Operation operation, String language, String body) {
		Constraint bodyConstraint = operation.createBodyCondition("body");
		bodyConstraint.getConstrainedElements().add(operation);

		OpaqueExpression bodyExpression = (OpaqueExpression) bodyConstraint.createSpecification(
			null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
		bodyExpression.getLanguages().add(language);
		bodyExpression.getBodies().add(body);
	}

}
