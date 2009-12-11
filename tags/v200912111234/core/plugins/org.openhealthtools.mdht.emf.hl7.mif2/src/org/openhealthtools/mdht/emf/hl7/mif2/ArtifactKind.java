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
 * A representation of the literals of the enumeration '<em><b>Artifact Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Identifies the kind of artifacts that can be packaged
 * UML: The name for a package in the package hierarchy
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getArtifactKind()
 * @model extendedMetaData="name='ArtifactKind'"
 * @generated
 */
public enum ArtifactKind implements Enumerator {
	/**
	 * The '<em><b>IFC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IFC_VALUE
	 * @generated
	 * @ordered
	 */
	IFC(0, "IFC", "IFC"),

	/**
	 * The '<em><b>RIM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIM_VALUE
	 * @generated
	 * @ordered
	 */
	RIM(1, "RIM", "RIM"),

	/**
	 * The '<em><b>DIM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIM_VALUE
	 * @generated
	 * @ordered
	 */
	DIM(2, "DIM", "DIM"),

	/**
	 * The '<em><b>CIM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIM_VALUE
	 * @generated
	 * @ordered
	 */
	CIM(3, "CIM", "CIM"),

	/**
	 * The '<em><b>LIM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIM_VALUE
	 * @generated
	 * @ordered
	 */
	LIM(4, "LIM", "LIM"),

	/**
	 * The '<em><b>DAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAM_VALUE
	 * @generated
	 * @ordered
	 */
	DAM(5, "DAM", "DAM"),

	/**
	 * The '<em><b>TP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TP_VALUE
	 * @generated
	 * @ordered
	 */
	TP(6, "TP", "TP"),

	/**
	 * The '<em><b>DT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DT_VALUE
	 * @generated
	 * @ordered
	 */
	DT(7, "DT", "DT"),

	/**
	 * The '<em><b>ITS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITS_VALUE
	 * @generated
	 * @ordered
	 */
	ITS(8, "ITS", "ITS"),

	/**
	 * The '<em><b>DC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DC_VALUE
	 * @generated
	 * @ordered
	 */
	DC(9, "DC", "DC"),

	/**
	 * The '<em><b>GL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GL_VALUE
	 * @generated
	 * @ordered
	 */
	GL(10, "GL", "GL"),

	/**
	 * The '<em><b>SB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SB_VALUE
	 * @generated
	 * @ordered
	 */
	SB(11, "SB", "SB"),

	/**
	 * The '<em><b>VO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VO_VALUE
	 * @generated
	 * @ordered
	 */
	VO(12, "VO", "VO"),

	/**
	 * The '<em><b>AR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AR_VALUE
	 * @generated
	 * @ordered
	 */
	AR(13, "AR", "AR"),

	/**
	 * The '<em><b>TE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TE_VALUE
	 * @generated
	 * @ordered
	 */
	TE(14, "TE", "TE"),

	/**
	 * The '<em><b>IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_VALUE
	 * @generated
	 * @ordered
	 */
	IN(15, "IN", "IN"),

	/**
	 * The '<em><b>DMIM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMIM_VALUE
	 * @generated
	 * @ordered
	 */
	DMIM(16, "DMIM", "DMIM"),

	/**
	 * The '<em><b>RM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RM_VALUE
	 * @generated
	 * @ordered
	 */
	RM(17, "RM", "RM"),

	/**
	 * The '<em><b>HD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HD_VALUE
	 * @generated
	 * @ordered
	 */
	HD(18, "HD", "HD"),

	/**
	 * The '<em><b>MT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MT_VALUE
	 * @generated
	 * @ordered
	 */
	MT(19, "MT", "MT");

