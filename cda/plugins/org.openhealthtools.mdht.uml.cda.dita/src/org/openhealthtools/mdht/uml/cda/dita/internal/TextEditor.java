package org.openhealthtools.mdht.uml.cda.dita.internal;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.dita.dost.util.DitaUtil;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.dita.DitaTransformerOptions;
import org.openhealthtools.mdht.uml.cda.dita.TransformClassContent;
import org.openhealthtools.mdht.uml.ui.properties.internal.sections.ConstraintEditor;

public class TextEditor implements ConstraintEditor {

	private Text text;

	private Constraint constraint;

	private Button closeErrorTextButton;

	private Text errorText;

	private boolean checkDita = false;

	public void setText(Text text) {
		this.text = text;
		this.text.addFocusListener(new FocusListener() {

			public void focusLost(FocusEvent e) {
				checkDita = true;
			}

			public void focusGained(FocusEvent e) {
				// Not needed
			}
		});

		this.text.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				handleChange();
			}
		});
	}

	/**
	 * @return the value stored in the Dita Enabled constraint
	 *         true iff the constraint has a Boolean of true, false otherwise
	 */
	@Override
	public boolean isDitaEnabled() {
		Boolean ditaEnabled = false;
		try {
			Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
				constraint, ICDAProfileConstants.CONSTRAINT_VALIDATION);
			ditaEnabled = (Boolean) constraint.getValue(stereotype, ICDAProfileConstants.CONSTRAINT_DITA_ENABLED);
		} catch (IllegalArgumentException ex) { /* Swallow this */
		}
		return ditaEnabled;
	}

	/*
	 * (non-Javadoc)
	 *
	 * * @see org.openhealthtools.mdht.uml.ui.properties.internal.sections.ConstraintEditor#setDitaEnabled(boolean)
	 */
	@Override
	public void setDitaEnabled(boolean isEnabled) {
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
			constraint, ICDAProfileConstants.CONSTRAINT_VALIDATION);

		if (stereotype == null) {
			stereotype = CDAProfileUtil.applyCDAStereotype(constraint, ICDAProfileConstants.CONSTRAINT_VALIDATION);
		}

		constraint.setValue(stereotype, ICDAProfileConstants.CONSTRAINT_DITA_ENABLED, isEnabled);

	}

	private void handleChange() {
		if (checkDita && isDitaEnabled()) {
			runHandleChange();
		}
	}

	private void runHandleChange() {
		checkDita = false;
		IPath tmpFile = generateTempDita();
		boolean errorOccured = false;
		try {
			DitaUtil.validate(tmpFile);
		} catch (Exception exception) {
			// Add UI here
			showError(exception.toString());
			errorOccured = true;
		} finally {
			hideError(errorOccured);
		}

		// Delete the temporary folder
		try {
			FileUtils.deleteDirectory(tmpFile.toFile().getParentFile());
		} catch (IOException ioEx) {
			ioEx.printStackTrace();
		}
	}

	private void hideError(boolean errorOccured) {
		if (!errorOccured) {
			errorText.setVisible(false);
			closeErrorTextButton.setVisible(false);
		}
	}

	private void showError(String error) {
		errorText.setText(error);
		errorText.setVisible(true);
		closeErrorTextButton.setVisible(true);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.ui.properties.internal.sections.ConstraintEditor#setConstraint(org.eclipse.uml2.uml.Constraint)
	 */
	@Override
	public void setConstraint(Constraint constraint) {
		boolean firstRun = this.constraint == null && constraint != null;
		this.constraint = constraint;
		this.checkDita = true;
		if (firstRun) {
			runHandleChange();
		} else {
			handleChange();
		}
	}

	private IPath generateTempDita() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();

		// A constraint may not have a name yet, so use a made-up name in that case
		String tmpName = constraint.getContext().getName() == null
				? "tmp"
				: constraint.getContext().getName();
		IPath tmpFileInWorkspaceDir = workspace.getRoot().getLocation().append("tmp").append(tmpName).addFileExtension(
			"dita");

		DitaTransformerOptions transformerOptions = new DitaTransformerOptions();
		transformerOptions.setExampleDepth(0);

		TransformClassContent transformer = new TransformClassContent(transformerOptions);

		if (!tmpFileInWorkspaceDir.toFile().getParentFile().exists())
			tmpFileInWorkspaceDir.toFile().getParentFile().mkdirs();

		transformer.writeClassToFile((Class) constraint.getContext(), tmpFileInWorkspaceDir);
		return tmpFileInWorkspaceDir;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.ui.properties.internal.sections.ConstraintEditor#setErrorText(org.eclipse.swt.widgets.Text)
	 */
	@Override
	public void setErrorText(Text errorText) {
		this.errorText = errorText;

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.ui.properties.internal.sections.ConstraintEditor#setCloseErrorText(org.eclipse.swt.widgets.Button)
	 */
	@Override
	public void setCloseErrorText(Button closeErrorTextButton) {
		this.closeErrorTextButton = closeErrorTextButton;
	}

}
