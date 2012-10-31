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
