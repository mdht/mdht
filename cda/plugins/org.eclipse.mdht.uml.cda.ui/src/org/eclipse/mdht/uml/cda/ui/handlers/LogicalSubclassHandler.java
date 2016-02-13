/*******************************************************************************
 * Copyright (c) 2014 seanmuir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     seanmuir - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.ui.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.window.Window;
import org.eclipse.mdht.uml.cda.core.profile.LogicalConstraint;
import org.eclipse.mdht.uml.cda.core.profile.LogicalOperator;
import org.eclipse.mdht.uml.cda.core.util.CDAProfileUtil;
import org.eclipse.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.eclipse.mdht.uml.common.ui.dialogs.SubclassEditorDialog;
import org.eclipse.mdht.uml.common.ui.dialogs.SubclassEditorViewContentProvider;
import org.eclipse.mdht.uml.common.ui.dialogs.SubclassEditorViewLabelProvider;
import org.eclipse.mdht.uml.common.ui.dialogs.SubclassHandler;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * @author seanmuir
 *
 */
public class LogicalSubclassHandler extends SubclassHandler {

	LogicalOperator logicalOperator;

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.mdht.uml.common.ui.dialogs.SubclassHandler#createSubclassDialog()
	 */
	@Override
	protected SubclassEditorDialog createSubclassDialog() {
		SubclassEditorDialog subclassDialog = new SubclassEditorDialog(
			shell, labelProvider, contentProvider, getSubclass());
		subclassDialog.setTitle("Create Logical Constraint " + logicalOperator.getLiteral());
		return subclassDialog;
	}

	/**
	 * @param shell
	 * @param subclass
	 * @param logicalOperator2
	 * @param subclassEditorViewLabelProvider
	 * @param subclassEditorViewContentProvider
	 */
	public LogicalSubclassHandler(Shell shell, Class subclass,
			SubclassEditorViewContentProvider subclassEditorViewContentProvider,
			SubclassEditorViewLabelProvider subclassEditorViewLabelProvider, LogicalOperator logicalOperator) {
		super(shell, subclass);
		this.logicalOperator = logicalOperator;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.mdht.uml.common.ui.dialogs.SubclassHandler#openSubclassDialog()
	 */
	@Override
	public int openSubclassDialog() {
		// create and kick off a subclass editor
		subclassDialog = createSubclassDialog();
		int resultStatus = subclassDialog.open();

		// OK button is pressed
		if (subclassDialog.getReturnCode() == Window.OK) {
			// get user selections
			Object[] selectionArray = subclassDialog.getResult();
			// set the new property selection
			createConstraint(selectionArray, getSubclass());
		}

		return resultStatus;
	}

	/**
	 * @param selectionArray
	 * @param subclass
	 */
	private void createConstraint(Object[] selectionArray, Class subclass) {

		if (selectionArray != null) {
			Constraint logicalConstraint = UMLFactory.eINSTANCE.createConstraint();

			String constraintName = "LogicalConstraint" + logicalOperator.getLiteral();
			int a = 0;
			while (subclass.getOwnedRule(constraintName + (a == 0
					? ""
					: a)) != null) {
				a++;
			}

			logicalConstraint.setName(constraintName + (a == 0
					? ""
					: a));
			// LogicalConstraint logicalConstraintStereotype = CDAFactory.eINSTANCE.createLogicalConstraint();
			// logicalConstraintStereotype.setOperation(logicalOperator);
			// logicalConstraintStereotype.setBase_Constraint(logicalConstraint);
			List<Property> selectedAttributes = new ArrayList<Property>();
			for (int i = 0; i < selectionArray.length; i++) {
				if (selectionArray[i] instanceof Property) {
					selectedAttributes.add((Property) selectionArray[i]);
				}
			}

			StringBuffer sb = new StringBuffer();
			for (Property p : selectedAttributes) {
				logicalConstraint.getConstrainedElements().add(p);
				if (sb.length() > 0) {
					sb.append(" " + (logicalOperator.equals(LogicalOperator.IFTHEN)
							? " THEN "
							: logicalOperator.getLiteral()) + " ");
				}
				if (sb.length() == 0 && logicalOperator.equals(LogicalOperator.IFTHEN)) {
					sb.append(" IF ");
				}
				sb.append(p.getName());
			}

			OpaqueExpression opaqueExpression = UMLFactory.eINSTANCE.createOpaqueExpression();
			opaqueExpression.getLanguages().add("Analysis");
			opaqueExpression.getBodies().add("Logical Constraint of " + sb.toString());

			logicalConstraint.setSpecification(opaqueExpression);

			subclass.getOwnedRules().add(logicalConstraint);

			// logicalConstraintStereotype.setBase_Constraint(logicalConstraint);
			// logicalConstraint.getStereotypeApplications().add(logicalConstraintStereotype);

			CDAProfileUtil.applyCDAStereotype(logicalConstraint, ICDAProfileConstants.LOGICAL_CONSTRAINT);

			for (EObject eObject : logicalConstraint.getStereotypeApplications()) {
				if (eObject instanceof LogicalConstraint) {
					((LogicalConstraint) eObject).setOperation(logicalOperator);
				}
			}
			// LogicalConstraint logicalConstraintStereotype = (LogicalConstraint) logicalConstraintStereotype.setOperation(logicalOperator);
		}

	}

	/**
	 * @param shell
	 * @param subclass
	 * @param contentProvider
	 * @param labelProvider
	 */
	public LogicalSubclassHandler(Shell shell, Class subclass, SubclassEditorViewContentProvider contentProvider,
			SubclassEditorViewLabelProvider labelProvider) {
		super(shell, subclass, contentProvider, labelProvider);
		// TODO Auto-generated constructor stub
	}

}
