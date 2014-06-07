/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.LanguageSpoken;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.LanguageSpokenOperations;
import org.openhealthtools.mdht.uml.cda.ihe.impl.LanguageCommunicationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language Spoken</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LanguageSpokenImpl extends LanguageCommunicationImpl implements LanguageSpoken {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageSpokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HITSPPackage.Literals.LANGUAGE_SPOKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageSpokenNoProficiencyLevelCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LanguageSpokenOperations.validateLanguageSpokenNoProficiencyLevelCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageSpokenTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LanguageSpokenOperations.validateLanguageSpokenTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageSpokenModeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LanguageSpokenOperations.validateLanguageSpokenModeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageSpoken init() {
    		CDAUtil.init(this);
    		return this;
	}
} //LanguageSpokenImpl
