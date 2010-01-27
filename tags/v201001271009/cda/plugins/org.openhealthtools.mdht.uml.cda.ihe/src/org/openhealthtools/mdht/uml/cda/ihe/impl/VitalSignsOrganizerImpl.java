/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.ihe.operations.VitalSignsOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vital Signs Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.impl.VitalSignsOrganizerImpl#getAuthors <em>Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VitalSignsOrganizerImpl extends org.openhealthtools.mdht.uml.cda.ccd.impl.VitalSignsOrganizerImpl implements VitalSignsOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VitalSignsOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.VITAL_SIGNS_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Author> getAuthors() {
		if (authors == null) {
			authors = new EObjectResolvingEList<Author>(Author.class, this, IHEPackage.VITAL_SIGNS_ORGANIZER__AUTHOR);
		}
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAuthors() {
		return authors != null && !authors.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIHEVitalSignsOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateIHEVitalSignsOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerVitalSignObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerOperations.validateVitalSignsOrganizerVitalSignObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsOrganizer init() {
    		CDAUtil.init(this);
    		return this;
	}
} //VitalSignsOrganizerImpl
