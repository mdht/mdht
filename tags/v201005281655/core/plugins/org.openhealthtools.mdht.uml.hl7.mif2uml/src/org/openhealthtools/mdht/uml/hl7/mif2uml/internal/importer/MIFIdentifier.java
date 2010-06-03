/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
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
package org.openhealthtools.mdht.uml.hl7.mif2uml.internal.importer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.NamedElement;
import org.openhealthtools.mdht.emf.hl7.mif2.Attribute;
import org.openhealthtools.mdht.emf.hl7.mif2.ClassBase;
import org.openhealthtools.mdht.emf.hl7.mif2.Datatype;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeModelLibrary;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef;
import org.openhealthtools.mdht.emf.hl7.mif2.EntryPointBase;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.ModelElement;
import org.openhealthtools.mdht.emf.hl7.mif2.Package;
import org.openhealthtools.mdht.emf.hl7.mif2.Relationship;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase;
import org.openhealthtools.mdht.uml.hl7.mif2uml.util.MIFUtil;


/**
 *
 * @version $Id: $
 */
public class MIFIdentifier {

	private EClass metaclass;
	private String namespace;
	private String name;

	/**
	 * Create an identifier with the given name.
	 */
	public MIFIdentifier(ModelElement mifElement, String name) {
		this(mifElement);
		if (name != null) {
			this.name = name;
		}
	}

	/**
	 * Create an identifier with the given namespace and name.
	 */
	public MIFIdentifier(ModelElement mifElement, String namespace, String name) {
		metaclass = mifElement.eClass();
		this.namespace = namespace;
		this.name = name;
	}

	/**
	 * Create an identifier with a name derived from the MIF model element.
	 */
	public MIFIdentifier(DatatypeRef datatypeRef) {
		if (datatypeRef != null) {
			// use a flattened name for template bindings
			name = MIFUtil.getDatatypeName(datatypeRef);
			// Datatype metaclass to find definition of reference
			metaclass = Mif2Package.eINSTANCE.getDatatype();
		}
	}
	
	/**
	 * Create an identifier with a name derived from the MIF model element.
	 */
	public MIFIdentifier(ModelElement mifElement) {
		if (mifElement != null) {
			Package mifPackage = MIFUtil.getPackage(mifElement);
			String modelName = MIFUtil.getModelName(mifPackage);
			namespace = modelName;

			if (mifElement instanceof StaticModelBase) {
				namespace = null;
				name = MIFUtil.getModelName((StaticModelBase)mifElement);
				metaclass = Mif2Package.eINSTANCE.getStaticModelBase();
			}
			else if (mifElement instanceof DatatypeModelLibrary) {
				namespace = null;
				name = MIFUtil.getModelName((DatatypeModelLibrary)mifElement);
				metaclass = Mif2Package.eINSTANCE.getDatatypeModelLibrary();
			}
			else if (mifElement instanceof Package) {
				namespace = null;
				name = MIFUtil.getModelName((Package)mifElement);
				metaclass = Mif2Package.eINSTANCE.getPackage();
			}
			else if (mifElement instanceof Datatype) {
				name = MIFUtil.getDatatypeName((Datatype)mifElement);
				metaclass = Mif2Package.eINSTANCE.getDatatype();
			}
			else if (mifElement instanceof DatatypeOperation) {
				name = ((DatatypeOperation)mifElement).getName();
				metaclass = Mif2Package.eINSTANCE.getDatatypeOperation();
			}
			else if (mifElement instanceof ClassBase) {
				name = ((ClassBase)mifElement).getName();
				metaclass = Mif2Package.eINSTANCE.getClassBase();
			}
			else if (mifElement instanceof EntryPointBase) {
				name = ((EntryPointBase)mifElement).getName();
				metaclass = Mif2Package.eINSTANCE.getEntryPointBase();
			}
			else if (mifElement instanceof Attribute) {
				name = ((Attribute)mifElement).getName();
				metaclass = Mif2Package.eINSTANCE.getAttribute();
			}
			else if (mifElement instanceof org.openhealthtools.mdht.emf.hl7.mif2.Association) {
				metaclass = Mif2Package.eINSTANCE.getAssociation();
				name = Integer.toString(mifElement.hashCode());
			}
			else if (mifElement instanceof Relationship) {
				metaclass = Mif2Package.eINSTANCE.getRelationship();
				name = Integer.toString(mifElement.hashCode());
			}
			else {
				metaclass = mifElement.eClass();
				name = Integer.toString(mifElement.hashCode());
			}
		}
	}

	/**
	 * Create an identifier from a UML element.
	 */
	public MIFIdentifier(NamedElement element) {
		if (element != null) {
			namespace = element.getNearestPackage().getName();
			name = element.getName();
			
			if (element instanceof org.eclipse.uml2.uml.Package) {
				namespace = null;
				metaclass = Mif2Package.eINSTANCE.getStaticModelBase();
			}
			else if (element instanceof org.eclipse.uml2.uml.Class) {
				metaclass = Mif2Package.eINSTANCE.getClassBase();
			}
			else if (element instanceof org.eclipse.uml2.uml.DataType) {
				metaclass = Mif2Package.eINSTANCE.getDatatype();
			}
//			else if (element instanceof org.eclipse.uml2.uml.Interface) {
//				metaclass = Mif2Package.eINSTANCE.getEntryPointBase();
//			}
			else if (element instanceof org.eclipse.uml2.uml.Interface) {
				metaclass = Mif2Package.eINSTANCE.getDatatype();
			}
			else if (element instanceof org.eclipse.uml2.uml.Property) {
				if (((org.eclipse.uml2.uml.Property)element).getAssociation() != null)
					metaclass = Mif2Package.eINSTANCE.getAssociationEndBase();
				else
					metaclass = Mif2Package.eINSTANCE.getAttribute();
			}
			else if (element instanceof org.eclipse.uml2.uml.Association) {
				metaclass = Mif2Package.eINSTANCE.getRelationship();
			}
			else if (element instanceof org.eclipse.uml2.uml.Generalization) {
				metaclass = Mif2Package.eINSTANCE.getRelationship();
			}
		}
	}

	public EClass getMetaclass() {
		return metaclass;
	}

	public String getName() {
		return name;
	}

	public String getNamespace() {
		return namespace;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || (obj.getClass() != this.getClass())) {
			return false;
		}

		MIFIdentifier test = (MIFIdentifier) obj;
		return metaclass == test.metaclass
			&& ( namespace == test.namespace || (namespace != null && namespace.equals(test.namespace)))
			&& ( name == test.name || (name != null && name.equals(test.name)));
	}

	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + (null == metaclass ? 0 : metaclass.hashCode());
		hash = 31 * hash + (null == namespace ? 0 : namespace.hashCode());
		hash = 31 * hash + (null == name ? 0 : name.hashCode());
		
		return hash;
	}

	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("[");
		buf.append(metaclass != null ? metaclass.getName() : "null");
		buf.append(", ");
		buf.append(namespace);
		buf.append(", ");
		buf.append(name);
		buf.append("]");
		return buf.toString();
	}
	
}
