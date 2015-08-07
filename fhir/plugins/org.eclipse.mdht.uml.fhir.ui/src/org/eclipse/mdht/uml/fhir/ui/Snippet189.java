package org.eclipse.mdht.uml.fhir.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Snippet189 {

	  public static void main(String[] args) {
	    Display display = new Display();
	    Shell shell = new Shell(display);
	    shell.setText("StyledText with underline and strike through");
	    shell.setLayout(new FillLayout());
	    StyledText text = new StyledText(shell, SWT.BORDER);
	    text.setText("0123456789 ABCDEFGHIJKLM NOPQRSTUVWXYZ");
	    // make 0123456789 appear underlined
	    StyleRange style1 = new StyleRange();
	    style1.start = 0;
	    style1.length = 10;
	    style1.underline = true;
	    text.setStyleRange(style1);
	    // make ABCDEFGHIJKLM have a strike through
	    StyleRange style2 = new StyleRange();
	    style2.start = 11;
	    style2.length = 13;
	    style2.strikeout = true;
	    text.setStyleRange(style2);
	    // make NOPQRSTUVWXYZ appear underlined and have a strike through
	    StyleRange style3 = new StyleRange();
	    style3.start = 25;
	    style3.length = 13;
	    style3.underline = true;
	    style3.strikeout = true;
	    text.setStyleRange(style3);
	    shell.pack();
	    shell.open();
	    while (!shell.isDisposed()) {
	      if (!display.readAndDispatch())
	        display.sleep();
	    }
	    display.dispose();
	  }
	}