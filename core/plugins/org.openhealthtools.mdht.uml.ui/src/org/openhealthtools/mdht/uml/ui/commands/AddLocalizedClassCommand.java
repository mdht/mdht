package org.openhealthtools.mdht.uml.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.DelegatingWrapperItemProvider;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.openhealthtools.mdht.uml.common.ui.util.IResourceConstants;
import org.openhealthtools.mdht.uml.ui.navigator.UMLDomainNavigatorItem;

public class AddLocalizedClassCommand extends AbstractHandler {

	public static String OPT_NESTCLASS = "org.openhealthtools.mdht.uml.ui.commands.AddLocalizedClassCommand.nestclass";

	/**
	 * Main processing method which will traverse the model tree structure
	 * backward (child node > parent node) from the selected element from the
	 * UI. It will recursive backward until a localised parent node (a class
	 * belong to IG model) is found or the root of IG model (the package
	 * element) reached. One found a localised parent node, the method will
	 * recursively backtrack the model tree (parent node -> child node) again to
	 * analyse the current associations on the path and class inheritance
	 * structure to create new localised (derived) classes and associations to
	 * newly localised classes.
	 * 
	 * @param provider
	 *            - A model tree content provider where the selected item came
	 *            from.
	 * @param localModel
	 *            - Current IG model root at package.
	 * @param currentItem
	 *            - The currently processing model element from the UI model
	 *            tree (parent node).
	 * @param previousItem
	 *            - previously processed and walked through model element from
	 *            the UI model tree (child node).
	 * @param createNestedClass
	 *            - TRUE to create all localised nested classes, FALSE to create
	 *            all localised top package level classes.
	 * @param monitor
	 *            - Progress monitor to monitor if user interupted with
	 *            cancellation signal and report processing progress.
	 * @param itemCount
	 *            - As code traverse the model tree structure backward, this
	 *            will count how many nodes on the path between the selected
	 *            node and the first localised parent node.
	 * @return newly created localised class (parent node) this class become the
	 *         container class for next localised class (child node)
	 */
	private org.eclipse.uml2.uml.Class processNode(ITreeContentProvider provider, Package localModel,
			Object currentItem, Object previousItem, boolean createNestedClass, IProgressMonitor monitor, int itemCount) {

		if (monitor.isCanceled())
			return null;

		EObject currentObj = unwrap(currentItem);
		Object child = currentItem;
		if (currentItem instanceof UMLDomainNavigatorItem)
			child = currentObj;

		if (!(currentObj instanceof Association) && !(currentObj instanceof org.eclipse.uml2.uml.Class) &&
				!(currentObj instanceof org.eclipse.uml2.uml.Generalization)) {
			monitor.beginTask("Create " + (createNestedClass
					? "Nested"
					: "Top Level") + " Local Classes", itemCount);
			return null;
		}

		if (isLocalClass(localModel, currentObj)) {
			monitor.beginTask("Create " + (createNestedClass
					? "Nested"
					: "Top Level") + " Local Classes", itemCount);
			return getType(currentObj);
		}

		monitor.subTask("Processing: " + getDescriptionText(currentObj));

		org.eclipse.uml2.uml.Class containingClass = processNode(
			provider, localModel, provider.getParent(child), currentObj, createNestedClass, monitor, itemCount + 1);

		if (monitor.isCanceled())
			return null;

		if (currentObj instanceof Association) {
			Association currentAss = (Association) currentObj;
			Property memberEnd = currentAss.getMemberEnds().get(0);
			Property ownedEnd = currentAss.getOwnedEnds().get(0);

			org.eclipse.uml2.uml.Class oldClass = (org.eclipse.uml2.uml.Class) memberEnd.getType();
			org.eclipse.uml2.uml.Class newClass = null;

			if ((containingClass != null)) {

				newClass = createNewClass(
					localModel, containingClass, oldClass, (Association) previousItem, createNestedClass);
				Property att = getNamedAttribute(memberEnd.getName(), containingClass);
				if (att == null) {
					containingClass.createAssociation(
						memberEnd.isNavigable(), memberEnd.getAggregation(), memberEnd.getName(), memberEnd.getLower(),
						memberEnd.getUpper(), newClass, ownedEnd.isNavigable(), ownedEnd.getAggregation(), "",
						ownedEnd.getLower(), ownedEnd.getUpper());
					monitor.subTask("Create Local Class: " + newClass.getQualifiedName());
				} else if (att.getType() != newClass) {
					att.setType(newClass);
				}
			}

			monitor.worked(1);
			return newClass;
		} else if (currentObj instanceof Generalization) {
			return containingClass;
		} else {
			monitor.setCanceled(true);
			return null;
		}
	}

