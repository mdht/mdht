package org.openhealthtools.mdht.uml.hl7.validation.internal.classifiers.rimconstraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.hl7.validation.internal.HL7AbstractConstraint;
import org.openhealthtools.mdht.uml.hl7.validation.internal.classifiers.Associations;

public class BidirectionalAssociationConstraint extends HL7AbstractConstraint {
	
private static final String ID_BIDIRECTIONAL = ASSOCIATIONS_GROUP + "BidirectionalAssociations";
	
	public static void register(){
		Associations.registerConstraints(ID_BIDIRECTIONAL, new BidirectionalAssociationConstraint());
	}

	@Override
	public IStatus validate(IValidationContext context) {
		
	Association association  = (Association ) context.getTarget();
		
		IStatus result = context.createSuccessStatus();
		
//		System.out.println("association.getNavigableOwnedEnds().size() "+association.getNavigableOwnedEnds().size() );
//		
//		System.out.println("association.getMemberEnds().size() " + association.getMemberEnds().size() );
		
		int navigationCtr = 0;
		for (Property property : association.getMemberEnds())
		{			
			if (property.isNavigable())
			{
				navigationCtr++; 
			}
		}
		
		
		if (association.getMemberEnds().size() == navigationCtr)
		{			
			Object[] data = new Object[1];
			data[0] = association.getName();
			result = context.createFailureStatus(data);
		}
		
		return result;
	}
	

}
