/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPRegistryDelegate;
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
public class HITSPRegistryDelegateOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HITSPRegistryDelegateOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  EClass getEClass(HITSPRegistryDelegate hitspRegistryDelegate, String templateId, Object context) {
		EClass result = null;
		if (context instanceof Element) {
			Element element = (Element) context;
			String localName = element.getLocalName();
			if ("2.16.840.1.113883.3.88.11.83.8".equals(templateId)) {
				List<String> templateIds = getTemplateIds(element);
				if (templateIds.contains("1.3.6.1.4.1.19376.1.5.3.1.4.7.1")) {
					// normal dose
					result = HITSPPackage.Literals.MEDICATION_NORMAL_DOSE;
				} else if (templateIds.contains("1.3.6.1.4.1.19376.1.5.3.1.4.9")) {
					// split dose
					result = HITSPPackage.Literals.MEDICATION_SPLIT_DOSE;
				} else if (templateIds.contains("1.3.6.1.4.1.19376.1.5.3.1.4.8")) {
					// tapered dose
					result = HITSPPackage.Literals.MEDICATION_TAPERED_DOSE;
				} else if (templateIds.contains("1.3.6.1.4.1.19376.1.5.3.1.4.10")) {
					// conditional dose
					result = HITSPPackage.Literals.MEDICATION_CONDITIONAL_DOSE;
				} else if (templateIds.contains("1.3.6.1.4.1.19376.1.5.3.1.4.11")) {
					// combination medication
					result = HITSPPackage.Literals.MEDICATION_COMBINATION_MEDICATION;
				} else {
					// no dose information
					result = HITSPPackage.Literals.MEDICATION;
				}
			}
			else if ("2.16.840.1.113883.3.88.11.83.3".equals(templateId)) {
				// Support
				if ("guardian".equals(localName)) {
					result = HITSPPackage.Literals.SUPPORT_GUARDIAN;
				} else if ("participant".equals(localName)) {
					result = HITSPPackage.Literals.SUPPORT_PARTICIPANT;
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

} // HITSPRegistryDelegateOperations