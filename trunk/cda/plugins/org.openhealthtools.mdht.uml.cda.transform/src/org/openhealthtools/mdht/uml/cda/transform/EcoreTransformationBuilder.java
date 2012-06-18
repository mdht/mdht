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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.transform.core.IRule;
import org.openhealthtools.mdht.transform.core.ITransformContext;
import org.openhealthtools.mdht.transform.core.ITransformMonitor;
import org.openhealthtools.mdht.transform.core.ITransformation;
import org.openhealthtools.mdht.transform.core.RuleKind;
import org.openhealthtools.mdht.transform.core.TransformationBuilder;
import org.openhealthtools.mdht.transform.core.TransformationException;
import org.openhealthtools.mdht.transform.core.impl.AbstractRule;
import org.openhealthtools.mdht.uml.transform.BaseUMLTransformationBuilder;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;

/**
 * A transformation builder that creates the standard configuration of a UML-to-Ecore transformation.
 * Clients may further configure this transformation to suit their specialized needs.
 */
public class EcoreTransformationBuilder extends TransformationBuilder {

	protected EcoreTransformationBuilder(ITransformation product) {
		super(product);
	}

	public static TransformationBuilder create() {
		TransformationBuilder result = new EcoreTransformationBuilder(BaseUMLTransformationBuilder.create() //

		.initialization() //
		.rule(new CDAInitializeContextRule()) //
		.done() // initialization phase

		.phase(ICDAEcoreTransformIDs.TRANSFORM_ELEMENTS_PHASE, "Transform elements") //
		.rule(adapt(TransformPackage.class)) //
		.rule(adapt(TransformConstraint.class)) //
		.rule(adapt(TransformClinicalDocument.class)) //
		.rule(adapt(TransformTemplateIdentifier.class)) //
		.rule(adapt(TransformPropertyConstraint.class)) //
		.rule(adapt(TransformAssociation.class)) //
		.rule(adapt(TransformClass.class)) //
		.rule(adapt(TransformPackage.class)) //
		.done() // transform most element types

		.phase(ICDAEcoreTransformIDs.TRANSFORM_INLINE_ASSOCATIONS_PHASE, "Transform inline associations") //
		.rule(adapt(TransformInlinedAssociations.class)) //
		.done() // transform inline associations phase

		.phase(ICDAEcoreTransformIDs.TRANSFORM_INNER_CLASSES_PHASE, "Transform inner classes") //
		.rule(adapt(TransformInnerClasses.class)) //
		.done() // transform inner classes phase

		.finalization() //
		// before we save the model, destroy all of the elements that we deleted
		.getRule(IRule.ID_SAVE_MODEL).before(new ProcessDeletedElementsFragment()) //
		.rule(new SavePluginPropertiesRule()) //
		.done() // finalization phase

		.build()); //

		if (Boolean.getBoolean("mdht.debug.ecoretransform")) {
			// add a step to simplify comparing the generated Ecore with other versions
			result.finalization().getRule(IRule.ID_SAVE_MODEL).before(new DebugUMLSetElementIDsFragment());
		}

		return result;
	}

	private static IRule adapt(Class<? extends UMLSwitch<?>> switchClass) {
		return new SwitchAdapter(switchClass);
	}

	//
	// Nested types
	//

	/**
	 * A transformation rule adapter that integrates the legacy {@link UMLSwitch}-based rules.
	 */
	private static class SwitchAdapter extends AbstractRule {
		private final Class<? extends UMLSwitch<?>> switchClass;

		private UMLSwitch<?> umlSwitch;

		SwitchAdapter(Class<? extends UMLSwitch<?>> switchClass) {
			super(switchClass.getName(), RuleKind.TRANSFORM, switchClass.getSimpleName());

			this.switchClass = switchClass;
		}

		@Override
		public void initialize(ITransformContext ctx) throws TransformationException {
			super.initialize(ctx);

			try {
				umlSwitch = switchClass.getConstructor(TransformerOptions.class).newInstance(
					ctx.get(TransformerOptions.class));
			} catch (Exception e) {
				throw new TransformationException(
					String.format("Failed to initialize rule '%s'", switchClass.getName()), e);
			}
		}

		@Override
		protected Object doApply(EObject input, ITransformMonitor monitor) throws TransformationException {
			return umlSwitch.doSwitch(input);
		}
	}

}
