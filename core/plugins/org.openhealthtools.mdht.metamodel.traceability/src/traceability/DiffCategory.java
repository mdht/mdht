/**
 */
package traceability;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link traceability.DiffCategory#getName <em>Name</em>}</li>
 *   <li>{@link traceability.DiffCategory#getDiffs <em>Diffs</em>}</li>
 *   <li>{@link traceability.DiffCategory#getModelIndex <em>Model Index</em>}</li>
 *   <li>{@link traceability.DiffCategory#isUnequal <em>Unequal</em>}</li>
 * </ul>
 * </p>
 *
 * @see traceability.TraceabilityPackage#getDiffCategory()
 * @model
 * @generated
 */
public interface DiffCategory extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see traceability.TraceabilityPackage#getDiffCategory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link traceability.DiffCategory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Diffs</b></em>' containment reference list.
	 * The list contents are of type {@link traceability.TraceDiff}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffs</em>' containment reference list.
	 * @see traceability.TraceabilityPackage#getDiffCategory_Diffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TraceDiff> getDiffs();

	/**
	 * Returns the value of the '<em><b>Model Index</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Index</em>' attribute.
	 * @see #setModelIndex(int)
	 * @see traceability.TraceabilityPackage#getDiffCategory_ModelIndex()
	 * @model default="-1"
	 * @generated
	 */
	int getModelIndex();

	/**
	 * Sets the value of the '{@link traceability.DiffCategory#getModelIndex <em>Model Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Index</em>' attribute.
	 * @see #getModelIndex()
	 * @generated
	 */
	void setModelIndex(int value);

	/**
	 * Returns the value of the '<em><b>Unequal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unequal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unequal</em>' attribute.
	 * @see #setUnequal(boolean)
	 * @see traceability.TraceabilityPackage#getDiffCategory_Unequal()
	 * @model
	 * @generated
	 */
	boolean isUnequal();

	/**
	 * Sets the value of the '{@link traceability.DiffCategory#isUnequal <em>Unequal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unequal</em>' attribute.
	 * @see #isUnequal()
	 * @generated
	 */
	void setUnequal(boolean value);

} // DiffCategory
