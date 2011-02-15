package org.openhealthtools.mdht.uml.cda.tests;

import java.util.LinkedList;
import java.util.Queue;

import org.eclipse.emf.common.util.Diagnostic;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil.ValidationHandler;

public class DiagnosticOutputHelper 
{
	// iterative breadth-first traversal of diagnostic tree using queue
	public static void processDiagnostic(Diagnostic diagnostic, ValidationHandler handler) 
	{
		Queue<Diagnostic> queue = new LinkedList<Diagnostic>();
		queue.add(diagnostic);	// root
		while (!queue.isEmpty()) 
		{
			Diagnostic d = queue.remove();
			handleDiagnostic(d, handler);	// visit
			for (Diagnostic childDiagnostic : d.getChildren()) 
			{	// process successors
				queue.add(childDiagnostic);
			}
		}
	}
	
	public static void handleDiagnostic(Diagnostic diagnostic, ValidationHandler handler) 
	{
		switch (diagnostic.getSeverity()) 
		{
			case Diagnostic.ERROR:
				handler.handleError(diagnostic);
				break;
			case Diagnostic.WARNING:
				handler.handleWarning(diagnostic);
				break;
			case Diagnostic.INFO:
				handler.handleInfo(diagnostic);
				break;
		}
	}
}
