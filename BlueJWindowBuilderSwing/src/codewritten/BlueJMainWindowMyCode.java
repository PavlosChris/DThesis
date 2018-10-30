package codewritten;

import gui.ClassCreationWindow;
import gui.ClassInformationPanel;
import gui.MainApplicationWindow;
import gui.PanelsWindow;
import gui.ProjectInformationPanel;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;



public class BlueJMainWindowMyCode {
	/*
		NOTE: Class Created with the purpose of not interfering with the code produced by 
		the GUI designers and NOT for creating extensible and/or easily maintainable software.
	*/
	static int newWindowX = 275;
	int newWindowY = 129;
	JPanel panel;

	MainApplicationWindow newMainWindow;
	ClassWidget firstClass;


	JTabbedPane tabbedPane;
	private static int tabIndex;
	private static int docPanelCounter;
	private ArrayList<String> appWindowNames = new ArrayList<String>();
	PanelsWindow newAppWindow = new PanelsWindow(this);

	//Main Application Window Code
	public BlueJMainWindowMyCode(final JPanel panel, final MainApplicationWindow newMainWindow) {
		initializeVariables();
		addFirstClass();
		this.panel = panel;
		this.newMainWindow = newMainWindow;
	}

	private void initializeVariables() {
		tabIndex = -1;
		docPanelCounter = 0;
	}

	public final void createNewClassWindow() {
		ClassCreationWindow newClass = new ClassCreationWindow(this);
		newClass.setVisible(true);
	}

	private void addFirstClass() {
		ClassWidget firstClass = new ClassWidget("FirstClass", 
				new ImageIcon(this.getClass().getResource("/img/ClassNull.png")).getImage(), this);
		this.firstClass = firstClass;
	}

	public final void addMouseDragMotionListener(final JButton btnFirstclass, final MouseEvent e) {
		firstClass.setWindowX(e.getX() + btnFirstclass.getX() - 25);
		firstClass.setWindowY(e.getY() + btnFirstclass.getY() - 25);

		btnFirstclass.setBounds(firstClass.getWindowX(), firstClass.getWindowY(), 93, 59);

		firstClass.setDragged(true);
		e.consume();
	}

	public final void addMouseActionListener(final ActionEvent e) {
		if (!firstClass.getDragged()) {
			addClassPanelIfPossible("FirstClass");
			newAppWindow.setVisible(true);
		}
		firstClass.setDragged(false);
	}

	public final void createClassIcon(final String className, 
			final BlueJMainWindowMyCode newReference) {
		Image img7 = new ImageIcon(this.getClass().getResource("/img/ClassNull.png")).getImage();
		ClassWidget newClass = new ClassWidget(className, img7, newReference);
		setWindowVariables(newClass);
		setupNewClassBtn(newClass);
		refreshVariables();
	}

	public final void setWindowVariables(final ClassWidget newClass) {
		newClass.setWindowX(newWindowX);
		newClass.setWindowY(newWindowY);
	}

	public final void setupNewClassBtn(final ClassWidget newClass) {
		JButton newClassBtn = new JButton();
		newClassBtn.setLayout(new GridLayout(2,1));

		setAppearanceOfNewBtn(newClassBtn, newClass);
		addClassBtnListeners(newClass, newClassBtn);
	}

	public final void setAppearanceOfNewBtn(final JButton newClassBtn, final ClassWidget newClass) {
		JLabel newJLabel = new JLabel(newClass.getName()); 
		newClassBtn.add(newJLabel);

		newClassBtn.setBounds(newClass.getWindowX(), newClass.getWindowY(), 93, 59);
		newClassBtn.setIcon(new ImageIcon(newClass.getImage()));
		panel.add(newClassBtn);
	}

	public final void addClassBtnListeners(final ClassWidget newClass, final JButton newClassBtn) {
		addClassBtnActionListener(newClass, newClassBtn);
		addClassBtnMotionListener(newClass, newClassBtn);
	}

