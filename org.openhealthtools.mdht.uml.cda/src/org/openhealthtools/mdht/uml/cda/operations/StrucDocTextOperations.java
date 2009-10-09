/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.operations;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.openhealthtools.mdht.uml.cda.StrucDocText;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Struc Doc Text</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.StrucDocText#addText(java.lang.String) <em>Add Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.StrucDocText#getText() <em>Get Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrucDocTextOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrucDocTextOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void addText(StrucDocText strucDocText, String text) {
		FeatureMapUtil.addText(strucDocText.getMixed(), text);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  String getText(StrucDocText strucDocText) {
		StringBuffer text = new StringBuffer("");
		for (FeatureMap.Entry entry : strucDocText.getMixed()) {
			if (FeatureMapUtil.isText(entry)) {
				text.append(entry.getValue().toString());
			}
		}
		return text.toString();
	}

} // StrucDocTextOperations