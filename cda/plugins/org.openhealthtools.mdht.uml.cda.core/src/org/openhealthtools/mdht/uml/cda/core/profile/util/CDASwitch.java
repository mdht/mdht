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
package org.openhealthtools.mdht.uml.cda.core.profile.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.openhealthtools.mdht.uml.cda.core.profile.*;
import org.openhealthtools.mdht.uml.cda.core.profile.ActRelationship;
import org.openhealthtools.mdht.uml.cda.core.profile.AssociationValidation;
import org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage;
import org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate;
import org.openhealthtools.mdht.uml.cda.core.profile.ClassValidation;
import org.openhealthtools.mdht.uml.cda.core.profile.CodeSystemConstraint;
import org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport;
import org.openhealthtools.mdht.uml.cda.core.profile.ConceptDomainConstraint;
import org.openhealthtools.mdht.uml.cda.core.profile.ConformsTo;
import org.openhealthtools.mdht.uml.cda.core.profile.ConstraintValidation;
import org.openhealthtools.mdht.uml.cda.core.profile.Entry;
import org.openhealthtools.mdht.uml.cda.core.profile.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.core.profile.NullFlavor;
import org.openhealthtools.mdht.uml.cda.core.profile.Participation;
import org.openhealthtools.mdht.uml.cda.core.profile.PropertyValidation;
import org.openhealthtools.mdht.uml.cda.core.profile.TextValue;
import org.openhealthtools.mdht.uml.cda.core.profile.Validation;
import org.openhealthtools.mdht.uml.cda.core.profile.ValueSetConstraint;
import org.openhealthtools.mdht.uml.cda.core.profile.VocabSpecification;

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
 * @see org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage
 * @generated
 */
