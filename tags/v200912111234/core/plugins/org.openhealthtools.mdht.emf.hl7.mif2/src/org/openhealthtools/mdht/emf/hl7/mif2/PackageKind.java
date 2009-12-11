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
 * A representation of the literals of the enumeration '<em><b>Package Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Identifies the 'level' associated with a particular package
 * UML: stored in a tag on Package stereotypes
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageKind()
 * @model extendedMetaData="name='PackageKind'"
 * @generated
 */
public enum PackageKind implements Enumerator {
	/**
	 * The '<em><b>Root</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROOT_VALUE
	 * @generated
	 * @ordered
	 */
	ROOT(0, "root", "root"),

	/**
	 * The '<em><b>Section</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECTION_VALUE
	 * @generated
	 * @ordered
	 */
	SECTION(1, "section", "section"),

	/**
	 * The '<em><b>Sub Section</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUB_SECTION_VALUE
	 * @generated
	 * @ordered
	 */
	SUB_SECTION(2, "subSection", "subSection"),

	/**
	 * The '<em><b>Domain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMAIN_VALUE
	 * @generated
	 * @ordered
	 */
	DOMAIN(3, "domain", "domain"),

	/**
	 * The '<em><b>Realm Namespace</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REALM_NAMESPACE_VALUE
	 * @generated
	 * @ordered
	 */
	REALM_NAMESPACE(4, "realmNamespace", "realmNamespace"),

	/**
	 * The '<em><b>Version</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERSION_VALUE
	 * @generated
	 * @ordered
	 */
	VERSION(5, "version", "version"),

	/**
	 * The '<em><b>Artifact</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARTIFACT_VALUE
	 * @generated
	 * @ordered
	 */
	ARTIFACT(6, "artifact", "artifact"),

	/**
	 * The '<em><b>Sub Artifact</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUB_ARTIFACT_VALUE
	 * @generated
	 * @ordered
	 */
	SUB_ARTIFACT(7, "subArtifact", "subArtifact"),

	/**
	 * The '<em><b>Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME_VALUE
	 * @generated
	 * @ordered
	 */
	NAME(8, "name", "name"),

	/**
	 * The '<em><b>Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_VALUE
	 * @generated
	 * @ordered
	 */
	ID(9, "id", "id");

	/**
	 * The '<em><b>Root</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the fundamental categorization of the package
	 * <!-- end-model-doc -->
	 * @see #ROOT
	 * @model name="root"
	 * @generated
	 * @ordered
	 */
	public static final int ROOT_VALUE = 0;

	/**
	 * The '<em><b>Section</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates a broad categorization of the business area
	 * <!-- end-model-doc -->
	 * @see #SECTION
	 * @model name="section"
	 * @generated
	 * @ordered
	 */
	public static final int SECTION_VALUE = 1;

	/**
	 * The '<em><b>Sub Section</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates a more specific categorization of the business area
	 * <!-- end-model-doc -->
	 * @see #SUB_SECTION
	 * @model name="subSection"
	 * @generated
	 * @ordered
	 */
	public static final int SUB_SECTION_VALUE = 2;

	/**
	 * The '<em><b>Domain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates a specific business area
	 * <!-- end-model-doc -->
	 * @see #DOMAIN
	 * @model name="domain"
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_VALUE = 3;

	/**
	 * The '<em><b>Realm Namespace</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a means for partitioning artifacts developed by the international organization, regional affiliates and member organizations
	 * <!-- end-model-doc -->
	 * @see #REALM_NAMESPACE
	 * @model name="realmNamespace"
	 * @generated
	 * @ordered
	 */
	public static final int REALM_NAMESPACE_VALUE = 4;

	/**
	 * The '<em><b>Version</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the iteration or revision number of a set of content
	 * <!-- end-model-doc -->
	 * @see #VERSION
	 * @model name="version"
	 * @generated
	 * @ordered
	 */
	public static final int VERSION_VALUE = 5;

	/**
	 * The '<em><b>Artifact</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the type of business-object stored in the package
	 * <!-- end-model-doc -->
	 * @see #ARTIFACT
	 * @model name="artifact"
	 * @generated
	 * @ordered
	 */
	public static final int ARTIFACT_VALUE = 6;

	/**
	 * The '<em><b>Sub Artifact</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the sub-type of business-object stored in the package
	 * <!-- end-model-doc -->
	 * @see #SUB_ARTIFACT
	 * @model name="subArtifact"
	 * @generated
	 * @ordered
	 */
	public static final int SUB_ARTIFACT_VALUE = 7;

	/**
	 * The '<em><b>Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A descriptive label for a particular artifact
	 * <!-- end-model-doc -->
	 * @see #NAME
	 * @model name="name"
	 * @generated
	 * @ordered
	 */
	public static final int NAME_VALUE = 8;

	/**
	 * The '<em><b>Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A numeric label for a particular artifact
	 * <!-- end-model-doc -->
	 * @see #ID
	 * @model name="id"
	 * @generated
	 * @ordered
	 */
	public static final int ID_VALUE = 9;

	/**
	 * An array of all the '<em><b>Package Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PackageKind[] VALUES_ARRAY =
		new PackageKind[] {
			ROOT,
			SECTION,
			SUB_SECTION,
			DOMAIN,
			REALM_NAMESPACE,
			VERSION,
			ARTIFACT,
			SUB_ARTIFACT,
			NAME,
			ID,
		};

	/**
	 * A public read-only list of all the '<em><b>Package Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PackageKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Package Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PackageKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PackageKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Package Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PackageKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PackageKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Package Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PackageKind get(int value) {
		switch (value) {
			case ROOT_VALUE: return ROOT;
			case SECTION_VALUE: return SECTION;
			case SUB_SECTION_VALUE: return SUB_SECTION;
			case DOMAIN_VALUE: return DOMAIN;
			case REALM_NAMESPACE_VALUE: return REALM_NAMESPACE;
			case VERSION_VALUE: return VERSION;
			case ARTIFACT_VALUE: return ARTIFACT;
			case SUB_ARTIFACT_VALUE: return SUB_ARTIFACT;
			case NAME_VALUE: return NAME;
			case ID_VALUE: return ID;
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
	private PackageKind(int value, String name, String literal) {
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
	
} //PackageKind