	/**
	 * The '<em><b>IFC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Interface (CMET and STUB) definition
	 * <!-- end-model-doc -->
	 * @see #IFC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IFC_VALUE = 0;

	/**
	 * The '<em><b>RIM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference Information Model
	 * <!-- end-model-doc -->
	 * @see #RIM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RIM_VALUE = 1;

	/**
	 * The '<em><b>DIM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Domain Information Model (supercedes D-MIM)
	 * <!-- end-model-doc -->
	 * @see #DIM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIM_VALUE = 2;

	/**
	 * The '<em><b>CIM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constrained Information Model (supercedes R-MIM, HMD and Message Type)
	 * <!-- end-model-doc -->
	 * @see #CIM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CIM_VALUE = 3;

	/**
	 * The '<em><b>LIM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Localized Information Model (a.k.a. message profile)
	 * <!-- end-model-doc -->
	 * @see #LIM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIM_VALUE = 4;

	/**
	 * The '<em><b>DAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Document Analysis Model
	 * <!-- end-model-doc -->
	 * @see #DAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAM_VALUE = 5;

	/**
	 * The '<em><b>TP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Template
	 * <!-- end-model-doc -->
	 * @see #TP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TP_VALUE = 6;

	/**
	 * The '<em><b>DT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datatype Model
	 * <!-- end-model-doc -->
	 * @see #DT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DT_VALUE = 7;

	/**
	 * The '<em><b>ITS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Implementation Technology Specification
	 * <!-- end-model-doc -->
	 * @see #ITS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ITS_VALUE = 8;

	/**
	 * The '<em><b>DC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Document
	 * <!-- end-model-doc -->
	 * @see #DC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DC_VALUE = 9;

	/**
	 * The '<em><b>GL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Glossary
	 * <!-- end-model-doc -->
	 * @see #GL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GL_VALUE = 10;

	/**
	 * The '<em><b>SB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Story Board
	 * <!-- end-model-doc -->
	 * @see #SB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SB_VALUE = 11;

	/**
	 * The '<em><b>VO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vocabulary Model
	 * <!-- end-model-doc -->
	 * @see #VO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VO_VALUE = 12;

	/**
	 * The '<em><b>AR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Application Role
	 * <!-- end-model-doc -->
	 * @see #AR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AR_VALUE = 13;

	/**
	 * The '<em><b>TE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trigger Event
	 * <!-- end-model-doc -->
	 * @see #TE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TE_VALUE = 14;

	/**
	 * The '<em><b>IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Interaction
	 * <!-- end-model-doc -->
	 * @see #IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_VALUE = 15;

	/**
	 * The '<em><b>DMIM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Domain Message Information Model
	 * Deprecated ?/?/?: DMIM is replaced by DIM
	 * <!-- end-model-doc -->
	 * @see #DMIM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DMIM_VALUE = 16;

	/**
	 * The '<em><b>RM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refined Message Information Model
	 * Deprecated ?/?/?: RMIM is replaced by CIM
	 * <!-- end-model-doc -->
	 * @see #RM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RM_VALUE = 17;

	/**
	 * The '<em><b>HD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hierarchical Message Descriptor
	 * Deprecated ?/?/?: HMD is replaced by CIM
	 * <!-- end-model-doc -->
	 * @see #HD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HD_VALUE = 18;

	/**
	 * The '<em><b>MT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Message Type
	 * Deprecated ?/?/?: MT is replaced by CIM
	 * <!-- end-model-doc -->
	 * @see #MT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MT_VALUE = 19;

	/**
	 * An array of all the '<em><b>Artifact Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArtifactKind[] VALUES_ARRAY =
		new ArtifactKind[] {
			IFC,
			RIM,
			DIM,
			CIM,
			LIM,
			DAM,
			TP,
			DT,
			ITS,
			DC,
			GL,
			SB,
			VO,
			AR,
			TE,
			IN,
			DMIM,
			RM,
			HD,
			MT,
		};

	/**
	 * A public read-only list of all the '<em><b>Artifact Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ArtifactKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Artifact Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArtifactKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArtifactKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Artifact Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArtifactKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArtifactKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Artifact Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArtifactKind get(int value) {
		switch (value) {
			case IFC_VALUE: return IFC;
			case RIM_VALUE: return RIM;
			case DIM_VALUE: return DIM;
			case CIM_VALUE: return CIM;
			case LIM_VALUE: return LIM;
			case DAM_VALUE: return DAM;
			case TP_VALUE: return TP;
			case DT_VALUE: return DT;
			case ITS_VALUE: return ITS;
			case DC_VALUE: return DC;
			case GL_VALUE: return GL;
			case SB_VALUE: return SB;
			case VO_VALUE: return VO;
			case AR_VALUE: return AR;
			case TE_VALUE: return TE;
			case IN_VALUE: return IN;
			case DMIM_VALUE: return DMIM;
			case RM_VALUE: return RM;
			case HD_VALUE: return HD;
			case MT_VALUE: return MT;
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
	private ArtifactKind(int value, String name, String literal) {
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
	
} //ArtifactKind
