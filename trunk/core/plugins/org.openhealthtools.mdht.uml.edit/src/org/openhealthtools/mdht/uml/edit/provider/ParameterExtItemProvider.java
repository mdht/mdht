/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.edit.provider;

import java.util.StringTokenizer;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.edit.providers.ParameterItemProvider;
import org.openhealthtools.mdht.uml.edit.IUMLTableProperties;
import org.openhealthtools.mdht.uml.edit.internal.Logger;
import org.openhealthtools.mdht.uml.edit.provider.operations.NamedElementOperations;

/**
 *
 * @version $Id: $
 */
public class ParameterExtItemProvider extends ParameterItemProvider
	implements ITableItemLabelProvider, ICellModifier {

	/**
	 * @param adapterFactory
	 */
	public ParameterExtItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.uml.provider.GeneralizationItemProvider#getImage(java.lang.Object)
	 */
	public Object getImage(Object object) {
//		Parameter parameter = (Parameter) object;
//		if (ParameterDirectionKind.IN_LITERAL == parameter.getDirection())
//			return UMLEditPlugin.getDefault().getImageURL("full/obj16/ParameterIn");
//		if (ParameterDirectionKind.RETURN_LITERAL == parameter.getDirection())
//			return UMLEditPlugin.getDefault().getImageURL("full/obj16/ParameterReturn");
//		else
//			return UMLEditPlugin.getDefault().getImageURL("full/obj16/Parameter");
		
		return super.getImage(object);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.uml.provider.GeneralizationItemProvider#getText(java.lang.Object)
	 */
	public String getText(Object object) {
		Parameter parameter = (Parameter) object;
		String name = parameter.getName();
		if (name == null || name.length() == 0) {
			name = getString("_UI_Parameter_type");
		}
				
		StringBuffer label = new StringBuffer();
		label.append(name);
		if (parameter.getType() != null) {
			label.append(" : ").append(parameter.getType().getName());
		}
		
//		label.append(displayMultiplicity(parameter));
		
		String defaultValue = parameter.getDefault();
		if (defaultValue != null && defaultValue.length() > 0) {
			label.append(" = ");
			label.append(defaultValue);
		}
		return label.toString();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.uml.provider.PropertyItemProvider#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(StructuralFeature.class)) {
			case UMLPackage.PARAMETER__TYPE:
			case UMLPackage.PARAMETER__UPPER_VALUE:
			case UMLPackage.PARAMETER__LOWER_VALUE:
			case UMLPackage.PARAMETER__DEFAULT_VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	public Object getColumnImage(Object object, int columnIndex) {
		Parameter parameter = (Parameter) object;
		Type type = parameter.getType();
		
		switch (columnIndex) {
		case IUMLTableProperties.NAME_INDEX:
			return getImage(parameter);
		case IUMLTableProperties.TYPE_INDEX: {
			if (type != null) {
				IItemLabelProvider provider = 
					(IItemLabelProvider) getAdapterFactory().adapt(
							type, IItemLabelProvider.class);
				if (provider != null)
					return provider.getImage(type);
			}
		}
		}
		
		return null;
	}

	public String getColumnText(Object object, int columnIndex) {
		Parameter parameter = (Parameter) object;
		
		switch (columnIndex) {
		case IUMLTableProperties.NAME_INDEX:
			return parameter.getName();
		case IUMLTableProperties.TYPE_INDEX:
			return (parameter.getType() == null) ? null :
					parameter.getType().getName();
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
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ICellModifier#getValue(java.lang.Object, java.lang.String)
	 */
	public Object getValue(Object element, String property) {
		Parameter parameter = (Parameter) element;
		
		if (IUMLTableProperties.NAME_PROPERTY.equals(property)) {
			return parameter.getName();
		}
		else if (IUMLTableProperties.TYPE_PROPERTY.equals(property)) {
			return parameter.getType();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ICellModifier#modify(java.lang.Object, java.lang.String, java.lang.Object)
	 */
	public void modify(final Object element, final String property, final Object value) {
		final Parameter parameter = (Parameter) element;
		
		if (IUMLTableProperties.NAME_PROPERTY.equals(property) 
				|| IUMLTableProperties.VISIBILITY_PROPERTY.equals(property)) {
			NamedElementOperations.modify(element, property, value);
			return;
		}
		
		try {
			TransactionalEditingDomain editingDomain = 
				TransactionUtil.getEditingDomain(parameter);
			
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					if (IUMLTableProperties.TYPE_PROPERTY.equals(property) 
							&& value instanceof Classifier) {
						setLabel("Set Parameter Type");
						parameter.setType((Classifier)value);
					}
					else if (IUMLTableProperties.DEFAULT_VALUE_PROPERTY.equals(property) 
							&& value instanceof String) {
						this.setLabel("Set Default Value");
						if (parameter.getDefaultValue() != null) {
							parameter.getDefaultValue().destroy();
						}
						String newValue = (String) value;
						if (newValue != null && newValue.trim().length() > 0) {
							//TODO check property type and create appropriate literal type
							LiteralString literal = UMLFactory.eINSTANCE.createLiteralString();
							literal.setValue(newValue);
							parameter.setDefaultValue(literal);
						}
					}
					else if (IUMLTableProperties.MULTIPLICITY_PROPERTY.equals(property) 
							&& value instanceof String) {
						setLabel("Set Multiplicity");
						setMultiplicity(parameter, value.toString());
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

	/**
	 * Set multiplicity parsed from a string value, e.g. "0..1" or "1..*".
	 * Must be called from within a transaction.
	 */
	private void setMultiplicity(MultiplicityElement multiplicityElement, String value ) {
		int lower = 1;
		int upper = 1;
		
		StringTokenizer stk = new StringTokenizer(value, ". ");
		if (stk.hasMoreTokens()) {
			lower = parseMultiplicityRangeToken(stk.nextToken());
			if (!stk.hasMoreTokens()) {
				if( lower == LiteralUnlimitedNatural.UNLIMITED ) {
					lower = 0;
					upper = LiteralUnlimitedNatural.UNLIMITED;
				}
				else {
					upper = lower;
				}
			} 
			else {
				upper = parseMultiplicityRangeToken(stk.nextToken());
				if (stk.hasMoreTokens()) {
					throw new IllegalArgumentException("illegal range specification: " + value);
				}
			}
		}
		
		// remove existing values so that we get change notification to update view
		if (multiplicityElement.getLowerValue() != null)
			multiplicityElement.getLowerValue().destroy();
		if (multiplicityElement.getUpperValue() != null)
			multiplicityElement.getUpperValue().destroy();

		multiplicityElement.setUpper(upper);
		multiplicityElement.setLower(lower);
	}

	/**
	 * Parse an multiplicity range token; map 'n', '*', or "unbounded" to -1
	 */
	private int parseMultiplicityRangeToken( String token ) {
		try {
			if (token.equalsIgnoreCase("n") || token.equals("*") || token.equalsIgnoreCase("unbounded"))
				return LiteralUnlimitedNatural.UNLIMITED;
			else
				return Integer.parseInt(token);
		} catch (Exception ex) {
			throw new IllegalArgumentException("illegal range bound: " + token);
		}
	}

}
