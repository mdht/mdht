/*******************************************************************************
 * Copyright (c) 2004, 2009 David A Carlson.
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
package org.eclipse.mdht.uml.common.ui.dialogs;

import java.util.Comparator;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.mdht.uml.common.ui.internal.l10n.Messages;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.FilteredList;
import org.eclipse.ui.dialogs.TwoPaneElementSelector;
import org.eclipse.uml2.uml.NamedElement;

/**
 * A dialog to select a type from a list of model elements.
 * Derived from Eclipse JDT UI Java type search dialog.
 *
 * @version $Id: $
 */
public class ElementSelectionDialog extends TwoPaneElementSelector {

	private static class TypeFilterMatcher implements FilteredList.FilterMatcher {

		private StringMatcher fMatcher;

		private StringMatcher fQualifierMatcher;

		/*
		 * @see FilteredList.FilterMatcher#setFilter(String, boolean)
		 */
		public void setFilter(String pattern, boolean ignoreCase, boolean igoreWildCards) {
			int qualifierIndex = pattern.lastIndexOf(NamedElement.SEPARATOR);

			// type
			if (qualifierIndex == -1) {
				fQualifierMatcher = null;
				fMatcher = new StringMatcher(pattern + '*', ignoreCase, igoreWildCards);

				// qualified type
			} else {
				fQualifierMatcher = new StringMatcher(pattern.substring(0, qualifierIndex), ignoreCase, igoreWildCards);
				fMatcher = new StringMatcher(pattern.substring(qualifierIndex + 1), ignoreCase, igoreWildCards);
			}
		}

		/*
		 * @see FilteredList.FilterMatcher#match(Object)
		 */
		public boolean match(Object element) {
			if (!(element instanceof NamedElement)) {
				return false;
			}

			NamedElement type = (NamedElement) element;

			if (type.getName() != null && !fMatcher.match(type.getName())) {
				return false;
			}

			if (fQualifierMatcher == null) {
				return true;
			}

			return fQualifierMatcher.match(type.getNearestPackage().getQualifiedName());
		}
	}

	/*
	 * A string comparator which is aware of obfuscated code
	 * (type names starting with lower case characters).
	 */
	private static class StringComparator implements Comparator {
		public int compare(Object left, Object right) {
			String leftString = (String) left;
			String rightString = (String) right;

			if (left == null || right == null || leftString.length() == 0 || rightString.length() == 0) {
				return 0;
			}

			if (Character.isLowerCase(leftString.charAt(0)) && !Character.isLowerCase(rightString.charAt(0))) {
				return +1;
			}

			if (Character.isLowerCase(rightString.charAt(0)) && !Character.isLowerCase(leftString.charAt(0))) {
				return -1;
			}

			int result = leftString.compareToIgnoreCase(rightString);
			if (result == 0) {
				result = leftString.compareTo(rightString);
			}

			return result;
		}
	}

	private List typeList;

	/**
	 * Constructs a type selection dialog.
	 *
	 * @param parent
	 *            the parent shell.
	 * @param context
	 *            the runnable context.
	 * @param typeList
	 *            list of elements to be displayed in the dialog
	 */
	public ElementSelectionDialog(Shell parent, IRunnableContext context, List typeList) {
		super(
			parent, new ElementLabelProvider(ElementLabelProvider.SHOW_TYPE_ONLY), new ElementLabelProvider(
				ElementLabelProvider.SHOW_TYPE_CONTAINER_ONLY + ElementLabelProvider.SHOW_RESOURCE_NAME_POSTFIX));

		Assert.isNotNull(context);
		this.typeList = typeList;

		setUpperListLabel(Messages.ElementSelectionDialog_upperLabel);
		setLowerListLabel(Messages.ElementSelectionDialog_lowerLabel);
	}

	/*
	 * @see AbstractElementListSelectionDialog#createFilteredList(Composite)
	 */
	@Override
	protected FilteredList createFilteredList(Composite parent) {
		FilteredList list = super.createFilteredList(parent);

		fFilteredList.setFilterMatcher(new TypeFilterMatcher());
		fFilteredList.setComparator(new StringComparator());

		return list;
	}

	/*
	 * @see org.eclipse.jface.window.Window#open()
	 */
	@Override
	public int open() {
		if (typeList.isEmpty()) {
			String title = Messages.ElementSelectionDialog_notypes_title;
			String message = Messages.ElementSelectionDialog_notypes_message;
			MessageDialog.openInformation(getShell(), title, message);
			return CANCEL;
		}

		Object[] typeArray = typeList.toArray(new Object[typeList.size()]);
		setElements(typeArray);

		return super.open();
	}

}
