package org.openhealthtools.mdht.api.schematron;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.api.CDAOCLHandler;
import org.openhealthtools.mdht.uml.cda.core.util.CDACommonUtils;

public class CDAOCL2XPathHandler<PK, C, O extends EModelElement, P, EL, PM, S, COA, SSA, CT, CLS, E> extends CDAOCLHandler<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> {

	@Override
	public String transformDomainSpecific(OperationCallExp<C, O> op, String opName) {
		if ("getSection".equals(opName)) {
			return trafo.step(trafo.transform(op.getSource()), "ancestor::" + trafo.nsPrefix("section") + "[1]");
		}
		if ("getClinicalDocument".equals(opName)) {
			return trafo.step(trafo.transform(op.getSource()), "ancestor::" + trafo.nsPrefix("ClinicalDocument"));
		}
		if ("hasContent".equals(opName)) {
			return trafo.predicate(trafo.transform(op.getSource()), "attribute::node()[name() != \"nullFlavor\"] | child::node()", null);
		}
		if ("isDefined".equals(opName)) {
			return trafo.step(trafo.transform(op.getSource()), "attribute::node()[name() = " + trafo.transform(op.getArgument().get(0)) + "]");
		}
		if ("getAllSections".equals(opName)) {
			return trafo.transform(op.getSource()) + "//" + trafo.nsPrefix("section");
		}
		if ("getText".equals(opName)) {
			if (op.getArgument().size() == 1) {
				return "string(" + trafo.predicate(trafo.transform(op.getSource()), "@id=" + trafo.transform(op.getArgument().get(0)), null) + "// text())";
			}
			return "string(" + trafo.transform(op.getSource()) + "//text())";
		}
		if ("validateTargetOfEntryRelationship".equals(opName)) {
			return trafo.step(trafo.transform(op.getSource()), "../@typeCode=\"REFR\"");
		}

		return super.transformDomainSpecific(op, opName);
	}

	@Override
	public String getPropertyName(P p) {
		if (p instanceof Property) {
			Property property = (Property) p;
			if (CDACommonUtils.getCDAProperty(property) != null) {
				property = CDACommonUtils.getCDAProperty(property);
				p = (P) property;
			}
			if (!(property.getType() instanceof Class)) {
				return "@" + property.getName();
			}
			for (Stereotype stereotype : property.getApplicableStereotypes()) {
				if (property.hasValue(stereotype, "xmlNamespace")) {
					Object xmlNamespace = property.getValue(stereotype, "xmlNamespace");
					if (xmlNamespace instanceof String) {
						String string = (String) xmlNamespace;
						if (!string.equals("##targetNamespace") && !string.equals("urn:hl7-org:v3")) {
							return "ext:" + property.getName();
						}
					}
				}

			}
			if (property.getNearestPackage() != null && "nehta".equals(property.getNearestPackage().getName())) {
				return "ext:" + property.getName();
			}
		}
		return "cda:" + trafo.getName(p);
	}
}
