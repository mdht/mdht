/*******************************************************************************
 * Copyright (c) 2006, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - adding support for showing business names (or not)
 *     Christian W. Damus - fix re-ordering of properties and constraints
 *                        - ensure correct structure of pasted association copies (artf3287)
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.edit.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.ChildrenToCopyProvider;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.CopyCommand.Helper;
import org.eclipse.emf.edit.command.CreateCopyCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.edit.providers.AssociationItemProvider;
import org.openhealthtools.mdht.uml.common.modelfilter.ModelFilterUtil;
import org.openhealthtools.mdht.uml.common.notation.INotationProvider;
import org.openhealthtools.mdht.uml.common.notation.NotationRegistry;
import org.openhealthtools.mdht.uml.common.notation.NotationUtil;
import org.openhealthtools.mdht.uml.common.util.NamedElementUtil;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.edit.IUMLTableProperties;
import org.openhealthtools.mdht.uml.edit.command.CommandWrapperWithChildrenToCopy;
import org.openhealthtools.mdht.uml.edit.internal.Logger;
import org.openhealthtools.mdht.uml.edit.internal.UMLExtEditPlugin;
import org.openhealthtools.mdht.uml.edit.provider.operations.NamedElementOperations;

/**
 * 
 * @version $Id: $
 */
