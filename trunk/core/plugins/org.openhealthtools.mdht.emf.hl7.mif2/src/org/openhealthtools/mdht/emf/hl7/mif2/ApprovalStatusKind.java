/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Approval Status Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * List of allowed ballot statuses
 * UML: Type used in a complex tag value
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getApprovalStatusKind()
 * @model extendedMetaData="name='ApprovalStatusKind'"
 * @generated
 */
public enum ApprovalStatusKind implements Enumerator {
	/**
	 * The '<em><b>Draft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAFT_VALUE
	 * @generated
	 * @ordered
	 */
	DRAFT(0, "Draft", "Draft"),

	/**
	 * The '<em><b>Non Standard Available For Use</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_STANDARD_AVAILABLE_FOR_USE_VALUE
	 * @generated
	 * @ordered
	 */
	NON_STANDARD_AVAILABLE_FOR_USE(1, "NonStandardAvailableForUse", "Non-standard - Available for use"),

	/**
	 * The '<em><b>Proposal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPOSAL_VALUE
	 * @generated
	 * @ordered
	 */
	PROPOSAL(2, "Proposal", "Proposal"),

	/**
	 * The '<em><b>Committee Ballot Normative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMITTEE_BALLOT_NORMATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	COMMITTEE_BALLOT_NORMATIVE(3, "CommitteeBallotNormative", "Committee Ballot - Normative"),

	/**
	 * The '<em><b>Committee Ballot Informative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMITTEE_BALLOT_INFORMATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	COMMITTEE_BALLOT_INFORMATIVE(4, "CommitteeBallotInformative", "Committee Ballot - Informative"),

	/**
	 * The '<em><b>Membership Ballot Normative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBERSHIP_BALLOT_NORMATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	MEMBERSHIP_BALLOT_NORMATIVE(5, "MembershipBallotNormative", "Membership Ballot - Normative"),

	/**
	 * The '<em><b>Membership Ballot Informative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBERSHIP_BALLOT_INFORMATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	MEMBERSHIP_BALLOT_INFORMATIVE(6, "MembershipBallotInformative", "Membership Ballot - Informative"),

	/**
	 * The '<em><b>Membership Ballot DSTU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBERSHIP_BALLOT_DSTU_VALUE
	 * @generated
	 * @ordered
	 */
	MEMBERSHIP_BALLOT_DSTU(7, "MembershipBallotDSTU", "Membership Ballot - DSTU"),

	/**
	 * The '<em><b>Approved Normative Standard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPROVED_NORMATIVE_STANDARD_VALUE
	 * @generated
	 * @ordered
	 */
	APPROVED_NORMATIVE_STANDARD(8, "ApprovedNormativeStandard", "Approved Normative Standard"),

	/**
	 * The '<em><b>Approved Informative Standard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPROVED_INFORMATIVE_STANDARD_VALUE
	 * @generated
	 * @ordered
	 */
	APPROVED_INFORMATIVE_STANDARD(9, "ApprovedInformativeStandard", "Approved Informative Standard"),

	/**
	 * The '<em><b>Approved DSTU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPROVED_DSTU_VALUE
	 * @generated
	 * @ordered
	 */
	APPROVED_DSTU(10, "ApprovedDSTU", "Approved DSTU"),

	/**
	 * The '<em><b>Affiliate Ballot Normative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFFILIATE_BALLOT_NORMATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	AFFILIATE_BALLOT_NORMATIVE(11, "AffiliateBallotNormative", "Affiliate Ballot - Normative"),

	/**
	 * The '<em><b>Affiliate Ballot Informative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFFILIATE_BALLOT_INFORMATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	AFFILIATE_BALLOT_INFORMATIVE(12, "AffiliateBallotInformative", "Affiliate Ballot - Informative"),

	/**
	 * The '<em><b>Reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCE(13, "Reference", "Reference"),

	/**
	 * The '<em><b>Approved Affiliate Normative Standard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPROVED_AFFILIATE_NORMATIVE_STANDARD_VALUE
	 * @generated
	 * @ordered
	 */
	APPROVED_AFFILIATE_NORMATIVE_STANDARD(14, "ApprovedAffiliateNormativeStandard",
			"Approved Affiliate Normative Standard"),

