/**
 * Copyright (c) 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   David A Carlson (XMLmodeling.com) - initial API and implementation
 *   
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ui.dialogs;

import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.cda.ui.util.CDAPropertyUtil;
import org.openhealthtools.mdht.uml.cda.ui.util.IHL7Appearance;
import org.openhealthtools.mdht.uml.common.ui.dialogs.SubclassEditorViewLabelProvider;

/**
 *
 */
public class TemplateEditorViewLabelProvider extends SubclassEditorViewLabelProvider {

	public String getText(Object element) {
		String text = "";
		if (element instanceof Property) {
			text = CDAPropertyUtil.getCustomLabel((Property)element,
					IHL7Appearance.DEFAULT_HL7_PROPERTY);
		} 
		else {
			text = super.getText(element);
		}
		return text;
	}
}
