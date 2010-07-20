package org.openhealthtools.mdht.uml.cda.dita;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.InstanceGenerator;
import org.openhealthtools.mdht.uml.cda.dita.internal.Logger;
import org.openhealthtools.mdht.uml.common.util.NamedElementComparator;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class TransformClassProperties extends TransformAbstract {
	
	private InstanceGenerator instanceGenerator;

	public TransformClassProperties(DitaTransformerOptions options) {
		super(options);
		
		if (Platform.getBundle("org.openhealthtools.mdht.uml.cda") != null) {
			instanceGenerator = new InstanceGenerator();
		}
	}

	@Override
	public Object caseClass(Class umlClass) {
		String pathFolder = "classes";
		IPath filePath = transformerOptions.getOutputPath().append(pathFolder)
				.addTrailingSeparator().append("generated").addTrailingSeparator().append(
						"_"+umlClass.getName()).addFileExtension("dita");
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

	private void appendHeader(PrintWriter writer, Class umlClass) {
		writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		writer.println("<!DOCTYPE topic PUBLIC \"-//OASIS//DTD DITA Topic//EN\" \"topic.dtd\">");
		writer.println("<topic id=\"classId\" xml:lang=\"en-us\">");
		writer.print("<title>");
		writer.print(UMLUtil.splitName(umlClass));
		writer.print(" - conformance rules");
		writer.println("</title>");
		
		Class cdaClass = CDAModelUtil.getCDAClass(umlClass);
		String cdaClassName = cdaClass != null ? cdaClass.getName() : "MISSING_CDA_CLASS";
		if (cdaClass != null) {
			writer.print("<shortdesc id=\"shortdesc\">");
			if (!umlClass.equals(cdaClass)) {
				writer.print("[" + cdaClassName + ": templateId <tt>" 
						+ CDAModelUtil.getTemplateId(umlClass) + "</tt>]");
			}
			writer.println("</shortdesc>");
			
			writer.println("<prolog id=\"prolog\">");
			writer.println("<metadata><category>" + cdaClassName + "</category></metadata>");
			writer.println("<resourceid id=\"" + CDAModelUtil.getTemplateId(umlClass) + "\"/>");
			writer.println("</prolog>");
		}
	}

	private void appendBody(PrintWriter writer, Class umlClass) {
		writer.println("<body>");
		
		appendConformanceRules(writer, umlClass);
		appendAggregateRules(writer, umlClass);
		appendExample(writer, umlClass);
		
		writer.println("</body>");
		writer.println("</topic>");
	}

	private void appendConformanceRules(PrintWriter writer, Class umlClass) {
		writer.println("<ol id=\"conformance\">");
		
		boolean hasRules = false;
		for (Generalization generalization : umlClass.getGeneralizations()) {
			String message = CDAModelUtil.computeConformanceMessage(generalization, true);
			if (message.length() > 0) {
				hasRules = true;
				writer.println("<li>" + message + "</li>");
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
			writer.println("<li>" + CDAModelUtil.computeConformanceMessage(property, true) + "</li>");
		}
		// XML elements
		for (Property property : allProperties) {
			hasRules = true;
			writer.println("<li>" + CDAModelUtil.computeConformanceMessage(property, true) + "</li>");
		}

		for (Constraint constraint : umlClass.getOwnedRules()) {
			hasRules = true;
			writer.println("<li>" + CDAModelUtil.computeConformanceMessage(constraint, true) + "</li>");
		}
		
		if (!hasRules) {
			writer.println("<li></li>");
		}

		writer.println("</ol>");
	}

	private void appendAggregateRules(PrintWriter writer, Class umlClass) {
		Package xrefSource = UMLUtil.getTopPackage(umlClass);
		List<Classifier> allParents = new ArrayList<Classifier>(umlClass.allParents());
		allParents.add(0, umlClass);

		List<Property> allProperties = new ArrayList<Property>();
		List<Property> allAttributes = new ArrayList<Property>();
		List<Constraint> allConstraints = new ArrayList<Constraint>();
		
		// process parents in reverse order, CDA base class first
		for (int i=allParents.size()-1; i>=0; i--) {
			Class parent = (Class) allParents.get(i);
			if (CDAModelUtil.isCDAModel(parent)) {
				//TODO add option to include CDA class properties
				continue;
			}
			
			for (Property property : parent.getOwnedAttributes()) {
				// if list contains this property name, replace it; else append
				int index = findProperty(allProperties, property.getName());
				if (index >= 0) {
					allProperties.set(index, property);
				}
				else {
					allProperties.add(property);
				}
			}
		}

		for (int i=allParents.size()-1; i>=0; i--) {
			Class parent = (Class) allParents.get(i);
			
			for (Constraint constraint : parent.getOwnedRules()) {
				allConstraints.add(constraint);
			}
		}

		writer.println("<ol id=\"aggregate\">");
		
		// use i>0 to omit this class
		for (int i=allParents.size()-1; i>0; i--) {
			Class parent = (Class) allParents.get(i);
			String message = CDAModelUtil.computeGeneralizationConformanceMessage(parent, true, xrefSource);
			if (message.length() > 0) {
				writer.println("<li>" + message + "</li>");
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
			writer.println("<li>" + modelPrefix(property) +
					CDAModelUtil.computeConformanceMessage(property, true, xrefSource) + "</li>");
		}
		// XML elements
		for (Property property : allProperties) {
			writer.println("<li>" + modelPrefix(property) +
					CDAModelUtil.computeConformanceMessage(property, true, xrefSource) + "</li>");
		}

		for (Constraint constraint : allConstraints) {
			writer.println("<li>" + modelPrefix(constraint) +
					CDAModelUtil.computeConformanceMessage(constraint, true) + "</li>");
		}
		
		// <ol> cannot be empty
		if (allAttributes.isEmpty() && allProperties.isEmpty() && allConstraints.isEmpty()) {
			writer.println("<li></li>");
		}

		writer.println("</ol>");
	}
	
	private int findProperty(List<Property> properties, String name) {
		if (name != null) {
			for (int i=0; i<properties.size(); i++) {
				if (name.equals(properties.get(i).getName()))
					return i;
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
	
	private void appendExample(PrintWriter writer, Class umlClass) {
		writer.print("<codeblock id=\"example\"><![CDATA[");

		if (instanceGenerator != null) {
			EObject eObject = instanceGenerator.createInstance(umlClass, 1);
			if (eObject != null) {
				instanceGenerator.save(eObject, writer);
			}
		}
		else {
			writer.print("TODO: XML document snippet");
		}
		
		writer.println("]]></codeblock>");
	}
	
}
