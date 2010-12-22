/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.emf.w3c.xhtml.Img;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Model Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Basic content for defining static models and subject areas
 * UML: StaticModel stereotype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getGraphicRepresentation <em>Graphic Representation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getHasDerivations <em>Has Derivations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getImportedDatatypeModelPackage <em>Imported Datatype Model Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getImportedVocabularyModelPackage <em>Imported Vocabulary Model Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getImportedCommonModelElementPackage <em>Imported Common Model Element Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getImportedStubPackage <em>Imported Stub Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getImportAnnotationLibrary <em>Import Annotation Library</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getAdditionalDatatypeModel <em>Additional Datatype Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getDatatypeLimitation <em>Datatype Limitation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getAdditionalVocabularyModel <em>Additional Vocabulary Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getVocabularyLimitation <em>Vocabulary Limitation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getSubjectAreaPackage <em>Subject Area Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getDefinitionalCode <em>Definitional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getConformanceLevel <em>Conformance Level</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#isIsSerializable <em>Is Serializable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getRepresentationKind <em>Representation Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelBase()
 * @model extendedMetaData="name='StaticModelBase' kind='elementOnly'"
 * @generated
 */
public interface StaticModelBase extends SubSystem {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the containing element.
	 * UML: A collector for the comments and constraints associated with a static model package.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(StaticModelAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelBase_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	StaticModelAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(StaticModelAnnotations value);

	/**
	 * Returns the value of the '<em><b>Graphic Representation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.StaticPackageDiagramGraphicInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the display shape(s) associated with the static package
	 * UML: association from ModelElement to SemanticModelBridge for a diagram
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graphic Representation</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelBase_GraphicRepresentation()
	 * @model containment="true" upper="2"
	 *        extendedMetaData="kind='element' name='graphicRepresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StaticPackageDiagramGraphicInformation> getGraphicRepresentation();

	/**
	 * Returns the value of the '<em><b>Figure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A graphical representation of the classes in a static package model.
	 * UML: figure tag on StaticPackage stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Figure</em>' containment reference.
	 * @see #setFigure(Img)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelBase_Figure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='figure' namespace='##targetNamespace'"
	 * @generated
	 */
	Img getFigure();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getFigure <em>Figure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Figure</em>' containment reference.
	 * @see #getFigure()
	 * @generated
	 */
	void setFigure(Img value);

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelDerivation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies static models from which the current model is derived
	 * UML: supplier association from ModelElement to Derivation stereotype on Dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived From</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelBase_DerivedFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derivedFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StaticModelDerivation> getDerivedFrom();

	/**
	 * Returns the value of the '<em><b>Has Derivations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies static models derived from the current model
	 * UML: client association from ModelElement to Derivation stereotype on Dependency
	 * Derivation: Todo
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Has Derivations</em>' containment reference.
	 * @see #setHasDerivations(StaticModelDerivationSource)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelBase_HasDerivations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hasDerivations' namespace='##targetNamespace'"
	 * @generated
	 */
	StaticModelDerivationSource getHasDerivations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getHasDerivations <em>Has Derivations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Derivations</em>' containment reference.
	 * @see #getHasDerivations()
	 * @generated
	 */
	void setHasDerivations(StaticModelDerivationSource value);

	/**
	 * Returns the value of the '<em><b>Imported Datatype Model Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The datatype model that is used by this model
	 * UML: A package that is imported into the current data model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Datatype Model Package</em>' containment reference.
	 * @see #setImportedDatatypeModelPackage(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelBase_ImportedDatatypeModelPackage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='importedDatatypeModelPackage' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getImportedDatatypeModelPackage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getImportedDatatypeModelPackage <em>Imported Datatype Model Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Datatype Model Package</em>' containment reference.
	 * @see #getImportedDatatypeModelPackage()
	 * @generated
	 */
	void setImportedDatatypeModelPackage(PackageRef value);

	/**
	 * Returns the value of the '<em><b>Imported Vocabulary Model Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The vocabulary model that is used by this model
	 * UML: A package that is imported into the current data model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Vocabulary Model Package</em>' containment reference.
	 * @see #setImportedVocabularyModelPackage(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelBase_ImportedVocabularyModelPackage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='importedVocabularyModelPackage' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getImportedVocabularyModelPackage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getImportedVocabularyModelPackage <em>Imported Vocabulary Model Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Vocabulary Model Package</em>' containment reference.
	 * @see #getImportedVocabularyModelPackage()
	 * @generated
	 */
	void setImportedVocabularyModelPackage(PackageRef value);

	/**
	 * Returns the value of the '<em><b>Imported Common Model Element Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CMET model that is used by this model
	 * UML: A package that is imported into the current data model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Common Model Element Package</em>' containment reference.
	 * @see #setImportedCommonModelElementPackage(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelBase_ImportedCommonModelElementPackage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='importedCommonModelElementPackage' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getImportedCommonModelElementPackage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getImportedCommonModelElementPackage <em>Imported Common Model Element Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Common Model Element Package</em>' containment reference.
	 * @see #getImportedCommonModelElementPackage()
	 * @generated
	 */
	void setImportedCommonModelElementPackage(PackageRef value);

	/**
	 * Returns the value of the '<em><b>Imported Stub Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The stub set that is used by this model
	 * UML: A package that is imported into the current data model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Stub Package</em>' containment reference.
	 * @see #setImportedStubPackage(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelBase_ImportedStubPackage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='importedStubPackage' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getImportedStubPackage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getImportedStubPackage <em>Imported Stub Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Stub Package</em>' containment reference.
	 * @see #getImportedStubPackage()
	 * @generated
	 */
	void setImportedStubPackage(PackageRef value);

	/**
	 * Returns the value of the '<em><b>Import Annotation Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the annotation library that is used to supplement the annotations defined in this model.  Annotations in this model with no 'cascade' information take precedence over annotations defined in the annoation library
	 * UML: AnnotationLibrary package that is imported into the model package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Import Annotation Library</em>' containment reference.
	 * @see #setImportAnnotationLibrary(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelBase_ImportAnnotationLibrary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='importAnnotationLibrary' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getImportAnnotationLibrary();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getImportAnnotationLibrary <em>Import Annotation Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Annotation Library</em>' containment reference.
	 * @see #getImportAnnotationLibrary()
	 * @generated
	 */
	void setImportAnnotationLibrary(PackageRef value);

	/**
	 * Returns the value of the '<em><b>Additional Datatype Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeModelLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies any additional datatype flavors required to express limitations in ability to express datatypes
	 * UML: Datatypes used by Classes within the models used by this artifact
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Datatype Model</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelBase_AdditionalDatatypeModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalDatatypeModel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatatypeModelLibrary> getAdditionalDatatypeModel();

	/**
	 * Returns the value of the '<em><b>Datatype Limitation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeLimitation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates datatypes not fully supported and what the limitations on those datatypes are.  Cascades through all static models supported by this element.
	 * UML: Tag on ConformanceProfile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datatype Limitation</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelBase_DatatypeLimitation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='datatypeLimitation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatatypeLimitation> getDatatypeLimitation();

	/**
	 * Returns the value of the '<em><b>Additional Vocabulary Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies any additional tables, domains, valuesets or bindings required to express limitations in ability to express datatypes
	 * UML: VocabularyDependencies of attributes and datatype properties within the models used by this artifact
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Vocabulary Model</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelBase_AdditionalVocabularyModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalVocabularyModel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VocabularyModel> getAdditionalVocabularyModel();

	/**
	 * Returns the value of the '<em><b>Vocabulary Limitation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyLimitation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates domains, valuesets and code systems not fully supported and what the limitations on those vocabulary elements are.  Cascades through all static models supported by this element.
	 * UML: Tag on ConformanceProfile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vocabulary Limitation</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelBase_VocabularyLimitation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vocabularyLimitation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VocabularyLimitation> getVocabularyLimitation();

	/**
	 * Returns the value of the '<em><b>Subject Area Package</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.SubjectAreaPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a 'sub-package' owned by the current static package.  All classes within the 'sub-packages' are always imported into their parent static package.  This means the names of all classes within a static package must be unique.  Graphically it represents a grouping of classes that may be represented on a separate page.
	 * UML: SubjectAreaPackage stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Area Package</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelBase_SubjectAreaPackage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subjectAreaPackage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubjectAreaPackage> getSubjectAreaPackage();

	/**
	 * Returns the value of the '<em><b>Definitional Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a concept which the static model represents or defines.  E.g. A template that 'defines' the concept of blood-pressure.
	 * UML: A tag on the HL7StaticModel
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definitional Code</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelBase_DefinitionalCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definitionalCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VocabularyCodeRef> getDefinitionalCode();

	/**
	 * Returns the value of the '<em><b>Conformance Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.ModelConformanceKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates what sort of conformance rules to enforce on the model
	 * UML: A tag on HL7StaticModel
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conformance Level</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ModelConformanceKind
	 * @see #isSetConformanceLevel()
	 * @see #unsetConformanceLevel()
	 * @see #setConformanceLevel(ModelConformanceKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelBase_ConformanceLevel()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='conformanceLevel'"
	 * @generated
	 */
	ModelConformanceKind getConformanceLevel();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getConformanceLevel <em>Conformance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance Level</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ModelConformanceKind
	 * @see #isSetConformanceLevel()
	 * @see #unsetConformanceLevel()
	 * @see #getConformanceLevel()
	 * @generated
	 */
	void setConformanceLevel(ModelConformanceKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getConformanceLevel <em>Conformance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConformanceLevel()
	 * @see #getConformanceLevel()
	 * @see #setConformanceLevel(ModelConformanceKind)
	 * @generated
	 */
	void unsetConformanceLevel();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getConformanceLevel <em>Conformance Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conformance Level</em>' attribute is set.
	 * @see #unsetConformanceLevel()
	 * @see #getConformanceLevel()
	 * @see #setConformanceLevel(ModelConformanceKind)
	 * @generated
	 */
	boolean isSetConformanceLevel();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the specified element is not intended to appear directly in an instance.  Only derivations of the element may appear.
	 * UML: inherited from GeneralizableElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #isSetIsAbstract()
	 * @see #unsetIsAbstract()
	 * @see #setIsAbstract(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelBase_IsAbstract()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isAbstract'"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isSetIsAbstract()
	 * @see #unsetIsAbstract()
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsAbstract()
	 * @see #isIsAbstract()
	 * @see #setIsAbstract(boolean)
	 * @generated
	 */
	void unsetIsAbstract();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#isIsAbstract <em>Is Abstract</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Abstract</em>' attribute is set.
	 * @see #unsetIsAbstract()
	 * @see #isIsAbstract()
	 * @see #setIsAbstract(boolean)
	 * @generated
	 */
	boolean isSetIsAbstract();

	/**
	 * Returns the value of the '<em><b>Is Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies whether this model can be represented in a serialized form.
	 * UML: isSerializable tag on staticModel stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Serializable</em>' attribute.
	 * @see #isSetIsSerializable()
	 * @see #unsetIsSerializable()
	 * @see #setIsSerializable(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelBase_IsSerializable()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='isSerializable'"
	 * @generated
	 */
	boolean isIsSerializable();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#isIsSerializable <em>Is Serializable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Serializable</em>' attribute.
	 * @see #isSetIsSerializable()
	 * @see #unsetIsSerializable()
	 * @see #isIsSerializable()
	 * @generated
	 */
	void setIsSerializable(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#isIsSerializable <em>Is Serializable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsSerializable()
	 * @see #isIsSerializable()
	 * @see #setIsSerializable(boolean)
	 * @generated
	 */
	void unsetIsSerializable();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#isIsSerializable <em>Is Serializable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Serializable</em>' attribute is set.
	 * @see #unsetIsSerializable()
	 * @see #isIsSerializable()
	 * @see #setIsSerializable(boolean)
	 * @generated
	 */
	boolean isSetIsSerializable();

	/**
	 * Returns the value of the '<em><b>Representation Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelRepresentationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies whether the model is represented in its flat or serializable form.
	 * UML: Not exposed.  All models will be represented in UML as 'flat'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Representation Kind</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticModelRepresentationKind
	 * @see #isSetRepresentationKind()
	 * @see #unsetRepresentationKind()
	 * @see #setRepresentationKind(StaticModelRepresentationKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getStaticModelBase_RepresentationKind()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='representationKind'"
	 * @generated
	 */
	StaticModelRepresentationKind getRepresentationKind();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getRepresentationKind <em>Representation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation Kind</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticModelRepresentationKind
	 * @see #isSetRepresentationKind()
	 * @see #unsetRepresentationKind()
	 * @see #getRepresentationKind()
	 * @generated
	 */
	void setRepresentationKind(StaticModelRepresentationKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getRepresentationKind <em>Representation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepresentationKind()
	 * @see #getRepresentationKind()
	 * @see #setRepresentationKind(StaticModelRepresentationKind)
	 * @generated
	 */
	void unsetRepresentationKind();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase#getRepresentationKind <em>Representation Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Representation Kind</em>' attribute is set.
	 * @see #unsetRepresentationKind()
	 * @see #getRepresentationKind()
	 * @see #setRepresentationKind(StaticModelRepresentationKind)
	 * @generated
	 */
	boolean isSetRepresentationKind();

} // StaticModelBase
