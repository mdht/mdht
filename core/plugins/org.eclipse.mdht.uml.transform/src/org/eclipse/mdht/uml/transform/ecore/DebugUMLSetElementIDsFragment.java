/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.transform.ecore;

import java.util.Collections;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.mdht.transform.core.ITransformContext;
import org.eclipse.mdht.transform.core.ITransformMonitor;
import org.eclipse.mdht.transform.core.RuleBuilder;
import org.eclipse.mdht.transform.core.TransformationException;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ProfileApplication;

/**
 * A rule fragment used only in debugging the UML-to-Ecore transformation, that assigns stable XMI IDs to all elements so that one can sensibly
 * compare the output model with another version.
 */
public class DebugUMLSetElementIDsFragment implements RuleBuilder.IFragmentDelegate {

	public DebugUMLSetElementIDsFragment() {
		super();
	}

	public Object apply(EObject input, Object output, ITransformContext ctx, ITransformMonitor monitor)
			throws TransformationException {

		TreeIterator<? extends EObject> iterator = EcoreUtil.getAllContents(Collections.singletonList(input));
		XMLResource resource = ((XMLResource) input.eResource());

		while (iterator.hasNext()) {
			EObject child = iterator.next();
			if ((child instanceof Constraint) || (child instanceof OpaqueExpression) || (child instanceof Operation) ||
					(child instanceof Parameter) || (child.eContainer() instanceof Parameter)) {
				UMLUtil.setEObjectID((NamedElement) child);
			} else if (child instanceof ProfileApplication) {
				resource.setID(
					child,
					String.format(
						"_apply_%s__%s",
						UML2Util.getValidJavaIdentifier(((ProfileApplication) child).getAppliedProfile().getName()),
						resource.getID(child.eContainer())));
			}

			if (child instanceof Element) {
				// handle the stereotypes on the element
				String elementID = UML2Util.getXMIIdentifier((InternalEObject) child);
				for (EObject next : ((Element) child).getStereotypeApplications()) {
					StringBuilder id = new StringBuilder(elementID);
					id.append('.').append(next.eClass().getEPackage().getName());
					id.append('.').append(next.eClass().getName());
					resource.setID(next, id.toString());
				}

				// and UML2-specific annotations
				if (child instanceof ProfileApplication) {
					String paID = resource.getID(child);
					int i = 1;
					for (EAnnotation next : ((ProfileApplication) child).getEAnnotations()) {
						resource.setID(next, paID + "$" + i++);
					}
				}
			}
		}
		return resource;
	}
}
