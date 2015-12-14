/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package traceability.presentation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import traceability.LogEntry;
import traceability.Trace;
import traceability.TraceDiff;
import traceability.Traces;
import traceability.presentation.table.TraceabilityViewer;
import traceability.util.TraceabilityUtils;

/**
 * This class reads in the traces and establishes forward and backward links between the traced elements.
 */
public class Tracing {

	/**
	 * The elements in this array define the rows in the trace matrix; usually, the rows get filtered later on in the specific traceability matrix views
	 */
	public List<Object> rows = new ArrayList<Object>();

	/**
	 * Map can be used to navigate traced elements from left to right in the row of a table
	 */
	public Map<EObject, EObject> forward = new HashMap<EObject, EObject>();

	/**
	 * Map can be used to navigate traced elements from right to left in the row of a table
	 */
	public Map<EObject, EObject> backward = new HashMap<EObject, EObject>();

	/**
	 * Stores the TraceDiff instance for traced model elements
	 */
	public Map<EObject, TraceDiff> diffOfElement = new HashMap<EObject, TraceDiff>();

	/**
	 * Stores the Trace instance for traced model elements
	 */
	Map<EObject, Trace> traceOfElement = new HashMap<EObject, Trace>();

	/**
	 * The source models collected over all Traces instances
	 */
	public List<EObject> sourceModels = new ArrayList<EObject>();

	/**
	 * The target models corresponding to the sourceModels. As the target model maybe not set for a source model, the corresponding items of this array are <code>null</code>
	 */
	public List<EObject> targetModels = new ArrayList<EObject>();

	/**
	 * Stores all errors associated with a traced model element
	 */
	public Map<EObject, List<LogEntry>> errors = new HashMap<EObject, List<LogEntry>>();

	/**
	 * Partial reverse of <code>errors</code>
	 */
	public Map<LogEntry, EObject> errorsRev = new HashMap<LogEntry, EObject>();

	/**
	 * All traced model elements
	 */
	public Set<EObject> traced = new HashSet<EObject>();

	private TraceDiff traceDiff;

	/**
	 * The resource of the trace model
	 */
	private Resource resource;

	public Map<EObject, EObject> modelOfElement = new HashMap<EObject, EObject>();

	public Tracing(Resource resource) {
		this.resource = resource;
		insertTraces();
	}

	public Tracing() {
	}

	/**
	 * Evaluates all traces/errors or the trace resource
	 * 
	 * @param resource
	 */
	protected void insertTraces() {

		TreeIterator<EObject> it = EcoreUtil.getAllContents(resource, true);
		while (it.hasNext()) {
			EObject eobject = it.next();
			if (eobject instanceof TraceDiff) {
				traceDiff = (TraceDiff) eobject;
				for (EObject participant : traceDiff.getParticipants()) {
					insertTraces(participant);
				}
			}
			insertTraces(eobject);
		}

		for (EObject eObject : backward.keySet()) {
			if (forward.get(backward.get(eObject)) == eObject) {
				if (rows.remove(eObject)) {
					System.err.println("Removed " + eObject);
				}
			}
		}

		it = EcoreUtil.getAllContents(resource, true);
		while (it.hasNext()) {
			EObject eobject = it.next();
			if (eobject instanceof TraceDiff) {
				traceDiff = (TraceDiff) eobject;
				for (EObject participant : traceDiff.getParticipants()) {
					addErrors(participant);
				}
			}
			addErrors(eobject);
		}
	}

	/**
	 * Incorporates traces represented by the passed object into the table
	 * 
	 * @param eObject
	 */
	private void insertTraces(EObject eObject) {
		if (eObject instanceof Trace) {
			Trace trace = (Trace) eObject;
			EObject lastSource = null;
			Traces traces = getTraceContainer(trace);
			for (EObject source : trace.getSource()) {
				goForward(trace, traceDiff, rows, lastSource != null ? lastSource : source, lastSource != null ? source : lastSource);
				lastSource = source;
				if (traces != null)
					modelOfElement.put(source, traces.getSourceModel());
			}
			for (EObject target : trace.getTarget()) {
				goForward(trace, traceDiff, rows, lastSource, target);
				if (traces != null)
					modelOfElement.put(target, traces.getTargetModel());
			}
		}
		if (eObject instanceof Traces) {
			Traces traces = (Traces) eObject;
			if (traces.getSourceModel() != null) {
				sourceModels.add(traces.getSourceModel());
				targetModels.add(traces.getTargetModel());
			}
		}
	}

	public Traces getTraceContainer(EObject trace) {
		Traces traces = null;
		EObject parent = trace.eContainer();
		while (parent != null) {
			if (parent instanceof Traces) {
				traces = (Traces) parent;
				break;
			}
			parent = parent.eContainer();
		}
		return traces;
	}

