/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Annotation Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Identifies the kinds of annotations that can be referenced
 * UML: Used to reference a tagged item
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAnnotationKind()
 * @model extendedMetaData="name='AnnotationKind'"
 * @generated
 */
public enum AnnotationKind implements Enumerator {
	/**
	 * The '<em><b>Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	DEFINITION(0, "Definition", "Definition"),

	/**
	 * The '<em><b>Description</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	DESCRIPTION(1, "Description", "Description"),

	/**
	 * The '<em><b>Usage Notes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USAGE_NOTES_VALUE
	 * @generated
	 * @ordered
	 */
	USAGE_NOTES(2, "UsageNotes", "UsageNotes"),

	/**
	 * The '<em><b>Usage Constraint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USAGE_CONSTRAINT_VALUE
	 * @generated
	 * @ordered
	 */
	USAGE_CONSTRAINT(3, "UsageConstraint", "UsageConstraint"),

	/**
	 * The '<em><b>Rationale</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATIONALE_VALUE
	 * @generated
	 * @ordered
	 */
	RATIONALE(4, "Rationale", "Rationale"),

	/**
	 * The '<em><b>Requirements</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIREMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIREMENTS(5, "Requirements", "Requirements"),

	/**
	 * The '<em><b>Walkthrough</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WALKTHROUGH_VALUE
	 * @generated
	 * @ordered
	 */
	WALKTHROUGH(6, "Walkthrough", "Walkthrough"),

	/**
	 * The '<em><b>Appendix</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPENDIX_VALUE
	 * @generated
	 * @ordered
	 */
	APPENDIX(7, "Appendix", "Appendix"),

	/**
	 * The '<em><b>Other Annotation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_ANNOTATION_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_ANNOTATION(8, "OtherAnnotation", "OtherAnnotation"),

	/**
	 * The '<em><b>Mapping</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAPPING_VALUE
	 * @generated
	 * @ordered
	 */
	MAPPING(9, "Mapping", "Mapping"),

	/**
	 * The '<em><b>Formal Constraint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORMAL_CONSTRAINT_VALUE
	 * @generated
	 * @ordered
	 */
	FORMAL_CONSTRAINT(10, "FormalConstraint", "FormalConstraint"),

	/**
	 * The '<em><b>Open Issue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_ISSUE_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_ISSUE(11, "OpenIssue", "OpenIssue"),

	/**
	 * The '<em><b>Design Comment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESIGN_COMMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DESIGN_COMMENT(12, "DesignComment", "DesignComment"),

	/**
	 * The '<em><b>Stability Remarks</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STABILITY_REMARKS_VALUE
	 * @generated
	 * @ordered
	 */
	STABILITY_REMARKS(13, "StabilityRemarks", "StabilityRemarks"), /**
	 * The '<em><b>Static Example</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATIC_EXAMPLE_VALUE
	 * @generated
	 * @ordered
	 */
	STATIC_EXAMPLE(14, "StaticExample", "StaticExample"),

	/**
	 * The '<em><b>Ballot Comment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BALLOT_COMMENT_VALUE
	 * @generated
	 * @ordered
	 */
	BALLOT_COMMENT(15, "BallotComment", "BallotComment"),

	/**
	 * The '<em><b>Change Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGE_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGE_REQUEST(16, "ChangeRequest", "ChangeRequest"),

	/**
	 * The '<em><b>Deprecation Info</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPRECATION_INFO_VALUE
	 * @generated
	 * @ordered
	 */
	DEPRECATION_INFO(17, "DeprecationInfo", "DeprecationInfo");

	/**
	 * The '<em><b>Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition annotation
	 * <!-- end-model-doc -->
	 * @see #DEFINITION
	 * @model name="Definition"
	 * @generated
	 * @ordered
	 */
	public static final int DEFINITION_VALUE = 0;

	/**
	 * The '<em><b>Description</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description annotation
	 * <!-- end-model-doc -->
	 * @see #DESCRIPTION
	 * @model name="Description"
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTION_VALUE = 1;

	/**
	 * The '<em><b>Usage Notes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UsageNotes annotation
	 * <!-- end-model-doc -->
	 * @see #USAGE_NOTES
	 * @model name="UsageNotes"
	 * @generated
	 * @ordered
	 */
	public static final int USAGE_NOTES_VALUE = 2;

	/**
	 * The '<em><b>Usage Constraint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UsageConstraint annotation
	 * <!-- end-model-doc -->
	 * @see #USAGE_CONSTRAINT
	 * @model name="UsageConstraint"
	 * @generated
	 * @ordered
	 */
	public static final int USAGE_CONSTRAINT_VALUE = 3;

	/**
	 * The '<em><b>Rationale</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rationale annotation
	 * <!-- end-model-doc -->
	 * @see #RATIONALE
	 * @model name="Rationale"
	 * @generated
	 * @ordered
	 */
	public static final int RATIONALE_VALUE = 4;

	/**
	 * The '<em><b>Requirements</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requirements annotation
	 * <!-- end-model-doc -->
	 * @see #REQUIREMENTS
	 * @model name="Requirements"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIREMENTS_VALUE = 5;

	/**
	 * The '<em><b>Walkthrough</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Walkthrough annotation
	 * <!-- end-model-doc -->
	 * @see #WALKTHROUGH
	 * @model name="Walkthrough"
	 * @generated
	 * @ordered
	 */
	public static final int WALKTHROUGH_VALUE = 6;

