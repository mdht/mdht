/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.rim.operations;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.hl7.rim.RIMPackage;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Infrastructure Root</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot#getRealmCodes() <em>Get Realm Codes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot#getTypeId() <em>Get Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot#getTemplateIds() <em>Get Template Ids</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot#getNullFlavor() <em>Get Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot#isNullFlavorDefined() <em>Is Null Flavor Defined</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot#isNullFlavorUndefined() <em>Is Null Flavor Undefined</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot#hasContent() <em>Has Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot#isDefined(java.lang.String) <em>Is Defined</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot#isClassCodeDefined() <em>Is Class Code Defined</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot#isTypeCodeDefined() <em>Is Type Code Defined</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot#isContextControlCodeDefined() <em>Is Context Control Code Defined</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot#isDeterminerCodeDefined() <em>Is Determiner Code Defined</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot#isMoodCodeDefined() <em>Is Mood Code Defined</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfrastructureRootOperations {
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
	protected InfrastructureRootOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  EList<CS> getRealmCodes(InfrastructureRoot infrastructureRoot) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  II getTypeId(InfrastructureRoot infrastructureRoot) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  EList<II> getTemplateIds(InfrastructureRoot infrastructureRoot) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  NullFlavor getNullFlavor(InfrastructureRoot infrastructureRoot) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isNullFlavorDefined(InfrastructureRoot infrastructureRoot) {
		return infrastructureRoot.eIsSet(infrastructureRoot.eClass().getEStructuralFeature("nullFlavor"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isNullFlavorUndefined(InfrastructureRoot infrastructureRoot) {
		return !isNullFlavorDefined(infrastructureRoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean hasContent(InfrastructureRoot infrastructureRoot) {
		for (EStructuralFeature feature : infrastructureRoot.eClass().getEAllStructuralFeatures()) {
			if (infrastructureRoot.eIsSet(feature) && !"nullFlavor".equals(feature.getName())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  boolean isDefined(InfrastructureRoot infrastructureRoot, String featureName) {
		return (infrastructureRoot.eIsSet(infrastructureRoot.eClass().getEStructuralFeature(featureName)));
	}

	/**
	 * The cached OCL expression body for the '{@link #isClassCodeDefined(InfrastructureRoot) <em>Is Class Code Defined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClassCodeDefined(InfrastructureRoot)
	 * @generated
	 * @ordered
	 */
	protected static final String IS_CLASS_CODE_DEFINED__EOCL_EXP = "self.isDefined('classCode')";
	/**
	 * The cached OCL query for the '{@link #isClassCodeDefined(InfrastructureRoot) <em>Is Class Code Defined</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClassCodeDefined(InfrastructureRoot)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> IS_CLASS_CODE_DEFINED__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.isDefined('classCode')
	 * @param infrastructureRoot The receiving '<em><b>Infrastructure Root</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean isClassCodeDefined(InfrastructureRoot infrastructureRoot) {
		if (IS_CLASS_CODE_DEFINED__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(RIMPackage.Literals.INFRASTRUCTURE_ROOT, RIMPackage.Literals.INFRASTRUCTURE_ROOT.getEAllOperations().get(8));
			try {
				IS_CLASS_CODE_DEFINED__EOCL_QRY = helper.createQuery(IS_CLASS_CODE_DEFINED__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(IS_CLASS_CODE_DEFINED__EOCL_QRY);
		return ((Boolean) query.evaluate(infrastructureRoot)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #isTypeCodeDefined(InfrastructureRoot) <em>Is Type Code Defined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeCodeDefined(InfrastructureRoot)
	 * @generated
	 * @ordered
	 */
	protected static final String IS_TYPE_CODE_DEFINED__EOCL_EXP = "self.isDefined('typeCode')";
	/**
	 * The cached OCL query for the '{@link #isTypeCodeDefined(InfrastructureRoot) <em>Is Type Code Defined</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeCodeDefined(InfrastructureRoot)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> IS_TYPE_CODE_DEFINED__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.isDefined('typeCode')
	 * @param infrastructureRoot The receiving '<em><b>Infrastructure Root</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean isTypeCodeDefined(InfrastructureRoot infrastructureRoot) {
		if (IS_TYPE_CODE_DEFINED__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(RIMPackage.Literals.INFRASTRUCTURE_ROOT, RIMPackage.Literals.INFRASTRUCTURE_ROOT.getEAllOperations().get(9));
			try {
				IS_TYPE_CODE_DEFINED__EOCL_QRY = helper.createQuery(IS_TYPE_CODE_DEFINED__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(IS_TYPE_CODE_DEFINED__EOCL_QRY);
		return ((Boolean) query.evaluate(infrastructureRoot)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #isContextControlCodeDefined(InfrastructureRoot) <em>Is Context Control Code Defined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContextControlCodeDefined(InfrastructureRoot)
	 * @generated
	 * @ordered
	 */
	protected static final String IS_CONTEXT_CONTROL_CODE_DEFINED__EOCL_EXP = "self.isDefined('contextControlCode')";
	/**
	 * The cached OCL query for the '{@link #isContextControlCodeDefined(InfrastructureRoot) <em>Is Context Control Code Defined</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContextControlCodeDefined(InfrastructureRoot)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> IS_CONTEXT_CONTROL_CODE_DEFINED__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.isDefined('contextControlCode')
	 * @param infrastructureRoot The receiving '<em><b>Infrastructure Root</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean isContextControlCodeDefined(InfrastructureRoot infrastructureRoot) {
		if (IS_CONTEXT_CONTROL_CODE_DEFINED__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(RIMPackage.Literals.INFRASTRUCTURE_ROOT, RIMPackage.Literals.INFRASTRUCTURE_ROOT.getEAllOperations().get(10));
			try {
				IS_CONTEXT_CONTROL_CODE_DEFINED__EOCL_QRY = helper.createQuery(IS_CONTEXT_CONTROL_CODE_DEFINED__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(IS_CONTEXT_CONTROL_CODE_DEFINED__EOCL_QRY);
		return ((Boolean) query.evaluate(infrastructureRoot)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #isDeterminerCodeDefined(InfrastructureRoot) <em>Is Determiner Code Defined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeterminerCodeDefined(InfrastructureRoot)
	 * @generated
	 * @ordered
	 */
	protected static final String IS_DETERMINER_CODE_DEFINED__EOCL_EXP = "self.isDefined('determinerCode')";
	/**
	 * The cached OCL query for the '{@link #isDeterminerCodeDefined(InfrastructureRoot) <em>Is Determiner Code Defined</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeterminerCodeDefined(InfrastructureRoot)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> IS_DETERMINER_CODE_DEFINED__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.isDefined('determinerCode')
	 * @param infrastructureRoot The receiving '<em><b>Infrastructure Root</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean isDeterminerCodeDefined(InfrastructureRoot infrastructureRoot) {
		if (IS_DETERMINER_CODE_DEFINED__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(RIMPackage.Literals.INFRASTRUCTURE_ROOT, RIMPackage.Literals.INFRASTRUCTURE_ROOT.getEAllOperations().get(11));
			try {
				IS_DETERMINER_CODE_DEFINED__EOCL_QRY = helper.createQuery(IS_DETERMINER_CODE_DEFINED__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(IS_DETERMINER_CODE_DEFINED__EOCL_QRY);
		return ((Boolean) query.evaluate(infrastructureRoot)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #isMoodCodeDefined(InfrastructureRoot) <em>Is Mood Code Defined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoodCodeDefined(InfrastructureRoot)
	 * @generated
	 * @ordered
	 */
	protected static final String IS_MOOD_CODE_DEFINED__EOCL_EXP = "self.isDefined('moodCode')";
	/**
	 * The cached OCL query for the '{@link #isMoodCodeDefined(InfrastructureRoot) <em>Is Mood Code Defined</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoodCodeDefined(InfrastructureRoot)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> IS_MOOD_CODE_DEFINED__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.isDefined('moodCode')
	 * @param infrastructureRoot The receiving '<em><b>Infrastructure Root</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean isMoodCodeDefined(InfrastructureRoot infrastructureRoot) {
		if (IS_MOOD_CODE_DEFINED__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(RIMPackage.Literals.INFRASTRUCTURE_ROOT, RIMPackage.Literals.INFRASTRUCTURE_ROOT.getEAllOperations().get(12));
			try {
				IS_MOOD_CODE_DEFINED__EOCL_QRY = helper.createQuery(IS_MOOD_CODE_DEFINED__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(IS_MOOD_CODE_DEFINED__EOCL_QRY);
		return ((Boolean) query.evaluate(infrastructureRoot)).booleanValue();
	}

} // InfrastructureRootOperations