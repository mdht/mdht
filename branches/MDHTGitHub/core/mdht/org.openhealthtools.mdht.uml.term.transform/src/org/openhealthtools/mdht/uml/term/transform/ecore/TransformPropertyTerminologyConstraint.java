/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     John T.E. Timm (IBM Corporation) - added CS type check
 *     Christian W. Damus - Generate OCL for enumeration properties (artf3099)
 *                        - generate multiple OCL constraints from one property (artf3121)
 *                        - discriminate multiple property constraints (artf3185)
 *                        - implement terminology constraint dependencies (artf3030)
 *                        - ensure terminology initializer for property constraints (artf3233)
 *                        - support nested datatype subclasses (artf3350)
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.term.transform.ecore;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemVersion;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetConstraint;
import org.openhealthtools.mdht.uml.term.core.util.CodeSystemConstraintUtil;
import org.openhealthtools.mdht.uml.term.core.util.TermProfileUtil;
import org.openhealthtools.mdht.uml.term.core.util.ValueSetConstraintUtil;
import org.openhealthtools.mdht.uml.transform.IBaseModelReflection;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;
import org.openhealthtools.mdht.uml.transform.ecore.IEcoreProfileReflection.ValidationStereotypeKind;
import org.openhealthtools.mdht.uml.transform.ecore.TransformPropertyConstraint;

/**
 * Transform UML property constraints for: multiplicity, type restriction, vocabulary.
 */
public class TransformPropertyTerminologyConstraint extends TransformPropertyConstraint {
	public TransformPropertyTerminologyConstraint(TransformerOptions options, IBaseModelReflection baseModelReflection) {
		super(options, baseModelReflection);
	}

	@Override
	protected PropertyConstraintHandler createConstraintHandler(ValidationStereotypeKind stereotypeKind) {
		PropertyConstraintHandler result = null;

		switch (stereotypeKind) {
			case CODE_SYSTEM:
				result = new CodeSystemConstraintHandler("CS");
				break;
			case VALUE_SET:
				result = new ValueSetConstraintHandler("VS");
				break;
		// case CONCEPT_DOMAIN:
		// result = new ConceptDomainConstranintHandler("CD");
		// break;
		}

		return result;
	}

	@Override
	protected boolean isCodedType(Property property) {
		Classifier type = (Classifier) property.getType();
		if (type == null) {
			Property baseProperty = getBaseProperty(property);
			if (baseProperty != null) {
				type = (Classifier) baseProperty.getType();
			} else {
				return false;
			}
		}

		List<Classifier> allTypes = new ArrayList<Classifier>(type.allParents());
		allTypes.add(0, type);

		for (Classifier classifier : allTypes) {
			if ("datatypes::CD".equals(classifier.getQualifiedName())) {
				return true;
			}
		}

		return false;
	}

	@Override
	protected boolean isSimpleCodedType(Property property) {
		return TermProfileUtil.isCSType(property);
	}

	//
	// Nested types
	//

	// class ConceptDomainConstraintHandler extends VocabConstraintHondler {
	//
	// }

	class CodeSystemConstraintHandler extends PropertyConstraintHandler {
		CodeSystemConstraintHandler(String suffix) {
			super(ValidationStereotypeKind.CODE_SYSTEM, suffix);
		}

		@Override
		protected boolean addAnnotation(PropertyContext context) {
			final Property property = context.property();
			boolean result = false;

			String codeSystem = null;
			String codeSystemName = null;
			String codeSystemVersion = null;
			String code = null;
			String displayName = null;

			CodeSystemConstraint codeSystemConstraint = TermProfileUtil.getCodeSystemConstraint(property);
			if (codeSystemConstraint != null) {
				if (codeSystemConstraint.getReference() != null) {
					codeSystem = codeSystemConstraint.getReference().getIdentifier();
					codeSystemName = codeSystemConstraint.getReference().getEnumerationName();
					// codeSystemVersion = codeSystemConstraint.getReference().getVersion();
				} else {
					codeSystem = codeSystemConstraint.getIdentifier();
					codeSystemName = codeSystemConstraint.getName();
					// codeSystemVersion= codeSystemConstraint.getVersion();
				}
				code = codeSystemConstraint.getCode();
				displayName = codeSystemConstraint.getDisplayName();

				result = addAnnotation(
					property, ValidationStereotypeKind.CODE_SYSTEM, codeSystem, codeSystemName, code, displayName,
					codeSystemVersion);
			}

			return result;
		}

		@Override
		protected Constraint addConstraint(PropertyContext context) {
			final Property property = context.property();
			Constraint result = null;

			CodeSystemConstraint codeSystemConstraint = TermProfileUtil.getCodeSystemConstraint(property);
			if (codeSystemConstraint != null) {
				result = addVocabConstraint(
					context, ValidationStereotypeKind.CODE_SYSTEM, CodeSystemConstraintUtil.getOCL(property));
			}

			return result;
		}
	}

	class ValueSetConstraintHandler extends PropertyConstraintHandler {
		ValueSetConstraintHandler(String suffix) {
			super(ValidationStereotypeKind.VALUE_SET, suffix);
		}

		@Override
		protected boolean addAnnotation(PropertyContext context) {
			final Property property = context.property();
			boolean result = false;

			ValueSetConstraint valueSetConstraint = TermProfileUtil.getValueSetConstraint(property);
			String codeSystem = null;
			String codeSystemName = null;
			String codeSystemVersion = null;
			String code = null;
			String displayName = null;

			if (valueSetConstraint != null) {
				if ((valueSetConstraint.getReference() != null) &&
						(valueSetConstraint.getReference().getCodeSystem() != null)) {
					CodeSystemVersion codeSystemDef = valueSetConstraint.getReference().getCodeSystem();
					codeSystem = codeSystemDef.getIdentifier();
					codeSystemName = codeSystemDef.getEnumerationName();
					// codeSystemVersion = codeSystemDef.getVersion();
				}

				result = addAnnotation(
					property, ValidationStereotypeKind.VALUE_SET, codeSystem, codeSystemName, code, displayName,
					codeSystemVersion);
			}

			return result;
		}

		@Override
		protected Constraint addConstraint(PropertyContext context) {
			final Property property = context.property();
			Constraint result = null;

			ValueSetConstraint valueSetConstraint = TermProfileUtil.getValueSetConstraint(property);
			if (valueSetConstraint != null) {
				result = addVocabConstraint(
					context, ValidationStereotypeKind.VALUE_SET, ValueSetConstraintUtil.getOCL(property));
			}

			return result;
		}
	}
}
