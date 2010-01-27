/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.Datatype;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeModelLibrary;
import org.openhealthtools.mdht.emf.hl7.mif2.ImportDatatypeModelLibrary;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype Model Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeModelLibraryImpl#getImportedVocabularyModelPackage <em>Imported Vocabulary Model Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeModelLibraryImpl#getImportDatatypeModelLibrary <em>Import Datatype Model Library</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeModelLibraryImpl#getImportAnnotationLibrary <em>Import Annotation Library</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeModelLibraryImpl#getDatatype <em>Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypeModelLibraryImpl extends PackageImpl implements DatatypeModelLibrary {
	/**
	 * The cached value of the '{@link #getImportedVocabularyModelPackage() <em>Imported Vocabulary Model Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedVocabularyModelPackage()
	 * @generated
	 * @ordered
	 */
	protected PackageRef importedVocabularyModelPackage;

	/**
	 * The cached value of the '{@link #getImportDatatypeModelLibrary() <em>Import Datatype Model Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportDatatypeModelLibrary()
	 * @generated
	 * @ordered
	 */
	protected ImportDatatypeModelLibrary importDatatypeModelLibrary;

	/**
	 * The cached value of the '{@link #getImportAnnotationLibrary() <em>Import Annotation Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportAnnotationLibrary()
	 * @generated
	 * @ordered
	 */
	protected PackageRef importAnnotationLibrary;

	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected EList<Datatype> datatype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypeModelLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.DATATYPE_MODEL_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRef getImportedVocabularyModelPackage() {
		return importedVocabularyModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedVocabularyModelPackage(PackageRef newImportedVocabularyModelPackage, NotificationChain msgs) {
		PackageRef oldImportedVocabularyModelPackage = importedVocabularyModelPackage;
		importedVocabularyModelPackage = newImportedVocabularyModelPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORTED_VOCABULARY_MODEL_PACKAGE, oldImportedVocabularyModelPackage, newImportedVocabularyModelPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedVocabularyModelPackage(PackageRef newImportedVocabularyModelPackage) {
		if (newImportedVocabularyModelPackage != importedVocabularyModelPackage) {
			NotificationChain msgs = null;
			if (importedVocabularyModelPackage != null)
				msgs = ((InternalEObject)importedVocabularyModelPackage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORTED_VOCABULARY_MODEL_PACKAGE, null, msgs);
			if (newImportedVocabularyModelPackage != null)
				msgs = ((InternalEObject)newImportedVocabularyModelPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORTED_VOCABULARY_MODEL_PACKAGE, null, msgs);
			msgs = basicSetImportedVocabularyModelPackage(newImportedVocabularyModelPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORTED_VOCABULARY_MODEL_PACKAGE, newImportedVocabularyModelPackage, newImportedVocabularyModelPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportDatatypeModelLibrary getImportDatatypeModelLibrary() {
		return importDatatypeModelLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportDatatypeModelLibrary(ImportDatatypeModelLibrary newImportDatatypeModelLibrary, NotificationChain msgs) {
		ImportDatatypeModelLibrary oldImportDatatypeModelLibrary = importDatatypeModelLibrary;
		importDatatypeModelLibrary = newImportDatatypeModelLibrary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORT_DATATYPE_MODEL_LIBRARY, oldImportDatatypeModelLibrary, newImportDatatypeModelLibrary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportDatatypeModelLibrary(ImportDatatypeModelLibrary newImportDatatypeModelLibrary) {
		if (newImportDatatypeModelLibrary != importDatatypeModelLibrary) {
			NotificationChain msgs = null;
			if (importDatatypeModelLibrary != null)
				msgs = ((InternalEObject)importDatatypeModelLibrary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORT_DATATYPE_MODEL_LIBRARY, null, msgs);
			if (newImportDatatypeModelLibrary != null)
				msgs = ((InternalEObject)newImportDatatypeModelLibrary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORT_DATATYPE_MODEL_LIBRARY, null, msgs);
			msgs = basicSetImportDatatypeModelLibrary(newImportDatatypeModelLibrary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORT_DATATYPE_MODEL_LIBRARY, newImportDatatypeModelLibrary, newImportDatatypeModelLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRef getImportAnnotationLibrary() {
		return importAnnotationLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportAnnotationLibrary(PackageRef newImportAnnotationLibrary, NotificationChain msgs) {
		PackageRef oldImportAnnotationLibrary = importAnnotationLibrary;
		importAnnotationLibrary = newImportAnnotationLibrary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORT_ANNOTATION_LIBRARY, oldImportAnnotationLibrary, newImportAnnotationLibrary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportAnnotationLibrary(PackageRef newImportAnnotationLibrary) {
		if (newImportAnnotationLibrary != importAnnotationLibrary) {
			NotificationChain msgs = null;
			if (importAnnotationLibrary != null)
				msgs = ((InternalEObject)importAnnotationLibrary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORT_ANNOTATION_LIBRARY, null, msgs);
			if (newImportAnnotationLibrary != null)
				msgs = ((InternalEObject)newImportAnnotationLibrary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORT_ANNOTATION_LIBRARY, null, msgs);
			msgs = basicSetImportAnnotationLibrary(newImportAnnotationLibrary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORT_ANNOTATION_LIBRARY, newImportAnnotationLibrary, newImportAnnotationLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Datatype> getDatatype() {
		if (datatype == null) {
			datatype = new EObjectContainmentEList<Datatype>(Datatype.class, this, Mif2Package.DATATYPE_MODEL_LIBRARY__DATATYPE);
		}
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORTED_VOCABULARY_MODEL_PACKAGE:
				return basicSetImportedVocabularyModelPackage(null, msgs);
			case Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORT_DATATYPE_MODEL_LIBRARY:
				return basicSetImportDatatypeModelLibrary(null, msgs);
			case Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORT_ANNOTATION_LIBRARY:
				return basicSetImportAnnotationLibrary(null, msgs);
			case Mif2Package.DATATYPE_MODEL_LIBRARY__DATATYPE:
				return ((InternalEList<?>)getDatatype()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORTED_VOCABULARY_MODEL_PACKAGE:
				return getImportedVocabularyModelPackage();
			case Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORT_DATATYPE_MODEL_LIBRARY:
				return getImportDatatypeModelLibrary();
			case Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORT_ANNOTATION_LIBRARY:
				return getImportAnnotationLibrary();
			case Mif2Package.DATATYPE_MODEL_LIBRARY__DATATYPE:
				return getDatatype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORTED_VOCABULARY_MODEL_PACKAGE:
				setImportedVocabularyModelPackage((PackageRef)newValue);
				return;
			case Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORT_DATATYPE_MODEL_LIBRARY:
				setImportDatatypeModelLibrary((ImportDatatypeModelLibrary)newValue);
				return;
			case Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORT_ANNOTATION_LIBRARY:
				setImportAnnotationLibrary((PackageRef)newValue);
				return;
			case Mif2Package.DATATYPE_MODEL_LIBRARY__DATATYPE:
				getDatatype().clear();
				getDatatype().addAll((Collection<? extends Datatype>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORTED_VOCABULARY_MODEL_PACKAGE:
				setImportedVocabularyModelPackage((PackageRef)null);
				return;
			case Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORT_DATATYPE_MODEL_LIBRARY:
				setImportDatatypeModelLibrary((ImportDatatypeModelLibrary)null);
				return;
			case Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORT_ANNOTATION_LIBRARY:
				setImportAnnotationLibrary((PackageRef)null);
				return;
			case Mif2Package.DATATYPE_MODEL_LIBRARY__DATATYPE:
				getDatatype().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORTED_VOCABULARY_MODEL_PACKAGE:
				return importedVocabularyModelPackage != null;
			case Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORT_DATATYPE_MODEL_LIBRARY:
				return importDatatypeModelLibrary != null;
			case Mif2Package.DATATYPE_MODEL_LIBRARY__IMPORT_ANNOTATION_LIBRARY:
				return importAnnotationLibrary != null;
			case Mif2Package.DATATYPE_MODEL_LIBRARY__DATATYPE:
				return datatype != null && !datatype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DatatypeModelLibraryImpl
