/**
 */
package traceability;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Diffs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link traceability.TraceDiffs#getComparedTraces <em>Compared Traces</em>}</li>
 * </ul>
 * </p>
 *
 * @see traceability.TraceabilityPackage#getTraceDiffs()
 * @model
 * @generated
 */
public interface TraceDiffs extends EObject {
	/**
	 * Returns the value of the '<em><b>Compared Traces</b></em>' reference list.
	 * The list contents are of type {@link traceability.Traces}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compared Traces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compared Traces</em>' reference list.
	 * @see traceability.TraceabilityPackage#getTraceDiffs_ComparedTraces()
	 * @model
	 * @generated
	 */
	EList<Traces> getComparedTraces();

} // TraceDiffs
