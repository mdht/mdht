/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHERegistryDelegate;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Registry Delegate</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegistryDelegate#getEClass(java.lang.String, java.lang.Object) <em>Get EClass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IHERegistryDelegateOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IHERegistryDelegateOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EClass getEClass(IHERegistryDelegate iheRegistryDelegate, String templateId, Object context) {
		EClass result = null;
		if (context instanceof Element) {
			Element element = (Element) context;
			if ("1.3.6.1.4.1.19376.1.5.3.1.4.19".equals(templateId)) {
				// ProcedureEntry
				List<String> templateIds = getTemplateIds(element);
				if (templateIds.contains("2.16.840.1.113883.10.20.1.29")) {
					// ProcedureEntryProcedureActivityProcedure
					result = IHEPackage.Literals.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE;
				} else if (templateIds.contains("2.16.840.1.113883.10.20.1.25")) {
					// ProcedureEntryPlanOfCareActivityProcedure
					result = IHEPackage.Literals.PROCEDURE_ENTRY_PLAN_OF_CARE_ACTIVITY_PROCEDURE;
				}
			}
		}
		return result;
	}
	
	private static List<String> getTemplateIds(Element element) {
		List<String> templateIds = new ArrayList<String>();
		NodeList nodeList = element.getChildNodes();
		for (int i = 0; i < nodeList.getLength(); i++) {
			if (nodeList.item(i) instanceof Element) {
				Element e = (Element) nodeList.item(i);
				if ("templateId".equals(e.getLocalName())) {
					String root = e.getAttributeNS(null, "root");
					if (root != null) {
						templateIds.add(root);
					}
				}
			}
		}
		return templateIds;
	}

} // IHERegistryDelegateOperations