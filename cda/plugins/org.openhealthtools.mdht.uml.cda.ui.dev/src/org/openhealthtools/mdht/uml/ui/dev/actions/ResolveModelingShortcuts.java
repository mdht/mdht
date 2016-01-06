package org.openhealthtools.mdht.uml.ui.dev.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.openhealthtools.mdht.uml.cda.core.profile.SeverityKind;
import org.openhealthtools.mdht.uml.cda.core.profile.Validation;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;

/**
 * ResolveModelingShortcuts
 * Utility to resolve the CDA modeling shorts into complete UML structures
 *
 * @author seanmuir
 *
 */
public class ResolveModelingShortcuts implements IObjectActionDelegate {

	@SuppressWarnings("deprecation")
	private void setInline(Class inlineClass) {

		org.eclipse.uml2.uml.util.UMLUtil.StereotypeApplicationHelper.INSTANCE.applyStereotype(
			inlineClass, org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage.eINSTANCE.getInline());

	}

	private NamedElement element;

	private void addComponent3(org.eclipse.uml2.uml.Class stucturedBody, Property p) {

		Class component3 = UMLFactory.eINSTANCE.createClass();

		Collection<NamedElement> ne = org.eclipse.uml2.uml.util.UMLUtil.findNamedElements(
			p.eResource().getResourceSet(), "cda::Component3");

		component3.setName("Component");

		for (Iterator<NamedElement> neIter = ne.iterator(); neIter.hasNext();) {
			component3.createGeneralization((Classifier) neIter.next());
			break;
		}

		Association a = stucturedBody.createAssociation(
			true, AggregationKind.COMPOSITE_LITERAL, p.getName(), 1, 1, component3, false, AggregationKind.NONE_LITERAL,
			"", 0, 1);

		setSubset(stucturedBody, p.getName(), component3, "component");

		Stereotype s = CDAProfileUtil.applyCDAStereotype(a, ICDAProfileConstants.ASSOCIATION_VALIDATION);

		Validation validation = (Validation) a.getStereotypeApplication(s);

		validation.setSeverity(SeverityKind.ERROR);

		stucturedBody.getNestedClassifiers().add(component3);

		setInline(component3);

		a = component3.createAssociation(
			true, AggregationKind.COMPOSITE_LITERAL, p.getName(), p.getLower(), p.getUpper(), p.getType(), false,
			AggregationKind.NONE_LITERAL, "", 0, 1);

		setSubset(component3, p.getName(), (Class) p.getType(), "section");

		s = CDAProfileUtil.applyCDAStereotype(a, ICDAProfileConstants.ASSOCIATION_VALIDATION);

		validation = (Validation) a.getStereotypeApplication(s);

		Validation v2 = (Validation) p.getStereotypeApplication(s);
		if (v2 == null) {
			v2 = (Validation) p.getAssociation().getStereotypeApplication(s);
		}

		validation.setSeverity(v2.getSeverity());
		validation.getRuleId().addAll(v2.getRuleId());

		// stucturedBody.getNestedClassifiers().add(component3);

	}

	void setSubset(Class sourceClass, String sourcePropertyName, Class sourcePropertyType, String basePropertyName) {

		Class baseClass = CDAModelUtil.getCDAClass(sourceClass);
		if (baseClass != null) {
			Property baseProperty = baseClass.getOwnedAttribute(basePropertyName, null);

			Property newProperty = sourceClass.getOwnedAttribute(sourcePropertyName, sourcePropertyType);
			if (baseProperty != null && newProperty != null) {

				newProperty.getSubsettedProperties().add(baseProperty);
			}
		}

	}

