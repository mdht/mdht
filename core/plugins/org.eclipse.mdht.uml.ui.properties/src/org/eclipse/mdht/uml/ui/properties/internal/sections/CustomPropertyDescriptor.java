/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
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
package org.eclipse.mdht.uml.ui.properties.internal.sections;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.UMLPackage;

/**
 *
 * @version $Id: $
 */
public class CustomPropertyDescriptor extends PropertyDescriptor {

	/**
	 * @param object
	 * @param itemPropertyDescriptor
	 */
	public CustomPropertyDescriptor(Object object, IItemPropertyDescriptor itemPropertyDescriptor) {
		super(object, itemPropertyDescriptor);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.edit.ui.provider.PropertyDescriptor#createPropertyEditor(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public CellEditor createPropertyEditor(final Composite composite) {
		if (!itemPropertyDescriptor.canSetProperty(object)) {
			return null;
		}

		/*
		 * Executing this method forces loading of all Resources into ResourceSet.
		 * This is the same method called by default EMF impl when filling combo boxes.
		 */
		itemPropertyDescriptor.getChoiceOfValues(object);
		CellEditor result = null;
		EStructuralFeature feature = (EStructuralFeature) itemPropertyDescriptor.getFeature(object);

		if (UMLPackage.eINSTANCE.getGeneralization_General().equals(feature)) {
			final Generalization gen = (Generalization) object;
			if (gen.getSpecific() instanceof Classifier) {

				// TODO

				// result = new ComponentsExtendedDialogCellEditor() {
				// String getInitialDialogMessageName() { return "Generalization-GeneralType_SemanticComponent"; }
				// AbstractSelectionPage getSelectionPage() { return new GeneralizationSelectBaseTypePage((SemanticComponent)gen.getSpecific()); }
				// void storeResult(ComponentsSelectionDialog dialog) { new CommandManager(gen).setGeneral(gen,
				// (Type)dialog.getFirstResult()).execute(); }
				// };
			}
		} else if (UMLPackage.eINSTANCE.getClassifier_Attribute().equals(feature)) {
			System.out.println("class attribute");
		} else {
			result = super.createPropertyEditor(composite);
		}

		return result;
	}
}
