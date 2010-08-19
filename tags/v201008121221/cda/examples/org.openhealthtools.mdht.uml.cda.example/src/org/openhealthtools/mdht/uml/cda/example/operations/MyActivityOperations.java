/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.example.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProblemActOperations;
import org.openhealthtools.mdht.uml.cda.example.ExamplePackage;
import org.openhealthtools.mdht.uml.cda.example.ExamplePlugin;
import org.openhealthtools.mdht.uml.cda.example.MyActivity;
import org.openhealthtools.mdht.uml.cda.example.util.ExampleValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>My Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.example.MyActivity#validateMyActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.example.MyActivity#validateMyActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.example.MyActivity#validateMyActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.example.MyActivity#validateMyActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.example.MyActivity#validateMyActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Activity Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MyActivityOperations extends ProblemActOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyActivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMyActivityTemplateId(MyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMyActivityTemplateId(MyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.2.3.4.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateMyActivityTemplateId(MyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMyActivityTemplateId(MyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.2.3.4.2')
	 * @param myActivity The receiving '<em><b>My Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMyActivityTemplateId(MyActivity myActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ExamplePackage.Literals.MY_ACTIVITY);
			try {
				VALIDATE_MY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(myActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ExampleValidator.DIAGNOSTIC_SOURCE,
						 ExampleValidator.MY_ACTIVITY__MY_ACTIVITY_TEMPLATE_ID,
						 ExamplePlugin.INSTANCE.getString("MyActivityTemplateId"),
						 new Object [] { myActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMyActivityClassCode(MyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Activity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMyActivityClassCode(MyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateMyActivityClassCode(MyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Activity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMyActivityClassCode(MyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param myActivity The receiving '<em><b>My Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMyActivityClassCode(MyActivity myActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ExamplePackage.Literals.MY_ACTIVITY);
			try {
				VALIDATE_MY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(myActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ExampleValidator.DIAGNOSTIC_SOURCE,
						 ExampleValidator.MY_ACTIVITY__MY_ACTIVITY_CLASS_CODE,
						 ExamplePlugin.INSTANCE.getString("MyActivityClassCode"),
						 new Object [] { myActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMyActivityMoodCode(MyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Activity Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMyActivityMoodCode(MyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateMyActivityMoodCode(MyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Activity Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMyActivityMoodCode(MyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::EVN
	 * @param myActivity The receiving '<em><b>My Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMyActivityMoodCode(MyActivity myActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ExamplePackage.Literals.MY_ACTIVITY);
			try {
				VALIDATE_MY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(myActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ExampleValidator.DIAGNOSTIC_SOURCE,
						 ExampleValidator.MY_ACTIVITY__MY_ACTIVITY_MOOD_CODE,
						 ExamplePlugin.INSTANCE.getString("MyActivityMoodCode"),
						 new Object [] { myActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMyActivityCode(MyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Activity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMyActivityCode(MyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MY_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.code = '23745001' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateMyActivityCode(MyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Activity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMyActivityCode(MyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MY_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = '23745001' and value.codeSystem = '2.16.840.1.113883.6.96')
	 * @param myActivity The receiving '<em><b>My Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMyActivityCode(MyActivity myActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MY_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ExamplePackage.Literals.MY_ACTIVITY);
			try {
				VALIDATE_MY_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MY_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MY_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(myActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ExampleValidator.DIAGNOSTIC_SOURCE,
						 ExampleValidator.MY_ACTIVITY__MY_ACTIVITY_CODE,
						 ExamplePlugin.INSTANCE.getString("MyActivityCode"),
						 new Object [] { myActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMyActivityStatusCode(MyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Activity Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMyActivityStatusCode(MyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed' and value.codeSystem = '2.16.840.1.113883.5.14')";

	/**
	 * The cached OCL invariant for the '{@link #validateMyActivityStatusCode(MyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Activity Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMyActivityStatusCode(MyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed' and value.codeSystem = '2.16.840.1.113883.5.14')
	 * @param myActivity The receiving '<em><b>My Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMyActivityStatusCode(MyActivity myActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ExamplePackage.Literals.MY_ACTIVITY);
			try {
				VALIDATE_MY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(myActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ExampleValidator.DIAGNOSTIC_SOURCE,
						 ExampleValidator.MY_ACTIVITY__MY_ACTIVITY_STATUS_CODE,
						 ExamplePlugin.INSTANCE.getString("MyActivityStatusCode"),
						 new Object [] { myActivity }));
			}
			return false;
		}
		return true;
	}

} // MyActivityOperations