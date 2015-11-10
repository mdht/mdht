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

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.compare.rangedifferencer.IRangeComparator;
import org.eclipse.compare.rangedifferencer.RangeDifference;
import org.eclipse.compare.rangedifferencer.RangeDifferencer;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.uml.cda.core.profile.LogicalConstraint;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ClinicalDocumentCreator;
import org.openhealthtools.mdht.uml.cda.core.util.InstanceGenerator;
import org.openhealthtools.mdht.uml.cda.core.util.ModelStatus;
import org.openhealthtools.mdht.uml.cda.core.util.RIMModelUtil;
import org.openhealthtools.mdht.uml.cda.dita.internal.Logger;
import org.openhealthtools.mdht.uml.common.util.NamedElementComparator;
import org.openhealthtools.mdht.uml.common.util.PropertyComparator;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class TransformClassContent extends TransformAbstract {

	private InstanceGenerator instanceGenerator;

	private TableGenerator tableGenerator;

	public TransformClassContent(DitaTransformerOptions options) {
		super(options);

		if (Platform.getBundle("org.openhealthtools.mdht.uml.cda") != null) {
			instanceGenerator = new InstanceGenerator();
			tableGenerator = new TableGenerator();
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

			if (CDAProfileUtil.getLogicalConstraint(constraint) == null) {
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

			// Remove participants in logical constraints that do not have a severity
			for (Constraint constraint : parent.getOwnedRules()) {
				LogicalConstraint logicConstraint = CDAProfileUtil.getLogicalConstraint(constraint);
				if (logicConstraint != null) {
					for (Element constrainedElement : constraint.getConstrainedElements()) {
						if (constrainedElement instanceof Property &&
								CDAModelUtil.getValidationKeyword(constrainedElement) == null) {
							allProperties.remove(constrainedElement);
						}
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
			List<DirectedRelationship> specializations = classifier.getTargetDirectedRelationships(
				UMLPackage.Literals.GENERALIZATION);
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
			if (!(property.getType().getOwner() instanceof Class)) {
				// comments are output preceding inline classes
				appendPropertyComments(writer, property);
			}
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

		appendKnownSubclasses(writer, umlClass);
		appendClassDocumentation(writer, umlClass);
		appendConformanceRules(writer, umlClass);
		appendAggregateRules(writer, umlClass);
		// if (transformerOptions.isIncludeTableView()) {
		appendTable(writer, umlClass);
		// }
		appendExample(writer, umlClass);
		appendChanges(writer, umlClass);

		writer.println("<p><ph id=\"classformalname\">" + TransformAbstract.getPublicationName(umlClass) + "</ph></p>");

		Class cdaClass = CDAModelUtil.getCDAClass(umlClass);
		String cdaClassName = cdaClass != null
				? cdaClass.getName()
				: "MISSING_CDA_CLASS";
		if (cdaClass != null) {
			writer.print("<p id=\"shortdesc\">");
			if (!umlClass.equals(cdaClass)) {
				writer.print(
					"[" + cdaClassName + ": templateId <tt>" + CDAModelUtil.getTemplateId(umlClass) + "</tt>]");
			}
			writer.println("</p>");

		}

		writer.println("</body>");
		writer.println("</topic>");
	}

	private void appendKnownSubclasses(PrintWriter writer, Class umlClass) {
		writer.println("<section id=\"knownSubclasses\">");
		List<Classifier> subclasses = UMLUtil.getSpecializations(umlClass);
		if (subclasses.size() > 0) {
			writer.print("<p>Known Subclasses: ");

			for (Iterator<Classifier> iterator = subclasses.iterator(); iterator.hasNext();) {

				Classifier subclass = iterator.next();

				if (subclass instanceof Class && (!(subclass.getOwner() instanceof Class))) {

					Package xrefSource = UMLUtil.getTopPackage(subclass);
					String xref = CDAModelUtil.computeXref(xrefSource, subclass);
					String format = xref != null && xref.endsWith(".html")
							? "format=\"html\" "
							: "";

					writer.append("<xref " + format + "href=\"" + xref + "\">");
					writer.append(TransformAbstract.getPublicationName(subclass));
					writer.append("</xref>");

					if (iterator.hasNext()) {
						writer.print(", ");
					}
				}
			}
			writer.println("</p>");
		}
		writer.println("</section>");
	}

	private void appendClassDocumentation(PrintWriter writer, Class umlClass) {
		writer.println("<section id=\"description\">");

		// TODO if blank line, wrap before and after contents in <p>

		for (Comment comment : umlClass.getOwnedComments()) {
			String body = CDAModelUtil.fixNonXMLCharacters(comment.getBody().trim());
			if (body.startsWith("<p>")) {
				writer.println(body);
			} else {
				writer.println("<p><lines><i>" + body + "</i></lines></p>");
			}
		}

		writer.println("</section>");
	}

	private void appendConformanceRules(PrintWriter writer, Class umlClass) {
		writer.println("<ol id=\"conformance\">");

		if (CDAModelUtil.getTemplateId(umlClass) != null) {
			writer.println("<li>" + CDAModelUtil.computeConformanceMessage(umlClass, true) + "</li>");
		}
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
				if (CDAProfileUtil.getLogicalConstraint(constraint) == null) {
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
		}

		List<Property> allProperties = new ArrayList<Property>(umlClass.getOwnedAttributes());
		List<Property> allAttributes = new ArrayList<Property>();

		for (Property property : allProperties) {
			if (CDAModelUtil.isXMLAttribute(property)) {
				allAttributes.add(property);
			}

			// Check to see if the property is part of a logical constraint - if so do not create process as a property

		}

		for (Constraint constraint : umlClass.getOwnedRules()) {
			LogicalConstraint logicConstraint = CDAProfileUtil.getLogicalConstraint(constraint);
			if (logicConstraint != null) {
				for (Element constrainedElement : constraint.getConstrainedElements()) {
					if (constrainedElement instanceof Property &&
							CDAModelUtil.getValidationKeyword(constrainedElement) == null) {
						allProperties.remove(constrainedElement);
						allAttributes.remove(constrainedElement);
					}
				}
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

		Collections.sort(allProperties, new PropertyComparator());
		// XML elements

		for (Property property : allProperties) {
			hasRules = true;
			writer.println("<li>" + CDAModelUtil.computeConformanceMessage(property, true));
			if (!(property.getType().getOwner() instanceof Class)) {
				// comments are output preceding inline classes
				appendPropertyComments(writer, property);
			}
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
		writer.print("<codeblock id=\"example\" outputclass=\"language-xml\"><![CDATA[");

		if (instanceGenerator != null) {

			int exampleDepth = transformerOptions.getExampleDepth();

			transformerOptions.isIncludeTableView();

			EObject eObject = instanceGenerator.createInstance(umlClass, exampleDepth > 0
					? exampleDepth
					: 2);
			if (eObject==null) {
				ArrayList<ModelStatus> statuses = new ArrayList<ModelStatus>();
				ClinicalDocumentCreator creator = new ClinicalDocumentCreator(
					null, umlClass.eResource().getResourceSet(), statuses);
				creator.enableSampleData(true);
				creator.enableSampleDataExpansion(true);
				Collection<Property> props = Collections.emptyList();
				EObject newObject = creator.initializeSnippet(umlClass, props);
				if (newObject != null) {
					String xml = creator.toXMLString(newObject, umlClass);
					writer.write(xml);
					writer.println("]]></codeblock>"); 
					return;
				}
			}
			if (eObject != null) {
				instanceGenerator.save(eObject, writer);
			} else {
				Logger.log(Logger.ERROR, "Error: Missing Runtime Class for UML Class " + umlClass.getQualifiedName());
				writer.print("Error: Missing Runtime Class");
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

		writer.print(TransformAbstract.getPublicationName(umlClass));

		writer.print(" - conformance rules");
		writer.println("</title>");

		Class cdaClass = CDAModelUtil.getCDAClass(umlClass);
		String prefix = getExtensionName(cdaClass);
		String cdaClassName = cdaClass != null
				? cdaClass.getName()
				: "MISSING_CDA_CLASS";
		writer.print("<shortdesc id=\"shortdesc\">");
		if (umlClass.isAbstract()) {
			writer.print("<i>Abstract</i> ");
		}
		if (cdaClass != null && !umlClass.equals(cdaClass)) {
			writer.print(
				"[" + prefix + cdaClassName + ": templateId <tt>" + CDAModelUtil.getTemplateId(umlClass) + "</tt>]");
		}
		writer.println("</shortdesc>");

		writer.println("<prolog id=\"prolog\">");
		if (cdaClass != null) {
			writer.println("<metadata><category>" + cdaClassName + "</category></metadata>");
			writer.println("<resourceid id=\"" + CDAModelUtil.getTemplateId(umlClass) + "\"/>");
		}
		writer.println("</prolog>");
	}

	private String getExtensionName(Class cdaClass) {
		String name = CDAModelUtil.getNameSpacePrefix(cdaClass);
		return name == null || name.isEmpty()
				? ""
				: name + ":";
	}

	private void appendPropertyComments(PrintWriter writer, Property property) {
		Association association = property.getAssociation();
		if (association != null && association.getOwnedComments().size() > 0) {
			writer.append("<ol>");
			for (Comment comment : association.getOwnedComments()) {
				writer.append("<li><p><lines><i>");
				writer.append(CDAModelUtil.fixNonXMLCharacters(comment.getBody()));
				writer.append("</i></lines></p></li>");
			}
			writer.append("</ol>");
		}

		if (property.getOwnedComments().size() > 0) {
			for (Comment comment : property.getOwnedComments()) {
				writer.append("<p><lines><i>");
				writer.append(CDAModelUtil.fixNonXMLCharacters(comment.getBody()));
				writer.append("</i></lines></p>");
			}
		}
	}

	private void appendPropertyRules(PrintWriter writer, Property property, Map<String, List<Constraint>> constraintMap,
			Map<Constraint, List<Constraint>> subConstraintMap, List<Constraint> unprocessedConstraints) {

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
		String normalizedClassName = normalizeCodeName(umlClass.getName());

		String pathFolder = "classes";
		IPath filePath = transformerOptions.getOutputPath().append(pathFolder).addTrailingSeparator().append(
			"generated").addTrailingSeparator().append("_" + normalizedClassName).addFileExtension("dita");
		return writeClassToFile(umlClass, filePath);
	}

	public Object writeClassToFile(Class umlClass, IPath filePath) {
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

	private void appendTable(PrintWriter writer, Class umlClass) {

		if (tableGenerator != null) {
			String table = tableGenerator.createTable(umlClass);
			if (table != null && table.length() > 0) {
				writer.println(table);
			}
			table = tableGenerator.createTable2(umlClass);
			if (table != null && table.length() > 0) {
				writer.println(table);
			}
		}

	}

	private void appendChanges(PrintWriter writer, Class umlClass) {

		writer.println("<section id=\"changes\">");
		;

		for (Substitution substitution : umlClass.getSubstitutions()) {

			for (NamedElement ne : substitution.getSuppliers()) {
				if (ne instanceof Class) {
					appendChangeLog(writer, umlClass, (Class) ne);
				}
			}

		}

		writer.println("</section>");

	}

	private static void composeAllConformanceMessages(Class element, final PrintWriter writer, final boolean markup) {
		//
		// for (Generalization generalization : element.getGeneralizations()) {
		// if (generalization.getGeneral() instanceof Class) {
		// composeAllConformanceMessages((Class) generalization.getGeneral(), writer, false);
		// }
		//
		// }

		final TreeIterator<EObject> iterator = EcoreUtil.getAllContents(Collections.singletonList(element));
		while (iterator != null && iterator.hasNext()) {
			EObject child = iterator.next();

			UMLSwitch<Object> umlSwitch = new UMLSwitch<Object>() {

				@Override
				public Object caseAssociation(Association association) {
					iterator.prune();
					return association;
				}

				@Override
				public Object caseClass(Class umlClass) {
					String message = CDAModelUtil.computeConformanceMessage(umlClass, markup);
					writer.println(message);

					return umlClass;
				}

				@Override
				public Object caseGeneralization(Generalization generalization) {
					String message = CDAModelUtil.computeConformanceMessage(generalization, markup);
					if (message.length() > 0) {
						writer.println(message);
					}
					return generalization;
				}

				@Override
				public Object caseProperty(Property property) {
					String message = CDAModelUtil.computeConformanceMessage(property, markup);
					if (message.length() > 0) {
						writer.println(message);
					}
					return property;
				}

				@Override
				public Object caseConstraint(Constraint constraint) {
					String message = CDAModelUtil.computeConformanceMessage(constraint, markup);
					if (message.length() > 0) {
						writer.println(message);
					}
					return constraint;
				}
			};
			umlSwitch.doSwitch(child);
		}
	}

	class LineComparator implements IRangeComparator {

		private String[] fLines;

		public LineComparator(InputStream is) throws IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String line;
			ArrayList<String> ar = new ArrayList<>();
			while ((line = br.readLine()) != null) {
				ar.add(line);
			}
			// It is the responsibility of the caller to close the stream
			fLines = ar.toArray(new String[ar.size()]);
		}

		String getLine(int ix) {
			return fLines[ix];
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.compare.rangedifferencer.IRangeComparator#getRangeCount()
		 */
		public int getRangeCount() {
			return fLines.length;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.compare.rangedifferencer.IRangeComparator#rangesEqual(int, org.eclipse.compare.rangedifferencer.IRangeComparator, int)
		 */
		public boolean rangesEqual(int thisIndex, IRangeComparator other, int otherIndex) {
			String s1 = fLines[thisIndex];
			String s2 = ((LineComparator) other).fLines[otherIndex];
			return s1.equals(s2);
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.compare.rangedifferencer.IRangeComparator#skipRangeComparison(int, int,
		 * org.eclipse.compare.rangedifferencer.IRangeComparator)
		 */
		public boolean skipRangeComparison(int length, int maxLength, IRangeComparator other) {
			return false;
		}
	}

	public IStatus appendChanges(PrintWriter writer, InputStream target, InputStream other) {

		IProgressMonitor monitor = null;

		LineComparator t, o;

		try {

			t = new LineComparator(target);
			o = new LineComparator(other);
		} catch (UnsupportedEncodingException e) {
			return null;
			// return new Status(IStatus.ERROR, CompareUI.PLUGIN_ID, 1, MergeMessages.TextAutoMerge_inputEncodingError, e);
		} catch (IOException e) {
			return null;
			// return new Status(IStatus.ERROR, CompareUI.PLUGIN_ID, 1, e.getMessage(), e);
		}

		// try {
		String lineSeparator = System.getProperty("line.separator"); //$NON-NLS-1$
		if (lineSeparator == null) {
			lineSeparator = "\n"; //$NON-NLS-1$
		}

		RangeDifference[] diffs = RangeDifferencer.findRanges(monitor, t, o);

		writer.append("<li>");
		writer.println("<b>Modifications</b>");
		writer.append("</li>");

		for (int i = 0; i < diffs.length; i++) {
			RangeDifference rd = diffs[i];
			switch (rd.kind()) {
				case RangeDifference.RIGHT:
					for (int j = rd.rightStart(); j < rd.rightEnd(); j++) {
						String s = o.getLine(j);
						writer.append("<li>");
						writer.println(s);
						writer.append("</li>");

					}
					break;

				default:
					break;
			}
		}

		writer.append("<li>");
		writer.println("<b>Additions</b>");
		writer.append("</li>");

		for (int i = 0; i < diffs.length; i++) {
			RangeDifference rd = diffs[i];
			switch (rd.kind()) {

				case RangeDifference.LEFT:
					for (int j = rd.leftStart(); j < rd.leftEnd(); j++) {
						String s = t.getLine(j);
						writer.append("<li>");
						writer.println(s);
						writer.append("</li>");

					}
					break;

				default:
					break;
			}
		}

		return Status.OK_STATUS;
	}

	void appendChangeLog(PrintWriter writer, Class source, Class substitute) {

		writer.println("<p>");
		// CDAModelUtil.get

		writer.println("Change Log from " + CDAModelUtil.getModelPrefix(substitute) + "::" + substitute.getName());
		writer.println("</p>");
		writer.println("<p id=\"" + substitute.getName() + "\" >");
		writer.append("<ol>");

		StringWriter leftsw = new StringWriter();
		PrintWriter leftpw = new PrintWriter(leftsw);

		composeAllConformanceMessages(source, leftpw, false);

		StringWriter rightsw = new StringWriter();
		PrintWriter rightpw = new PrintWriter(rightsw);

		composeAllConformanceMessages(substitute, rightpw, false);

		InputStream sourceStream = new ByteArrayInputStream(leftsw.getBuffer().toString().getBytes());

		InputStream substitueStream = new ByteArrayInputStream(rightsw.getBuffer().toString().getBytes());

		appendChanges(writer, sourceStream, substitueStream);

		writer.append("</ol>");

		writer.println("</p>");

	}

}