	/**
	 * The '<em><b>Approved Affiliate Informative Standard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPROVED_AFFILIATE_INFORMATIVE_STANDARD_VALUE
	 * @generated
	 * @ordered
	 */
	APPROVED_AFFILIATE_INFORMATIVE_STANDARD(15, "ApprovedAffiliateInformativeStandard",
			"Approved Affiliate Informative Standard"),

	/**
	 * The '<em><b>Approved Affiliate DSTU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPROVED_AFFILIATE_DSTU_VALUE
	 * @generated
	 * @ordered
	 */
	APPROVED_AFFILIATE_DSTU(16, "ApprovedAffiliateDSTU", "Approved Affiliate DSTU"),

	/**
	 * The '<em><b>Localized Adaptation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCALIZED_ADAPTATION_VALUE
	 * @generated
	 * @ordered
	 */
	LOCALIZED_ADAPTATION(17, "LocalizedAdaptation", "Localized Adaptation"),

	/**
	 * The '<em><b>Withdrawn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WITHDRAWN_VALUE
	 * @generated
	 * @ordered
	 */
	WITHDRAWN(18, "Withdrawn", "Withdrawn");

	/**
	 * The '<em><b>Draft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content that is under development and is not intended to be used..
	 * <!-- end-model-doc -->
	 * @see #DRAFT
	 * @model name="Draft"
	 * @generated
	 * @ordered
	 */
	public static final int DRAFT_VALUE = 0;

	/**
	 * The '<em><b>Non Standard Available For Use</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content developed independently by an organization or individual that is declared to be 'usable' but for which there is no present intention to submit through the standards submission and review process.
	 * <!-- end-model-doc -->
	 * @see #NON_STANDARD_AVAILABLE_FOR_USE
	 * @model name="NonStandardAvailableForUse" literal="Non-standard - Available for use"
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_AVAILABLE_FOR_USE_VALUE = 1;

	/**
	 * The '<em><b>Proposal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content submitted to a committee for consideration for future inclusion in the standard.
	 * <!-- end-model-doc -->
	 * @see #PROPOSAL
	 * @model name="Proposal"
	 * @generated
	 * @ordered
	 */
	public static final int PROPOSAL_VALUE = 2;

	/**
	 * The '<em><b>Committee Ballot Normative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content prepared by a committee and submitted for internal consideration as a normative standard.
	 * <!-- end-model-doc -->
	 * @see #COMMITTEE_BALLOT_NORMATIVE
	 * @model name="CommitteeBallotNormative" literal="Committee Ballot - Normative"
	 * @generated
	 * @ordered
	 */
	public static final int COMMITTEE_BALLOT_NORMATIVE_VALUE = 3;

	/**
	 * The '<em><b>Committee Ballot Informative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content prepared by a committee and submitted for internal consideration as an informative standard.
	 * <!-- end-model-doc -->
	 * @see #COMMITTEE_BALLOT_INFORMATIVE
	 * @model name="CommitteeBallotInformative" literal="Committee Ballot - Informative"
	 * @generated
	 * @ordered
	 */
	public static final int COMMITTEE_BALLOT_INFORMATIVE_VALUE = 4;

	/**
	 * The '<em><b>Membership Ballot Normative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content prepared by a committee and submitted for membership consideration as a normative standard.
	 * <!-- end-model-doc -->
	 * @see #MEMBERSHIP_BALLOT_NORMATIVE
	 * @model name="MembershipBallotNormative" literal="Membership Ballot - Normative"
	 * @generated
	 * @ordered
	 */
	public static final int MEMBERSHIP_BALLOT_NORMATIVE_VALUE = 5;

	/**
	 * The '<em><b>Membership Ballot Informative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content prepared by a committee and submitted for membership consideration as an informative standard.
	 * <!-- end-model-doc -->
	 * @see #MEMBERSHIP_BALLOT_INFORMATIVE
	 * @model name="MembershipBallotInformative" literal="Membership Ballot - Informative"
	 * @generated
	 * @ordered
	 */
	public static final int MEMBERSHIP_BALLOT_INFORMATIVE_VALUE = 6;

	/**
	 * The '<em><b>Membership Ballot DSTU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content prepared by a committee and submitted for membership consideration as a draft standard for trial use.
	 * <!-- end-model-doc -->
	 * @see #MEMBERSHIP_BALLOT_DSTU
	 * @model name="MembershipBallotDSTU" literal="Membership Ballot - DSTU"
	 * @generated
	 * @ordered
	 */
	public static final int MEMBERSHIP_BALLOT_DSTU_VALUE = 7;

