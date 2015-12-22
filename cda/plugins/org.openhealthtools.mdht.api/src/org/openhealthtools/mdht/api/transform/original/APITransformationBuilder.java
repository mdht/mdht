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
package org.openhealthtools.mdht.api.transform.original;

import static org.openhealthtools.mdht.uml.transform.ecore.BaseEcoreTransformationBuilder.adapt;

import org.openhealthtools.mdht.transform.core.IRule;
import org.openhealthtools.mdht.transform.core.ITransformation;
import org.openhealthtools.mdht.transform.core.TransformationBuilder;
import org.openhealthtools.mdht.uml.cda.transform.CDAInitializeContextRule;
import org.openhealthtools.mdht.uml.cda.transform.TransformClinicalDocument;
import org.openhealthtools.mdht.uml.cda.transform.TransformTemplateIdentifier;
import org.openhealthtools.mdht.uml.transform.ecore.BaseEcoreTransformationBuilder;
import org.openhealthtools.mdht.uml.transform.ecore.BaseEcoreTransformationBuilder.IRuleOverrideProvider;
import org.openhealthtools.mdht.uml.transform.ecore.IEcoreTransformIDs;
import org.openhealthtools.mdht.uml.transform.ecore.ProcessDeletedElementsFragment;
import org.openhealthtools.mdht.uml.transform.ecore.TransformAssociation;
import org.openhealthtools.mdht.uml.transform.ecore.TransformConstraint;
import org.openhealthtools.mdht.uml.transform.ecore.TransformPackage;
import org.openhealthtools.mdht.uml.transform.ecore.TransformPropertyConstraint;

/**
 * A transformation builder that creates the standard configuration of a UML-to-Ecore transformation. Clients may further configure this transformation to suit their specialized needs.
 */
public class APITransformationBuilder extends TransformationBuilder {

	protected APITransformationBuilder(ITransformation product) {
		super(product);
	}

	public static TransformationBuilder create() {
		TransformationBuilder result = new APITransformationBuilder(BaseEcoreTransformationBuilder.create(overrides()) //

				.initialization() //
				.rule(new CDAInitializeContextRule()) //
				.done() // initialization phase

				.getPhase(IEcoreTransformIDs.TRANSFORM_ELEMENTS_PHASE) //
				.rule(adapt(TransformClinicalDocument.class)) //
				.rule(adapt(TransformTemplateIdentifier.class)) //
				.done() // customizing main transformation phase

				.finalization() //
				.rule(new APISaveModelRule()) //
				.done() // customizing main transformation phase

				.finalization() //
				// before we save the model, destroy all of the elements that we deleted
				.getRule(IRule.ID_SAVE_MODEL).before(new ProcessDeletedElementsFragment()) //
				.rule(new APISavePluginPropertiesRule()) //
				.done()

				.build()); //

		return result;
	}

	private static IRuleOverrideProvider overrides() {
		return new IRuleOverrideProvider() {

			public <T> Class<? extends T> override(Class<T> rule) {
				Class<? extends T> result = null;

				if (rule == TransformAssociation.class) {
					result = APITransformCDAAssociation.class.asSubclass(rule);
				} else if (rule == TransformPropertyConstraint.class) {
					result = APITransformCDAPropertyConstraint.class.asSubclass(rule);
				} else if (rule == TransformConstraint.class) {
					result = APITransformLogicalConstraint.class.asSubclass(rule);
				} else if (rule == TransformTemplateIdentifier.class || rule == TransformPackage.class) {
					result = rule;
				} else {
					result = (Class) APITransformNothing.class;
				}

				return result;
			}
		};
	}
}
