/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersSection;
import org.openhealthtools.mdht.uml.cda.ccd.operations.EncountersSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounters Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EncountersSectionImpl extends SectionImpl implements EncountersSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncountersSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.ENCOUNTERS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersSectionOperations.validateEncountersSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersSectionOperations.validateEncountersSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersSectionOperations.validateEncountersSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSection init() {
    		CDAUtil.init(this);
    		return this;
	}
} //EncountersSectionImpl
