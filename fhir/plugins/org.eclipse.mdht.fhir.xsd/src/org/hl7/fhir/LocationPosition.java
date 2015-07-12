/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Details and position information for a physical place where services are provided  and resources and participants may be stored, found, contained or accommodated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.LocationPosition#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link org.hl7.fhir.LocationPosition#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link org.hl7.fhir.LocationPosition#getAltitude <em>Altitude</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getLocationPosition()
 * @model extendedMetaData="name='Location.Position' kind='elementOnly'"
 * @generated
 */
public interface LocationPosition extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Longitude. The value domain and the interpretation are the same as for the text of the longitude element in KML (see notes below).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Longitude</em>' containment reference.
	 * @see #setLongitude(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getLocationPosition_Longitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='longitude' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getLongitude();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.LocationPosition#getLongitude <em>Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' containment reference.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(Decimal value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Latitude. The value domain and the interpretation are the same as for the text of the latitude element in KML (see notes below).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latitude</em>' containment reference.
	 * @see #setLatitude(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getLocationPosition_Latitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='latitude' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getLatitude();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.LocationPosition#getLatitude <em>Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' containment reference.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(Decimal value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Altitude. The value domain and the interpretation are the same as for the text of the altitude element in KML (see notes below).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Altitude</em>' containment reference.
	 * @see #setAltitude(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getLocationPosition_Altitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='altitude' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getAltitude();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.LocationPosition#getAltitude <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' containment reference.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(Decimal value);

} // LocationPosition