	public final void addClassBtnActionListener(final ClassWidget newClass, 
			final JButton newClassBtn) {
		newClassBtn.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				addClassPanelToAppWindowIfPossible(newClass);
			}
		});
	}

	public final void addClassPanelToAppWindowIfPossible(final ClassWidget newClass) {
		if (!newClass.getDragged()) {
			addClassPanelIfPossible(newClass.getName());
			newAppWindow.setVisible(true);
		}
		newClass.setDragged(false);
	}

	public final void addClassBtnMotionListener(final ClassWidget newClass, 
			final JButton newClassBtn) {
		newClassBtn.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(final MouseEvent e) {
				newClass.setDragged(true);
				newClass.setWindowX(calculateNewBtnX(e, newClassBtn));
				newClass.setWindowY(calculateNewBtnY(e, newClassBtn));
				newClassBtn.setBounds(newClass.getWindowX(), 
						newClass.getWindowY(), 93, 59);
				e.consume();
			}
		});
	}

	public final int calculateNewBtnX(final MouseEvent e, final JButton newClassBtn) {
		return e.getX() + newClassBtn.getX() - 25;
	}

	public final int calculateNewBtnY(final MouseEvent e, final JButton newClassBtn) {
		return e.getY() + newClassBtn.getY() - 25;
	}

	public final void refreshVariables() {
		newWindowX += 100;
		panel.revalidate();
        panel.repaint();
	}

	//Panels Window Code
	public final void beginAddDocumentPanelProcedure() {
		addDocumentPanelIfPossible(newAppWindow);
		newAppWindow.setVisible(true);
	}

	public final void addDocumentPanelIfPossible(final PanelsWindow frame) {
		if (docPanelCounter == 0) {
			addDocumentPanel(frame);
			tabbedPane.setSelectedIndex(tabIndex);
		}
	}

	private void addDocumentPanel(final PanelsWindow frame) {
		increasePanelVariables();
		ProjectInformationPanel newDoc = new ProjectInformationPanel(tabIndex, this);
		tabbedPane.addTab("README.TXT", newDoc);
		PanelTab pnlTab = new PanelTab("README.TXT",this);
		tabbedPane.setTabComponentAt(tabIndex, pnlTab.getPnlTab());
	}

	private void increasePanelVariables() {
		docPanelCounter++;
		tabIndex++;
	}

	public final void addClassPanelIfPossible(final String name) {
		if (checkIfNameEligible(name)) {
			addClassPanel(name);
			tabbedPane.setSelectedIndex(tabIndex);
		}
	}

	private boolean checkIfNameEligible(final String newName) {
		for (int i = 0; i < appWindowNames.size(); i++) {
			if (appWindowNames.get(i).equals(newName)) {
				return false;
			}
		}
		return true;
	}

	private void addClassPanel(final String name) {
		tabIndex++;
		ClassInformationPanel newClass = new ClassInformationPanel(name, this);
		tabbedPane.addTab(name, newClass);

		PanelTab pnlTab = new PanelTab(name, this);
		tabbedPane.setTabComponentAt(tabIndex, pnlTab.getPnlTab());

		appWindowNames.add(name);
	}

	public final void clearAppWindow() {
		removeDocPanelIfExists();
		removeAndClearAllClassPanels();
	}

	private void removeDocPanelIfExists() {
		if (docPanelCounter == 1) {
			closeTab("README.TXT");
		}
		docPanelCounter = 0;
	}

	public final void closeTab(final String tabName) {
		removeTabOperation(tabName);
		removeNameIfClassRemoved(tabName);
		reduceCounterIfDocRemoved(tabName);
		disposeIfTabIndexZero();
	}

	private void removeTabOperation(final String tabName) {
		tabbedPane.remove(tabbedPane.indexOfTab(tabName));
		tabIndex--;
	}

	private void removeNameIfClassRemoved(final String tabName) {
		if (!tabName.equals("README.TXT")) {
			appWindowNames.remove(appWindowNames.indexOf(tabName));
		}
	}

	private void reduceCounterIfDocRemoved(final String tabName) {
		if (tabName.equals("README.TXT")) {
			docPanelCounter--;
		}
	}

	private void disposeIfTabIndexZero() {
		if (tabIndex == -1) {
			newAppWindow.dispose();
		}
	}

	private void removeAndClearAllClassPanels() {
		removeAllClassPanels();
		appWindowNames.clear();
	}

	private void removeAllClassPanels() {
		for (int i = 0; i  < appWindowNames.size(); i++) {
			tabbedPane.remove(tabbedPane.indexOfTab(appWindowNames.get(i)));
			tabIndex--;
		}
	}

	public final void setContentPane(final JPanel contentPane, final JTabbedPane tabbedPane) {

		this.tabbedPane = tabbedPane;
		contentPane.add(tabbedPane);
	}

	//Class Creation Window Code
	public final void addTextFieldListener(final JTextField txtClassname, final JButton btnOk) {
		txtClassname.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(final DocumentEvent arg0) {
				changeEnableabilityOkButton();
			}

			@Override
			public void insertUpdate(final DocumentEvent arg0) {
				changeEnableabilityOkButton();
			}

			@Override
			public void removeUpdate(final DocumentEvent arg0) {
				changeEnableabilityOkButton();
			}

			public void changeEnableabilityOkButton() {
				if (!txtClassname.getText().equals("")) {
					btnOk.setEnabled(true);
				} else {
					btnOk.setEnabled(false);
				}
			}

		});
	}

}
