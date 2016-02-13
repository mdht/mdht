package org.eclipse.mdht.uml.ui.propertytesters;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.DelegatingWrapperItemProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.mdht.uml.common.ui.util.IResourceConstants;
import org.eclipse.mdht.uml.ui.navigator.UMLDomainNavigatorItem;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;

public class UmlElement extends PropertyTester {

	public boolean test(Object receiver, String propertyName, Object[] args, Object value) {

		switch (propertyName) {
			case "fromLocal":
				return true;
			case "isLocalised":
				EObject obj = unwrap(receiver);
				if (obj instanceof Association) {
					Association association = (Association) obj;
					for (Property property : association.getMemberEnds()) {
						if (property.getType() != null && property.getType().getOwner().equals(property.getOwner())) {
							return true;
						}
					}
				}
				return false;
			case "instanceOf":
				return false;
			case "isAnAssociation":
				return unwrap(receiver) instanceof Association;
			case "isProperty":
				return unwrap(receiver) instanceof Property;
			case "isNamedElement":
				return unwrap(receiver) instanceof NamedElement;

			default:
				return false;

		}
		//
		// boolean ret = false;
		//
		// try {
		// EObject obj = unwrap(receiver);
		//
		// if (obj == null)
		// ;
		// else if ("instanceOf".equals(propertyName)) {
		// ret = Class.forName(value.toString()).isAssignableFrom(obj.getClass());
		// } else if ("isLocalised".equals(propertyName)) {
		// if (obj instanceof Association) {
		// Property memberEnd = ((Association) obj).getMemberEnds().get(0);
		// try {
		//
		// IWorkbenchPart part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService().getActivePart();
		// IViewerProvider view = (IViewerProvider) part.getAdapter(IViewerProvider.class);
		// TreeViewer tree = (TreeViewer) view.getViewer();
		// // isLocalType(getCurrentModel(receiver),
		// // memberEnd.getType()) &&
		// ret = isLocalised(
		// (ITreeContentProvider) tree.getContentProvider(), getCurrentMDHTModel(), receiver, null);
		// } catch (Throwable e) {
		// }
		//
		// }
		// } else if ("fromLocal".equals(propertyName)) {
		//
		// try {
		// IWorkbenchPart part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService().getActivePart();
		// IViewerProvider view = (IViewerProvider) part.getAdapter(IViewerProvider.class);
		// TreeViewer tree = (TreeViewer) view.getViewer();
		// ret = fromCurrentModel(
		// (ITreeContentProvider) tree.getContentProvider(), getCurrentMDHTModel(), receiver);
		// } catch (Throwable e) {
		// }
		//
		// }
		//
		// } catch (Throwable e) {
		// e.printStackTrace(System.err);
		// }
		//
		// return true;
	}

	private static EObject unwrap(Object wrapper) {
		Object obj = null;
		if (wrapper instanceof EObject) {
			return (EObject) wrapper;
		}
		if (wrapper instanceof DelegatingWrapperItemProvider) {
			obj = ((DelegatingWrapperItemProvider) wrapper).getValue();
		} else if (wrapper instanceof UMLDomainNavigatorItem) {
			obj = ((UMLDomainNavigatorItem) wrapper).getEObject();
		} else {
			return null;
		}
		return unwrap(obj);
	}

	private static Package getCurrentMDHTModel() {

		TransactionalEditingDomain editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain(
			IResourceConstants.EDITING_DOMAIN_ID);

		if (editingDomain == null) {
			return null;
		}

		IWorkbenchPart part = null;
		try {
			part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService().getActivePart();
		} catch (Throwable e) {

		}

		if (!(part instanceof IEditorPart) || !(((IEditorPart) part).getEditorInput() instanceof IFileEditorInput)) {
			return null;
		}

		String modelFilePath = ((IFileEditorInput) ((IEditorPart) part).getEditorInput()).getFile().getFullPath().toString();
		URI resourceURI = URI.createPlatformResourceURI(modelFilePath, false);

		for (Resource resource : editingDomain.getResourceSet().getResources()) {
			if (resource.getURI().equals(resourceURI)) {
				for (EObject e : resource.getContents()) {
					if (e instanceof Package) {
						return (Package) e;
					}
				}
			}
		}

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
		if (selectedItem instanceof UMLDomainNavigatorItem) {
			child = currentObj;
		}

		if (!(currentObj instanceof Association) && !(currentObj instanceof org.eclipse.uml2.uml.Class) &&
				!(currentObj instanceof org.eclipse.uml2.uml.Generalization)) {

			if (currentObj instanceof Package) {
				return currentObj == localModel;
			}
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
		if (selectedItem instanceof UMLDomainNavigatorItem) {
			child = currentObj;
		}

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

	private static boolean isLocalType(Package currentModel, EObject type) {
		return currentModel == getOwnerModel(type);
	}

	private static boolean isLocalClass(Package currentModel, EObject type) {
		return isLocalType(currentModel, type) && (type instanceof org.eclipse.uml2.uml.Class);
	}

	private static Package getOwnerModel(EObject t) {
		if (t.eContainer() instanceof Package) {
			return (Package) t.eContainer();
		} else {
			return getOwnerModel(t.eContainer());
		}
	}

}
