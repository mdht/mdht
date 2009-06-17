/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.validation;

import org.openhealthtools.mdht.emf.hl7.mif2.Point;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.GraphConnector}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GraphConnectorValidator {
	boolean validate();

	boolean validatePosition(Point value);
	boolean validateConnectToShapeId(String value);
}
