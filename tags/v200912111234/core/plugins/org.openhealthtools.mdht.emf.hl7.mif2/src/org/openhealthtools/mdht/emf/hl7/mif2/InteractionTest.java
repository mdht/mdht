/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a test interaction sent between two systems
 * UML: Part of a complex tag value
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionTest#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionTest#getExampleContent <em>Example Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionTest#getExampleFile <em>Example File</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionTest#getReceivingSystem <em>Receiving System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionTest#getSendingSystem <em>Sending System</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteractionTest()
 * @model extendedMetaData="name='InteractionTest' kind='elementOnly'"
 * @generated
 */
public interface InteractionTest extends TestBase {
	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the interaction being transmitted by this test.
	 * UML: Base interface(s) implemented by the ClassifierRole
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction</em>' containment reference.
	 * @see #setInteraction(PackageOrArtifactRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteractionTest_Interaction()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='interaction' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageOrArtifactRef getInteraction();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionTest#getInteraction <em>Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction</em>' containment reference.
	 * @see #getInteraction()
	 * @generated
	 */
	void setInteraction(PackageOrArtifactRef value);

	/**
	 * Returns the value of the '<em><b>Example Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the actual content that should go over the wire in this test
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Example Content</em>' containment reference.
	 * @see #setExampleContent(ExampleType)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteractionTest_ExampleContent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exampleContent' namespace='##targetNamespace'"
	 * @generated
	 */
	ExampleType getExampleContent();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionTest#getExampleContent <em>Example Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Content</em>' containment reference.
	 * @see #getExampleContent()
	 * @generated
	 */
	void setExampleContent(ExampleType value);

	/**
	 * Returns the value of the '<em><b>Example File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a file which contains the actual content that should go over the wire in this test
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Example File</em>' attribute.
	 * @see #setExampleFile(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteractionTest_ExampleFile()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.LocalFileReference"
	 *        extendedMetaData="kind='attribute' name='exampleFile'"
	 * @generated
	 */
	String getExampleFile();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionTest#getExampleFile <em>Example File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example File</em>' attribute.
	 * @see #getExampleFile()
	 * @generated
	 */
	void setExampleFile(String value);

	/**
	 * Returns the value of the '<em><b>Receiving System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The system in this test responsible for receiving the interaction
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiving System</em>' attribute.
	 * @see #setReceivingSystem(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteractionTest_ReceivingSystem()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName" required="true"
	 *        extendedMetaData="kind='attribute' name='receivingSystem'"
	 * @generated
	 */
	String getReceivingSystem();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionTest#getReceivingSystem <em>Receiving System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiving System</em>' attribute.
	 * @see #getReceivingSystem()
	 * @generated
	 */
	void setReceivingSystem(String value);

	/**
	 * Returns the value of the '<em><b>Sending System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The system in this test responsible for sending the interaction
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sending System</em>' attribute.
	 * @see #setSendingSystem(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getInteractionTest_SendingSystem()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName" required="true"
	 *        extendedMetaData="kind='attribute' name='sendingSystem'"
	 * @generated
	 */
	String getSendingSystem();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionTest#getSendingSystem <em>Sending System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sending System</em>' attribute.
	 * @see #getSendingSystem()
	 * @generated
	 */
	void setSendingSystem(String value);

} // InteractionTest
