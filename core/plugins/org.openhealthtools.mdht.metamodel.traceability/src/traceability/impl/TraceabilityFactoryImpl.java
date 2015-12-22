/**
 */
package traceability.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import traceability.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceabilityFactoryImpl extends EFactoryImpl implements TraceabilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TraceabilityFactory init() {
		try {
			TraceabilityFactory theTraceabilityFactory = (TraceabilityFactory)EPackage.Registry.INSTANCE.getEFactory(TraceabilityPackage.eNS_URI);
			if (theTraceabilityFactory != null) {
				return theTraceabilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TraceabilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TraceabilityPackage.TRACE: return createTrace();
			case TraceabilityPackage.LOG_ENTRY: return createLogEntry();
			case TraceabilityPackage.TRACES: return createTraces();
			case TraceabilityPackage.TRACE_DIFF: return createTraceDiff();
			case TraceabilityPackage.DIFF_CATEGORY: return createDiffCategory();
			case TraceabilityPackage.TRACE_DIFFS: return createTraceDiffs();
			case TraceabilityPackage.CATEGORY: return createCategory();
			case TraceabilityPackage.TRACE_COMMENT: return createTraceComment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogEntry createLogEntry() {
		LogEntryImpl logEntry = new LogEntryImpl();
		return logEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Traces createTraces() {
		TracesImpl traces = new TracesImpl();
		return traces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceDiff createTraceDiff() {
		TraceDiffImpl traceDiff = new TraceDiffImpl();
		return traceDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffCategory createDiffCategory() {
		DiffCategoryImpl diffCategory = new DiffCategoryImpl();
		return diffCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceDiffs createTraceDiffs() {
		TraceDiffsImpl traceDiffs = new TraceDiffsImpl();
		return traceDiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceComment createTraceComment() {
		TraceCommentImpl traceComment = new TraceCommentImpl();
		return traceComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityPackage getTraceabilityPackage() {
		return (TraceabilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TraceabilityPackage getPackage() {
		return TraceabilityPackage.eINSTANCE;
	}

} //TraceabilityFactoryImpl
