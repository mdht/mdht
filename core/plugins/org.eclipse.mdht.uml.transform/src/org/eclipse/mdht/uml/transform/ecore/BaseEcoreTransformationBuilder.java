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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.transform.core.IRule;
import org.eclipse.mdht.transform.core.ITransformContext;
import org.eclipse.mdht.transform.core.ITransformMonitor;
import org.eclipse.mdht.transform.core.ITransformation;
import org.eclipse.mdht.transform.core.RuleKind;
import org.eclipse.mdht.transform.core.TransformationBuilder;
import org.eclipse.mdht.transform.core.TransformationException;
import org.eclipse.mdht.transform.core.impl.AbstractRule;
import org.eclipse.mdht.uml.transform.BaseUMLTransformationBuilder;
import org.eclipse.mdht.uml.transform.IBaseModelReflection;
import org.eclipse.mdht.uml.transform.TransformerOptions;
import org.eclipse.uml2.uml.util.UMLSwitch;

/**
 * A transformation builder that creates the standard configuration of a UML-to-Ecore transformation.
 * Clients may further configure this transformation to suit their specialized needs.
 */
public class BaseEcoreTransformationBuilder extends TransformationBuilder {
	protected BaseEcoreTransformationBuilder(ITransformation product) {
		super(product);
	}

	public static TransformationBuilder create(IRuleOverrideProvider overrideProvider) {
		TransformationBuilder result = new BaseEcoreTransformationBuilder(BaseUMLTransformationBuilder.create() //

		.phase(IEcoreTransformIDs.TRANSFORM_ELEMENTS_PHASE, "Transform elements") //
		.rule(adapt(overrideProvider, TransformPackage.class)) //
		.rule(adapt(overrideProvider, TransformConstraint.class)) //
		.rule(adapt(overrideProvider, TransformPropertyConstraint.class)) //
		.rule(adapt(overrideProvider, TransformAssociation.class)) //
		.rule(adapt(overrideProvider, TransformClass.class)) //
		.done() // transform most element types

		.phase(IEcoreTransformIDs.TRANSFORM_INLINE_ASSOCATIONS_PHASE, "Transform in-lined associations and properties") //
		.rule(adapt(overrideProvider, TransformInlinedProperties.class)) //
		.done() // transform inline associations phase

		.phase(IEcoreTransformIDs.TRANSFORM_INNER_CLASSES_PHASE, "Transform in-lined classes") //
		.rule(adapt(overrideProvider, TransformInlinedClasses.class)) //
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

	private static IRule adapt(IRuleOverrideProvider overrideProvider, Class<? extends UMLSwitch<?>> switchClass) {
		Class<? extends UMLSwitch<?>> override = overrideProvider.override(switchClass);
		if (override != null) {
			switchClass = override;
		}

		return adapt(switchClass);
	}

	public static IRule adapt(Class<? extends UMLSwitch<?>> switchClass) {
		return new SwitchAdapter(switchClass);
	}

	//
	// Nested types
	//

	/**
	 * A provider of classes to override the particular base implementations of transformation rules. This is required at least for the abstract
	 * rules.
	 */
	public static interface IRuleOverrideProvider {
		<T> Class<? extends T> override(Class<T> rule);
	}

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
				umlSwitch = switchClass.getConstructor(
					TransformerOptions.class, IBaseModelReflection.class).newInstance(
						ctx.get(TransformerOptions.class), ctx.get(IBaseModelReflection.class));
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
