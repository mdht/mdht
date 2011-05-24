/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
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
package org.openhealthtools.mdht.uml.hdf.ui.util;

import java.util.Iterator;
import java.util.List;

import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FillStyle;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.hdf.util.IRIMProfileConstants;

/**
 * Static utility methods for assigning standard RIM colors to model diagram notational views.
 */
public class RIMColorUtil {

	public static final String ACT = IRIMProfileConstants.ACT;

	public static final String ACT_RELATIONSHIP = IRIMProfileConstants.ACT_RELATIONSHIP;

	public static final String ENTITY = IRIMProfileConstants.ENTITY;

	public static final String ROLE = IRIMProfileConstants.ROLE;

	public static final String ROLE_LINK = IRIMProfileConstants.ROLE_LINK;

	public static final String PARTICIPATION = IRIMProfileConstants.PARTICIPATION;

	public static final String NON_CORE = "InfrastructureRoot"; // what stereotypes??

	public static final String LANGUAGE_COMMUNICATION = "LanguageCommunication";

	public static final int ACT_COLOR = 8487423; // red

	public static final int ACT_RELATIONSHIP_COLOR = 12303359; // light red

	public static final int ENTITY_COLOR = 8519553; // green

	public static final int ROLE_COLOR = 8519679; // yellow

	public static final int ROLE_LINK_COLOR = 8519679; // yellow

	public static final int PARTICIPATION_COLOR = 16777088; // light blue

	public static final int NON_CORE_COLOR = 16744833; // dark blue

	/**
	 * Assign standard RIM colors to a diagram view element.
	 * 
	 * @param view
	 *            a diagram view that should be colorized
	 * @param rimClass
	 *            a UML Class or Stereotype used for RIM assignment
	 * @return true if color is assigned successfully
	 */
	public static boolean assignRIMColor(View view, Classifier rimClass) {
		List<String> allParentNames = UMLUtil.getAllParentNames(rimClass);
		if (view instanceof Edge) {
			return assignRIMColor(view, allParentNames);
		} else {
			return assignRIMColor(view, allParentNames);
		}
	}

	/**
	 * Assign standard RIM colors to a diagram edge that represents an AssociationClass.
	 * Find the child node for class attached to this association.
	 * 
	 * @param view
	 *            a diagram view that should be colorized
	 * @param rimClass
	 *            a UML Class or Stereotype used for RIM assignment
	 * @return true if color is assigned successfully
	 */
	public static boolean assignRIMColor(Edge edge, Classifier rimClass) {
		List<String> allParentNames = UMLUtil.getAllParentNames(rimClass);

		// find nested class node
		for (Iterator iterator = edge.getChildren().iterator(); iterator.hasNext();) {
			View child = (View) iterator.next();
			if (isClassNode(child)) {
				return assignRIMColor(child, allParentNames);
			}
		}

		return false;
	}

	/**
	 * Assign standard RIM colors to a diagram view element.
	 * 
	 * @param view
	 *            a diagram view that should be colorized
	 * @param element
	 *            use keywords on this element for RIM assignment
	 * @return true if color is assigned successfully
	 */
	public static boolean assignRIMColorFromKeywords(View view, Element element) {
		// when testing keywords, cannot use RIM generalization to determine type
		// TODO if profile available, use keyword to look up stereotype, then test generalization
		List allParentNames = element.getKeywords();
		return assignRIMColor(view, allParentNames);
	}

	public static void assignNonCoreColor(View view) {
		setFillStyle(view, RIMColorUtil.NON_CORE_COLOR);
	}

	protected static boolean assignRIMColor(View view, List allParentNames) {
		if (allParentNames.contains(ACT)) {
			setFillStyle(view, ACT_COLOR);
			return true;
		} else if (allParentNames.contains(ACT_RELATIONSHIP)) {
			setFillStyle(view, ACT_RELATIONSHIP_COLOR);
			return true;
		} else if (allParentNames.contains(ENTITY)) {
			setFillStyle(view, ENTITY_COLOR);
			return true;
		} else if (allParentNames.contains(ROLE)) {
			setFillStyle(view, ROLE_COLOR);
			return true;
		} else if (allParentNames.contains(ROLE_LINK)) {
			setFillStyle(view, ROLE_LINK_COLOR);
			return true;
		} else if (allParentNames.contains(PARTICIPATION)) {
			setFillStyle(view, PARTICIPATION_COLOR);
			return true;
		} else if (allParentNames.contains(NON_CORE)) {
			setFillStyle(view, NON_CORE_COLOR);
			return true;
		} else if (allParentNames.contains(LANGUAGE_COMMUNICATION)) {
			setFillStyle(view, NON_CORE_COLOR);
			return true;
		}

		return false;
	}

	private static boolean isClassNode(View view) {
		// TODO works for RSM, but may be different node type for classses in UML2Tools
		return view instanceof Node && "".equals(((Node) view).getType());
	}

	private static void setFillStyle(View view, int color) {
		FillStyle style = (FillStyle) view.getStyle(NotationPackage.Literals.FILL_STYLE);
		if (style == null) {
			style = NotationFactory.eINSTANCE.createFillStyle();
			view.getStyles().add(style);
		}
		style.setFillColor(color);
	}

}
