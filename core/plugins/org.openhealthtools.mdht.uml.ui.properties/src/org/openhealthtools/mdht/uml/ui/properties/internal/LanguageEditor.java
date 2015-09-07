package org.openhealthtools.mdht.uml.ui.properties.internal;

import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.uml2.uml.Constraint;

public class LanguageEditor extends UmlUiEditor {

	private Text text;

	private Constraint constraint;

	private boolean checkDita = false;

	public void setText(Text text) {
		this.text = text;
		this.text.addFocusListener(new FocusListener() {

			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub

			}

			public void focusLost(FocusEvent e) {
				// Text t = (Text) e.widget;
				// System.out.println("LE: " + t.getText() + " check for valid ");
				checkDita = true;
			}
		});
		this.text.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				if (checkDita) {
					checkDita = false;
					// Do further process with constraint here
				}
			}
		});

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.ui.properties.internal.sections.ConstraintEditor#setConstraint(org.eclipse.uml2.uml.Constraint)
	 */
	public void setConstraint(Constraint constraint) {
		this.constraint = constraint;
	}

}