	private Property getNamedAttribute(String name, org.eclipse.uml2.uml.Class clazz) {
		for (Property att : clazz.getOwnedAttributes())
			if (name.equals(att.getName()))
				return att;
		return null;
	}

	private String getDescriptionText(EObject obj) {
		if (obj instanceof Association) {
			Property memberEnd = ((Association) obj).getMemberEnds().get(0);
			Property ownedEnd = ((Association) obj).getOwnedEnds().get(0);
			return ownedEnd.getType().getQualifiedName() + "." + memberEnd.getName() + " (" +
					memberEnd.getType().getQualifiedName() + ")";
		} else if (obj instanceof Generalization) {
			return ((Generalization) obj).getGeneral().getQualifiedName();
		}
		return "";
	}

	private org.eclipse.uml2.uml.Class createNewClass(Package localModel, org.eclipse.uml2.uml.Class containingClass,
			org.eclipse.uml2.uml.Class oldClass, Association oldAssociation, boolean createNestedClass) {
		org.eclipse.uml2.uml.Class newClass = null;
		Type existingObj = null;
		if (createNestedClass)
			existingObj = containingClass.getNestedClassifier(oldClass.getName());
		else
			existingObj = localModel.getOwnedType(oldClass.getName());
		String className = oldClass.getName();
		if (existingObj != null) {
			if (existingObj instanceof org.eclipse.uml2.uml.Class) {
				newClass = (org.eclipse.uml2.uml.Class) existingObj;
			} else {
				className = oldClass.getName() + "_C";
			}
		}

		if (newClass == null) {
			if (createNestedClass)
				newClass = (org.eclipse.uml2.uml.Class) containingClass.createNestedClassifier(
					oldClass.getName(), oldClass.eClass());
			else
				newClass = localModel.createOwnedClass(className, oldClass.isAbstract());
			newClass.createGeneralization(oldClass);

			Association association = null;
			for (Property p : oldClass.getOwnedAttributes()) {
				if (((association = p.getAssociation()) != null) && (association != oldAssociation)) {
					Property memberEnd = association.getMemberEnds().get(0);
					Property ownedEnd = association.getOwnedEnds().get(0);
					newClass.createAssociation(
						memberEnd.isNavigable(), memberEnd.getAggregation(), memberEnd.getName(), memberEnd.getLower(),
						memberEnd.getUpper(), memberEnd.getType(), ownedEnd.isNavigable(), ownedEnd.getAggregation(),
						"", ownedEnd.getLower(), ownedEnd.getUpper());
				}
			}
		}
		return newClass;
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);

