/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.cda.dita;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.InstanceGenerator;
import org.openhealthtools.mdht.uml.cda.core.util.RIMModelUtil;
import org.openhealthtools.mdht.uml.cda.dita.internal.Logger;
import org.openhealthtools.mdht.uml.common.util.NamedElementComparator;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class TransformClassContent extends TransformAbstract {

	private InstanceGenerator instanceGenerator;

	public TransformClassContent(DitaTransformerOptions options) {
		super(options);

		if (Platform.getBundle("org.openhealthtools.mdht.uml.cda") != null) {
			instanceGenerator = new InstanceGenerator();
		}
	}

	private void appendAggregateRules(PrintWriter writer, Class umlClass) {
		Package xrefSource = UMLUtil.getTopPackage(umlClass);
		List<Classifier> allParents = new ArrayList<Classifier>(umlClass.allParents());
		allParents.add(0, umlClass);

		List<Property> allProperties = new ArrayList<Property>();
		List<Property> allAssociations = new ArrayList<Property>();
		List<Property> allAttributes = new ArrayList<Property>();
		List<Constraint> allConstraints = new ArrayList<Constraint>();

		// categorize constraints by constrainedElement name
		List<Constraint> unprocessedConstraints = new ArrayList<Constraint>();
		// propertyName -> constraints
		Map<String, List<Constraint>> constraintMap = new HashMap<String, List<Constraint>>();
		// constraint -> sub-constraints
		Map<Constraint, List<Constraint>> subConstraintMap = new HashMap<Constraint, List<Constraint>>();

		for (Constraint constraint : umlClass.getOwnedRules()) {
			unprocessedConstraints.add(constraint);
			for (Element element : constraint.getConstrainedElements()) {
				if (element instanceof Property) {
					String name = ((Property) element).getName();
					List<Constraint> rules = constraintMap.get(name);
					if (rules == null) {
						rules = new ArrayList<Constraint>();
						constraintMap.put(name, rules);
					}
					rules.add(constraint);
				} else if (element instanceof Constraint) {
					Constraint subConstraint = (Constraint) element;
					List<Constraint> rules = subConstraintMap.get(subConstraint);
					if (rules == null) {
						rules = new ArrayList<Constraint>();
						subConstraintMap.put(subConstraint, rules);
					}
					rules.add(constraint);
				}
			}
		}

		// process parents in reverse order, CDA base class first
		for (int i = allParents.size() - 1; i >= 0; i--) {
			Class parent = (Class) allParents.get(i);

			for (Property property : parent.getOwnedAttributes()) {
				if (property.getAssociation() != null) {
					allAssociations.add(property);
				} else {
					// if list contains this property name, replace it; else append
					int index = findProperty(allProperties, property.getName());
					if (index >= 0) {
						allProperties.set(index, property);
					} else {
						allProperties.add(property);
					}
				}
			}
		}

		Iterator<Property> propertyIterator = allProperties.iterator();
		while (propertyIterator.hasNext()) {
			Property property = propertyIterator.next();
			if (CDAModelUtil.isCDAModel(property) && property.getLower() == 0) {
				// include only required CDA class properties
				propertyIterator.remove();
			}
		}

		Iterator<Property> associationIterator = allAssociations.iterator();
		while (associationIterator.hasNext()) {
			Property property = associationIterator.next();
			if (CDAModelUtil.isCDAModel(property) && property.getLower() == 0) {
				// include only required CDA class properties
				associationIterator.remove();
			}
		}

		/*
		 * Include only associations that are not redefined in a subclass.
		 * TODO There must be a better way... use UML property redefinition in model.
		 */
		List<Classifier> endTypes = new ArrayList<Classifier>();
		for (Property property : allAssociations) {
			endTypes.add((Classifier) property.getType());
		}
		for (int index = 0; index < allAssociations.size(); index++) {
			Classifier classifier = endTypes.get(index);
			boolean hasSubclass = false;
			List<DirectedRelationship> specializations = classifier.getTargetDirectedRelationships(UMLPackage.Literals.GENERALIZATION);
			for (DirectedRelationship relationship : specializations) {
				Classifier specific = ((Generalization) relationship).getSpecific();
				if (endTypes.contains(specific)) {
					hasSubclass = true;
					break;
				}
			}

			if (!hasSubclass) {
				allProperties.add(allAssociations.get(index));
			}
		}

		// aggregate constraints
		for (int i = allParents.size() - 1; i >= 0; i--) {
			Class parent = (Class) allParents.get(i);
			if (!CDAModelUtil.isCDAModel(parent)) {
				for (Constraint constraint : parent.getOwnedRules()) {
					allConstraints.add(constraint);
				}
			}
		}

		writer.println("<ol id=\"aggregate\">");

		// use i>0 to omit this class
		for (int i = allParents.size() - 1; i > 0; i--) {
			Class parent = (Class) allParents.get(i);
			if (!RIMModelUtil.isRIMModel(parent) && !CDAModelUtil.isCDAModel(parent)) {
				String message = CDAModelUtil.computeGeneralizationConformanceMessage(parent, true, xrefSource);
				if (message.length() > 0) {
					writer.println("<li>" + message + "</li>");
				}
			}
		}

		for (Property property : allProperties) {
			if (CDAModelUtil.isXMLAttribute(property)) {
				allAttributes.add(property);
			}
		}
		allProperties.removeAll(allAttributes);
		Collections.sort(allAttributes, new NamedElementComparator());

		// XML attributes
		for (Property property : allAttributes) {
			writer.println("<li>" + CDAModelUtil.computeConformanceMessage(property, true));
			appendPropertyRules(writer, property, constraintMap, subConstraintMap, unprocessedConstraints);
			appendPropertyComments(writer, property);
			writer.println("</li>");
		}
		// XML elements
		for (Property property : allProperties) {
			writer.println("<li>" + CDAModelUtil.computeConformanceMessage(property, true));
			appendPropertyRules(writer, property, constraintMap, subConstraintMap, unprocessedConstraints);
			appendPropertyComments(writer, property);
			writer.println("</li>");
		}

		for (Constraint constraint : allConstraints) {
			writer.println("<li>" + CDAModelUtil.computeConformanceMessage(constraint, true)
			// + " " + modelPrefix(constraint)
					+ "</li>");
		}

		// <ol> cannot be empty
		if (allAttributes.isEmpty() && allProperties.isEmpty() && allConstraints.isEmpty()) {
			writer.println("<li></li>");
		}

		writer.println("</ol>");
	}

	private void appendBody(PrintWriter writer, Class umlClass) {
		writer.println("<body>");

		appendClassDocumentation(writer, umlClass);
		appendConformanceRules(writer, umlClass);
		appendAggregateRules(writer, umlClass);
		appendExample(writer, umlClass);

		writer.println("</body>");
		writer.println("</topic>");
	}

	private void appendClassDocumentation(PrintWriter writer, Class umlClass) {
		writer.println("<section id=\"description\">");

		// TODO if blank line, wrap before and after contents in <p>

		for (Comment comment : umlClass.getOwnedComments()) {
			String body = CDAModelUtil.fixNonXMLCharacters(comment.getBody().trim());
			if (body.startsWith("<p>")) {
				writer.println(body);
			} else {
				writer.println("<p>" + body + "</p>");
			}
		}

		writer.println("</section>");
	}

	private void appendConformanceRules(PrintWriter writer, Class umlClass) {
		writer.println("<ol id=\"conformance\">");

		boolean hasRules = false;
		for (Generalization generalization : umlClass.getGeneralizations()) {
			Classifier general = generalization.getGeneral();
			if (!RIMModelUtil.isRIMModel(general) && !CDAModelUtil.isCDAModel(general)) {
				String message = CDAModelUtil.computeConformanceMessage(generalization, true);
				if (message.length() > 0) {
					hasRules = true;
					writer.println("<li>" + message + "</li>");
				}
			}
		}

		// categorize constraints by constrainedElement name
		List<Constraint> unprocessedConstraints = new ArrayList<Constraint>();
		// propertyName -> constraints
		Map<String, List<Constraint>> constraintMap = new HashMap<String, List<Constraint>>();
		// constraint -> sub-constraints
		Map<Constraint, List<Constraint>> subConstraintMap = new HashMap<Constraint, List<Constraint>>();

		for (Constraint constraint : umlClass.getOwnedRules()) {
			unprocessedConstraints.add(constraint);
			for (Element element : constraint.getConstrainedElements()) {
				if (element instanceof Property) {
					String name = ((Property) element).getName();
					List<Constraint> rules = constraintMap.get(name);
					if (rules == null) {
						rules = new ArrayList<Constraint>();
						constraintMap.put(name, rules);
					}
					rules.add(constraint);
				} else if (element instanceof Constraint) {
					Constraint subConstraint = (Constraint) element;
					List<Constraint> rules = subConstraintMap.get(subConstraint);
					if (rules == null) {
						rules = new ArrayList<Constraint>();
						subConstraintMap.put(subConstraint, rules);
					}
					rules.add(constraint);
				}
			}
		}

		List<Property> allProperties = new ArrayList<Property>(umlClass.getOwnedAttributes());
		List<Property> allAttributes = new ArrayList<Property>();
		for (Property property : allProperties) {
			if (CDAModelUtil.isXMLAttribute(property)) {
				allAttributes.add(property);
			}
		}
		allProperties.removeAll(allAttributes);
		Collections.sort(allAttributes, new NamedElementComparator());
		// XML attributes
		for (Property property : allAttributes) {
			hasRules = true;
			writer.println("<li>" + CDAModelUtil.computeConformanceMessage(property, true));
			appendPropertyComments(writer, property);
			appendPropertyRules(writer, property, constraintMap, subConstraintMap, unprocessedConstraints);
			writer.println("</li>");
		}
		// XML elements
		for (Property property : allProperties) {
			hasRules = true;
			writer.println("<li>" + CDAModelUtil.computeConformanceMessage(property, true));
			appendPropertyComments(writer, property);
			appendPropertyRules(writer, property, constraintMap, subConstraintMap, unprocessedConstraints);
			writer.println("</li>");
		}

		for (Constraint constraint : unprocessedConstraints) {
			hasRules = true;
			writer.println("<li>" + CDAModelUtil.computeConformanceMessage(constraint, true) + "</li>");
		}

		if (!hasRules) {
			writer.println("<li></li>");
		}

		writer.println("</ol>");
	}

	private void appendExample(PrintWriter writer, Class umlClass) {
		writer.print("<codeblock id=\"example\"><![CDATA[");

		if (instanceGenerator != null) {
			EObject eObject = instanceGenerator.createInstance(umlClass, 1);
			if (eObject != null) {
				instanceGenerator.save(eObject, writer);
			}
		} else {
			writer.print("TODO: XML document snippet");
		}

		writer.println("]]></codeblock>");
	}

	private void appendHeader(PrintWriter writer, Class umlClass) {
		writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		writer.println("<!DOCTYPE topic PUBLIC \"-//OASIS//DTD DITA Topic//EN\" \"topic.dtd\">");
		writer.println("<topic id=\"classId\" xml:lang=\"en-us\">");
		writer.print("<title>");
		writer.print(UMLUtil.splitName(umlClass));
		writer.print(" - conformance rules");
		writer.println("</title>");

		Class cdaClass = CDAModelUtil.getCDAClass(umlClass);
		String cdaClassName = cdaClass != null
				? cdaClass.getName()
				: "MISSING_CDA_CLASS";
		if (cdaClass != null) {
			writer.print("<shortdesc id=\"shortdesc\">");
			if (!umlClass.equals(cdaClass)) {
				writer.print("[" + cdaClassName + ": templateId <tt>" + CDAModelUtil.getTemplateId(umlClass) + "</tt>]");
			}
			writer.println("</shortdesc>");

			writer.println("<prolog id=\"prolog\">");
			writer.println("<metadata><category>" + cdaClassName + "</category></metadata>");
			writer.println("<resourceid id=\"" + CDAModelUtil.getTemplateId(umlClass) + "\"/>");
			writer.println("</prolog>");
		}
	}

	private void appendPropertyComments(PrintWriter writer, Property property) {
		Association association = property.getAssociation();
		if (association != null && association.getOwnedComments().size() > 0) {
			writer.append("<ul>");
			for (Comment comment : association.getOwnedComments()) {
				writer.append("<li>");
				writer.append(CDAModelUtil.fixNonXMLCharacters(comment.getBody()));
				writer.append("</li>");
			}
			writer.append("</ul>");
		}

		if (property.getOwnedComments().size() > 0) {
			writer.append("<ul>");
			for (Comment comment : property.getOwnedComments()) {
				writer.append("<li>");
				writer.append(CDAModelUtil.fixNonXMLCharacters(comment.getBody()));
				writer.append("</li>");
			}
			writer.append("</ul>");
		}
	}

	private void appendPropertyRules(PrintWriter writer, Property property,
			Map<String, List<Constraint>> constraintMap, Map<Constraint, List<Constraint>> subConstraintMap,
			List<Constraint> unprocessedConstraints) {

		// association typeCode and property type
		String assocConstraints = "";
		if (property.getAssociation() != null) {
			assocConstraints = CDAModelUtil.computeAssociationConstraints(property, true);
		}

		StringBuffer ruleConstraints = new StringBuffer();
		List<Constraint> rules = constraintMap.get(property.getName());
		if (rules != null && !rules.isEmpty()) {
			for (Constraint constraint : rules) {
				unprocessedConstraints.remove(constraint);
				ruleConstraints.append("\n<li>" + CDAModelUtil.computeConformanceMessage(constraint, true));
				appendSubConstraintRules(ruleConstraints, constraint, subConstraintMap, unprocessedConstraints);

				// List<Constraint> subConstraints = subConstraintMap.get(constraint);
				// if (subConstraints != null && subConstraints.size() > 0) {
				// ruleConstraints.append("<ol>");
				// for (Constraint subConstraint : subConstraints) {
				// unprocessedConstraints.remove(subConstraint);
				// ruleConstraints.append("\n<li>" + CDAModelUtil.computeConformanceMessage(subConstraint, true) + "</li>");
				// }
				// ruleConstraints.append("</ol>");
				// }
				ruleConstraints.append("</li>");
			}
		}

		if (assocConstraints.length() > 0 || ruleConstraints.length() > 0) {
			// writer.append(", such that ");
			// writer.append(property.upperBound()==1 ? "it" : "each");

			writer.append("<ol>");
			writer.append(assocConstraints);
			writer.append(ruleConstraints);
			writer.append("</ol>");
		}
	}

	private void appendSubConstraintRules(StringBuffer ruleConstraints, Constraint constraint,
			Map<Constraint, List<Constraint>> subConstraintMap, List<Constraint> unprocessedConstraints) {

		List<Constraint> subConstraints = subConstraintMap.get(constraint);
		if (subConstraints != null && subConstraints.size() > 0) {
			ruleConstraints.append("<ol>");
			for (Constraint subConstraint : subConstraints) {
				unprocessedConstraints.remove(subConstraint);
				ruleConstraints.append("\n<li>" + CDAModelUtil.computeConformanceMessage(subConstraint, true));
				appendSubConstraintRules(ruleConstraints, subConstraint, subConstraintMap, unprocessedConstraints);
				ruleConstraints.append("</li>");
			}
			ruleConstraints.append("</ol>");
		}
	}

	@Override
	public Object caseClass(Class umlClass) {
		String pathFolder = "classes";
		IPath filePath = transformerOptions.getOutputPath().append(pathFolder).addTrailingSeparator().append(
			"generated").addTrailingSeparator().append("_" + umlClass.getName()).addFileExtension("dita");
		File file = filePath.toFile();
		PrintWriter writer = null;

		try {
			file.createNewFile();

			writer = new PrintWriter(file);
			appendHeader(writer, umlClass);
			appendBody(writer, umlClass);

		} catch (FileNotFoundException e) {
			Logger.logException(e);
		} catch (IOException e1) {
			Logger.logException(e1);
		} finally {
			if (writer != null) {
				writer.close();
			}
		}

		return umlClass;
	}

	private int findProperty(List<Property> properties, String name) {
		if (name != null) {
			for (int i = 0; i < properties.size(); i++) {
				if (name.equals(properties.get(i).getName())) {
					return i;
				}
			}
		}
		return -1;
	}

	private String modelPrefix(NamedElement element) {
		StringBuffer prefix = new StringBuffer();
		String modelPrefix = CDAModelUtil.getModelPrefix(element);
		if (modelPrefix != null && modelPrefix.length() > 0) {
			prefix.append("[");
			prefix.append(modelPrefix);
			prefix.append("] ");
		}

		return prefix.toString();
	}

}
