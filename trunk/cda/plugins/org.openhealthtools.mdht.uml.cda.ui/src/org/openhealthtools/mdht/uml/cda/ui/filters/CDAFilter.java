package org.openhealthtools.mdht.uml.cda.ui.filters;

import org.eclipse.jface.viewers.IFilter;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.openhealthtools.mdht.uml.common.ui.filters.HDFFilterUtil;

public abstract class CDAFilter extends HDFFilterUtil implements IFilter {

	private static final String CDA_PACKAGE_NAME = "cda";
	
	/**
	 * getCDAClass returns the parent CDA class.  
	 * 
	 * Note : In Papyrus - if the base model (cda for example) is not available, getNearestPackage returns null
	 * @param templateClass
	 * @return
	 */
	protected Class getCDAClass(Class templateClass) { 
		
		Class cdaClass = null;
		for (Classifier parent : templateClass.allParents()) {
			if (parent.getNearestPackage() != null) {
				if (CDA_PACKAGE_NAME.equals(parent.getNearestPackage().getName()) && parent instanceof Class) {
					cdaClass = (Class) parent;
				}
			}

		}
		
		return cdaClass;
	}
	

}