	private void addErrors(EObject eobject) {
		if (eobject instanceof LogEntry) {
			LogEntry logEntry = (LogEntry) eobject;
			for (EObject eo : logEntry.getParticipants()) {
				List<LogEntry> existing = errors.get(eo);
				if (existing == null)
					errors.put(eo, existing = new ArrayList<LogEntry>());
				existing.add(logEntry);
				errorsRev.put(logEntry, eo);
			}
			if (traceDiff != null)
				diffOfElement.put(logEntry, traceDiff);
		}
	}

	/**
	 * Records that the given source element is mapped onto the given target element and populates the "forward" and "backward" maps accordingly
	 * 
	 * @param trace
	 *            optional associated Trace instance
	 * @param diff
	 *            optional associated Trace instance
	 * @param elements
	 *            store representative elements here
	 * @param source
	 * @param target
	 *            if <code>null</code>, only the source element is traced up
	 */
	public void goForward(Trace trace, TraceDiff diff, List<Object> elements, EObject source, EObject target) {

		if (source != null)
			traced.add(source);
		if (target != null)
			traced.add(target);
		if (diff != null && !diffOfElement.containsKey(source))
			diffOfElement.put(source, diff);
		if (trace != null && !diffOfElement.containsKey(source))
			traceOfElement.put(source, trace);
		if (target == null) {
			if (backward.get(source) == null) {
				if (!elements.contains(source))
					elements.add(source);
				backward.put(source, null);
			}
			return;
		}
		if (forward.get(source) != null) {
			if (backward.get(target) == null) {
				if (!elements.contains(target))
					elements.add(target);
				backward.put(target, source);
			} else {
				System.err.println("Cannot insert trace link!");
			}
			return;
		}
		forward.put(source, target);
		if (backward.get(source) == null) {
			if (!elements.contains(source))
				elements.add(source);
			backward.put(source, null);
		}
		if (backward.get(target) == null) {
			elements.remove(target);
			backward.put(target, source);
		}
	}

	public Resource getResource() {
		return resource;
	}

	/**
	 * Finds a traced element of a certain type in forward or backward direction starting for the given element
	 * 
	 * @param cls
	 * @param element
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T> T findType(Class<T> cls, Object element) {
		element = TraceabilityViewer.getRedirectedElement(element);
		Object result = findTypeRightward(cls, element);
		if (result == null)
			result = findTypeLeftward(cls, element);
		return (T) result;
	}

	@SuppressWarnings("unchecked")
	<T> T findTypeLeftward(Class<T> cls, Object element) {
		Object result = element;
		while (result != null) {
			if (cls.isInstance(result))
				return (T) result;
			result = backward.get(result);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	<T> T findTypeRightward(Class<T> cls, Object element) {
		Object result = element;
		while (result != null) {
			if (cls.isInstance(result))
				return (T) result;
			result = forward.get(result);
		}
		return null;
	}

	/**
	 * Finds a traced element belonging to a certain model in forward or backward direction starting for the given element
	 * 
	 * @param model
	 * @param element
	 * @return
	 */
	public EObject findModel(EObject model, EObject element) {
		EObject result = findModelRightward(model, element);
		if (result == null)
			result = findModelLeftward(model, element);
		return result;
	}

	EObject findModelLeftward(EObject model, EObject element) {
		EObject result = element;
		while (result != null) {
			if (model == modelOfElement.get(result))
				return result;
			result = backward.get(result);
		}
		return null;
	}

	EObject findModelRightward(EObject model, EObject element) {
		EObject result = element;
		while (result != null) {
			if (model == modelOfElement.get(result))
				return result;
			result = forward.get(result);
		}
		return null;
	}

	/**
	 * @return all errors associated to the given element
	 */
	public List<LogEntry> getErrors(Object element) {
		List<LogEntry> result = new ArrayList<LogEntry>();
		while (element != null) {
			List<LogEntry> error = errors.get(element);
			if (error != null) {
				for (LogEntry entry : error) {
					if (!diffOfElement.isEmpty()) {
						TraceDiff diff = getTraceDiff(entry);
						if (diff != null && diff.getParticipants().size() != 1)
							continue;
					}
					if (!result.contains(entry))
						result.add(entry);
				}
			}
			element = forward.get(element);
		}
		return result;
	}

	/**
	 * @param eObject
	 * @return
	 */
	public Trace getAnyTrace(final EObject eObject) {
		Trace trace = getTrace(eObject);
		if (trace == null) {
			TraceDiff diff = getTraceDiff(eObject);
			if (diff != null) {
				for (EObject p : diff.getParticipants()) {
					if (p instanceof Trace && TraceabilityUtils.getProjectName(p).contains(".model")) {
						trace = (Trace) p;
					}
				}
			}
		}
		return trace;
	}

	public TraceDiff getTraceDiff(EObject cellData) {
		return diffOfElement.get(cellData);
	}

	public Trace getTrace(Object cellData) {
		return traceOfElement.get(cellData);
	}

	/**
	 * @return the error with the highest severity associated to the given element
	 */
	public LogEntry getError(Object element) {
		LogEntry result = null;
		for (LogEntry error : getErrors(element)) {
			if (result == null || result.getSeverity() > error.getSeverity()) {
				result = error;
			}
		}
		return result;
	}

}
