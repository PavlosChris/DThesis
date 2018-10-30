package codewritten;

import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MainWindowVisibility {

	JButton btnUparrow, btnDownarrow, btnCancel, btnEnd, 
		btnRunTests, btnShare, button_1, button_2;
	JLabel lblTeamwork, lblTesting;
	JRadioButton rdbtnRecording;
	TextField textField;
	JPanel panel_2;

	public MainWindowVisibility(final JButton btnUparrow, final JButton btnDownarrow,
			final JButton btnCancel, final JButton btnEnd, final JButton btnRunTests,
			final JButton btnShare, final JLabel lblTeamwork, final JLabel lblTesting,
			final JRadioButton rdbtnRecording, final JButton button_1,
			final JButton button_2,
			final TextField textField, final JPanel panel_2) {
		this.btnUparrow = btnUparrow;
		this.btnDownarrow = btnDownarrow;
		this.btnCancel = btnCancel;
		this.btnEnd = btnEnd;
		this.btnRunTests = btnRunTests;
		this.btnShare = btnShare;
		this.lblTeamwork = lblTeamwork;
		this.lblTesting = lblTesting;
		this.rdbtnRecording = rdbtnRecording;
		this.button_1 = button_1;
		this.button_2 = button_2;
		this.textField = textField;
		this.panel_2 = panel_2;

	}

	public final void changeVisibilityUpArrow() {
		changeVisibilityUpDownArrows(true);
	}

	public final void changeVisibilityDownArrow() {
		changeVisibilityUpDownArrows(false);
	}

	private void changeVisibilityUpDownArrows(final boolean visibilityValue) {
		lblTeamwork.setVisible(visibilityValue);
		btnShare.setVisible(visibilityValue);
		lblTesting.setVisible(visibilityValue);
		btnRunTests.setVisible(visibilityValue);
		rdbtnRecording.setVisible(visibilityValue);
		btnEnd.setVisible(visibilityValue);
		btnCancel.setVisible(visibilityValue);
		btnDownarrow.setVisible(visibilityValue);
		btnUparrow.setVisible(!visibilityValue);
	}

	public final void changeVisibilityLeftArrow() {
		changeVisibilityLeftRightArrows(true);
	}

	public final void changeVisibilityRightArrow() {
		changeVisibilityLeftRightArrows(false);
	}

	private void changeVisibilityLeftRightArrows(final boolean visibilityValue) {
		button_2.setVisible(visibilityValue);
		button_1.setVisible(!visibilityValue);
		textField.setVisible(visibilityValue);
		panel_2.setVisible(visibilityValue);
	}

}
