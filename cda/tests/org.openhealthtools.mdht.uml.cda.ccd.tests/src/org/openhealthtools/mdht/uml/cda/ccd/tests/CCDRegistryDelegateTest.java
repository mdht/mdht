/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.CCDRegistryDelegate;
import org.openhealthtools.mdht.uml.cda.ccd.operations.CCDRegistryDelegateOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Registry Delegate</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.RegistryDelegate#getEClass(java.lang.String, java.lang.Object)
 * <em>Get EClass</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class CCDRegistryDelegateTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends CCDRegistryDelegateOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass()
						.getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	 * 
	 * @generated
	 */
	private static class ObjectFactory implements
			TestObjectFactory<CCDRegistryDelegate> {
		public CCDRegistryDelegate create() {
			return CCDFactory.eINSTANCE.createCCDRegistryDelegate();
		}
	}

	/**
	 * 
	 * @generated
	 */
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	 * 
	 * @generated
	 */
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	 * 
	 * @generated
	 */
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // CCDRegistryDelegateOperations