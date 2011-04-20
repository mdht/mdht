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

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Operation;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class GenDomainInterface extends TransformAbstract {
	public GenDomainInterface(EcoreTransformerOptions options) {
		super(options);
	}
	
	public Object caseClass(Class umlClass) {
		Interface domainInterface = getDomainInterface(umlClass);
		
		// copy comments for use in Javadoc
		for (Comment comment : umlClass.getOwnedComments()) {
			Comment clone = EcoreUtil.copy(comment);
			clone.getAnnotatedElements().add(domainInterface);
			domainInterface.getOwnedComments().add(clone);
		}

		// add hyperlink to implementation guide
		Comment igLink = domainInterface.createOwnedComment();
		igLink.getAnnotatedElements().add(domainInterface);
		//String igURL = "http://www.cdatools.org/infocenter/topic/org.openhealthtools.mdht.uml.cda.hitsp.doc/classes/DiagnosticResultsSection.html";
		String igURL = "http://www.cdatools.org/infocenter/index.jsp";
		igLink.setBody("<p>Refer to full implementation guide <a href=\""+igURL+"\"/>specification</a>.</p>");
		
		// interface generalization
		for (Generalization generalization : umlClass.getGeneralizations()) {
			//TODO ultimately want to support domain interfaces in other models
			if (UMLUtil.isSameModel(umlClass, generalization.getGeneral())) {
				Interface extendsInterface = getDomainInterface(generalization.getGeneral());
				if (extendsInterface != null) {
					domainInterface.createGeneralization(extendsInterface);
				}
			}
		}

		Class cdaType = CDAModelUtil.getCDAClass(umlClass);
		if (cdaType != null) {
			// toCDAType() operation
			String operationName = "toCDAType";
			Operation operation = domainInterface.createOwnedOperation(operationName, null, null, cdaType);
			operation.setIsQuery(true);	// make this a query method
		}
		
		return domainInterface;
	}
	
}