	private Class createStucturedBody(org.eclipse.uml2.uml.Class clinicalDocument) {

		Class component2 = UMLFactory.eINSTANCE.createClass();

		Collection<NamedElement> ne = org.eclipse.uml2.uml.util.UMLUtil.findNamedElements(
			clinicalDocument.eResource().getResourceSet(), "cda::Component2");

		component2.setName("Component");

		clinicalDocument.getNestedClassifiers().add(component2);

		setInline(component2);

		for (Iterator<NamedElement> neIter = ne.iterator(); neIter.hasNext();) {
			component2.createGeneralization((Classifier) neIter.next());
			break;
		}

		Association a = clinicalDocument.createAssociation(
			true, AggregationKind.COMPOSITE_LITERAL, "component", 1, 1, component2, false, AggregationKind.NONE_LITERAL,
			"", 0, 1);

		setSubset(clinicalDocument, "component", component2, "component");

		Stereotype s = CDAProfileUtil.applyCDAStereotype(a, ICDAProfileConstants.ASSOCIATION_VALIDATION);

		Validation validation = (Validation) a.getStereotypeApplication(s);

		validation.setSeverity(SeverityKind.ERROR);

		Class structuredBody = UMLFactory.eINSTANCE.createClass();

		structuredBody.setName("StructuredBody");

		component2.getNestedClassifiers().add(structuredBody);
		setInline(structuredBody);

		ne = org.eclipse.uml2.uml.util.UMLUtil.findNamedElements(
			clinicalDocument.eResource().getResourceSet(), "cda::StructuredBody");

		for (Iterator<NamedElement> neIter = ne.iterator(); neIter.hasNext();) {
			structuredBody.createGeneralization((Classifier) neIter.next());
			break;
		}

		a = component2.createAssociation(
			true, AggregationKind.COMPOSITE_LITERAL, "structuredBody", 1, 1, structuredBody, false,
			AggregationKind.NONE_LITERAL, "", 0, 1);

		setSubset(component2, "structuredBody", structuredBody, "structuredBody");

		s = CDAProfileUtil.applyCDAStereotype(a, ICDAProfileConstants.ASSOCIATION_VALIDATION);

		validation = (Validation) a.getStereotypeApplication(s);

		validation.setSeverity(SeverityKind.ERROR);

		return structuredBody;

	}

	private void addEntry(org.eclipse.uml2.uml.Class section, Property p) {

		Class entry = UMLFactory.eINSTANCE.createClass();

		Collection<NamedElement> ne = org.eclipse.uml2.uml.util.UMLUtil.findNamedElements(
			p.eResource().getResourceSet(), "cda::Entry");

		entry.setName(p.getType().getName() + "Entry");

		for (Iterator<NamedElement> neIter = ne.iterator(); neIter.hasNext();) {
			entry.createGeneralization((Classifier) neIter.next());
			break;
		}

		section.getNestedClassifiers().add(entry);

		setInline(entry);

		Association a = section.createAssociation(
			true, AggregationKind.COMPOSITE_LITERAL, "entry", 1, 1, entry, false, AggregationKind.NONE_LITERAL, "", 0,
			1);

		setSubset(section, "entry", entry, "entry");

		Stereotype s = CDAProfileUtil.applyCDAStereotype(a, ICDAProfileConstants.ASSOCIATION_VALIDATION);

		Validation validation = (Validation) a.getStereotypeApplication(s);

		validation.setSeverity(SeverityKind.ERROR);

		// section.getNestedClassifiers().add(entry);

		a = entry.createAssociation(
			true, AggregationKind.COMPOSITE_LITERAL, p.getName(), p.getLower(), p.getUpper(), p.getType(), false,
			AggregationKind.NONE_LITERAL, "", 0, 1);

		Class csClass = CDAModelUtil.getCDAClass((Classifier) p.getType());

		String target = Character.toLowerCase(csClass.getName().charAt(0)) + csClass.getName().substring(1);

		setSubset(entry, p.getName(), (Class) p.getType(), target);

		s = CDAProfileUtil.applyCDAStereotype(a, ICDAProfileConstants.ASSOCIATION_VALIDATION);

		validation = (Validation) a.getStereotypeApplication(s);

		Validation v2 = (Validation) p.getStereotypeApplication(s);
		if (v2 == null) {
			v2 = (Validation) p.getAssociation().getStereotypeApplication(s);
		}

		validation.setSeverity(v2.getSeverity());
		validation.getRuleId().addAll(v2.getRuleId());

	}