		if (selection instanceof IStructuredSelection) {
			IWorkbenchPart activePart = HandlerUtil.getActivePartChecked(event);
			IViewerProvider view = (IViewerProvider) activePart.getAdapter(IViewerProvider.class);
			final TreeViewer tree = (TreeViewer) view.getViewer();
			final boolean createNestClass = (Boolean) event.getObjectParameterForExecution(AddLocalizedClassCommand.OPT_NESTCLASS);
			final Package pkz = getCurrentMDHTModel();
			final Object selectedObject = selection.getFirstElement();
			final TransactionalEditingDomain editingDomain = getEditingDomain(selectedObject);

			// Create a new execution job and schedule this job run on a
			// separate thread. This will release the UI
			// thread from being blocked. Up to job manager decide when to
			// execute, depending on eclipse's job queue.

			Job j = new Job("Localise Class" + (createNestClass
					? " (Nested)"
					: "")) {
				@Override
				public IStatus run(final IProgressMonitor monitor) {

					IStatus status = Status.OK_STATUS;
					editingDomain.getCommandStack().execute(
						new RecordingCommand(editingDomain, "Localise Class" + (createNestClass
								? " (Nested)"
								: "")) {
							@Override
							protected void doExecute() {
								processNode(
									(ITreeContentProvider) tree.getContentProvider(), pkz, selectedObject, null,
									createNestClass, monitor, 0);
							}
						});

					if (monitor.isCanceled())
						status = Status.CANCEL_STATUS;
					monitor.done();

					return status;
				}

			};
			j.schedule();
		}

