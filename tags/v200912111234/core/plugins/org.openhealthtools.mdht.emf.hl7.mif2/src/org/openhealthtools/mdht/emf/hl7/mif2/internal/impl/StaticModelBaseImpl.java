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

import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeLimitation;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeModelLibrary;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.ModelConformanceKind;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelDerivationSource;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelRepresentationKind;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticPackageDiagramGraphicInformation;
import org.openhealthtools.mdht.emf.hl7.mif2.SubjectAreaPackage;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRef;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyLimitation;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel;
import org.openhealthtools.mdht.emf.w3c.xhtml.Img;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Model Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelBaseImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelBaseImpl#getGraphicRepresentation <em>Graphic Representation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelBaseImpl#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelBaseImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelBaseImpl#getHasDerivations <em>Has Derivations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelBaseImpl#getImportedDatatypeModelPackage <em>Imported Datatype Model Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelBaseImpl#getImportedVocabularyModelPackage <em>Imported Vocabulary Model Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelBaseImpl#getImportedCommonModelElementPackage <em>Imported Common Model Element Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelBaseImpl#getImportedStubPackage <em>Imported Stub Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelBaseImpl#getImportAnnotationLibrary <em>Import Annotation Library</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelBaseImpl#getAdditionalDatatypeModel <em>Additional Datatype Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelBaseImpl#getDatatypeLimitation <em>Datatype Limitation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelBaseImpl#getAdditionalVocabularyModel <em>Additional Vocabulary Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelBaseImpl#getVocabularyLimitation <em>Vocabulary Limitation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelBaseImpl#getSubjectAreaPackage <em>Subject Area Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelBaseImpl#getDefinitionalCode <em>Definitional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelBaseImpl#getConformanceLevel <em>Conformance Level</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelBaseImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelBaseImpl#isIsSerializable <em>Is Serializable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelBaseImpl#getRepresentationKind <em>Representation Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaticModelBaseImpl extends SubSystemImpl implements StaticModelBase {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected StaticModelAnnotations annotations;

	/**
	 * The cached value of the '{@link #getGraphicRepresentation() <em>Graphic Representation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<StaticPackageDiagramGraphicInformation> graphicRepresentation;

	/**
	 * The cached value of the '{@link #getFigure() <em>Figure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigure()
	 * @generated
	 * @ordered
	 */
	protected Img figure;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<StaticModelDerivation> derivedFrom;

	/**
	 * The cached value of the '{@link #getHasDerivations() <em>Has Derivations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDerivations()
	 * @generated
	 * @ordered
	 */
	protected StaticModelDerivationSource hasDerivations;

	/**
	 * The cached value of the '{@link #getImportedDatatypeModelPackage() <em>Imported Datatype Model Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedDatatypeModelPackage()
	 * @generated
	 * @ordered
	 */
	protected PackageRef importedDatatypeModelPackage;

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
	 * The cached value of the '{@link #getImportedCommonModelElementPackage() <em>Imported Common Model Element Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedCommonModelElementPackage()
	 * @generated
	 * @ordered
	 */
	protected PackageRef importedCommonModelElementPackage;

	/**
	 * The cached value of the '{@link #getImportedStubPackage() <em>Imported Stub Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedStubPackage()
	 * @generated
	 * @ordered
	 */
	protected PackageRef importedStubPackage;

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
	 * The cached value of the '{@link #getAdditionalDatatypeModel() <em>Additional Datatype Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalDatatypeModel()
	 * @generated
	 * @ordered
	 */
	protected EList<DatatypeModelLibrary> additionalDatatypeModel;

	/**
	 * The cached value of the '{@link #getDatatypeLimitation() <em>Datatype Limitation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatypeLimitation()
	 * @generated
	 * @ordered
	 */
	protected EList<DatatypeLimitation> datatypeLimitation;

	/**
	 * The cached value of the '{@link #getAdditionalVocabularyModel() <em>Additional Vocabulary Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalVocabularyModel()
	 * @generated
	 * @ordered
	 */
	protected EList<VocabularyModel> additionalVocabularyModel;

	/**
	 * The cached value of the '{@link #getVocabularyLimitation() <em>Vocabulary Limitation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabularyLimitation()
	 * @generated
	 * @ordered
	 */
	protected EList<VocabularyLimitation> vocabularyLimitation;

	/**
	 * The cached value of the '{@link #getSubjectAreaPackage() <em>Subject Area Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectAreaPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<SubjectAreaPackage> subjectAreaPackage;

	/**
	 * The cached value of the '{@link #getDefinitionalCode() <em>Definitional Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionalCode()
	 * @generated
	 * @ordered
	 */
	protected EList<VocabularyCodeRef> definitionalCode;

	/**
	 * The default value of the '{@link #getConformanceLevel() <em>Conformance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformanceLevel()
	 * @generated
	 * @ordered
	 */
	protected static final ModelConformanceKind CONFORMANCE_LEVEL_EDEFAULT = ModelConformanceKind.INTERNATIONAL;

	/**
	 * The cached value of the '{@link #getConformanceLevel() <em>Conformance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformanceLevel()
	 * @generated
	 * @ordered
	 */
	protected ModelConformanceKind conformanceLevel = CONFORMANCE_LEVEL_EDEFAULT;

	/**
	 * This is true if the Conformance Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conformanceLevelESet;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * This is true if the Is Abstract attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstractESet;

	/**
	 * The default value of the '{@link #isIsSerializable() <em>Is Serializable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSerializable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SERIALIZABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSerializable() <em>Is Serializable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSerializable()
	 * @generated
	 * @ordered
	 */
	protected boolean isSerializable = IS_SERIALIZABLE_EDEFAULT;

	/**
	 * This is true if the Is Serializable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isSerializableESet;

	/**
	 * The default value of the '{@link #getRepresentationKind() <em>Representation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationKind()
	 * @generated
	 * @ordered
	 */
	protected static final StaticModelRepresentationKind REPRESENTATION_KIND_EDEFAULT = StaticModelRepresentationKind.FLAT;

	/**
	 * The cached value of the '{@link #getRepresentationKind() <em>Representation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationKind()
	 * @generated
	 * @ordered
	 */
	protected StaticModelRepresentationKind representationKind = REPRESENTATION_KIND_EDEFAULT;

	/**
	 * This is true if the Representation Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean representationKindESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticModelBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.STATIC_MODEL_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(StaticModelAnnotations newAnnotations, NotificationChain msgs) {
		StaticModelAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_MODEL_BASE__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(StaticModelAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.STATIC_MODEL_BASE__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.STATIC_MODEL_BASE__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_MODEL_BASE__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaticPackageDiagramGraphicInformation> getGraphicRepresentation() {
		if (graphicRepresentation == null) {
			graphicRepresentation = new EObjectContainmentEList<StaticPackageDiagramGraphicInformation>(StaticPackageDiagramGraphicInformation.class, this, Mif2Package.STATIC_MODEL_BASE__GRAPHIC_REPRESENTATION);
		}
		return graphicRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Img getFigure() {
		return figure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFigure(Img newFigure, NotificationChain msgs) {
		Img oldFigure = figure;
		figure = newFigure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_MODEL_BASE__FIGURE, oldFigure, newFigure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFigure(Img newFigure) {
		if (newFigure != figure) {
			NotificationChain msgs = null;
			if (figure != null)
				msgs = ((InternalEObject)figure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.STATIC_MODEL_BASE__FIGURE, null, msgs);
			if (newFigure != null)
				msgs = ((InternalEObject)newFigure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.STATIC_MODEL_BASE__FIGURE, null, msgs);
			msgs = basicSetFigure(newFigure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_MODEL_BASE__FIGURE, newFigure, newFigure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaticModelDerivation> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectContainmentEList<StaticModelDerivation>(StaticModelDerivation.class, this, Mif2Package.STATIC_MODEL_BASE__DERIVED_FROM);
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelDerivationSource getHasDerivations() {
		return hasDerivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasDerivations(StaticModelDerivationSource newHasDerivations, NotificationChain msgs) {
		StaticModelDerivationSource oldHasDerivations = hasDerivations;
		hasDerivations = newHasDerivations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_MODEL_BASE__HAS_DERIVATIONS, oldHasDerivations, newHasDerivations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasDerivations(StaticModelDerivationSource newHasDerivations) {
		if (newHasDerivations != hasDerivations) {
			NotificationChain msgs = null;
			if (hasDerivations != null)
				msgs = ((InternalEObject)hasDerivations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.STATIC_MODEL_BASE__HAS_DERIVATIONS, null, msgs);
			if (newHasDerivations != null)
				msgs = ((InternalEObject)newHasDerivations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.STATIC_MODEL_BASE__HAS_DERIVATIONS, null, msgs);
			msgs = basicSetHasDerivations(newHasDerivations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_MODEL_BASE__HAS_DERIVATIONS, newHasDerivations, newHasDerivations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRef getImportedDatatypeModelPackage() {
		return importedDatatypeModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedDatatypeModelPackage(PackageRef newImportedDatatypeModelPackage, NotificationChain msgs) {
		PackageRef oldImportedDatatypeModelPackage = importedDatatypeModelPackage;
		importedDatatypeModelPackage = newImportedDatatypeModelPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_MODEL_BASE__IMPORTED_DATATYPE_MODEL_PACKAGE, oldImportedDatatypeModelPackage, newImportedDatatypeModelPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedDatatypeModelPackage(PackageRef newImportedDatatypeModelPackage) {
		if (newImportedDatatypeModelPackage != importedDatatypeModelPackage) {
			NotificationChain msgs = null;
			if (importedDatatypeModelPackage != null)
				msgs = ((InternalEObject)importedDatatypeModelPackage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.STATIC_MODEL_BASE__IMPORTED_DATATYPE_MODEL_PACKAGE, null, msgs);
			if (newImportedDatatypeModelPackage != null)
				msgs = ((InternalEObject)newImportedDatatypeModelPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.STATIC_MODEL_BASE__IMPORTED_DATATYPE_MODEL_PACKAGE, null, msgs);
			msgs = basicSetImportedDatatypeModelPackage(newImportedDatatypeModelPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_MODEL_BASE__IMPORTED_DATATYPE_MODEL_PACKAGE, newImportedDatatypeModelPackage, newImportedDatatypeModelPackage));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_MODEL_BASE__IMPORTED_VOCABULARY_MODEL_PACKAGE, oldImportedVocabularyModelPackage, newImportedVocabularyModelPackage);
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
				msgs = ((InternalEObject)importedVocabularyModelPackage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.STATIC_MODEL_BASE__IMPORTED_VOCABULARY_MODEL_PACKAGE, null, msgs);
			if (newImportedVocabularyModelPackage != null)
				msgs = ((InternalEObject)newImportedVocabularyModelPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.STATIC_MODEL_BASE__IMPORTED_VOCABULARY_MODEL_PACKAGE, null, msgs);
			msgs = basicSetImportedVocabularyModelPackage(newImportedVocabularyModelPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_MODEL_BASE__IMPORTED_VOCABULARY_MODEL_PACKAGE, newImportedVocabularyModelPackage, newImportedVocabularyModelPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRef getImportedCommonModelElementPackage() {
		return importedCommonModelElementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedCommonModelElementPackage(PackageRef newImportedCommonModelElementPackage, NotificationChain msgs) {
		PackageRef oldImportedCommonModelElementPackage = importedCommonModelElementPackage;
		importedCommonModelElementPackage = newImportedCommonModelElementPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_MODEL_BASE__IMPORTED_COMMON_MODEL_ELEMENT_PACKAGE, oldImportedCommonModelElementPackage, newImportedCommonModelElementPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedCommonModelElementPackage(PackageRef newImportedCommonModelElementPackage) {
		if (newImportedCommonModelElementPackage != importedCommonModelElementPackage) {
			NotificationChain msgs = null;
			if (importedCommonModelElementPackage != null)
				msgs = ((InternalEObject)importedCommonModelElementPackage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.STATIC_MODEL_BASE__IMPORTED_COMMON_MODEL_ELEMENT_PACKAGE, null, msgs);
			if (newImportedCommonModelElementPackage != null)
				msgs = ((InternalEObject)newImportedCommonModelElementPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.STATIC_MODEL_BASE__IMPORTED_COMMON_MODEL_ELEMENT_PACKAGE, null, msgs);
			msgs = basicSetImportedCommonModelElementPackage(newImportedCommonModelElementPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_MODEL_BASE__IMPORTED_COMMON_MODEL_ELEMENT_PACKAGE, newImportedCommonModelElementPackage, newImportedCommonModelElementPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRef getImportedStubPackage() {
		return importedStubPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedStubPackage(PackageRef newImportedStubPackage, NotificationChain msgs) {
		PackageRef oldImportedStubPackage = importedStubPackage;
		importedStubPackage = newImportedStubPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_MODEL_BASE__IMPORTED_STUB_PACKAGE, oldImportedStubPackage, newImportedStubPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedStubPackage(PackageRef newImportedStubPackage) {
		if (newImportedStubPackage != importedStubPackage) {
			NotificationChain msgs = null;
			if (importedStubPackage != null)
				msgs = ((InternalEObject)importedStubPackage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.STATIC_MODEL_BASE__IMPORTED_STUB_PACKAGE, null, msgs);
			if (newImportedStubPackage != null)
				msgs = ((InternalEObject)newImportedStubPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.STATIC_MODEL_BASE__IMPORTED_STUB_PACKAGE, null, msgs);
			msgs = basicSetImportedStubPackage(newImportedStubPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_MODEL_BASE__IMPORTED_STUB_PACKAGE, newImportedStubPackage, newImportedStubPackage));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_MODEL_BASE__IMPORT_ANNOTATION_LIBRARY, oldImportAnnotationLibrary, newImportAnnotationLibrary);
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
				msgs = ((InternalEObject)importAnnotationLibrary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.STATIC_MODEL_BASE__IMPORT_ANNOTATION_LIBRARY, null, msgs);
			if (newImportAnnotationLibrary != null)
				msgs = ((InternalEObject)newImportAnnotationLibrary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.STATIC_MODEL_BASE__IMPORT_ANNOTATION_LIBRARY, null, msgs);
			msgs = basicSetImportAnnotationLibrary(newImportAnnotationLibrary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_MODEL_BASE__IMPORT_ANNOTATION_LIBRARY, newImportAnnotationLibrary, newImportAnnotationLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeModelLibrary> getAdditionalDatatypeModel() {
		if (additionalDatatypeModel == null) {
			additionalDatatypeModel = new EObjectContainmentEList<DatatypeModelLibrary>(DatatypeModelLibrary.class, this, Mif2Package.STATIC_MODEL_BASE__ADDITIONAL_DATATYPE_MODEL);
		}
		return additionalDatatypeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeLimitation> getDatatypeLimitation() {
		if (datatypeLimitation == null) {
			datatypeLimitation = new EObjectContainmentEList<DatatypeLimitation>(DatatypeLimitation.class, this, Mif2Package.STATIC_MODEL_BASE__DATATYPE_LIMITATION);
		}
		return datatypeLimitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VocabularyModel> getAdditionalVocabularyModel() {
		if (additionalVocabularyModel == null) {
			additionalVocabularyModel = new EObjectContainmentEList<VocabularyModel>(VocabularyModel.class, this, Mif2Package.STATIC_MODEL_BASE__ADDITIONAL_VOCABULARY_MODEL);
		}
		return additionalVocabularyModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VocabularyLimitation> getVocabularyLimitation() {
		if (vocabularyLimitation == null) {
			vocabularyLimitation = new EObjectContainmentEList<VocabularyLimitation>(VocabularyLimitation.class, this, Mif2Package.STATIC_MODEL_BASE__VOCABULARY_LIMITATION);
		}
		return vocabularyLimitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubjectAreaPackage> getSubjectAreaPackage() {
		if (subjectAreaPackage == null) {
			subjectAreaPackage = new EObjectContainmentEList<SubjectAreaPackage>(SubjectAreaPackage.class, this, Mif2Package.STATIC_MODEL_BASE__SUBJECT_AREA_PACKAGE);
		}
		return subjectAreaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VocabularyCodeRef> getDefinitionalCode() {
		if (definitionalCode == null) {
			definitionalCode = new EObjectContainmentEList<VocabularyCodeRef>(VocabularyCodeRef.class, this, Mif2Package.STATIC_MODEL_BASE__DEFINITIONAL_CODE);
		}
		return definitionalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelConformanceKind getConformanceLevel() {
		return conformanceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConformanceLevel(ModelConformanceKind newConformanceLevel) {
		ModelConformanceKind oldConformanceLevel = conformanceLevel;
		conformanceLevel = newConformanceLevel == null ? CONFORMANCE_LEVEL_EDEFAULT : newConformanceLevel;
		boolean oldConformanceLevelESet = conformanceLevelESet;
		conformanceLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_MODEL_BASE__CONFORMANCE_LEVEL, oldConformanceLevel, conformanceLevel, !oldConformanceLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConformanceLevel() {
		ModelConformanceKind oldConformanceLevel = conformanceLevel;
		boolean oldConformanceLevelESet = conformanceLevelESet;
		conformanceLevel = CONFORMANCE_LEVEL_EDEFAULT;
		conformanceLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.STATIC_MODEL_BASE__CONFORMANCE_LEVEL, oldConformanceLevel, CONFORMANCE_LEVEL_EDEFAULT, oldConformanceLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConformanceLevel() {
		return conformanceLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		boolean oldIsAbstractESet = isAbstractESet;
		isAbstractESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_MODEL_BASE__IS_ABSTRACT, oldIsAbstract, isAbstract, !oldIsAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsAbstract() {
		boolean oldIsAbstract = isAbstract;
		boolean oldIsAbstractESet = isAbstractESet;
		isAbstract = IS_ABSTRACT_EDEFAULT;
		isAbstractESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.STATIC_MODEL_BASE__IS_ABSTRACT, oldIsAbstract, IS_ABSTRACT_EDEFAULT, oldIsAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsAbstract() {
		return isAbstractESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSerializable() {
		return isSerializable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSerializable(boolean newIsSerializable) {
		boolean oldIsSerializable = isSerializable;
		isSerializable = newIsSerializable;
		boolean oldIsSerializableESet = isSerializableESet;
		isSerializableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_MODEL_BASE__IS_SERIALIZABLE, oldIsSerializable, isSerializable, !oldIsSerializableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsSerializable() {
		boolean oldIsSerializable = isSerializable;
		boolean oldIsSerializableESet = isSerializableESet;
		isSerializable = IS_SERIALIZABLE_EDEFAULT;
		isSerializableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.STATIC_MODEL_BASE__IS_SERIALIZABLE, oldIsSerializable, IS_SERIALIZABLE_EDEFAULT, oldIsSerializableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsSerializable() {
		return isSerializableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelRepresentationKind getRepresentationKind() {
		return representationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentationKind(StaticModelRepresentationKind newRepresentationKind) {
		StaticModelRepresentationKind oldRepresentationKind = representationKind;
		representationKind = newRepresentationKind == null ? REPRESENTATION_KIND_EDEFAULT : newRepresentationKind;
		boolean oldRepresentationKindESet = representationKindESet;
		representationKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_MODEL_BASE__REPRESENTATION_KIND, oldRepresentationKind, representationKind, !oldRepresentationKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepresentationKind() {
		StaticModelRepresentationKind oldRepresentationKind = representationKind;
		boolean oldRepresentationKindESet = representationKindESet;
		representationKind = REPRESENTATION_KIND_EDEFAULT;
		representationKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.STATIC_MODEL_BASE__REPRESENTATION_KIND, oldRepresentationKind, REPRESENTATION_KIND_EDEFAULT, oldRepresentationKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepresentationKind() {
		return representationKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.STATIC_MODEL_BASE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.STATIC_MODEL_BASE__GRAPHIC_REPRESENTATION:
				return ((InternalEList<?>)getGraphicRepresentation()).basicRemove(otherEnd, msgs);
			case Mif2Package.STATIC_MODEL_BASE__FIGURE:
				return basicSetFigure(null, msgs);
			case Mif2Package.STATIC_MODEL_BASE__DERIVED_FROM:
				return ((InternalEList<?>)getDerivedFrom()).basicRemove(otherEnd, msgs);
			case Mif2Package.STATIC_MODEL_BASE__HAS_DERIVATIONS:
				return basicSetHasDerivations(null, msgs);
			case Mif2Package.STATIC_MODEL_BASE__IMPORTED_DATATYPE_MODEL_PACKAGE:
				return basicSetImportedDatatypeModelPackage(null, msgs);
			case Mif2Package.STATIC_MODEL_BASE__IMPORTED_VOCABULARY_MODEL_PACKAGE:
				return basicSetImportedVocabularyModelPackage(null, msgs);
			case Mif2Package.STATIC_MODEL_BASE__IMPORTED_COMMON_MODEL_ELEMENT_PACKAGE:
				return basicSetImportedCommonModelElementPackage(null, msgs);
			case Mif2Package.STATIC_MODEL_BASE__IMPORTED_STUB_PACKAGE:
				return basicSetImportedStubPackage(null, msgs);
			case Mif2Package.STATIC_MODEL_BASE__IMPORT_ANNOTATION_LIBRARY:
				return basicSetImportAnnotationLibrary(null, msgs);
			case Mif2Package.STATIC_MODEL_BASE__ADDITIONAL_DATATYPE_MODEL:
				return ((InternalEList<?>)getAdditionalDatatypeModel()).basicRemove(otherEnd, msgs);
			case Mif2Package.STATIC_MODEL_BASE__DATATYPE_LIMITATION:
				return ((InternalEList<?>)getDatatypeLimitation()).basicRemove(otherEnd, msgs);
			case Mif2Package.STATIC_MODEL_BASE__ADDITIONAL_VOCABULARY_MODEL:
				return ((InternalEList<?>)getAdditionalVocabularyModel()).basicRemove(otherEnd, msgs);
			case Mif2Package.STATIC_MODEL_BASE__VOCABULARY_LIMITATION:
				return ((InternalEList<?>)getVocabularyLimitation()).basicRemove(otherEnd, msgs);
			case Mif2Package.STATIC_MODEL_BASE__SUBJECT_AREA_PACKAGE:
				return ((InternalEList<?>)getSubjectAreaPackage()).basicRemove(otherEnd, msgs);
			case Mif2Package.STATIC_MODEL_BASE__DEFINITIONAL_CODE:
				return ((InternalEList<?>)getDefinitionalCode()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.STATIC_MODEL_BASE__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.STATIC_MODEL_BASE__GRAPHIC_REPRESENTATION:
				return getGraphicRepresentation();
			case Mif2Package.STATIC_MODEL_BASE__FIGURE:
				return getFigure();
			case Mif2Package.STATIC_MODEL_BASE__DERIVED_FROM:
				return getDerivedFrom();
			case Mif2Package.STATIC_MODEL_BASE__HAS_DERIVATIONS:
				return getHasDerivations();
			case Mif2Package.STATIC_MODEL_BASE__IMPORTED_DATATYPE_MODEL_PACKAGE:
				return getImportedDatatypeModelPackage();
			case Mif2Package.STATIC_MODEL_BASE__IMPORTED_VOCABULARY_MODEL_PACKAGE:
				return getImportedVocabularyModelPackage();
			case Mif2Package.STATIC_MODEL_BASE__IMPORTED_COMMON_MODEL_ELEMENT_PACKAGE:
				return getImportedCommonModelElementPackage();
			case Mif2Package.STATIC_MODEL_BASE__IMPORTED_STUB_PACKAGE:
				return getImportedStubPackage();
			case Mif2Package.STATIC_MODEL_BASE__IMPORT_ANNOTATION_LIBRARY:
				return getImportAnnotationLibrary();
			case Mif2Package.STATIC_MODEL_BASE__ADDITIONAL_DATATYPE_MODEL:
				return getAdditionalDatatypeModel();
			case Mif2Package.STATIC_MODEL_BASE__DATATYPE_LIMITATION:
				return getDatatypeLimitation();
			case Mif2Package.STATIC_MODEL_BASE__ADDITIONAL_VOCABULARY_MODEL:
				return getAdditionalVocabularyModel();
			case Mif2Package.STATIC_MODEL_BASE__VOCABULARY_LIMITATION:
				return getVocabularyLimitation();
			case Mif2Package.STATIC_MODEL_BASE__SUBJECT_AREA_PACKAGE:
				return getSubjectAreaPackage();
			case Mif2Package.STATIC_MODEL_BASE__DEFINITIONAL_CODE:
				return getDefinitionalCode();
			case Mif2Package.STATIC_MODEL_BASE__CONFORMANCE_LEVEL:
				return getConformanceLevel();
			case Mif2Package.STATIC_MODEL_BASE__IS_ABSTRACT:
				return isIsAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case Mif2Package.STATIC_MODEL_BASE__IS_SERIALIZABLE:
				return isIsSerializable() ? Boolean.TRUE : Boolean.FALSE;
			case Mif2Package.STATIC_MODEL_BASE__REPRESENTATION_KIND:
				return getRepresentationKind();
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
			case Mif2Package.STATIC_MODEL_BASE__ANNOTATIONS:
				setAnnotations((StaticModelAnnotations)newValue);
				return;
			case Mif2Package.STATIC_MODEL_BASE__GRAPHIC_REPRESENTATION:
				getGraphicRepresentation().clear();
				getGraphicRepresentation().addAll((Collection<? extends StaticPackageDiagramGraphicInformation>)newValue);
				return;
			case Mif2Package.STATIC_MODEL_BASE__FIGURE:
				setFigure((Img)newValue);
				return;
			case Mif2Package.STATIC_MODEL_BASE__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends StaticModelDerivation>)newValue);
				return;
			case Mif2Package.STATIC_MODEL_BASE__HAS_DERIVATIONS:
				setHasDerivations((StaticModelDerivationSource)newValue);
				return;
			case Mif2Package.STATIC_MODEL_BASE__IMPORTED_DATATYPE_MODEL_PACKAGE:
				setImportedDatatypeModelPackage((PackageRef)newValue);
				return;
			case Mif2Package.STATIC_MODEL_BASE__IMPORTED_VOCABULARY_MODEL_PACKAGE:
				setImportedVocabularyModelPackage((PackageRef)newValue);
				return;
			case Mif2Package.STATIC_MODEL_BASE__IMPORTED_COMMON_MODEL_ELEMENT_PACKAGE:
				setImportedCommonModelElementPackage((PackageRef)newValue);
				return;
			case Mif2Package.STATIC_MODEL_BASE__IMPORTED_STUB_PACKAGE:
				setImportedStubPackage((PackageRef)newValue);
				return;
			case Mif2Package.STATIC_MODEL_BASE__IMPORT_ANNOTATION_LIBRARY:
				setImportAnnotationLibrary((PackageRef)newValue);
				return;
			case Mif2Package.STATIC_MODEL_BASE__ADDITIONAL_DATATYPE_MODEL:
				getAdditionalDatatypeModel().clear();
				getAdditionalDatatypeModel().addAll((Collection<? extends DatatypeModelLibrary>)newValue);
				return;
			case Mif2Package.STATIC_MODEL_BASE__DATATYPE_LIMITATION:
				getDatatypeLimitation().clear();
				getDatatypeLimitation().addAll((Collection<? extends DatatypeLimitation>)newValue);
				return;
			case Mif2Package.STATIC_MODEL_BASE__ADDITIONAL_VOCABULARY_MODEL:
				getAdditionalVocabularyModel().clear();
				getAdditionalVocabularyModel().addAll((Collection<? extends VocabularyModel>)newValue);
				return;
			case Mif2Package.STATIC_MODEL_BASE__VOCABULARY_LIMITATION:
				getVocabularyLimitation().clear();
				getVocabularyLimitation().addAll((Collection<? extends VocabularyLimitation>)newValue);
				return;
			case Mif2Package.STATIC_MODEL_BASE__SUBJECT_AREA_PACKAGE:
				getSubjectAreaPackage().clear();
				getSubjectAreaPackage().addAll((Collection<? extends SubjectAreaPackage>)newValue);
				return;
			case Mif2Package.STATIC_MODEL_BASE__DEFINITIONAL_CODE:
				getDefinitionalCode().clear();
				getDefinitionalCode().addAll((Collection<? extends VocabularyCodeRef>)newValue);
				return;
			case Mif2Package.STATIC_MODEL_BASE__CONFORMANCE_LEVEL:
				setConformanceLevel((ModelConformanceKind)newValue);
				return;
			case Mif2Package.STATIC_MODEL_BASE__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case Mif2Package.STATIC_MODEL_BASE__IS_SERIALIZABLE:
				setIsSerializable(((Boolean)newValue).booleanValue());
				return;
			case Mif2Package.STATIC_MODEL_BASE__REPRESENTATION_KIND:
				setRepresentationKind((StaticModelRepresentationKind)newValue);
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
			case Mif2Package.STATIC_MODEL_BASE__ANNOTATIONS:
				setAnnotations((StaticModelAnnotations)null);
				return;
			case Mif2Package.STATIC_MODEL_BASE__GRAPHIC_REPRESENTATION:
				getGraphicRepresentation().clear();
				return;
			case Mif2Package.STATIC_MODEL_BASE__FIGURE:
				setFigure((Img)null);
				return;
			case Mif2Package.STATIC_MODEL_BASE__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case Mif2Package.STATIC_MODEL_BASE__HAS_DERIVATIONS:
				setHasDerivations((StaticModelDerivationSource)null);
				return;
			case Mif2Package.STATIC_MODEL_BASE__IMPORTED_DATATYPE_MODEL_PACKAGE:
				setImportedDatatypeModelPackage((PackageRef)null);
				return;
			case Mif2Package.STATIC_MODEL_BASE__IMPORTED_VOCABULARY_MODEL_PACKAGE:
				setImportedVocabularyModelPackage((PackageRef)null);
				return;
			case Mif2Package.STATIC_MODEL_BASE__IMPORTED_COMMON_MODEL_ELEMENT_PACKAGE:
				setImportedCommonModelElementPackage((PackageRef)null);
				return;
			case Mif2Package.STATIC_MODEL_BASE__IMPORTED_STUB_PACKAGE:
				setImportedStubPackage((PackageRef)null);
				return;
			case Mif2Package.STATIC_MODEL_BASE__IMPORT_ANNOTATION_LIBRARY:
				setImportAnnotationLibrary((PackageRef)null);
				return;
			case Mif2Package.STATIC_MODEL_BASE__ADDITIONAL_DATATYPE_MODEL:
				getAdditionalDatatypeModel().clear();
				return;
			case Mif2Package.STATIC_MODEL_BASE__DATATYPE_LIMITATION:
				getDatatypeLimitation().clear();
				return;
			case Mif2Package.STATIC_MODEL_BASE__ADDITIONAL_VOCABULARY_MODEL:
				getAdditionalVocabularyModel().clear();
				return;
			case Mif2Package.STATIC_MODEL_BASE__VOCABULARY_LIMITATION:
				getVocabularyLimitation().clear();
				return;
			case Mif2Package.STATIC_MODEL_BASE__SUBJECT_AREA_PACKAGE:
				getSubjectAreaPackage().clear();
				return;
			case Mif2Package.STATIC_MODEL_BASE__DEFINITIONAL_CODE:
				getDefinitionalCode().clear();
				return;
			case Mif2Package.STATIC_MODEL_BASE__CONFORMANCE_LEVEL:
				unsetConformanceLevel();
				return;
			case Mif2Package.STATIC_MODEL_BASE__IS_ABSTRACT:
				unsetIsAbstract();
				return;
			case Mif2Package.STATIC_MODEL_BASE__IS_SERIALIZABLE:
				unsetIsSerializable();
				return;
			case Mif2Package.STATIC_MODEL_BASE__REPRESENTATION_KIND:
				unsetRepresentationKind();
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
			case Mif2Package.STATIC_MODEL_BASE__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.STATIC_MODEL_BASE__GRAPHIC_REPRESENTATION:
				return graphicRepresentation != null && !graphicRepresentation.isEmpty();
			case Mif2Package.STATIC_MODEL_BASE__FIGURE:
				return figure != null;
			case Mif2Package.STATIC_MODEL_BASE__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case Mif2Package.STATIC_MODEL_BASE__HAS_DERIVATIONS:
				return hasDerivations != null;
			case Mif2Package.STATIC_MODEL_BASE__IMPORTED_DATATYPE_MODEL_PACKAGE:
				return importedDatatypeModelPackage != null;
			case Mif2Package.STATIC_MODEL_BASE__IMPORTED_VOCABULARY_MODEL_PACKAGE:
				return importedVocabularyModelPackage != null;
			case Mif2Package.STATIC_MODEL_BASE__IMPORTED_COMMON_MODEL_ELEMENT_PACKAGE:
				return importedCommonModelElementPackage != null;
			case Mif2Package.STATIC_MODEL_BASE__IMPORTED_STUB_PACKAGE:
				return importedStubPackage != null;
			case Mif2Package.STATIC_MODEL_BASE__IMPORT_ANNOTATION_LIBRARY:
				return importAnnotationLibrary != null;
			case Mif2Package.STATIC_MODEL_BASE__ADDITIONAL_DATATYPE_MODEL:
				return additionalDatatypeModel != null && !additionalDatatypeModel.isEmpty();
			case Mif2Package.STATIC_MODEL_BASE__DATATYPE_LIMITATION:
				return datatypeLimitation != null && !datatypeLimitation.isEmpty();
			case Mif2Package.STATIC_MODEL_BASE__ADDITIONAL_VOCABULARY_MODEL:
				return additionalVocabularyModel != null && !additionalVocabularyModel.isEmpty();
			case Mif2Package.STATIC_MODEL_BASE__VOCABULARY_LIMITATION:
				return vocabularyLimitation != null && !vocabularyLimitation.isEmpty();
			case Mif2Package.STATIC_MODEL_BASE__SUBJECT_AREA_PACKAGE:
				return subjectAreaPackage != null && !subjectAreaPackage.isEmpty();
			case Mif2Package.STATIC_MODEL_BASE__DEFINITIONAL_CODE:
				return definitionalCode != null && !definitionalCode.isEmpty();
			case Mif2Package.STATIC_MODEL_BASE__CONFORMANCE_LEVEL:
				return isSetConformanceLevel();
			case Mif2Package.STATIC_MODEL_BASE__IS_ABSTRACT:
				return isSetIsAbstract();
			case Mif2Package.STATIC_MODEL_BASE__IS_SERIALIZABLE:
				return isSetIsSerializable();
			case Mif2Package.STATIC_MODEL_BASE__REPRESENTATION_KIND:
				return isSetRepresentationKind();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (conformanceLevel: ");
		if (conformanceLevelESet) result.append(conformanceLevel); else result.append("<unset>");
		result.append(", isAbstract: ");
		if (isAbstractESet) result.append(isAbstract); else result.append("<unset>");
		result.append(", isSerializable: ");
		if (isSerializableESet) result.append(isSerializable); else result.append("<unset>");
		result.append(", representationKind: ");
		if (representationKindESet) result.append(representationKind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StaticModelBaseImpl
