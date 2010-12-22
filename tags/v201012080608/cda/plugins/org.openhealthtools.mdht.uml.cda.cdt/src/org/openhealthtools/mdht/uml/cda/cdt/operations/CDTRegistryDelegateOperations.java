/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.cdt.operations;

import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.CDTRegistryDelegate;
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
public class CDTRegistryDelegateOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDTRegistryDelegateOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  EClass getEClass(CDTRegistryDelegate cdtRegistryDelegate, String templateId, Object context) {
		EClass result = null;
		if (context instanceof Element) {
			Element element = (Element) context;
			if ("2.16.840.1.113883.10.20.2.7".equals(templateId)) {
				String code = getCode(element);
				if ("51848-0".equals(code)) {
					result = CDTPackage.Literals.ASSESSMENT_SECTION;
				} else if ("18776-5".equals(code)) {
					result = CDTPackage.Literals.PLAN_SECTION;
				} else if ("51847-2".equals(code)) {
					result = CDTPackage.Literals.ASSESSMENT_AND_PLAN_SECTION;
				}
			}
			else if ("2.16.840.1.113883.10.20.2.8".equals(templateId)) {
				String code = getCode(element);
				if ("29299-5".equals(code)) {
					result = CDTPackage.Literals.REASON_FOR_VISIT_SECTION;
				} else if ("10154-3".equals(code)) {
					result = CDTPackage.Literals.CHIEF_COMPLAINT_SECTION;
				} else if ("46239-0".equals(code)) {
					result = CDTPackage.Literals.REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION;
				}
			}
			else if ("2.16.840.1.113883.10.20.4.8".equals(templateId)) {
				String code = getCode(element);
				if ("42349-1".equals(code)) {
					result = CDTPackage.Literals.REASON_FOR_REFERRAL_SECTION;
				} else if ("29299-5".equals(code)) {
					result = CDTPackage.Literals.REASON_FOR_VISIT_SECTION_CONSULT;
				}
			}
		}
		return result;
	}

	private static String getCode(Element element) {
		NodeList nodeList = element.getChildNodes();
		for (int i = 0; i < nodeList.getLength(); i++) {
			if (nodeList.item(i) instanceof Element) {
				Element e = (Element) nodeList.item(i);
				if ("code".equals(e.getLocalName())) {
					String code = e.getAttributeNS(null, "code");
					return code;
				}
			}
		}
		return null;
	}

} // CDTRegistryDelegateOperations