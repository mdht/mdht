/**
 */
package traceability;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see traceability.TraceabilityFactory
 * @model kind="package"
 * @generated
 */
public interface TraceabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "traceability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ns.electronichealth.net.au/ci/metamodel/traceability";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "trc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraceabilityPackage eINSTANCE = traceability.impl.TraceabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link traceability.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see traceability.impl.TraceImpl
	 * @see traceability.impl.TraceabilityPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__CHILDREN = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__PARENT = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__VALUE = 5;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__COMMENT = 6;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__COMMENTS = 7;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link traceability.impl.LogEntryImpl <em>Log Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see traceability.impl.LogEntryImpl
	 * @see traceability.impl.TraceabilityPackageImpl#getLogEntry()
	 * @generated
	 */
	int LOG_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY__PARTICIPANTS = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY__SEVERITY = 2;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY__MESSAGE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY__COMMENT = 4;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY__COMMENTS = 5;

	/**
	 * The number of structural features of the '<em>Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link traceability.impl.TracesImpl <em>Traces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see traceability.impl.TracesImpl
	 * @see traceability.impl.TraceabilityPackageImpl#getTraces()
	 * @generated
	 */
	int TRACES = 2;

	/**
	 * The feature id for the '<em><b>Original Source URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACES__ORIGINAL_SOURCE_URL = 0;

	/**
	 * The feature id for the '<em><b>Source Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACES__SOURCE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Target Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACES__TARGET_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACES__USERNAME = 3;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACES__FULL_NAME = 4;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACES__DATE = 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACES__LOCATION = 6;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACES__COMMENTS = 7;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACES__TRACES = 8;

	/**
	 * The feature id for the '<em><b>Uri Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACES__URI_MAP = 9;

	/**
	 * The number of structural features of the '<em>Traces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACES_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Traces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACES_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link traceability.impl.TraceDiffImpl <em>Trace Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see traceability.impl.TraceDiffImpl
	 * @see traceability.impl.TraceabilityPackageImpl#getTraceDiff()
	 * @generated
	 */
	int TRACE_DIFF = 3;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DIFF__PARTICIPANTS = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DIFF__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DIFF__COMMENTS = 2;

	/**
	 * The number of structural features of the '<em>Trace Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DIFF_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Trace Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DIFF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link traceability.impl.DiffCategoryImpl <em>Diff Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see traceability.impl.DiffCategoryImpl
	 * @see traceability.impl.TraceabilityPackageImpl#getDiffCategory()
	 * @generated
	 */
	int DIFF_CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Diffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CATEGORY__DIFFS = 1;

	/**
	 * The feature id for the '<em><b>Model Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CATEGORY__MODEL_INDEX = 2;

	/**
	 * The feature id for the '<em><b>Unequal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CATEGORY__UNEQUAL = 3;

	/**
	 * The number of structural features of the '<em>Diff Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CATEGORY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Diff Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CATEGORY_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link traceability.impl.TraceDiffsImpl <em>Trace Diffs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see traceability.impl.TraceDiffsImpl
	 * @see traceability.impl.TraceabilityPackageImpl#getTraceDiffs()
	 * @generated
	 */
	int TRACE_DIFFS = 5;

	/**
	 * The feature id for the '<em><b>Compared Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DIFFS__COMPARED_TRACES = 0;

	/**
	 * The number of structural features of the '<em>Trace Diffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DIFFS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trace Diffs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DIFFS_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link traceability.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see traceability.impl.CategoryImpl
	 * @see traceability.impl.TraceabilityPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CONTENTS = 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link traceability.impl.TraceCommentImpl <em>Trace Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see traceability.impl.TraceCommentImpl
	 * @see traceability.impl.TraceabilityPackageImpl#getTraceComment()
	 * @generated
	 */
	int TRACE_COMMENT = 7;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMMENT__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMMENT__USERNAME = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMMENT__DATE = 2;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMMENT__COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Narrow Down</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMMENT__NARROW_DOWN = 4;

	/**
	 * The number of structural features of the '<em>Trace Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Trace Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_COMMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link traceability.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see traceability.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the reference list '{@link traceability.Trace#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see traceability.Trace#getSource()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Source();

	/**
	 * Returns the meta object for the reference list '{@link traceability.Trace#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see traceability.Trace#getTarget()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Target();

	/**
	 * Returns the meta object for the attribute '{@link traceability.Trace#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see traceability.Trace#getDescription()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link traceability.Trace#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see traceability.Trace#getChildren()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Children();

	/**
	 * Returns the meta object for the container reference '{@link traceability.Trace#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see traceability.Trace#getParent()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Parent();

	/**
	 * Returns the meta object for the attribute '{@link traceability.Trace#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see traceability.Trace#getValue()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_Value();

	/**
	 * Returns the meta object for the attribute '{@link traceability.Trace#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see traceability.Trace#getComment()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link traceability.Trace#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see traceability.Trace#getComments()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Comments();

	/**
	 * Returns the meta object for class '{@link traceability.LogEntry <em>Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Entry</em>'.
	 * @see traceability.LogEntry
	 * @generated
	 */
	EClass getLogEntry();

	/**
	 * Returns the meta object for the reference list '{@link traceability.LogEntry#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participants</em>'.
	 * @see traceability.LogEntry#getParticipants()
	 * @see #getLogEntry()
	 * @generated
	 */
	EReference getLogEntry_Participants();

	/**
	 * Returns the meta object for the attribute '{@link traceability.LogEntry#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see traceability.LogEntry#getMessage()
	 * @see #getLogEntry()
	 * @generated
	 */
	EAttribute getLogEntry_Message();

	/**
	 * Returns the meta object for the attribute '{@link traceability.LogEntry#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see traceability.LogEntry#getSeverity()
	 * @see #getLogEntry()
	 * @generated
	 */
	EAttribute getLogEntry_Severity();

	/**
	 * Returns the meta object for the attribute '{@link traceability.LogEntry#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see traceability.LogEntry#getMessageType()
	 * @see #getLogEntry()
	 * @generated
	 */
	EAttribute getLogEntry_MessageType();

	/**
	 * Returns the meta object for the attribute '{@link traceability.LogEntry#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see traceability.LogEntry#getComment()
	 * @see #getLogEntry()
	 * @generated
	 */
	EAttribute getLogEntry_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link traceability.LogEntry#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see traceability.LogEntry#getComments()
	 * @see #getLogEntry()
	 * @generated
	 */
	EReference getLogEntry_Comments();

	/**
	 * Returns the meta object for class '{@link traceability.Traces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traces</em>'.
	 * @see traceability.Traces
	 * @generated
	 */
	EClass getTraces();

	/**
	 * Returns the meta object for the attribute '{@link traceability.Traces#getOriginalSourceURL <em>Original Source URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original Source URL</em>'.
	 * @see traceability.Traces#getOriginalSourceURL()
	 * @see #getTraces()
	 * @generated
	 */
	EAttribute getTraces_OriginalSourceURL();

	/**
	 * Returns the meta object for the reference '{@link traceability.Traces#getSourceModel <em>Source Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Model</em>'.
	 * @see traceability.Traces#getSourceModel()
	 * @see #getTraces()
	 * @generated
	 */
	EReference getTraces_SourceModel();

	/**
	 * Returns the meta object for the reference '{@link traceability.Traces#getTargetModel <em>Target Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Model</em>'.
	 * @see traceability.Traces#getTargetModel()
	 * @see #getTraces()
	 * @generated
	 */
	EReference getTraces_TargetModel();

	/**
	 * Returns the meta object for the attribute '{@link traceability.Traces#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see traceability.Traces#getUsername()
	 * @see #getTraces()
	 * @generated
	 */
	EAttribute getTraces_Username();

	/**
	 * Returns the meta object for the attribute '{@link traceability.Traces#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see traceability.Traces#getFullName()
	 * @see #getTraces()
	 * @generated
	 */
	EAttribute getTraces_FullName();

	/**
	 * Returns the meta object for the attribute '{@link traceability.Traces#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see traceability.Traces#getDate()
	 * @see #getTraces()
	 * @generated
	 */
	EAttribute getTraces_Date();

	/**
	 * Returns the meta object for the attribute '{@link traceability.Traces#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see traceability.Traces#getLocation()
	 * @see #getTraces()
	 * @generated
	 */
	EAttribute getTraces_Location();

	/**
	 * Returns the meta object for the attribute '{@link traceability.Traces#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see traceability.Traces#getComments()
	 * @see #getTraces()
	 * @generated
	 */
	EAttribute getTraces_Comments();

	/**
	 * Returns the meta object for the containment reference list '{@link traceability.Traces#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Traces</em>'.
	 * @see traceability.Traces#getTraces()
	 * @see #getTraces()
	 * @generated
	 */
	EReference getTraces_Traces();

	/**
	 * Returns the meta object for the attribute '{@link traceability.Traces#getUriMap <em>Uri Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Map</em>'.
	 * @see traceability.Traces#getUriMap()
	 * @see #getTraces()
	 * @generated
	 */
	EAttribute getTraces_UriMap();

	/**
	 * Returns the meta object for class '{@link traceability.TraceDiff <em>Trace Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Diff</em>'.
	 * @see traceability.TraceDiff
	 * @generated
	 */
	EClass getTraceDiff();

	/**
	 * Returns the meta object for the reference list '{@link traceability.TraceDiff#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participants</em>'.
	 * @see traceability.TraceDiff#getParticipants()
	 * @see #getTraceDiff()
	 * @generated
	 */
	EReference getTraceDiff_Participants();

	/**
	 * Returns the meta object for the attribute '{@link traceability.TraceDiff#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see traceability.TraceDiff#getComment()
	 * @see #getTraceDiff()
	 * @generated
	 */
	EAttribute getTraceDiff_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link traceability.TraceDiff#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see traceability.TraceDiff#getComments()
	 * @see #getTraceDiff()
	 * @generated
	 */
	EReference getTraceDiff_Comments();

	/**
	 * Returns the meta object for class '{@link traceability.DiffCategory <em>Diff Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Category</em>'.
	 * @see traceability.DiffCategory
	 * @generated
	 */
	EClass getDiffCategory();

	/**
	 * Returns the meta object for the attribute '{@link traceability.DiffCategory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see traceability.DiffCategory#getName()
	 * @see #getDiffCategory()
	 * @generated
	 */
	EAttribute getDiffCategory_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link traceability.DiffCategory#getDiffs <em>Diffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffs</em>'.
	 * @see traceability.DiffCategory#getDiffs()
	 * @see #getDiffCategory()
	 * @generated
	 */
	EReference getDiffCategory_Diffs();

	/**
	 * Returns the meta object for the attribute '{@link traceability.DiffCategory#getModelIndex <em>Model Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Index</em>'.
	 * @see traceability.DiffCategory#getModelIndex()
	 * @see #getDiffCategory()
	 * @generated
	 */
	EAttribute getDiffCategory_ModelIndex();

	/**
	 * Returns the meta object for the attribute '{@link traceability.DiffCategory#isUnequal <em>Unequal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unequal</em>'.
	 * @see traceability.DiffCategory#isUnequal()
	 * @see #getDiffCategory()
	 * @generated
	 */
	EAttribute getDiffCategory_Unequal();

	/**
	 * Returns the meta object for class '{@link traceability.TraceDiffs <em>Trace Diffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Diffs</em>'.
	 * @see traceability.TraceDiffs
	 * @generated
	 */
	EClass getTraceDiffs();

	/**
	 * Returns the meta object for the reference list '{@link traceability.TraceDiffs#getComparedTraces <em>Compared Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compared Traces</em>'.
	 * @see traceability.TraceDiffs#getComparedTraces()
	 * @see #getTraceDiffs()
	 * @generated
	 */
	EReference getTraceDiffs_ComparedTraces();

	/**
	 * Returns the meta object for class '{@link traceability.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see traceability.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link traceability.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see traceability.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link traceability.Category#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see traceability.Category#getContents()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Contents();

	/**
	 * Returns the meta object for class '{@link traceability.TraceComment <em>Trace Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Comment</em>'.
	 * @see traceability.TraceComment
	 * @generated
	 */
	EClass getTraceComment();

	/**
	 * Returns the meta object for the attribute '{@link traceability.TraceComment#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see traceability.TraceComment#getComment()
	 * @see #getTraceComment()
	 * @generated
	 */
	EAttribute getTraceComment_Comment();

	/**
	 * Returns the meta object for the attribute '{@link traceability.TraceComment#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see traceability.TraceComment#getUsername()
	 * @see #getTraceComment()
	 * @generated
	 */
	EAttribute getTraceComment_Username();

	/**
	 * Returns the meta object for the attribute '{@link traceability.TraceComment#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see traceability.TraceComment#getDate()
	 * @see #getTraceComment()
	 * @generated
	 */
	EAttribute getTraceComment_Date();

	/**
	 * Returns the meta object for the attribute '{@link traceability.TraceComment#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see traceability.TraceComment#getColumn()
	 * @see #getTraceComment()
	 * @generated
	 */
	EAttribute getTraceComment_Column();

	/**
	 * Returns the meta object for the reference '{@link traceability.TraceComment#getNarrowDown <em>Narrow Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Narrow Down</em>'.
	 * @see traceability.TraceComment#getNarrowDown()
	 * @see #getTraceComment()
	 * @generated
	 */
	EReference getTraceComment_NarrowDown();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraceabilityFactory getTraceabilityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link traceability.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see traceability.impl.TraceImpl
		 * @see traceability.impl.TraceabilityPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__SOURCE = eINSTANCE.getTrace_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__TARGET = eINSTANCE.getTrace_Target();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE__DESCRIPTION = eINSTANCE.getTrace_Description();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__CHILDREN = eINSTANCE.getTrace_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__PARENT = eINSTANCE.getTrace_Parent();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE__VALUE = eINSTANCE.getTrace_Value();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE__COMMENT = eINSTANCE.getTrace_Comment();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__COMMENTS = eINSTANCE.getTrace_Comments();

		/**
		 * The meta object literal for the '{@link traceability.impl.LogEntryImpl <em>Log Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see traceability.impl.LogEntryImpl
		 * @see traceability.impl.TraceabilityPackageImpl#getLogEntry()
		 * @generated
		 */
		EClass LOG_ENTRY = eINSTANCE.getLogEntry();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_ENTRY__PARTICIPANTS = eINSTANCE.getLogEntry_Participants();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_ENTRY__MESSAGE = eINSTANCE.getLogEntry_Message();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_ENTRY__SEVERITY = eINSTANCE.getLogEntry_Severity();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_ENTRY__MESSAGE_TYPE = eINSTANCE.getLogEntry_MessageType();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_ENTRY__COMMENT = eINSTANCE.getLogEntry_Comment();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_ENTRY__COMMENTS = eINSTANCE.getLogEntry_Comments();

		/**
		 * The meta object literal for the '{@link traceability.impl.TracesImpl <em>Traces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see traceability.impl.TracesImpl
		 * @see traceability.impl.TraceabilityPackageImpl#getTraces()
		 * @generated
		 */
		EClass TRACES = eINSTANCE.getTraces();

		/**
		 * The meta object literal for the '<em><b>Original Source URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACES__ORIGINAL_SOURCE_URL = eINSTANCE.getTraces_OriginalSourceURL();

		/**
		 * The meta object literal for the '<em><b>Source Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACES__SOURCE_MODEL = eINSTANCE.getTraces_SourceModel();

		/**
		 * The meta object literal for the '<em><b>Target Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACES__TARGET_MODEL = eINSTANCE.getTraces_TargetModel();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACES__USERNAME = eINSTANCE.getTraces_Username();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACES__FULL_NAME = eINSTANCE.getTraces_FullName();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACES__DATE = eINSTANCE.getTraces_Date();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACES__LOCATION = eINSTANCE.getTraces_Location();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACES__COMMENTS = eINSTANCE.getTraces_Comments();

		/**
		 * The meta object literal for the '<em><b>Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACES__TRACES = eINSTANCE.getTraces_Traces();

		/**
		 * The meta object literal for the '<em><b>Uri Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACES__URI_MAP = eINSTANCE.getTraces_UriMap();

		/**
		 * The meta object literal for the '{@link traceability.impl.TraceDiffImpl <em>Trace Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see traceability.impl.TraceDiffImpl
		 * @see traceability.impl.TraceabilityPackageImpl#getTraceDiff()
		 * @generated
		 */
		EClass TRACE_DIFF = eINSTANCE.getTraceDiff();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_DIFF__PARTICIPANTS = eINSTANCE.getTraceDiff_Participants();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_DIFF__COMMENT = eINSTANCE.getTraceDiff_Comment();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_DIFF__COMMENTS = eINSTANCE.getTraceDiff_Comments();

		/**
		 * The meta object literal for the '{@link traceability.impl.DiffCategoryImpl <em>Diff Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see traceability.impl.DiffCategoryImpl
		 * @see traceability.impl.TraceabilityPackageImpl#getDiffCategory()
		 * @generated
		 */
		EClass DIFF_CATEGORY = eINSTANCE.getDiffCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_CATEGORY__NAME = eINSTANCE.getDiffCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Diffs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_CATEGORY__DIFFS = eINSTANCE.getDiffCategory_Diffs();

		/**
		 * The meta object literal for the '<em><b>Model Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_CATEGORY__MODEL_INDEX = eINSTANCE.getDiffCategory_ModelIndex();

		/**
		 * The meta object literal for the '<em><b>Unequal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_CATEGORY__UNEQUAL = eINSTANCE.getDiffCategory_Unequal();

		/**
		 * The meta object literal for the '{@link traceability.impl.TraceDiffsImpl <em>Trace Diffs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see traceability.impl.TraceDiffsImpl
		 * @see traceability.impl.TraceabilityPackageImpl#getTraceDiffs()
		 * @generated
		 */
		EClass TRACE_DIFFS = eINSTANCE.getTraceDiffs();

		/**
		 * The meta object literal for the '<em><b>Compared Traces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_DIFFS__COMPARED_TRACES = eINSTANCE.getTraceDiffs_ComparedTraces();

		/**
		 * The meta object literal for the '{@link traceability.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see traceability.impl.CategoryImpl
		 * @see traceability.impl.TraceabilityPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__CONTENTS = eINSTANCE.getCategory_Contents();

		/**
		 * The meta object literal for the '{@link traceability.impl.TraceCommentImpl <em>Trace Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see traceability.impl.TraceCommentImpl
		 * @see traceability.impl.TraceabilityPackageImpl#getTraceComment()
		 * @generated
		 */
		EClass TRACE_COMMENT = eINSTANCE.getTraceComment();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_COMMENT__COMMENT = eINSTANCE.getTraceComment_Comment();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_COMMENT__USERNAME = eINSTANCE.getTraceComment_Username();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_COMMENT__DATE = eINSTANCE.getTraceComment_Date();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_COMMENT__COLUMN = eINSTANCE.getTraceComment_Column();

		/**
		 * The meta object literal for the '<em><b>Narrow Down</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_COMMENT__NARROW_DOWN = eINSTANCE.getTraceComment_NarrowDown();

	}

} //TraceabilityPackage
