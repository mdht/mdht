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
import org.openhealthtools.mdht.uml.cda.Place;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.EN;
import org.openhealthtools.mdht.uml.hl7.rim.operations.EntityOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Place</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Place#getNames() <em>Get Names</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Place#getAddrs() <em>Get Addrs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceOperations extends EntityOperations {
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
	protected PlaceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #getNames(Place) <em>Get Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNames(Place)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NAMES__EOCL_EXP = "Bag { self.name }";

	/**
	 * The cached OCL query for the '{@link #getNames(Place) <em>Get Names</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNames(Place)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NAMES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bag { self.name }
	 * @param place The receiving '<em><b>Place</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<EN> getNames(Place place) {
		if (GET_NAMES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.Literals.PLACE, CDAPackage.Literals.PLACE.getEAllOperations().get(8));
			try {
				GET_NAMES__EOCL_QRY = helper.createQuery(GET_NAMES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NAMES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EN> result = (Collection<EN>) query.evaluate(place);
		return new BasicEList.UnmodifiableEList<EN>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getAddrs(Place) <em>Get Addrs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddrs(Place)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADDRS__EOCL_EXP = "Bag { self.addr }";

	/**
	 * The cached OCL query for the '{@link #getAddrs(Place) <em>Get Addrs</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddrs(Place)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADDRS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bag { self.addr }
	 * @param place The receiving '<em><b>Place</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<AD> getAddrs(Place place) {
		if (GET_ADDRS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDAPackage.Literals.PLACE, CDAPackage.Literals.PLACE.getEAllOperations().get(9));
			try {
				GET_ADDRS__EOCL_QRY = helper.createQuery(GET_ADDRS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADDRS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AD> result = (Collection<AD>) query.evaluate(place);
		return new BasicEList.UnmodifiableEList<AD>(result.size(), result.toArray());
	}

} // PlaceOperations