	/**
	 * The '<em><b>Approved Normative Standard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content that has passed ballot as a normative standard
	 * <!-- end-model-doc -->
	 * @see #APPROVED_NORMATIVE_STANDARD
	 * @model name="ApprovedNormativeStandard" literal="Approved Normative Standard"
	 * @generated
	 * @ordered
	 */
	public static final int APPROVED_NORMATIVE_STANDARD_VALUE = 8;

	/**
	 * The '<em><b>Approved Informative Standard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content that has passed ballot as a normative standard
	 * <!-- end-model-doc -->
	 * @see #APPROVED_INFORMATIVE_STANDARD
	 * @model name="ApprovedInformativeStandard" literal="Approved Informative Standard"
	 * @generated
	 * @ordered
	 */
	public static final int APPROVED_INFORMATIVE_STANDARD_VALUE = 9;

	/**
	 * The '<em><b>Approved DSTU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content that has passed ballot as a draft standard for trial use
	 * <!-- end-model-doc -->
	 * @see #APPROVED_DSTU
	 * @model name="ApprovedDSTU" literal="Approved DSTU"
	 * @generated
	 * @ordered
	 */
	public static final int APPROVED_DSTU_VALUE = 10;

	/**
	 * The '<em><b>Affiliate Ballot Normative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content that is being presented to an international affiliate for consideration as a realm-specific normative standard
	 * <!-- end-model-doc -->
	 * @see #AFFILIATE_BALLOT_NORMATIVE
	 * @model name="AffiliateBallotNormative" literal="Affiliate Ballot - Normative"
	 * @generated
	 * @ordered
	 */
	public static final int AFFILIATE_BALLOT_NORMATIVE_VALUE = 11;

	/**
	 * The '<em><b>Affiliate Ballot Informative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content that is being presented to an international affiliate for consideration as a realm-specific informative standard
	 * <!-- end-model-doc -->
	 * @see #AFFILIATE_BALLOT_INFORMATIVE
	 * @model name="AffiliateBallotInformative" literal="Affiliate Ballot - Informative"
	 * @generated
	 * @ordered
	 */
	public static final int AFFILIATE_BALLOT_INFORMATIVE_VALUE = 12;

	/**
	 * The '<em><b>Reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content that is not intended to be balloted, but which exists to support other balloted content
	 * <!-- end-model-doc -->
	 * @see #REFERENCE
	 * @model name="Reference"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE_VALUE = 13;

	/**
	 * The '<em><b>Approved Affiliate Normative Standard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content that has passed ballot as a realm-specific normative standard
	 * <!-- end-model-doc -->
	 * @see #APPROVED_AFFILIATE_NORMATIVE_STANDARD
	 * @model name="ApprovedAffiliateNormativeStandard" literal="Approved Affiliate Normative Standard"
	 * @generated
	 * @ordered
	 */
	public static final int APPROVED_AFFILIATE_NORMATIVE_STANDARD_VALUE = 14;

	/**
	 * The '<em><b>Approved Affiliate Informative Standard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content that has passed ballot as a realm-specific informative standard
	 * <!-- end-model-doc -->
	 * @see #APPROVED_AFFILIATE_INFORMATIVE_STANDARD
	 * @model name="ApprovedAffiliateInformativeStandard" literal="Approved Affiliate Informative Standard"
	 * @generated
	 * @ordered
	 */
	public static final int APPROVED_AFFILIATE_INFORMATIVE_STANDARD_VALUE = 15;

	/**
	 * The '<em><b>Approved Affiliate DSTU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content that has passed ballot as a realm-specific draft standard for trial use
	 * <!-- end-model-doc -->
	 * @see #APPROVED_AFFILIATE_DSTU
	 * @model name="ApprovedAffiliateDSTU" literal="Approved Affiliate DSTU"
	 * @generated
	 * @ordered
	 */
	public static final int APPROVED_AFFILIATE_DSTU_VALUE = 16;

	/**
	 * The '<em><b>Localized Adaptation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content that represents an adaption of a implementable balloted material to represent the needs or capabilities of a particular installation.
	 * <!-- end-model-doc -->
	 * @see #LOCALIZED_ADAPTATION
	 * @model name="LocalizedAdaptation" literal="Localized Adaptation"
	 * @generated
	 * @ordered
	 */
	public static final int LOCALIZED_ADAPTATION_VALUE = 17;