		return null;
	}

	/*********************/

	private static EObject unwrap(Object wrapper) {
		Object obj = null;
		if (wrapper instanceof EObject)
			return (EObject) wrapper;
		if (wrapper instanceof DelegatingWrapperItemProvider) {
			obj = ((DelegatingWrapperItemProvider) wrapper).getValue();
		} else if (wrapper instanceof UMLDomainNavigatorItem) {
			obj = ((UMLDomainNavigatorItem) wrapper).getEObject();
		} else
			return null;
		return unwrap(obj);
	}

	private static org.eclipse.uml2.uml.Class getType(EObject type) {

		org.eclipse.uml2.uml.Class t = null;

		if (type instanceof Association) {
			t = (org.eclipse.uml2.uml.Class) ((Association) type).getMemberEnds().get(0).getType();
		} else if (type instanceof Generalization) {
			t = (org.eclipse.uml2.uml.Class) ((Generalization) type).getGeneral();
		} else if (type instanceof org.eclipse.uml2.uml.Class) {
			t = (org.eclipse.uml2.uml.Class) type;
		}
		return t;
	}

	private static boolean isLocalType(Package currentModel, EObject type) {
		return currentModel == getOwnerModel(type);
	}

	private static boolean isLocalClass(Package currentModel, EObject type) {
		return isLocalType(currentModel, type) && (type instanceof org.eclipse.uml2.uml.Class);
	}

	private static Package getOwnerModel(EObject t) {
		if (t.eContainer() instanceof Package)
			return (Package) t.eContainer();
		else
			return getOwnerModel(t.eContainer());
	}

	private static TransactionalEditingDomain getEditingDomain(Object editingObject) {
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(unwrap(editingObject));

		if (editingDomain == null)
			editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain(IResourceConstants.EDITING_DOMAIN_ID);

		return editingDomain;
	}

	private static Package getCurrentModel(Object receiver) {
		IWorkbenchPart part = null;
		try {
			part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService().getActivePart();
		} catch (Throwable e) {
		}

		if (!(part instanceof IEditorPart) ||
				!(((IEditorPart) part).getEditorInput() instanceof org.eclipse.ui.IFileEditorInput))
			return null;

		String modelFilePath = ((IFileEditorInput) ((IEditorPart) part).getEditorInput()).getFile().getFullPath().toString();

		URI resourceURI = URI.createPlatformResourceURI(modelFilePath, false);
		TransactionalEditingDomain editingDomain = getEditingDomain(receiver);

		if (editingDomain == null)
			return null;

		for (Resource resource : editingDomain.getResourceSet().getResources())
			if (resource.getURI().equals(resourceURI))
				for (EObject e : resource.getContents())
					if (e instanceof Package)
						return (Package) e;

		return null;
	}

	private static Package getCurrentMDHTModel() {

		TransactionalEditingDomain editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain(IResourceConstants.EDITING_DOMAIN_ID);

		if (editingDomain == null)
			return null;

		IWorkbenchPart part = null;
		try {
			part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService().getActivePart();
		} catch (Throwable e) {

		}

		if (!(part instanceof IEditorPart) || !(((IEditorPart) part).getEditorInput() instanceof IFileEditorInput))
			return null;

		String modelFilePath = ((IFileEditorInput) ((IEditorPart) part).getEditorInput()).getFile().getFullPath().toString();
		URI resourceURI = URI.createPlatformResourceURI(modelFilePath, false);

		for (Resource resource : editingDomain.getResourceSet().getResources())
			if (resource.getURI().equals(resourceURI))
				for (EObject e : resource.getContents())
					if (e instanceof Package)
						return (Package) e;

		return null;
	}

	/**
	 * A util method to test if the selected item from a UI tree structure is a
	 * descendant of the current IG model structure.
	 * 
	 * @param provider
	 *            - A model tree content provider where the selected item came
	 *            from.
	 * @param localModel
	 *            - Local IG model.
	 * @param selectedItem
	 *            - The currently selected item from the model tree.
	 * 
	 * @return TRUE if the item rooted from current local IG model. FALSE if the
	 *         item rooted from import models.
	 */

	private static boolean fromCurrentModel(ITreeContentProvider provider, Package localModel, Object selectedItem) {
		boolean rs = false;

		EObject currentObj = unwrap(selectedItem);
		Object child = selectedItem;
		if (selectedItem instanceof UMLDomainNavigatorItem)
			child = currentObj;

		if (!(currentObj instanceof Association) && !(currentObj instanceof org.eclipse.uml2.uml.Class) &&
				!(currentObj instanceof org.eclipse.uml2.uml.Generalization)) {

			if (currentObj instanceof Package)
				return currentObj == localModel;
			return false;
		}
		rs = fromCurrentModel(provider, localModel, provider.getParent(child));
		return rs;
	}

	/**
	 * A util method to test if a selected item from a UI tree structure has
	 * been localised to current IG model. A Nested class path from current
	 * selected element backward up to first localised element will be checked
	 * for existance.
	 * 
	 * @param provider
	 *            - A model tree content provider where the selected item came
	 *            from.
	 * @param localModel
	 *            - Local IG model.
	 * @param selectedItem
	 *            - The currently selected item from the model tree.
	 * @return TRUE if the localised class for this item exist. FALSE otherwise.
	 */

	private static boolean isLocalised(ITreeContentProvider provider, Package localModel, Object selectedItem,
			String previousTypeName) {

		EObject currentObj = unwrap(selectedItem);
		Object child = selectedItem;
		if (selectedItem instanceof UMLDomainNavigatorItem)
			child = currentObj;

		if (!(currentObj instanceof Association) && !(currentObj instanceof org.eclipse.uml2.uml.Class) &&
				!(currentObj instanceof org.eclipse.uml2.uml.Generalization)) {

			return false;
		}
		String part1 = getTypeName(currentObj);
		String part2 = (part1 != null) && (previousTypeName != null)
				? "::"
				: "";
		part1 = part1 == null
				? ""
				: part1;
		String part3 = previousTypeName == null
				? ""
				: previousTypeName;
		String typeName = part1 + part2 + part3;
		if (isLocalClass(localModel, currentObj)) {
			return org.eclipse.uml2.uml.util.UMLUtil.findNamedElements(localModel.eResource(), typeName).size() > 0;
		}

		return isLocalised(provider, localModel, provider.getParent(child), typeName);
	}

	private static String getTypeName(EObject obj) {
		if (obj instanceof Association) {
			return ((Association) obj).getMemberEnds().get(0).getType().getName();
		} else if (obj instanceof Generalization) {
			return null;
		} else if (obj instanceof org.eclipse.uml2.uml.Class) {
			return ((org.eclipse.uml2.uml.Class) obj).getQualifiedName();
		}
		return "";
	}

}
