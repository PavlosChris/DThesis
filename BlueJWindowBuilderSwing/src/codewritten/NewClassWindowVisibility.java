package codewritten;

import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class NewClassWindowVisibility {

	private JToggleButton tglbtnStride, tglbtnJava;
	private JRadioButton rdbtnUnitTest, rdbtnEnum, rdbtnJavafxClass,
	rdbtnAbstractClass, rdbtnInterface, rdbtnClass;
	private JRadioButton[] radioButtons;
	
	public NewClassWindowVisibility(final JToggleButton tglbtnStride,
			final JToggleButton tglbtnJava, final JRadioButton rdbtnUnitTest,
			final JRadioButton rdbtnEnum, final JRadioButton rdbtnJavafxClass,
			final JRadioButton rdbtnAbstractClass, final JRadioButton rdbtnInterface,
			final JRadioButton rdbtnClass) {
		this.tglbtnStride = tglbtnStride;
		this.tglbtnJava = tglbtnJava;
		this.rdbtnUnitTest = rdbtnUnitTest;
		this.rdbtnEnum = rdbtnEnum;
		this.rdbtnJavafxClass = rdbtnJavafxClass;
		this.rdbtnAbstractClass = rdbtnAbstractClass;
		this.rdbtnInterface = rdbtnInterface;
		this.rdbtnClass = rdbtnClass;
		radioButtons = new JRadioButton[]{rdbtnUnitTest, rdbtnEnum, rdbtnJavafxClass, 
				rdbtnAbstractClass, rdbtnInterface, rdbtnClass};
	}

	public void setToggleButtonJavaVisibility() {
		tglbtnStride.setSelected(false);
		changeRadioButtonVisibility(true);
	}

	public void setToggleBtnStrideVisibiity() {
		tglbtnJava.setSelected(false);
		changeRadioButtonVisibility(false);
	}

	private void changeRadioButtonVisibility(boolean visibilityValue) {
		rdbtnUnitTest.setVisible(visibilityValue);
		rdbtnEnum.setVisible(visibilityValue);
		rdbtnJavafxClass.setVisible(visibilityValue);
	}

	public void setRdBtnClassVisibility() {
		setRdButtonSelected(rdbtnClass);
	}

	public void setRdBtnAbstractClassVisibility() {
		setRdButtonSelected(rdbtnAbstractClass);
	}

	public void setRdBtnInterfaceVisibility() {
		setRdButtonSelected(rdbtnInterface);
	}

	public void setRdBtnUnitTestVisibility() {
		setRdButtonSelected(rdbtnUnitTest);
	}

	public void setRdBtnEnumVisibility() {
		setRdButtonSelected(rdbtnEnum);
	}

	public void setRdBtnJavaFXClassVisibility() {
		setRdButtonSelected(rdbtnJavafxClass);
	}

	private void setRdButtonSelected(JRadioButton buttonSelected) {
		for (int i = 0; i < 6; i++) {
			if (buttonSelected != radioButtons[i]) radioButtons[i].setSelected(false);
		}
	}
}
