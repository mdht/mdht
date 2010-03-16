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
import org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations;
import org.openhealthtools.mdht.uml.cda.example.ExamplePackage;
import org.openhealthtools.mdht.uml.cda.example.ExamplePlugin;
import org.openhealthtools.mdht.uml.cda.example.MyDocument;
import org.openhealthtools.mdht.uml.cda.example.util.ExampleValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>My Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.example.MyDocument#validateMyDocumentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Document Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.example.MyDocument#validateMyDocumentMySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Document My Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MyDocumentOperations extends ContinuityOfCareDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyDocumentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMyDocumentTemplateId(MyDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Document Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMyDocumentTemplateId(MyDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MY_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.2.3.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateMyDocumentTemplateId(MyDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Document Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMyDocumentTemplateId(MyDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MY_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.2.3.4')
	 * @param myDocument The receiving '<em><b>My Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMyDocumentTemplateId(MyDocument myDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MY_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ExamplePackage.Literals.MY_DOCUMENT);
			try {
				VALIDATE_MY_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MY_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MY_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(myDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ExampleValidator.DIAGNOSTIC_SOURCE,
						 ExampleValidator.MY_DOCUMENT__MY_DOCUMENT_TEMPLATE_ID,
						 ExamplePlugin.INSTANCE.getString("MyDocumentTemplateId"),
						 new Object [] { myDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMyDocumentMySection(MyDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Document My Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMyDocumentMySection(MyDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MY_DOCUMENT_MY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | section.oclIsKindOf(example::MySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateMyDocumentMySection(MyDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate My Document My Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMyDocumentMySection(MyDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MY_DOCUMENT_MY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->one(section : cda::Section | section.oclIsKindOf(example::MySection))
	 * @param myDocument The receiving '<em><b>My Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMyDocumentMySection(MyDocument myDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MY_DOCUMENT_MY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ExamplePackage.Literals.MY_DOCUMENT);
			try {
				VALIDATE_MY_DOCUMENT_MY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MY_DOCUMENT_MY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MY_DOCUMENT_MY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(myDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ExampleValidator.DIAGNOSTIC_SOURCE,
						 ExampleValidator.MY_DOCUMENT__MY_DOCUMENT_MY_SECTION,
						 ExamplePlugin.INSTANCE.getString("MyDocumentMySection"),
						 new Object [] { myDocument }));
			}
			return false;
		}
		return true;
	}

} // MyDocumentOperations