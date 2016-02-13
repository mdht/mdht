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
package org.eclipse.mdht.uml.transform;

import org.eclipse.mdht.transform.core.ITransformation;
import org.eclipse.mdht.transform.core.TransformationBuilder;

/**
 * A transformation builder that creates the basic configuration of a UML transformation.
 * Clients must further configure this transformation to add some actual transformation rules (this builder provides only some initialization
 * and finalization rules).
 */
public class BaseUMLTransformationBuilder extends TransformationBuilder {

	protected BaseUMLTransformationBuilder(ITransformation product) {
		super(product);
	}

	public static TransformationBuilder create() {
		TransformationBuilder result = new BaseUMLTransformationBuilder(TransformationBuilder.create() //

		.initialization() //
		.rule(new UMLInitializeContextRule()) //
		.done() // initialization phase

		.finalization() //
		.rule(new UMLSaveModelLocalizedNamesRule()) // if there are any localized names to save, save them
		.done() // finalization phase

		.build()); //

		return result;
	}

}