public class CDASwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static CDAPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CDASwitch() {
		if (modelPackage == null) {
			modelPackage = CDAPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Act Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActRelationship(ActRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Validation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Validation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationValidation(AssociationValidation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDATemplate(CDATemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Validation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Validation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassValidation(ClassValidation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Codegen Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Codegen Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodegenSupport(CodegenSupport object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Conforms To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conforms To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformsTo(ConformsTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Validation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Validation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintValidation(ConstraintValidation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntry(Entry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryRelationship(EntryRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Flavor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Flavor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullFlavor(NullFlavor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipation(Participation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalConstraint(LogicalConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInline(Inline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unimplementable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unimplementable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnimplementable(Unimplementable object) {
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
	public T caseTerm_ConceptDomainConstraint(
			org.openhealthtools.mdht.uml.term.core.profile.ConceptDomainConstraint object) {
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
	public T caseTerm_CodeSystemConstraint(org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint object) {
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
	public T caseTerm_ValueSetConstraint(org.openhealthtools.mdht.uml.term.core.profile.ValueSetConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Validation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Validation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyValidation(PropertyValidation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextValue(TextValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidation(Validation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Vocab Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vocab Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVocabSpecification(VocabSpecification object) {
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
			case CDAPackage.ENTRY: {
				Entry entry = (Entry) theEObject;
				T result = caseEntry(entry);
				if (result == null) {
					result = caseAssociationValidation(entry);
				}
				if (result == null) {
					result = caseValidation(entry);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CDAPackage.ASSOCIATION_VALIDATION: {
				AssociationValidation associationValidation = (AssociationValidation) theEObject;
				T result = caseAssociationValidation(associationValidation);
				if (result == null) {
					result = caseValidation(associationValidation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CDAPackage.VALIDATION: {
				Validation validation = (Validation) theEObject;
				T result = caseValidation(validation);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CDAPackage.ENTRY_RELATIONSHIP: {
				EntryRelationship entryRelationship = (EntryRelationship) theEObject;
				T result = caseEntryRelationship(entryRelationship);
				if (result == null) {
					result = caseAssociationValidation(entryRelationship);
				}
				if (result == null) {
					result = caseValidation(entryRelationship);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CDAPackage.CODEGEN_SUPPORT: {
				CodegenSupport codegenSupport = (CodegenSupport) theEObject;
				T result = caseCodegenSupport(codegenSupport);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CDAPackage.PROPERTY_VALIDATION: {
				PropertyValidation propertyValidation = (PropertyValidation) theEObject;
				T result = casePropertyValidation(propertyValidation);
				if (result == null) {
					result = caseValidation(propertyValidation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CDAPackage.CLASS_VALIDATION: {
				ClassValidation classValidation = (ClassValidation) theEObject;
				T result = caseClassValidation(classValidation);
				if (result == null) {
					result = caseValidation(classValidation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CDAPackage.VOCAB_SPECIFICATION: {
				VocabSpecification vocabSpecification = (VocabSpecification) theEObject;
				T result = caseVocabSpecification(vocabSpecification);
				if (result == null) {
					result = casePropertyValidation(vocabSpecification);
				}
				if (result == null) {
					result = caseValidation(vocabSpecification);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CDAPackage.NULL_FLAVOR: {
				NullFlavor nullFlavor = (NullFlavor) theEObject;
				T result = caseNullFlavor(nullFlavor);
				if (result == null) {
					result = casePropertyValidation(nullFlavor);
				}
				if (result == null) {
					result = caseValidation(nullFlavor);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CDAPackage.TEXT_VALUE: {
				TextValue textValue = (TextValue) theEObject;
				T result = caseTextValue(textValue);
				if (result == null) {
					result = casePropertyValidation(textValue);
				}
				if (result == null) {
					result = caseValidation(textValue);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CDAPackage.CDA_TEMPLATE: {
				CDATemplate cdaTemplate = (CDATemplate) theEObject;
				T result = caseCDATemplate(cdaTemplate);
				if (result == null) {
					result = caseClassValidation(cdaTemplate);
				}
				if (result == null) {
					result = caseValidation(cdaTemplate);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CDAPackage.CONSTRAINT_VALIDATION: {
				ConstraintValidation constraintValidation = (ConstraintValidation) theEObject;
				T result = caseConstraintValidation(constraintValidation);
				if (result == null) {
					result = caseValidation(constraintValidation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CDAPackage.CONFORMS_TO: {
				ConformsTo conformsTo = (ConformsTo) theEObject;
				T result = caseConformsTo(conformsTo);
				if (result == null) {
					result = caseValidation(conformsTo);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CDAPackage.CONCEPT_DOMAIN_CONSTRAINT: {
				ConceptDomainConstraint conceptDomainConstraint = (ConceptDomainConstraint) theEObject;
				T result = caseConceptDomainConstraint(conceptDomainConstraint);
				if (result == null) {
					result = caseValidation(conceptDomainConstraint);
				}
				if (result == null) {
					result = caseTerm_ConceptDomainConstraint(conceptDomainConstraint);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CDAPackage.CODE_SYSTEM_CONSTRAINT: {
				CodeSystemConstraint codeSystemConstraint = (CodeSystemConstraint) theEObject;
				T result = caseCodeSystemConstraint(codeSystemConstraint);
				if (result == null) {
					result = caseTerm_CodeSystemConstraint(codeSystemConstraint);
				}
				if (result == null) {
					result = caseValidation(codeSystemConstraint);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CDAPackage.VALUE_SET_CONSTRAINT: {
				ValueSetConstraint valueSetConstraint = (ValueSetConstraint) theEObject;
				T result = caseValueSetConstraint(valueSetConstraint);
				if (result == null) {
					result = caseValidation(valueSetConstraint);
				}
				if (result == null) {
					result = caseTerm_ValueSetConstraint(valueSetConstraint);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CDAPackage.ACT_RELATIONSHIP: {
				ActRelationship actRelationship = (ActRelationship) theEObject;
				T result = caseActRelationship(actRelationship);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CDAPackage.PARTICIPATION: {
				Participation participation = (Participation) theEObject;
				T result = caseParticipation(participation);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CDAPackage.LOGICAL_CONSTRAINT: {
				LogicalConstraint logicalConstraint = (LogicalConstraint) theEObject;
				T result = caseLogicalConstraint(logicalConstraint);
				if (result == null) {
					result = caseConstraintValidation(logicalConstraint);
				}
				if (result == null) {
					result = caseValidation(logicalConstraint);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CDAPackage.INLINE: {
				Inline inline = (Inline) theEObject;
				T result = caseInline(inline);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CDAPackage.UNIMPLEMENTABLE: {
				Unimplementable unimplementable = (Unimplementable) theEObject;
				T result = caseUnimplementable(unimplementable);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

} // CDASwitch