	/**
	 * The '<em><b>Appendix</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appendix annotation
	 * <!-- end-model-doc -->
	 * @see #APPENDIX
	 * @model name="Appendix"
	 * @generated
	 * @ordered
	 */
	public static final int APPENDIX_VALUE = 7;

	/**
	 * The '<em><b>Other Annotation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OtherAnnotation annotation
	 * <!-- end-model-doc -->
	 * @see #OTHER_ANNOTATION
	 * @model name="OtherAnnotation"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_ANNOTATION_VALUE = 8;

	/**
	 * The '<em><b>Mapping</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mapping annotation
	 * <!-- end-model-doc -->
	 * @see #MAPPING
	 * @model name="Mapping"
	 * @generated
	 * @ordered
	 */
	public static final int MAPPING_VALUE = 9;

	/**
	 * The '<em><b>Formal Constraint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constraint annotation
	 * <!-- end-model-doc -->
	 * @see #FORMAL_CONSTRAINT
	 * @model name="FormalConstraint"
	 * @generated
	 * @ordered
	 */
	public static final int FORMAL_CONSTRAINT_VALUE = 10;

	/**
	 * The '<em><b>Open Issue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OpenIssue annotation
	 * <!-- end-model-doc -->
	 * @see #OPEN_ISSUE
	 * @model name="OpenIssue"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_ISSUE_VALUE = 11;

	/**
	 * The '<em><b>Design Comment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DesignComments annotation
	 * <!-- end-model-doc -->
	 * @see #DESIGN_COMMENT
	 * @model name="DesignComment"
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_COMMENT_VALUE = 12;

	/**
	 * The '<em><b>Stability Remarks</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StabilityRemarks annotation
	 * <!-- end-model-doc -->
	 * @see #STABILITY_REMARKS
	 * @model name="StabilityRemarks"
	 * @generated
	 * @ordered
	 */
	public static final int STABILITY_REMARKS_VALUE = 13;

	/**
	 * The '<em><b>Static Example</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StaticExample annotation
	 * <!-- end-model-doc -->
	 * @see #STATIC_EXAMPLE
	 * @model name="StaticExample"
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_EXAMPLE_VALUE = 14;

	/**
	 * The '<em><b>Ballot Comment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BallotComment annotation
	 * <!-- end-model-doc -->
	 * @see #BALLOT_COMMENT
	 * @model name="BallotComment"
	 * @generated
	 * @ordered
	 */
	public static final int BALLOT_COMMENT_VALUE = 15;

	/**
	 * The '<em><b>Change Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ChangeRequest annotation
	 * <!-- end-model-doc -->
	 * @see #CHANGE_REQUEST
	 * @model name="ChangeRequest"
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_REQUEST_VALUE = 16;

	/**
	 * The '<em><b>Deprecation Info</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeprecationInfo annotation
	 * <!-- end-model-doc -->
	 * @see #DEPRECATION_INFO
	 * @model name="DeprecationInfo"
	 * @generated
	 * @ordered
	 */
	public static final int DEPRECATION_INFO_VALUE = 17;

	/**
	 * An array of all the '<em><b>Annotation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AnnotationKind[] VALUES_ARRAY =
		new AnnotationKind[] {
			DEFINITION,
			DESCRIPTION,
			USAGE_NOTES,
			USAGE_CONSTRAINT,
			RATIONALE,
			REQUIREMENTS,
			WALKTHROUGH,
			APPENDIX,
			OTHER_ANNOTATION,
			MAPPING,
			FORMAL_CONSTRAINT,
			OPEN_ISSUE,
			DESIGN_COMMENT,
			STABILITY_REMARKS,
			STATIC_EXAMPLE,
			BALLOT_COMMENT,
			CHANGE_REQUEST,
			DEPRECATION_INFO,
		};

	/**
	 * A public read-only list of all the '<em><b>Annotation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AnnotationKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Annotation Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnnotationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AnnotationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Annotation Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnnotationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AnnotationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Annotation Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnnotationKind get(int value) {
		switch (value) {
			case DEFINITION_VALUE: return DEFINITION;
			case DESCRIPTION_VALUE: return DESCRIPTION;
			case USAGE_NOTES_VALUE: return USAGE_NOTES;
			case USAGE_CONSTRAINT_VALUE: return USAGE_CONSTRAINT;
			case RATIONALE_VALUE: return RATIONALE;
			case REQUIREMENTS_VALUE: return REQUIREMENTS;
			case WALKTHROUGH_VALUE: return WALKTHROUGH;
			case APPENDIX_VALUE: return APPENDIX;
			case OTHER_ANNOTATION_VALUE: return OTHER_ANNOTATION;
			case MAPPING_VALUE: return MAPPING;
			case FORMAL_CONSTRAINT_VALUE: return FORMAL_CONSTRAINT;
			case OPEN_ISSUE_VALUE: return OPEN_ISSUE;
			case DESIGN_COMMENT_VALUE: return DESIGN_COMMENT;
			case STABILITY_REMARKS_VALUE: return STABILITY_REMARKS;
			case STATIC_EXAMPLE_VALUE: return STATIC_EXAMPLE;
			case BALLOT_COMMENT_VALUE: return BALLOT_COMMENT;
			case CHANGE_REQUEST_VALUE: return CHANGE_REQUEST;
			case DEPRECATION_INFO_VALUE: return DEPRECATION_INFO;
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
	private AnnotationKind(int value, String name, String literal) {
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
	
} //AnnotationKind
