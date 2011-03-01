/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.validation;

import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.emf.hl7.mif2.State;
import org.openhealthtools.mdht.emf.hl7.mif2.StateMachineAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.Transition;
import org.openhealthtools.mdht.emf.w3c.xhtml.Img;


/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.StateMachine}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface StateMachineValidator {
	boolean validate();

	boolean validateAnnotations(StateMachineAnnotations value);
	boolean validateFigure(Img value);
	boolean validateSubState(EList<State> value);
	boolean validateTransition(EList<Transition> value);
	boolean validateStateAttributeName(String value);
}