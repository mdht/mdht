/*******************************************************************************
 * Copyright (c) 2014 Sean Muir, JKM Software LLC.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.common.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;

import com.google.common.base.Equivalence;
import com.google.common.collect.MapDifference;
import com.google.common.collect.MapDifference.ValueDifference;
import com.google.common.collect.Maps;

public class ModelCompare {

	/**
	 * Returns the xmi:id attribute value for the given eObject as a <tt>String</tt>.
	 * Returns <b>null</b> in case there's no containing resource or the eObject simply
	 * didn't have a xmi:id attribute.
	 */
	private static String getXmiId(EObject eObject) {
		Resource xmiResource = eObject.eResource();
		if (xmiResource == null) {
			return null;
		} else {
			return ((XMLResource) xmiResource).getID(eObject);
		}
	}

	private static HashMap<String, Element> createElementHashMap(Element element) {
		HashMap<String, Element> umlPackageHashMap = new HashMap<String, Element>();

		if (element != null) {
			for (Element e : element.getOwnedElements()) {
				umlPackageHashMap.put(getXmiId(e), e);
			}
			for (Element e : element.getAppliedStereotypes()) {
				umlPackageHashMap.put(getXmiId(e), e);
			}

		}

		return umlPackageHashMap;
	}

	private static class ValueEquivalence extends Equivalence<Element> {

		static ValueEquivalence ElementEquivalence = new ValueEquivalence();

		@Override
		protected boolean doEquivalent(Element arg0, Element arg1) {
			Compare compare = new Compare(arg0);
			boolean result = compare.doSwitch(arg1);
			if (result) {
				return true;
			} else {
				return false;
			}

		}

		@Override
		protected int doHash(Element arg0) {

			return 1;
		}

	};

	private static class Compare extends org.eclipse.uml2.uml.util.UMLSwitch<Boolean> {

		Element element;

		/**
		 * @param element
		 */
		public Compare(Element element) {
			super();
			this.element = element;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseElement(org.eclipse.uml2.uml.Element)
		 */
		@Override
		public Boolean caseElement(Element object) {
			return getXmiId(object).equals(getXmiId(element));
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseNamedElement(org.eclipse.uml2.uml.NamedElement)
		 */
		@Override
		public Boolean caseNamedElement(NamedElement namedElement) {
			if (((NamedElement) element).getName() != null) {
				return ((NamedElement) element).getName().equals(namedElement.getName());
			}
			return super.caseNamedElement(namedElement);

		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#casePackage(org.eclipse.uml2.uml.Package)
		 */
		@Override
		public Boolean casePackage(Package object) {
			HashMap<String, Element> umlClassifer1HashMap = createElementHashMap(element);

			HashMap<String, Element> umlClassifer2HashMap = createElementHashMap(object);

			MapDifference<String, Element> diff = Maps.difference(
				umlClassifer1HashMap, umlClassifer2HashMap, ValueEquivalence.ElementEquivalence);

			if (diff.areEqual()) {
				return super.casePackage(object);
			} else {
				return false;
			}
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseClassifier(org.eclipse.uml2.uml.Classifier)
		 */
		@Override
		public Boolean caseClassifier(Classifier object) {
			HashMap<String, Element> umlClassifer1HashMap = createElementHashMap(element);

			HashMap<String, Element> umlClassifer2HashMap = createElementHashMap(object);

			MapDifference<String, Element> diff = Maps.difference(
				umlClassifer1HashMap, umlClassifer2HashMap, ValueEquivalence.ElementEquivalence);

			if (diff.areEqual()) {
				return super.caseClassifier(object);
			} else {
				return false;
			}

		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseProperty(org.eclipse.uml2.uml.Property)
		 */
		@Override
		public Boolean caseProperty(Property property2) {
			Property property1 = (Property) element;
			if (property1.getLower() == property2.getLower() && property1.getUpper() == property2.getUpper()) {
				if (property1.getType() != null && property2.getType() != null &&
						property1.getType().getQualifiedName() != null &&
						property2.getType().getQualifiedName() != null) {
					if (property1.getType().getQualifiedName().equals(property2.getType().getQualifiedName())) {
						return super.caseProperty(property2);
					}
				} else if (property1.getType() == null && property2.getType() == null) {
					return super.caseProperty(property2);
				} else if (property1.getType().getQualifiedName() == null &&
						property2.getType().getQualifiedName() == null) {
					return super.caseProperty(property2);
				}

			}
			return false;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 */
		@Override
		public Boolean defaultCase(EObject object) {
			return true;
		}

	}

	private static final Comparator<Element> COMPAREELEMENT = new Comparator<Element>() {

		public int compare(Element o1, Element o2) {

			Element owner1 = o1.getOwner();
			Element owner2 = o2.getOwner();
			Package package1 = owner1.getNearestPackage();
			Package package2 = owner2.getNearestPackage();

			// If there is a nearest package and the owners are named elements - compare
			// else compare using id's
			if (package1 != null && package2 != null) {
				int result = 0;
				result = package1.getName().compareTo(package2.getName());
				if (result == 0) {
					if (owner1 instanceof NamedElement && owner2 instanceof NamedElement &&
							((NamedElement) owner1).getQualifiedName() != null &&
							((NamedElement) owner2).getQualifiedName() != null) {
						result = ((NamedElement) owner1).getQualifiedName().compareTo(
							((NamedElement) owner2).getQualifiedName());
						if (result == 0) {

							if (o1 instanceof NamedElement && o2 instanceof NamedElement &&
									((NamedElement) o1).getQualifiedName() != null &&
									((NamedElement) o2).getQualifiedName() != null) {
								result = ((NamedElement) o1).getQualifiedName().compareTo(
									((NamedElement) o2).getQualifiedName());
							}
							if (result == 0) {
								result = getXmiId(o1).compareTo(getXmiId(o2));
							}
						}
					}

				}
				return result;
			}
			return getXmiId(o1).compareTo(getXmiId(o2));
		}
	};

	private static final Comparator<ValueDifference<Element>> COMPAREVALUEDIFFERENCE = new Comparator<ValueDifference<Element>>() {

		public int compare(ValueDifference<Element> o1, ValueDifference<Element> o2) {

			return COMPAREELEMENT.compare(o1.leftValue(), o2.leftValue());

		}
	};

	private static ArrayList<Element> getSortedElements(Collection<Element> elements) {
		ArrayList<Element> sortedElements = new ArrayList<Element>();
		sortedElements.addAll(elements);
		Collections.sort(sortedElements, COMPAREELEMENT);
		return sortedElements;
	}

	private static ArrayList<ValueDifference<Element>> getSortedValueDifference(
			Collection<ValueDifference<Element>> valueDifferences) {
		ArrayList<ValueDifference<Element>> sortedValueDifferences = new ArrayList<ValueDifference<Element>>();
		sortedValueDifferences.addAll(valueDifferences);
		Collections.sort(sortedValueDifferences, COMPAREVALUEDIFFERENCE);
		return sortedValueDifferences;
	}

	static public void compare(NamedElement element1, NamedElement element2, CompareResultVisitor compareResults) {

		compareResults.startElement(element1);

		HashMap<String, Element> umlPackage1HashMap = createElementHashMap(element1);

		HashMap<String, Element> umlPackage2HashMap = createElementHashMap(element2);

		MapDifference<String, Element> diff = Maps.difference(
			umlPackage1HashMap, umlPackage2HashMap, ValueEquivalence.ElementEquivalence);

		ArrayList<Element> leftElements = getSortedElements(diff.entriesOnlyOnLeft().values());
		for (Element eee : leftElements) {
			compareResults.addedElement(element1, eee);
			if (eee instanceof Package || eee instanceof org.eclipse.uml2.uml.Class) {
				compare((NamedElement) eee, null, compareResults);
			}

		}

		ArrayList<Element> rightElements = getSortedElements(diff.entriesOnlyOnRight().values());
		for (Element eee : rightElements) {
			compareResults.deletedElement(element1, eee);
		}

		ArrayList<ValueDifference<Element>> differences = getSortedValueDifference(diff.entriesDiffering().values());
		for (ValueDifference<Element> valueDifference : differences) {
			compareResults.changedElement(element1, valueDifference.leftValue(), valueDifference.rightValue());
			if ((valueDifference.leftValue() instanceof Class) || (valueDifference.leftValue() instanceof Package)) {
				compare(
					(NamedElement) valueDifference.leftValue(), (NamedElement) valueDifference.rightValue(),
					compareResults);
			}
		}

		compareResults.endElement(element1);

	}

}
