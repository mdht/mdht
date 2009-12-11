/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: Package stereotype
 * 
 * 				DublinCore: The 'specialization' of Package is used to identify 'type'
 * 								The 'format' is always "HL7 MIF"
 * 								The 'identifier' is the name attribute defined in specializations
 * 								HL7 artifacts tend to be 'original' and therefore have no 'source'
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Package#getPackageLocation <em>Package Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Package#getHeader <em>Header</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Package#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Package#getReplacedBy <em>Replaced By</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Package#getHashCode <em>Hash Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Package#getPackageKind <em>Package Kind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Package#getSecondaryId <em>Secondary Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Package#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackage()
 * @model abstract="true"
 *        extendedMetaData="name='Package' kind='elementOnly'"
 * @generated
 */
public interface Package extends PackageBase {
	/**
	 * Returns the value of the '<em><b>Package Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies where (within the 'repository' package hierarchy) this package resides
	 * UML: Identifies the namespace the package is part of
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Location</em>' containment reference.
	 * @see #setPackageLocation(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackage_PackageLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='packageLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getPackageLocation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Package#getPackageLocation <em>Package Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Location</em>' containment reference.
	 * @see #getPackageLocation()
	 * @generated
	 */
	void setPackageLocation(PackageRef value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General metadata information about the package
	 * UML: complex tag value on Package stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(Header)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackage_Header()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='header' namespace='##targetNamespace'"
	 * @generated
	 */
	Header getHeader();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Package#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(Header value);

	/**
	 * Returns the value of the '<em><b>Replaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the package and versions (or packages) that are intended to be superceded by this package.
	 * UML: tag on Package stereotype
	 * DublinCore: Corresponds to 'replaces'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replaces</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackage_Replaces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='replaces' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackageRef> getReplaces();

	/**
	 * Returns the value of the '<em><b>Replaced By</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the package and versions (or packages) which supercede this package.
	 * UML: tag on Package stereotype
	 * Derive: Todo - All packages which reference this element as a 'replaces'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replaced By</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackage_ReplacedBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='replacedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackageRef> getReplacedBy();

	/**
	 * Returns the value of the '<em><b>Hash Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A base64 encoded SHA-256 hashcode.  The hashcode will be calculated upon the full canonicalized content (including comments) of the package, transformed to exclude the hashcode attribute itself.  Refer to http://www.w3.org/TR/2002/REC-xmldsig-core-20020212 for details. FUTURE_USE
	 * UML: hashCode tag on Package stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hash Code</em>' attribute.
	 * @see #setHashCode(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackage_HashCode()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.HashCode"
	 *        extendedMetaData="kind='attribute' name='hashCode'"
	 * @generated
	 */
	String getHashCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Package#getHashCode <em>Hash Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash Code</em>' attribute.
	 * @see #getHashCode()
	 * @generated
	 */
	void setHashCode(String value);

	/**
	 * Returns the value of the '<em><b>Package Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.PackageKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The 'level' or variety of package being represented
	 * UML: 'packageKind' tag on Package stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Kind</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PackageKind
	 * @see #isSetPackageKind()
	 * @see #unsetPackageKind()
	 * @see #setPackageKind(PackageKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackage_PackageKind()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='packageKind'"
	 * @generated
	 */
	PackageKind getPackageKind();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Package#getPackageKind <em>Package Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Kind</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PackageKind
	 * @see #isSetPackageKind()
	 * @see #unsetPackageKind()
	 * @see #getPackageKind()
	 * @generated
	 */
	void setPackageKind(PackageKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Package#getPackageKind <em>Package Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPackageKind()
	 * @see #getPackageKind()
	 * @see #setPackageKind(PackageKind)
	 * @generated
	 */
	void unsetPackageKind();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Package#getPackageKind <em>Package Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Package Kind</em>' attribute is set.
	 * @see #unsetPackageKind()
	 * @see #getPackageKind()
	 * @see #setPackageKind(PackageKind)
	 * @generated
	 */
	boolean isSetPackageKind();

	/**
	 * Returns the value of the '<em><b>Secondary Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An object identifier issued to the package or model as a supplementary id used for locating the object in registries, etc.
	 * UML: Tag on HL7Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secondary Id</em>' attribute.
	 * @see #setSecondaryId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackage_SecondaryId()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Oid"
	 *        extendedMetaData="kind='attribute' name='secondaryId'"
	 * @generated
	 */
	String getSecondaryId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Package#getSecondaryId <em>Secondary Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Id</em>' attribute.
	 * @see #getSecondaryId()
	 * @generated
	 */
	void setSecondaryId(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The descriptive name for the package in circumstances where the 'name' is more of an identifier.
	 * UML: title tag on Package stereotype
	 * DublinCore: Equivalent to 'title'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackage_Title()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Package#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Package
