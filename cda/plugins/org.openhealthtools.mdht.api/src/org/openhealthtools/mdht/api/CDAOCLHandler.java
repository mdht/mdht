/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhealthtools.mdht.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.transformation.ocl.DomainSpecificOCLHandler;
import org.openhealthtools.mdht.uml.cda.core.profile.Inline;
import org.openhealthtools.mdht.uml.cda.core.util.CDACommonUtils;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint;

public class CDAOCLHandler<PK, C, O extends EModelElement, P, EL, PM, S, COA, SSA, CT, CLS, E> extends DomainSpecificOCLHandler<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> {

	@Override
	public String transformDomainSpecific(OperationCallExp<C, O> op, String opName) {
		if ("isNullFlavorUndefined".equals(opName)) {
			return trafo.isEmpty(trafo.step(trafo.transform(op.getSource()), "@nullFlavor"));
		}
		if ("isNullFlavorDefined".equals(opName)) {
			return trafo.isNotEmpty(trafo.step(trafo.transform(op.getSource()), "@nullFlavor"));
		}
		if ("getEntryRelationshipTargets".equals(opName)) {
			if (op.getArgument().size() == 2) {
				String entries = trafo.step(trafo.transform(op.getSource()), trafo.nsPrefix("entryRelationship"));
				String compareTo = trafo.transform(op.getArgument().get(0));
				String i = trafo.newVar();
				return trafo.childNode(trafo.predicate(entries, trafo.compare("=", trafo.step(trafo.referVar(i), "@typeCode"), compareTo), i));
			}
			return trafo.childNode(trafo.step(trafo.transform(op.getSource()), trafo.nsPrefix("entryRelationship")));
		}
		if ("getEntryTargets".equals(opName)) {
			if (op.getArgument().size() == 2) {
				String entries = trafo.step(trafo.transform(op.getSource()), trafo.nsPrefix("entry"));
				String compareTo = trafo.transform(op.getArgument().get(0));
				String i = trafo.newVar();
				return trafo.childNode(trafo.predicate(entries, trafo.compare("=", trafo.step(trafo.referVar(i), "@typeCode"), compareTo), i));
			}
			return trafo.childNode(trafo.step(trafo.transform(op.getSource()), trafo.nsPrefix("entry")));
		}
		if ("getObservations".equals(opName)) {
			String field = "entryRelationship";
			if (trafo.getName(op.getSource().getType()).contains("Section")) {
				field = "entry";
			}
			return trafo.step(trafo.step(trafo.transform(op.getSource()), trafo.nsPrefix(field)), trafo.nsPrefix("observation"));
		}

		return null;
	}

	public String getTypeCheck(C class1, String customSelfVariable) {
		if (class1 instanceof Class) {
			Class clazz = (Class) class1;
			EObject predicate = CDACommonUtils.getPredicateForTypeCheck(clazz);
			if (predicate instanceof Inline) {
				Inline inline = (Inline) predicate;
				OCLExpression<C> exp2 = trafo.getOCLExpression(class1, inline.getFilter(), true);
				String body = trafo.cosmetics(trafo.transformWithNewBindings(exp2, customSelfVariable));
				return body;
			}
			if (predicate == clazz) {
				return getCodeOrClasscodeCheckForPredicate(clazz, trafo.referVar(customSelfVariable));
			}
			Property containerProperty = CDACommonUtils.getPropertyForTypeCheck(clazz);
			if (containerProperty != null) {
				String entries = trafo.step(trafo.referVar(customSelfVariable), (P) containerProperty);
				// return isNotEmpty(predicate(entries, getCodeOrClasscodeCheck(predicate, i), i));
				return getCodeOrClasscodeCheckForPredicate(predicate, entries);
			}
		}
		return null;
	}

	public String getCodeOrClasscodeCheck(Class clazz, String set) {
		return getCodeOrClasscodeCheckForPredicate(CDACommonUtils.getPredicateForCodeOrClasscodeCheck(null, clazz), set);
	}

	public String getCodeOrClasscodeCheckForPredicate(EObject predicate, String set) {
		String entries;
		Property typeCode;
		String compareTo;
		if (predicate instanceof Class) {
			Class clazz = (Class) predicate;
			Property templateIdProperty = CDACommonUtils.findAttribute(clazz, "templateId");
			entries = trafo.step(set, (P) templateIdProperty);
			String id = "id";
			if (!(templateIdProperty.getType() instanceof Class))
				return null;
			String id_root = trafo.step(trafo.referVar(id), (P) CDACommonUtils.findAttribute((Class) templateIdProperty.getType(), "root"));
			compareTo = "\"" + CDACommonUtils.getTemplateId(clazz) + "\"";
			String body = trafo.compare("=", id_root, compareTo);
			String result = trafo.iterator(body, id, "exists", entries);
			return trafo.cosmetics(result);
		} else if (predicate instanceof CodeSystemConstraint) {
			CodeSystemConstraint codeSystemConstraint = (CodeSystemConstraint) predicate;
			Property property = codeSystemConstraint.getBase_Property();
			entries = trafo.step(set, (P) property);
			if (!(property.getType() instanceof Class))
				return null;
			typeCode = CDACommonUtils.findAttribute((Class) property.getType(), "code");
			compareTo = "\"" + codeSystemConstraint.getCode() + "\"";
		} else if (predicate instanceof Property) {
			Property property = (Property) predicate;
			entries = set;
			typeCode = property;
			compareTo = getFixedValue(property);
		} else {
			return null;
		}
		String source = trafo.step(entries, (P) typeCode);
		// String i = newVar();
		// String result = iterator(compare("=", referVar(i), compareTo), i, "exists", source);
		// return result;
		return trafo.cosmetics(trafo.compare("=", source, compareTo));
	}

	public String getFixedValue(Property property) {
		return trafo.getValue((P) property, CDACommonUtils.getDefault(property));
	}

	/**
	 * @param t
	 * @return CDA base type of the given type
	 */
	public C getBaseType(C t) {
		if (t instanceof Class)
			return (C) CDACommonUtils.getCDAType((Class) t);
		if (t instanceof EClassifier)
			return (C) getCDAClass((EClassifier) t);
		return t;
	}

	@Override
	public P getBaseProperty(P p) {
		if (p instanceof Property && CDACommonUtils.getCDAProperty((Property) p) != null)
			return (P) CDACommonUtils.getCDAProperty((Property) p);
		return super.getBaseProperty(p);
	}

	/**
	 * Copied from CDAModelUtil, but adapted to Ecore
	 * 
	 * @param templateClass
	 * @return
	 */
	public static EClass getCDAClass(EClassifier templateClass) {
		EClass cdaClass = null;

		// if the provided class is from CDA and not a template
		if (isCDAModel(templateClass) && templateClass instanceof EClass) {
			return (EClass) templateClass;
		}

		List<EClass> ar = new ArrayList<EClass>(((EClass) templateClass).getEAllSuperTypes());
		Collections.reverse(ar);
		for (EClassifier parent : ar) {
			// nearest package may be null if CDA model is not available
			if (parent.getEPackage() != null) {
				if (isCDAModel(parent) && parent instanceof EClass) {
					cdaClass = (EClass) parent;
					break;
				}
			}
		}

		return cdaClass;
	}

	public static boolean isCDAModel(EClassifier element) {
		return (element.getEPackage().getName().equals("cda") || element.getEPackage().getName().equals("datatypes") || element.getEPackage().getName().equals("rim")) && !element.getName().equals("ClinicalStatement") && !element.getName().equals("Participation") && !element.getName().equals("InfrastructureRoot")
				&& !element.getName().equals("ActRelationship");
	}
}
