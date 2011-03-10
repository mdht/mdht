/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.rim.operations;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.Participation;
import org.openhealthtools.mdht.uml.hl7.rim.RIMPackage;
import org.openhealthtools.mdht.uml.hl7.rim.Role;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Participation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.Participation#getTypeCode() <em>Get Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.Participation#getAct() <em>Get Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.Participation#getRole() <em>Get Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.Participation#isTypeCodeDefined() <em>Is Type Code Defined</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.Participation#isContextControlCodeDefined() <em>Is Context Control Code Defined</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipationOperations extends InfrastructureRootOperations {
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
	protected ParticipationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  Enumerator getTypeCode(Participation participation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  Act getAct(Participation participation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  Role getRole(Participation participation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #isTypeCodeDefined(Participation) <em>Is Type Code Defined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeCodeDefined(Participation)
	 * @generated
	 * @ordered
	 */
	protected static final String IS_TYPE_CODE_DEFINED__EOCL_EXP = "self.isDefined('typeCode')";
	/**
	 * The cached OCL query for the '{@link #isTypeCodeDefined(Participation) <em>Is Type Code Defined</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeCodeDefined(Participation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> IS_TYPE_CODE_DEFINED__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.isDefined('typeCode')
	 * @param participation The receiving '<em><b>Participation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean isTypeCodeDefined(Participation participation) {
		if (IS_TYPE_CODE_DEFINED__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(RIMPackage.Literals.PARTICIPATION, RIMPackage.Literals.PARTICIPATION.getEAllOperations().get(11));
			try {
				IS_TYPE_CODE_DEFINED__EOCL_QRY = helper.createQuery(IS_TYPE_CODE_DEFINED__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(IS_TYPE_CODE_DEFINED__EOCL_QRY);
		return ((Boolean) query.evaluate(participation)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #isContextControlCodeDefined(Participation) <em>Is Context Control Code Defined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContextControlCodeDefined(Participation)
	 * @generated
	 * @ordered
	 */
	protected static final String IS_CONTEXT_CONTROL_CODE_DEFINED__EOCL_EXP = "self.isDefined('contextControlCode')";
	/**
	 * The cached OCL query for the '{@link #isContextControlCodeDefined(Participation) <em>Is Context Control Code Defined</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContextControlCodeDefined(Participation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> IS_CONTEXT_CONTROL_CODE_DEFINED__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.isDefined('contextControlCode')
	 * @param participation The receiving '<em><b>Participation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean isContextControlCodeDefined(Participation participation) {
		if (IS_CONTEXT_CONTROL_CODE_DEFINED__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(RIMPackage.Literals.PARTICIPATION, RIMPackage.Literals.PARTICIPATION.getEAllOperations().get(12));
			try {
				IS_CONTEXT_CONTROL_CODE_DEFINED__EOCL_QRY = helper.createQuery(IS_CONTEXT_CONTROL_CODE_DEFINED__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(IS_CONTEXT_CONTROL_CODE_DEFINED__EOCL_QRY);
		return ((Boolean) query.evaluate(participation)).booleanValue();
	}

} // ParticipationOperations