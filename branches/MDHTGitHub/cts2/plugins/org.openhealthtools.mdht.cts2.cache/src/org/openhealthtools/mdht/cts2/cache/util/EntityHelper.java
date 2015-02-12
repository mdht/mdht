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
package org.openhealthtools.mdht.cts2.cache.util;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.cts2.association.GraphNode;
import org.openhealthtools.mdht.cts2.core.EntitySynopsis;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;
import org.openhealthtools.mdht.cts2.entity.ClassDescription;
import org.openhealthtools.mdht.cts2.entity.Designation;
import org.openhealthtools.mdht.cts2.entity.DesignationRole;
import org.openhealthtools.mdht.cts2.entity.EntityDescriptionMsg;
import org.openhealthtools.mdht.cts2.entity.EntityDirectoryEntry;
import org.openhealthtools.mdht.cts2.entity.NamedEntityDescription;

public class EntityHelper {
	private static String defaultLanguage = "English";

	public static String getEntityName(EObject eObject) {
		String name = null;

		if (eObject instanceof EntitySynopsis) {
			name = ((EntitySynopsis) eObject).getDesignation();
		} else if (eObject instanceof URIAndEntityName) {
			name = ((URIAndEntityName) eObject).getName();
		} else if (eObject instanceof EntityDirectoryEntry) {
			name = ((EntityDirectoryEntry) eObject).getKnownEntityDescription().get(0).getDesignation();
		} else if (eObject instanceof NamedEntityDescription) {
			name = getPreferredDesignation((NamedEntityDescription) eObject);
		} else if (eObject instanceof GraphNode) {
			name = ((GraphNode) eObject).getNodeEntity().getDesignation();
		}

		return name;
	}

	public static String getURI(EObject eObject) {
		String uri = null;
		if (eObject instanceof URIAndEntityName) {
			uri = ((URIAndEntityName) eObject).getUri();
		} else if (eObject instanceof NamedEntityDescription) {
			uri = ((NamedEntityDescription) eObject).getAbout();
		} else if (eObject instanceof EntityDirectoryEntry) {
			uri = ((EntityDirectoryEntry) eObject).getAbout();
		}

		return uri;
	}

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

				if (designation.getLanguage() != null &&
						designation.getLanguage().getValue().indexOf(defaultLanguage) >= 0) {
					break;
				}
			}
		}

		return value;
	}
}
