/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.cdt.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.ObjectiveSection;
import org.openhealthtools.mdht.uml.cda.cdt.operations.ObjectiveSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ObjectiveSectionImpl extends SectionImpl implements ObjectiveSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDTPackage.Literals.OBJECTIVE_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectiveSectionHasClinicalStatements(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ObjectiveSectionOperations.validateObjectiveSectionHasClinicalStatements(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectiveSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ObjectiveSectionOperations.validateObjectiveSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectiveSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ObjectiveSectionOperations.validateObjectiveSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectiveSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ObjectiveSectionOperations.validateObjectiveSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectiveSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ObjectiveSectionOperations.validateObjectiveSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveSection init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ObjectiveSectionImpl
