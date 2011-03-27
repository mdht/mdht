/*******************************************************************************
 * Copyright (c) 2006, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - adding support for showing business names (or not)
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.edit.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
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
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.edit.providers.AssociationItemProvider;
import org.openhealthtools.mdht.uml.common.notation.INotationProvider;
import org.openhealthtools.mdht.uml.common.notation.NotationRegistry;
import org.openhealthtools.mdht.uml.common.util.NamedElementUtil;
import org.openhealthtools.mdht.uml.edit.IUMLTableProperties;
import org.openhealthtools.mdht.uml.edit.internal.Logger;
import org.openhealthtools.mdht.uml.edit.internal.UMLExtEditPlugin;
import org.openhealthtools.mdht.uml.edit.provider.operations.NamedElementOperations;


/**
 *
 * @version $Id: $
 */
public class AssociationExtItemProvider extends AssociationItemProvider
	implements ITableItemLabelProvider, ICellModifier {

	/**
	 * @param adapterFactory
	 */
	public AssociationExtItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	public Object getImage(Object object) {
		boolean navigable = false;

		for (Property memberEnd : ((Association) object).getMemberEnds()) {
			if (memberEnd.isNavigable())
				navigable = true;
		}

		if (navigable) {
			return overlayImage(object,UMLExtEditPlugin.INSTANCE.getImage(
					"full/obj16/Association_navigable")); //$NON-NLS-1$
		}
		else {
			return super.getImage(object);
		}
	}

	protected String getName(NamedElement namedElement) {
		AdapterFactory adapterFactory = getAdapterFactory();
		return adapterFactory instanceof UML2ExtendedAdapterFactory
				&& ((UML2ExtendedAdapterFactory) adapterFactory)
						.isShowBusinessNames() ? NamedElementUtil
				.getBusinessName(namedElement) : namedElement.getName();
	}

	public String getText(Object object) {
		String label = getName((Association)object);
		if (label == null) {
			StringBuffer labelBuffer = new StringBuffer();
			for (Property end : ((Association)object).getMemberEnds()) {
				if (end.isNavigable()) {
					if (labelBuffer.length() > 0)
						labelBuffer.append("_");
					
					if (end.getName() != null)
						labelBuffer.append(end.getName());
					else if (end.getType() != null)
						labelBuffer.append(end.getType().getName());
					else
						labelBuffer.append("NULL");
				}
			}
			label = labelBuffer.toString();
		}
		return label;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	public Collection<Element> getChildren(Object object) {
		Association association = (Association) object;
		List<Element> children = new ArrayList<Element>();
		children.addAll(association.getOwnedComments());
		
		Property navigableEnd = getNavigableEnd(association);
		if (navigableEnd != null && navigableEnd.getType() instanceof Class) {
			Class endType = (Class) navigableEnd.getType();
			for (Property property : endType.getOwnedAttributes()) {
				if (property.getAssociation() == null) {
					children.add(property);
				}
			}
			// include associations after attributes
			for (Property property : endType.getOwnedAttributes()) {
				if (property.getAssociation() != null && property.getOtherEnd() != null
						&& property.getOtherEnd().getType() == endType) {
					children.add(property.getAssociation());
				}
			}
//			children.addAll(endType.getOwnedRules());
//			children.addAll(endType.getGeneralizations());
		}
		
		children.addAll(association.getOwnedRules());
//		children.addAll(association.getGeneralizations());
//		// show only navigable ends
//		for (Property end : association.getMemberEnds()) {
//			if (end.isNavigable())
//				children.add(end);
//		}
//		children.addAll(association.getClientDependencies());
		
		return children;
	}
	
	private Property getNavigableEnd(Association association) {
		Property navigableEnd = null;
		for (Property end : association.getMemberEnds()) {
			if (end.isNavigable()) {
				if (navigableEnd != null) {
					return null; // multiple navigable ends
				}
				navigableEnd = end;
			}
		}
		
		return navigableEnd;
	}

	public Object getColumnImage(Object object, int columnIndex) {
		Association association = (Association) object;
		if (association.getNearestPackage() == null) {
			// occurs when association is deleted
			return null;
		}
		Property navigableEnd = getNavigableEnd(association);
		Class endType = null;
		if (navigableEnd != null && navigableEnd.getType() instanceof Class) {
			endType = (Class) navigableEnd.getType();
		}
		
		switch (columnIndex) {
		case IUMLTableProperties.NAME_INDEX:
			return getImage(object);
		case IUMLTableProperties.TYPE_INDEX:
			if (endType != null) {
				IItemLabelProvider provider = 
					(IItemLabelProvider) getAdapterFactory().adapt(
							endType, IItemLabelProvider.class);
				if (provider != null)
					return provider.getImage(endType);
			}
		case IUMLTableProperties.ANNOTATION_INDEX: {
			for (Profile profile : association.getNearestPackage().getAllAppliedProfiles()) {
				// eResource is null for unresolved eProxyURI, missing profiles
				if (profile.eResource() != null) {
					// use the first notation provider found for an applied profile, ignore others
					String profileURI = profile.eResource().getURI().toString();
					INotationProvider provider = 
						NotationRegistry.INSTANCE.getProviderInstance(profileURI);
					if (provider != null) {
						return provider.getAnnotationImage(association);
					}
				}
			}
		}
		default:
			return null;
		}
	}

	public String getColumnText(Object element, int columnIndex) {
		Association association = (Association) element;
		if (association.getNearestPackage() == null) {
			// occurs when association is deleted
			return null;
		}
		Property navigableEnd = getNavigableEnd(association);
		Class endType = null;
		if (navigableEnd != null && navigableEnd.getType() instanceof Class) {
			endType = (Class) navigableEnd.getType();
		}
		
		switch (columnIndex) {
		case IUMLTableProperties.NAME_INDEX:
			return getText(element);
		case IUMLTableProperties.TYPE_INDEX:
			return (endType == null) ? null : endType.getName();
		case IUMLTableProperties.MULTIPLICITY_INDEX:
			return PropertyExtItemProvider.displayColumnMultiplicity(navigableEnd);
		case IUMLTableProperties.VISIBILITY_INDEX:
			if (VisibilityKind.PUBLIC_LITERAL == association.getVisibility())
				return "";
			else
				return association.getVisibility().getName();
		case IUMLTableProperties.ANNOTATION_INDEX: {
			for (Profile profile : association.getNearestPackage().getAllAppliedProfiles()) {
				// eResource is null for unresolved eProxyURI, missing profiles
				if (profile.eResource() != null) {
					// use the first notation provider found for an applied profile, ignore others
					String profileURI = profile.eResource().getURI().toString();
					INotationProvider provider = 
						NotationRegistry.INSTANCE.getProviderInstance(profileURI);
					if (provider != null) {
						return provider.getAnnotation(association);
					}
				}
			}
		}
		default:
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ICellModifier#canModify(java.lang.Object, java.lang.String)
	 */
	public boolean canModify(Object element, String property) {
		if (IUMLTableProperties.NAME_PROPERTY.equals(property)) {
			return true;
		}
		else if (IUMLTableProperties.TYPE_PROPERTY.equals(property)) {
			return true;
		}
		else if (IUMLTableProperties.MULTIPLICITY_PROPERTY.equals(property)) {
			return true;
		}
		else if (IUMLTableProperties.VISIBILITY_PROPERTY.equals(property)) {
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ICellModifier#getValue(java.lang.Object, java.lang.String)
	 */
	public Object getValue(Object element, String property) {
		Property navigableEnd = getNavigableEnd((Association)element);
		
		if (navigableEnd != null) {
			if (IUMLTableProperties.NAME_PROPERTY.equals(property)) {
				return navigableEnd.getName();
			}
			else if (IUMLTableProperties.VISIBILITY_PROPERTY.equals(property)) {
				return new Integer(navigableEnd.getVisibility().getValue());
			}
			else if (IUMLTableProperties.TYPE_PROPERTY.equals(property)) {
				return navigableEnd.getType();
			}
			else if (IUMLTableProperties.MULTIPLICITY_PROPERTY.equals(property)) {
				return PropertyExtItemProvider.displayColumnMultiplicity(navigableEnd);
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ICellModifier#modify(java.lang.Object, java.lang.String, java.lang.Object)
	 */
	public void modify(final Object element, final String property, final Object value) {
		final Association association = (Association)element;
		final Property navigableEnd = getNavigableEnd(association);
		if (navigableEnd == null)
			return;

		if (IUMLTableProperties.NAME_PROPERTY.equals(property) 
				|| IUMLTableProperties.VISIBILITY_PROPERTY.equals(property)) {
			NamedElementOperations.modify(navigableEnd, property, value);
			return;
		}
		
		try {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(navigableEnd);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					if (IUMLTableProperties.TYPE_PROPERTY.equals(property) 
							&& value instanceof Classifier) {
						setLabel("Set Type");
						navigableEnd.setType((Classifier)value);
						
						// refresh children, cause change notification to be sent
						Class owner = navigableEnd.getClass_();
						int position = owner.getOwnedAttributes().lastIndexOf(navigableEnd);
						owner.getOwnedAttributes().remove(navigableEnd);
						owner.getOwnedAttributes().add(position, navigableEnd);
					}
					else if (IUMLTableProperties.AGGREGATION_PROPERTY.equals(property) 
							&& value instanceof Integer) {
						setLabel("Set Aggregation");
						navigableEnd.setAggregation(AggregationKind.get(((Integer)value).intValue()));
					}
					else if (IUMLTableProperties.MULTIPLICITY_PROPERTY.equals(property) 
							&& value instanceof String) {
						setLabel("Set Multiplicity");
						PropertyExtItemProvider.setMultiplicity(navigableEnd, value.toString());
					}
					else {
						return Status.CANCEL_STATUS;
					}
					
			        return Status.OK_STATUS;
			    }};

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

}