public class AssociationExtItemProvider extends AssociationItemProvider implements ITableItemLabelProvider,
		ICellModifier {

	/**
	 * @param adapterFactory
	 */
	public AssociationExtItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		Property navigableEnd = UMLUtil.getNavigableEnd((Association) object);

		ComposedImage composedImage = (ComposedImage) super.getImage(object);
		if (navigableEnd != null) {
			composedImage = (ComposedImage) overlayImage(
				object, UMLExtEditPlugin.INSTANCE.getImage("full/obj16/Association_navigable")); //$NON-NLS-1$
			if (ModelFilterUtil.isHidden(navigableEnd)) {
				composedImage.getImages().add(UMLExtEditPlugin.INSTANCE.getImage("full/ovr16/filtered"));
			}
		}

		return composedImage;
	}

	protected String getName(NamedElement namedElement) {
		AdapterFactory adapterFactory = getAdapterFactory();
		return adapterFactory instanceof UML2ExtendedAdapterFactory &&
				((UML2ExtendedAdapterFactory) adapterFactory).isShowBusinessNames()
				? NamedElementUtil.getBusinessName(namedElement)
				: namedElement.getName();
	}

	@Override
	public String getText(Object object) {
		String label = getName((Association) object);
		if (label == null) {
			StringBuffer labelBuffer = new StringBuffer();
			for (Property end : ((Association) object).getMemberEnds()) {
				if (end.isNavigable()) {
					if (labelBuffer.length() > 0) {
						labelBuffer.append("_");
					}

					if (end.getName() != null) {
						labelBuffer.append(getName(end));
					} else if (end.getType() != null) {
						labelBuffer.append(getName(end.getType()));
					} else {
						labelBuffer.append("NULL");
					}
				}
			}
			label = labelBuffer.toString();
		}
		return label;
	}

	/**
	 * I declare no children features so that no drop/add/etc. may be attempted on me.
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		return Collections.emptyList();
	}

	/**
	 * Because we show associations under the "source" class, provide that as the parent.
	 */
	@Override
	public Object getParent(Object object) {
		final Association association = (Association) object;

		// only look for class as owner, not (e.g.) datatype, because we only
		// show associations under classes
		Property navigableEnd = UMLUtil.getNavigableEnd(association);
		Object result = (navigableEnd == null)
				? null
				: navigableEnd.getClass_();
		if (result == null) {
			result = super.getParent(object);
		}

		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	@Override
	public Collection<?> getChildren(Object object) {
		Association association = (Association) object;
		List<Object> children = new ArrayList<Object>();

		// these are proper contents of the association. No wrapping!
		children.addAll(association.getOwnedComments());

		Property navigableEnd = UMLUtil.getNavigableEnd(association);
		final EReference navigableEndRef = UMLPackage.Literals.ASSOCIATION__END_TYPE;
		if (navigableEnd != null && navigableEnd.getType() instanceof Class) {
			Class endType = (Class) navigableEnd.getType();
			for (Property property : endType.getOwnedAttributes()) {
				if (property.getAssociation() == null) {
					children.add(wrap(association, navigableEndRef, property, Notification.NO_INDEX));
				}
			}

			// include associations after attributes
			for (Property property : endType.getOwnedAttributes()) {
				if (property.getAssociation() != null && property.getOtherEnd() != null &&
						property.getOtherEnd().getType() == endType) {
					children.add(wrap(association, navigableEndRef, property.getAssociation(), Notification.NO_INDEX));
				}
			}

			// for (Object next : endType.getOwnedRules()) {
			// children.add(wrap(endType, navigableEndRef, next, Notification.NO_INDEX));
			// }
			for (Object next : endType.getGeneralizations()) {
				children.add(wrap(endType, navigableEndRef, next, Notification.NO_INDEX));
			}
		}

		// these are proper contents of the association. No wrapping!
		children.addAll(association.getOwnedRules());

		return children;
	}

	@Override
	protected boolean isWrappingNeeded(Object object) {
		// we wrap most children because they are cross-references (and not even direct ones, at that)
		return true;
	}

	@Override
	public Object getColumnImage(Object object, int columnIndex) {
		Association association = (Association) object;
		if (association.getNearestPackage() == null) {
			// occurs when association is deleted
			return null;
		}
		Property navigableEnd = UMLUtil.getNavigableEnd(association);
		Class endType = null;
		if (navigableEnd != null && navigableEnd.getType() instanceof Class) {
			endType = (Class) navigableEnd.getType();
		}

		switch (columnIndex) {
			case IUMLTableProperties.NAME_INDEX:
				return getImage(object);
			case IUMLTableProperties.TYPE_INDEX:
				if (endType != null) {
					Object image = null;

					// must pass property (rather than type) so that correct notation provider is selected
					INotationProvider notationProvider = NotationRegistry.INSTANCE.getNotationProvider(navigableEnd);
					if (notationProvider != null) {
						image = notationProvider.getElementImage(endType);
					}

					if (image == null) {
						IItemLabelProvider provider = (IItemLabelProvider) getAdapterFactory().adapt(
							endType, IItemLabelProvider.class);
						if (provider != null) {
							image = provider.getImage(endType);
						}
					}
					return image;
				}
			case IUMLTableProperties.ANNOTATION_INDEX:
				return NotationUtil.getAnnotationImage(association);
			default:
				return null;
		}
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		Association association = (Association) element;
		if (association.getNearestPackage() == null) {
			// occurs when association is deleted
			return null;
		}
		Property navigableEnd = UMLUtil.getNavigableEnd(association);
		Class endType = null;
		if (navigableEnd != null && navigableEnd.getType() instanceof Class) {
			endType = (Class) navigableEnd.getType();
		}

		switch (columnIndex) {
			case IUMLTableProperties.NAME_INDEX:
				return getText(element);
			case IUMLTableProperties.TYPE_INDEX:
				return (endType == null)
						? null
						: endType.getName();
			case IUMLTableProperties.MULTIPLICITY_INDEX:
				return PropertyExtItemProvider.displayColumnMultiplicity(navigableEnd);
			case IUMLTableProperties.VISIBILITY_INDEX:
				if (VisibilityKind.PUBLIC_LITERAL == association.getVisibility()) {
					return "";
				} else {
					return association.getVisibility().getName();
				}
			case IUMLTableProperties.ANNOTATION_INDEX: {
				String annotation = NotationUtil.getAnnotation(association);
				if ((annotation == null || annotation.length() == 0) && navigableEnd != null) {
					// if no association annotations, display property annotations
					annotation = NotationUtil.getAnnotation(navigableEnd);
				}
				return annotation;
			}
			default:
				return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ICellModifier#canModify(java.lang.Object, java.lang.String)
	 */
	public boolean canModify(Object element, String property) {
		if (IUMLTableProperties.NAME_PROPERTY.equals(property)) {
			return true;
		} else if (IUMLTableProperties.TYPE_PROPERTY.equals(property)) {
			return true;
		} else if (IUMLTableProperties.MULTIPLICITY_PROPERTY.equals(property)) {
			return true;
		} else if (IUMLTableProperties.VISIBILITY_PROPERTY.equals(property)) {
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ICellModifier#getValue(java.lang.Object, java.lang.String)
	 */
	public Object getValue(Object element, String property) {
		Property navigableEnd = UMLUtil.getNavigableEnd((Association) element);

		if (navigableEnd != null) {
			if (IUMLTableProperties.NAME_PROPERTY.equals(property)) {
				return navigableEnd.getName();
			} else if (IUMLTableProperties.VISIBILITY_PROPERTY.equals(property)) {
				return new Integer(navigableEnd.getVisibility().getValue());
			} else if (IUMLTableProperties.TYPE_PROPERTY.equals(property)) {
				return navigableEnd.getType();
			} else if (IUMLTableProperties.MULTIPLICITY_PROPERTY.equals(property)) {
				return PropertyExtItemProvider.displayColumnMultiplicity(navigableEnd);
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ICellModifier#modify(java.lang.Object, java.lang.String, java.lang.Object)
	 */
	public void modify(final Object element, final String property, final Object value) {
		final Association association = (Association) element;
		final Property navigableEnd = UMLUtil.getNavigableEnd(association);
		if (navigableEnd == null) {
			return;
		}

		if (IUMLTableProperties.NAME_PROPERTY.equals(property) ||
				IUMLTableProperties.VISIBILITY_PROPERTY.equals(property)) {
			NamedElementOperations.modify(navigableEnd, property, value);
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(navigableEnd);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					if (IUMLTableProperties.TYPE_PROPERTY.equals(property) && value instanceof Classifier) {
						setLabel("Set Type");
						navigableEnd.setType((Classifier) value);

						// refresh children, cause change notification to be sent
						Class owner = navigableEnd.getClass_();
						int position = owner.getOwnedAttributes().lastIndexOf(navigableEnd);
						owner.getOwnedAttributes().remove(navigableEnd);
						owner.getOwnedAttributes().add(position, navigableEnd);
					} else if (IUMLTableProperties.AGGREGATION_PROPERTY.equals(property) && value instanceof Integer) {
						setLabel("Set Aggregation");
						navigableEnd.setAggregation(AggregationKind.get(((Integer) value).intValue()));
					} else if (IUMLTableProperties.MULTIPLICITY_PROPERTY.equals(property) && value instanceof String) {
						setLabel("Set Multiplicity");
						PropertyExtItemProvider.setMultiplicity(navigableEnd, value.toString());
					} else {
						return Status.CANCEL_STATUS;
					}

					return Status.OK_STATUS;
				}
			};

			try {
				IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
				operation.addContext(commandStack.getDefaultUndoContext());
				commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), null);

			} catch (ExecutionException ee) {
				Logger.logException(ee);
			}

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	@Override
	protected Command createCreateCopyCommand(EditingDomain domain, EObject owner, Helper helper) {
		final Property navigableEnd = UMLUtil.getNavigableEnd((Association) owner);

		Command result = super.createCreateCopyCommand(domain, owner, helper);

		if (navigableEnd != null) {
			// need to copy it, too, to have a complete association
			class CompoundWithChildrenToCopy extends CompoundCommand implements ChildrenToCopyProvider {
				CompoundWithChildrenToCopy() {
					super(CompoundCommand.MERGE_COMMAND_ALL);
				}

				public Collection<?> getChildrenToCopy() {
					List<Object> result = new java.util.ArrayList<Object>();

					for (Command next : commandList) {
						if (next instanceof ChildrenToCopyProvider) {
							result.addAll(((ChildrenToCopyProvider) next).getChildrenToCopy());
						}
					}

					return result;
				}
			}

			CompoundCommand compound = new CompoundWithChildrenToCopy();
			compound.append(result);
			result = compound;

			compound.append(CreateCopyCommand.create(domain, navigableEnd, helper));
		}

		return result;
	}

	@Override
	protected Command wrapCommand(Command command, Object object, java.lang.Class<? extends Command> commandClass,
			CommandParameter commandParameter, CommandParameter oldCommandParameter) {

		Command result = super.wrapCommand(command, object, commandClass, commandParameter, oldCommandParameter);

		if ((result != command) && (command instanceof ChildrenToCopyProvider)) {
			result = new CommandWrapperWithChildrenToCopy(result, (ChildrenToCopyProvider) command);
		}

		return result;
	}
}
