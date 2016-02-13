/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.term.core.profile.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.mdht.uml.term.core.profile.CD;
import org.eclipse.mdht.uml.term.core.profile.CR;
import org.eclipse.mdht.uml.term.core.profile.CodeSystemConstraint;
import org.eclipse.mdht.uml.term.core.profile.CodeSystemVersion;
import org.eclipse.mdht.uml.term.core.profile.ConceptDomain;
import org.eclipse.mdht.uml.term.core.profile.ConceptDomainConstraint;
import org.eclipse.mdht.uml.term.core.profile.TermPackage;
import org.eclipse.mdht.uml.term.core.profile.UsageContext;
import org.eclipse.mdht.uml.term.core.profile.ValueSetCode;
import org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint;
import org.eclipse.mdht.uml.term.core.profile.ValueSetContextBinding;
import org.eclipse.mdht.uml.term.core.profile.ValueSetVersion;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage
 * @generated
 */
public class TermSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static TermPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public TermSwitch() {
		if (modelPackage == null) {
			modelPackage = TermPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param ePackage
	 *            the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCD(CD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemConstraint(CodeSystemConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemVersion(CodeSystemVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptDomain(ConceptDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Domain Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Domain Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptDomainConstraint(ConceptDomainConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCR(CR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsageContext(UsageContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetCode(ValueSetCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetConstraint(ValueSetConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Context Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Context Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetContextBinding(ValueSetContextBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetVersion(ValueSetVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TermPackage.CD: {
				CD cd = (CD) theEObject;
				T result = caseCD(cd);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case TermPackage.CR: {
				CR cr = (CR) theEObject;
				T result = caseCR(cr);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case TermPackage.CONCEPT_DOMAIN_CONSTRAINT: {
				ConceptDomainConstraint conceptDomainConstraint = (ConceptDomainConstraint) theEObject;
				T result = caseConceptDomainConstraint(conceptDomainConstraint);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case TermPackage.CONCEPT_DOMAIN: {
				ConceptDomain conceptDomain = (ConceptDomain) theEObject;
				T result = caseConceptDomain(conceptDomain);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case TermPackage.CODE_SYSTEM_CONSTRAINT: {
				CodeSystemConstraint codeSystemConstraint = (CodeSystemConstraint) theEObject;
				T result = caseCodeSystemConstraint(codeSystemConstraint);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case TermPackage.CODE_SYSTEM_VERSION: {
				CodeSystemVersion codeSystemVersion = (CodeSystemVersion) theEObject;
				T result = caseCodeSystemVersion(codeSystemVersion);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case TermPackage.VALUE_SET_CONSTRAINT: {
				ValueSetConstraint valueSetConstraint = (ValueSetConstraint) theEObject;
				T result = caseValueSetConstraint(valueSetConstraint);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case TermPackage.VALUE_SET_VERSION: {
				ValueSetVersion valueSetVersion = (ValueSetVersion) theEObject;
				T result = caseValueSetVersion(valueSetVersion);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case TermPackage.VALUE_SET_CODE: {
				ValueSetCode valueSetCode = (ValueSetCode) theEObject;
				T result = caseValueSetCode(valueSetCode);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case TermPackage.VALUE_SET_CONTEXT_BINDING: {
				ValueSetContextBinding valueSetContextBinding = (ValueSetContextBinding) theEObject;
				T result = caseValueSetContextBinding(valueSetContextBinding);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case TermPackage.USAGE_CONTEXT: {
				UsageContext usageContext = (UsageContext) theEObject;
				T result = caseUsageContext(usageContext);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

} // TermSwitch