	private void addEntryRelationship(org.eclipse.uml2.uml.Class clinicalStatment, Property p) {

		Class entryRelationship = UMLFactory.eINSTANCE.createClass();

		Collection<NamedElement> ne = org.eclipse.uml2.uml.util.UMLUtil.findNamedElements(
			p.eResource().getResourceSet(), "cda::EntryRelationship");

		entryRelationship.setName(p.getType().getName() + "EntryRelationship");

		for (Iterator<NamedElement> neIter = ne.iterator(); neIter.hasNext();) {
			entryRelationship.createGeneralization((Classifier) neIter.next());
			break;
		}

		clinicalStatment.getNestedClassifiers().add(entryRelationship);

		setInline(entryRelationship);

		Association a = clinicalStatment.createAssociation(
			true, AggregationKind.COMPOSITE_LITERAL, "entryRelationship", 1, 1, entryRelationship, false,
			AggregationKind.NONE_LITERAL, "", 0, 1);

		setSubset(clinicalStatment, "entryRelationship", entryRelationship, "entryRelationship");

		Stereotype s = CDAProfileUtil.applyCDAStereotype(a, ICDAProfileConstants.ASSOCIATION_VALIDATION);

		Validation validation = (Validation) a.getStereotypeApplication(s);

		validation.setSeverity(SeverityKind.ERROR);

		a = entryRelationship.createAssociation(
			true, AggregationKind.COMPOSITE_LITERAL, p.getName(), p.getLower(), p.getUpper(), p.getType(), false,
			AggregationKind.NONE_LITERAL, "", 0, 1);

		Class csClass = CDAModelUtil.getCDAClass((Classifier) p.getType());

		String target = Character.toLowerCase(csClass.getName().charAt(0)) + csClass.getName().substring(1);

		setSubset(entryRelationship, p.getName(), (Class) p.getType(), target);

		s = CDAProfileUtil.applyCDAStereotype(a, ICDAProfileConstants.ASSOCIATION_VALIDATION);

		validation = (Validation) a.getStereotypeApplication(s);

		Validation v2 = (Validation) p.getStereotypeApplication(s);
		if (v2 == null) {
			v2 = (Validation) p.getAssociation().getStereotypeApplication(s);

		}

		if (v2 == null) {
			s = CDAProfileUtil.getAppliedCDAStereotype(p, ICDAProfileConstants.ENTRY_RELATIONSHIP);
			v2 = (Validation) p.getStereotypeApplication(s);
		}

		if (v2 == null) {
			s = CDAProfileUtil.getAppliedCDAStereotype(p.getAssociation(), ICDAProfileConstants.ENTRY_RELATIONSHIP);
			v2 = (Validation) p.getAssociation().getStereotypeApplication(s);
		}

		if (v2 != null) {
			validation.setSeverity(v2.getSeverity());
			validation.getRuleId().addAll(v2.getRuleId());
		}

	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(element);
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Fix comments") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {

					TreeIterator<EObject> iterator = EcoreUtil.getAllContents(Collections.singletonList(element));

					while (iterator != null && iterator.hasNext()) {
						EObject eObject = iterator.next();
						if (org.eclipse.uml2.uml.Class.class.isInstance(eObject)) {

							org.eclipse.uml2.uml.Class umlClass = (Class) eObject;

							if (CDAModelUtil.isClinicalDocument(umlClass)) {

								boolean hasSection = false;
								for (Property property : umlClass.getOwnedAttributes()) {

									if (property.getAssociation() != null) {

										if (CDAModelUtil.isSection(property.getType())) {
											hasSection = true;
										}
									}
								}

								if (hasSection) {
									Class stucturedBody = createStucturedBody(umlClass);

									ArrayList<Property> toberemoved = new ArrayList<Property>();
									for (Property property : umlClass.getOwnedAttributes()) {

										if (property.getAssociation() != null) {

											if (CDAModelUtil.isSection(property.getType())) {

												addComponent3(stucturedBody, property);
												toberemoved.add(property);
											}

										}

									}
									for (Property p : toberemoved) {
										p.destroy();
									}
								}

							}

							if (CDAModelUtil.isSection(umlClass)) {

								ArrayList<Property> entries = new ArrayList<Property>();

								for (Property property : umlClass.getOwnedAttributes()) {

									if (property.getAssociation() != null &&
											CDAModelUtil.isClinicalStatement(property.getType())) {

										entries.add(property);

									}

								}

								for (Property property : entries) {
									addEntry(umlClass, property);
								}

								for (Property property : entries) {
									property.destroy();
								}
							}

							if (CDAModelUtil.isClinicalStatement(umlClass)) {

								ArrayList<Property> entryRelationships = new ArrayList<Property>();

								for (Property property : umlClass.getOwnedAttributes()) {

									if (property.getAssociation() != null &&
											CDAModelUtil.isClinicalStatement(property.getType())) {

										entryRelationships.add(property);

									}

								}

								for (Property property : entryRelationships) {
									addEntryRelationship(umlClass, property);
								}

								for (Property property : entryRelationships) {
									property.destroy();
								}
							}

						}
					}

					return Status.OK_STATUS;
				}
			};

			try {
				IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
				operation.addContext(commandStack.getDefaultUndoContext());
				commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), null);

			} catch (ExecutionException ee) {
				// Logger.logException(ee);
			}

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		element = null;

		if (((IStructuredSelection) selection).size() == 1) {
			Object selected = ((IStructuredSelection) selection).getFirstElement();
			if (selected instanceof IAdaptable) {
				selected = ((IAdaptable) selected).getAdapter(EObject.class);
			}
			if (selected instanceof NamedElement) {
				element = (NamedElement) selected;
			}
		}

		action.setEnabled(element != null);
	}

}