	/**
	 * The '<em><b>Withdrawn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content that represents an item that was at one point a normative or informative standard, but was subsequently withdrawn.
	 * <!-- end-model-doc -->
	 * @see #WITHDRAWN
	 * @model name="Withdrawn"
	 * @generated
	 * @ordered
	 */
	public static final int WITHDRAWN_VALUE = 18;

	/**
	 * An array of all the '<em><b>Approval Status Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ApprovalStatusKind[] VALUES_ARRAY = new ApprovalStatusKind[] {
			DRAFT, NON_STANDARD_AVAILABLE_FOR_USE, PROPOSAL, COMMITTEE_BALLOT_NORMATIVE, COMMITTEE_BALLOT_INFORMATIVE,
			MEMBERSHIP_BALLOT_NORMATIVE, MEMBERSHIP_BALLOT_INFORMATIVE, MEMBERSHIP_BALLOT_DSTU,
			APPROVED_NORMATIVE_STANDARD, APPROVED_INFORMATIVE_STANDARD, APPROVED_DSTU, AFFILIATE_BALLOT_NORMATIVE,
			AFFILIATE_BALLOT_INFORMATIVE, REFERENCE, APPROVED_AFFILIATE_NORMATIVE_STANDARD,
			APPROVED_AFFILIATE_INFORMATIVE_STANDARD, APPROVED_AFFILIATE_DSTU, LOCALIZED_ADAPTATION, WITHDRAWN, };

	/**
	 * A public read-only list of all the '<em><b>Approval Status Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ApprovalStatusKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Approval Status Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApprovalStatusKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApprovalStatusKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Approval Status Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApprovalStatusKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApprovalStatusKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Approval Status Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApprovalStatusKind get(int value) {
		switch (value) {
			case DRAFT_VALUE:
				return DRAFT;
			case NON_STANDARD_AVAILABLE_FOR_USE_VALUE:
				return NON_STANDARD_AVAILABLE_FOR_USE;
			case PROPOSAL_VALUE:
				return PROPOSAL;
			case COMMITTEE_BALLOT_NORMATIVE_VALUE:
				return COMMITTEE_BALLOT_NORMATIVE;
			case COMMITTEE_BALLOT_INFORMATIVE_VALUE:
				return COMMITTEE_BALLOT_INFORMATIVE;
			case MEMBERSHIP_BALLOT_NORMATIVE_VALUE:
				return MEMBERSHIP_BALLOT_NORMATIVE;
			case MEMBERSHIP_BALLOT_INFORMATIVE_VALUE:
				return MEMBERSHIP_BALLOT_INFORMATIVE;
			case MEMBERSHIP_BALLOT_DSTU_VALUE:
				return MEMBERSHIP_BALLOT_DSTU;
			case APPROVED_NORMATIVE_STANDARD_VALUE:
				return APPROVED_NORMATIVE_STANDARD;
			case APPROVED_INFORMATIVE_STANDARD_VALUE:
				return APPROVED_INFORMATIVE_STANDARD;
			case APPROVED_DSTU_VALUE:
				return APPROVED_DSTU;
			case AFFILIATE_BALLOT_NORMATIVE_VALUE:
				return AFFILIATE_BALLOT_NORMATIVE;
			case AFFILIATE_BALLOT_INFORMATIVE_VALUE:
				return AFFILIATE_BALLOT_INFORMATIVE;
			case REFERENCE_VALUE:
				return REFERENCE;
			case APPROVED_AFFILIATE_NORMATIVE_STANDARD_VALUE:
				return APPROVED_AFFILIATE_NORMATIVE_STANDARD;
			case APPROVED_AFFILIATE_INFORMATIVE_STANDARD_VALUE:
				return APPROVED_AFFILIATE_INFORMATIVE_STANDARD;
			case APPROVED_AFFILIATE_DSTU_VALUE:
				return APPROVED_AFFILIATE_DSTU;
			case LOCALIZED_ADAPTATION_VALUE:
				return LOCALIZED_ADAPTATION;
			case WITHDRAWN_VALUE:
				return WITHDRAWN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ApprovalStatusKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // ApprovalStatusKind
