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
package org.openhealthtools.mdht.uml.cda.transform;

import static org.openhealthtools.mdht.uml.transform.ecore.BaseEcoreTransformationBuilder.adapt;

import org.openhealthtools.mdht.transform.core.ITransformation;
import org.openhealthtools.mdht.transform.core.TransformationBuilder;
import org.openhealthtools.mdht.uml.transform.ecore.BaseEcoreTransformationBuilder;
import org.openhealthtools.mdht.uml.transform.ecore.BaseEcoreTransformationBuilder.IRuleOverrideProvider;
import org.openhealthtools.mdht.uml.transform.ecore.IEcoreTransformIDs;
import org.openhealthtools.mdht.uml.transform.ecore.TransformAssociation;
import org.openhealthtools.mdht.uml.transform.ecore.TransformConstraint;
import org.openhealthtools.mdht.uml.transform.ecore.TransformInlinedProperties;
import org.openhealthtools.mdht.uml.transform.ecore.TransformPropertyConstraint;

/**
 * A transformation builder that creates the standard configuration of a UML-to-Ecore transformation.
 * Clients may further configure this transformation to suit their specialized needs.
 */
public class EcoreTransformationBuilder extends TransformationBuilder {

	protected EcoreTransformationBuilder(ITransformation product) {
		super(product);
	}

	public static TransformationBuilder create() {
		TransformationBuilder result = new EcoreTransformationBuilder(
			BaseEcoreTransformationBuilder.create(overrides()) //

			.initialization() //
			.rule(new CDAInitializeContextRule()) //
			.done() // initialization phase

			.getPhase(IEcoreTransformIDs.TRANSFORM_ELEMENTS_PHASE) //
			.rule(adapt(TransformClinicalDocument.class)) //
			.rule(adapt(TransformTemplateIdentifier.class)) //
			.done() // customizing main transformation phase

			.build()); //

		return result;
	}

	private static IRuleOverrideProvider overrides() {
		return new IRuleOverrideProvider() {

			public <T> Class<? extends T> override(Class<T> rule) {
				Class<? extends T> result = null;

				if (rule == TransformAssociation.class) {
					result = TransformCDAAssociation.class.asSubclass(rule);
				} else if (rule == TransformPropertyConstraint.class) {
					result = TransformCDAPropertyConstraint.class.asSubclass(rule);
				} else if (rule == TransformInlinedProperties.class) {
					// Use the CDA Inline transformation
					result = TransformCDAInlineProperties.class.asSubclass(rule);
				} else if (rule == TransformConstraint.class) {
					result = TransformLogicalConstraint.class.asSubclass(rule);
				}

				return result;
			}
		};
	}
}
