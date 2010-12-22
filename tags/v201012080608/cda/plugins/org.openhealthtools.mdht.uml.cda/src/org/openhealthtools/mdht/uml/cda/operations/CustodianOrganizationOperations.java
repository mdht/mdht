/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.operations;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.EN;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.rim.operations.EntityOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Custodian Organization</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.CustodianOrganization#getNames() <em>Get Names</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.CustodianOrganization#getTelecoms() <em>Get Telecoms</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.CustodianOrganization#getAddrs() <em>Get Addrs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustodianOrganizationOperations extends EntityOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustodianOrganizationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #getNames(CustodianOrganization) <em>Get Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNames(CustodianOrganization)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NAMES__EOCL_EXP = "Bag { self.name }";

	/**
	 * The cached OCL query for the '{@link #getNames(CustodianOrganization) <em>Get Names</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNames(CustodianOrganization)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NAMES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bag { self.name }
	 * @param custodianOrganization The receiving '<em><b>Custodian Organization</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<EN> getNames(CustodianOrganization custodianOrganization) {
		if (GET_NAMES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.Literals.CUSTODIAN_ORGANIZATION, CDAPackage.Literals.CUSTODIAN_ORGANIZATION.getEAllOperations().get(8));
			try {
				GET_NAMES__EOCL_QRY = helper.createQuery(GET_NAMES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NAMES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EN> result = (Collection<EN>) query.evaluate(custodianOrganization);
		return new BasicEList.UnmodifiableEList<EN>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getTelecoms(CustodianOrganization) <em>Get Telecoms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecoms(CustodianOrganization)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TELECOMS__EOCL_EXP = "Bag { self.telecom }";

	/**
	 * The cached OCL query for the '{@link #getTelecoms(CustodianOrganization) <em>Get Telecoms</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecoms(CustodianOrganization)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TELECOMS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bag { self.telecom }
	 * @param custodianOrganization The receiving '<em><b>Custodian Organization</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<TEL> getTelecoms(CustodianOrganization custodianOrganization) {
		if (GET_TELECOMS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.Literals.CUSTODIAN_ORGANIZATION, CDAPackage.Literals.CUSTODIAN_ORGANIZATION.getEAllOperations().get(9));
			try {
				GET_TELECOMS__EOCL_QRY = helper.createQuery(GET_TELECOMS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TELECOMS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TEL> result = (Collection<TEL>) query.evaluate(custodianOrganization);
		return new BasicEList.UnmodifiableEList<TEL>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getAddrs(CustodianOrganization) <em>Get Addrs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddrs(CustodianOrganization)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADDRS__EOCL_EXP = "Bag { self.addr }";

	/**
	 * The cached OCL query for the '{@link #getAddrs(CustodianOrganization) <em>Get Addrs</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddrs(CustodianOrganization)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADDRS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bag { self.addr }
	 * @param custodianOrganization The receiving '<em><b>Custodian Organization</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<AD> getAddrs(CustodianOrganization custodianOrganization) {
		if (GET_ADDRS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.Literals.CUSTODIAN_ORGANIZATION, CDAPackage.Literals.CUSTODIAN_ORGANIZATION.getEAllOperations().get(10));
			try {
				GET_ADDRS__EOCL_QRY = helper.createQuery(GET_ADDRS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADDRS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AD> result = (Collection<AD>) query.evaluate(custodianOrganization);
		return new BasicEList.UnmodifiableEList<AD>(result.size(), result.toArray());
	}

} // CustodianOrganizationOperations