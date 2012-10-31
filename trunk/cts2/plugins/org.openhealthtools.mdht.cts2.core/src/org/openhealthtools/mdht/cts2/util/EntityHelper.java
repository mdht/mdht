/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.util;

import org.openhealthtools.mdht.cts2.entity.ClassDescription;
import org.openhealthtools.mdht.cts2.entity.Designation;
import org.openhealthtools.mdht.cts2.entity.DesignationRole;
import org.openhealthtools.mdht.cts2.entity.EntityDescriptionMsg;
import org.openhealthtools.mdht.cts2.entity.NamedEntityDescription;

public class EntityHelper {
	private static String defaultLanguage = "US English";

	public static String getPreferredDesignation(EntityDescriptionMsg entity) {
		ClassDescription classDescription = entity.getEntityDescription().getClassDescription();
		return getPreferredDesignation(classDescription);
	}

	public static String getPreferredDesignation(NamedEntityDescription classDescription) {
		String value = null;
		for (Designation designation : classDescription.getDesignation()) {
			if (DesignationRole.PREFERRED == designation.getDesignationRole()) {
				if (designation.getValue() != null && designation.getValue().getMixed().size() > 0) {
					value = designation.getValue().getMixed().getValue(0).toString();
				}

				if (designation.getLanguage() != null && defaultLanguage.equals(designation.getLanguage().getValue())) {
					break;
				}
			}
		}

		return value;
	}
}
