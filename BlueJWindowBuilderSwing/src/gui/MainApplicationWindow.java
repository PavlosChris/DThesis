package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.TextField;
import java.awt.event.MouseMotionAdapter;
import javax.swing.border.LineBorder;

import codewritten.BlueJMainWindowMyCode;
import codewritten.MainWindowVisibility;

import java.awt.Insets;

public class MainApplicationWindow {

	private static JFrame frame;
  private JPanel panel = new JPanel();
  private BlueJMainWindowMyCode newReference = new BlueJMainWindowMyCode(panel, this); //added
  private MainWindowVisibility newVisibility; //added

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApplicationWindow mainWindow = new MainApplicationWindow();
					mainWindow.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainApplicationWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame("BlueJ");
		frame.setResizable(false);
		frame.setBounds(100, 100, 772, 672);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnProject = new JMenu("Project");
		menuBar.add(mnProject);
		
		JMenuItem mntmNewProject = new JMenuItem("New Project...");
		mnProject.add(mntmNewProject);
		
		JMenuItem mntmOpenProject = new JMenuItem("Open Project");
		mnProject.add(mntmOpenProject);
		
		JMenu mnOpenRecent = new JMenu("Open Recent");
		mnProject.add(mnOpenRecent);
		
		JMenuItem mntmCusersuserdocumentsbluej = new JMenuItem("C:\\Users\\User1\\Documents\\BlueJ");
		mnOpenRecent.add(mntmCusersuserdocumentsbluej);
		
		JMenuItem mntmOpenNonBluej = new JMenuItem("Open Non BlueJ...");
		mnProject.add(mntmOpenNonBluej);
		
		JMenuItem mntmOpenZipjar = new JMenuItem("Open ZIP/JAR...");
		mnProject.add(mntmOpenZipjar);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mnProject.add(mntmClose);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnProject.add(mntmSave);
		
		JMenuItem mntmSaveAs = new JMenuItem("Save As...");
		mnProject.add(mntmSaveAs);
		
		JSeparator separator = new JSeparator();
		mnProject.add(separator);
		
		JMenuItem mntmImport = new JMenuItem("Import...");
		mnProject.add(mntmImport);
		
		JMenuItem mntmCreateJarFile = new JMenuItem("Create Jar File...");
		mnProject.add(mntmCreateJarFile);
		
		JSeparator separator_1 = new JSeparator();
		mnProject.add(separator_1);
		
		JMenuItem mntmPrint = new JMenuItem("Print...");
		mnProject.add(mntmPrint);
		
		JSeparator separator_2 = new JSeparator();
		mnProject.add(separator_2);
		
		JMenuItem mntmQuit = new JMenuItem("Quit");
		mnProject.add(mntmQuit);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmNewClass = new JMenuItem("New Class...");
		mnEdit.add(mntmNewClass);
		
		JMenuItem mntmNewPackage = new JMenuItem("New Package...");
		mnEdit.add(mntmNewPackage);
		
		JMenuItem mntmNewCssItem = new JMenuItem("New CSS Item...");
		mnEdit.add(mntmNewCssItem);
		
		JMenuItem mntmAddClassFrom = new JMenuItem("Add Class From File...");
		mnEdit.add(mntmAddClassFrom);
		
		JMenuItem mntmDelete = new JMenuItem("Delete");
		mnEdit.add(mntmDelete);
		
		JSeparator separator_3 = new JSeparator();
		mnEdit.add(separator_3);
		
		JMenuItem mntmNewInheritanceArrow = new JMenuItem("New Inheritance Arrow...");
		mnEdit.add(mntmNewInheritanceArrow);
		
		JMenu mnTools = new JMenu("Tools");
		menuBar.add(mnTools);
		
		JMenuItem mntmCompile = new JMenuItem("Compile");
		mnTools.add(mntmCompile);
		
		JMenuItem mntmCompileSelected = new JMenuItem("Compile Selected");
		mnTools.add(mntmCompileSelected);
		
		JMenuItem mntmRebuildPackage = new JMenuItem("Rebuild Package");
		mnTools.add(mntmRebuildPackage);
		
		JMenuItem mntmResetJavaVirtual = new JMenuItem("Reset Java Virtual Machine");
		mnTools.add(mntmResetJavaVirtual);
		
		JSeparator separator_4 = new JSeparator();
		mnTools.add(separator_4);
		
		JMenuItem mntmUseLibraryClass = new JMenuItem("Use Library Class...");
		mnTools.add(mntmUseLibraryClass);
		
		JMenuItem mntmProjectDocumentation = new JMenuItem("Project Documentation");
		mnTools.add(mntmProjectDocumentation);
		
		JMenu mnTesting = new JMenu("Testing");
		mnTools.add(mnTesting);
		
		JMenuItem mntmRunTests = new JMenuItem("Run Tests");
		mnTesting.add(mntmRunTests);
		
		JMenuItem mntmEndRecording = new JMenuItem("End Recording");
		mntmEndRecording.setEnabled(false);
		mnTesting.add(mntmEndRecording);
		
		JMenuItem mntmCancelRecording = new JMenuItem("Cancel Recording");
		mntmCancelRecording.setEnabled(false);
		mnTesting.add(mntmCancelRecording);
		
		JMenu mnTeam = new JMenu("Team");
		mnTools.add(mnTeam);
		
		JMenuItem mntmCheckoutProject = new JMenuItem("Checkout Project...");
		mnTeam.add(mntmCheckoutProject);
		
		JMenuItem mntmShareThisProject = new JMenuItem("Share this Project...");
		mnTeam.add(mntmShareThisProject);
		
		JSeparator separator_9 = new JSeparator();
		mnTeam.add(separator_9);
		
		JMenuItem mntmUpdateFromRepository = new JMenuItem("Update from Repository...");
		mntmUpdateFromRepository.setEnabled(false);
		mnTeam.add(mntmUpdateFromRepository);
		
		JMenuItem mntmCommitToRepository = new JMenuItem("Commit to Repository...");
		mntmCommitToRepository.setEnabled(false);
		mnTeam.add(mntmCommitToRepository);
		
		JMenuItem mntmStatus = new JMenuItem("Status");
		mntmStatus.setEnabled(false);
		mnTeam.add(mntmStatus);
		
		JMenuItem mntmProjectHistory = new JMenuItem("Project History");
		mntmProjectHistory.setEnabled(false);
		mnTeam.add(mntmProjectHistory);
		
		JSeparator separator_10 = new JSeparator();
		mnTeam.add(separator_10);
		
		JMenuItem mntmTeamworkSettings = new JMenuItem("Teamwork Settings...");
		mntmTeamworkSettings.setEnabled(false);
		mnTeam.add(mntmTeamworkSettings);
		
		JSeparator separator_5 = new JSeparator();
		mnTools.add(separator_5);
		
		JMenuItem mntmPreferences = new JMenuItem("Preferences...");
		mnTools.add(mntmPreferences);
		
		JSeparator separator_6 = new JSeparator();
		mnTools.add(separator_6);
		
		JMenuItem mntmSubmit = new JMenuItem("Submit...");
		mntmSubmit.setEnabled(false);
		mnTools.add(mntmSubmit);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		
		JCheckBoxMenuItem chckbxmntmShowUses = new JCheckBoxMenuItem("Show Uses");
		chckbxmntmShowUses.setSelected(true);
		mnView.add(chckbxmntmShowUses);
		
		JCheckBoxMenuItem chckbxmntmShowInheritance = new JCheckBoxMenuItem("Show Inheritance");
		chckbxmntmShowInheritance.setSelected(true);
		mnView.add(chckbxmntmShowInheritance);
		
		JSeparator separator_7 = new JSeparator();
		mnView.add(separator_7);
		
		JCheckBoxMenuItem chckbxmntmShowDebugger = new JCheckBoxMenuItem("Show Debugger");
		mnView.add(chckbxmntmShowDebugger);
		
		JCheckBoxMenuItem chckbxmntmShowTerminal = new JCheckBoxMenuItem("Show Terminal");
		mnView.add(chckbxmntmShowTerminal);
		
		JCheckBoxMenuItem chckbxmntmShowCodePad = new JCheckBoxMenuItem("Show Code Pad");
		mnView.add(chckbxmntmShowCodePad);
		
		JCheckBoxMenuItem chckbxmntmShowTeamAnd = new JCheckBoxMenuItem("Show Team and Test Controls");
		mnView.add(chckbxmntmShowTeamAnd);
		
		JCheckBoxMenuItem chckbxmntmShowTestResults = new JCheckBoxMenuItem("Show Test Results");
		mnView.add(chckbxmntmShowTestResults);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAboutBluej = new JMenuItem("About BlueJ");
		mnHelp.add(mntmAboutBluej);
		
		JMenuItem mntmCheckVersion = new JMenuItem("Check Version...");
		mnHelp.add(mntmCheckVersion);
		
		JMenuItem mntmCopyright = new JMenuItem("Copyright");
		mnHelp.add(mntmCopyright);
		
		JMenuItem mntmInstalledExtentions = new JMenuItem("Installed Extentions");
		mnHelp.add(mntmInstalledExtentions);
		
		JSeparator separator_8 = new JSeparator();
		mnHelp.add(separator_8);
		
		JMenuItem mntmBluejWebSite = new JMenuItem("BlueJ Web Site");
		mnHelp.add(mntmBluejWebSite);
		
		JMenuItem mntmOnlineDocumentation = new JMenuItem("Online Documentation");
		mnHelp.add(mntmOnlineDocumentation);
		
		JMenuItem mntmInteractiveTutorial = new JMenuItem("Interactive Tutorial");
		mnHelp.add(mntmInteractiveTutorial);
		
		JMenuItem mntmJavaClassLibraries = new JMenuItem("Java Class Libraries");
		mnHelp.add(mntmJavaClassLibraries);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewClass = new JButton("New Class...");
		btnNewClass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    newReference.createNewClassWindow();
			}
		});
		btnNewClass.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewClass.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 10));
		btnNewClass.setBounds(10, 23, 98, 23);
		frame.getContentPane().add(btnNewClass);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(this.getClass().getResource("/img/arrow.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(10, 55, 98, 23);
		frame.getContentPane().add(button);
		
		JLabel lblMachineStatus = new JLabel("Initialising virtual machine... Done.");
		lblMachineStatus.setBounds(10, 584, 288, 25);
		frame.getContentPane().add(lblMachineStatus);
		
		JButton btnCompile = new JButton("Compile");
		btnCompile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMachineStatus.setText("Compiling... Done");
			}
		});
		btnCompile.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCompile.setBounds(10, 89, 98, 23);
		frame.getContentPane().add(btnCompile);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(558, 584, 146, 25);
		frame.getContentPane().add(progressBar);
		
		JButton btnReturn = new JButton("");
		btnReturn.setIcon(new ImageIcon(this.getClass().getResource("/img/return.png")));
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMachineStatus.setText("Initialising virtual machine... Done");
			}
		});
		btnReturn.setBounds(714, 584, 33, 25);
		frame.getContentPane().add(btnReturn);
		
		JLabel lblTeamwork = new JLabel("Teamwork");
		lblTeamwork.setVisible(false);
		lblTeamwork.setForeground(Color.GRAY);
		lblTeamwork.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTeamwork.setBounds(10, 194, 119, 19);
		frame.getContentPane().add(lblTeamwork);
		
		JButton btnShare = new JButton("Share...");
		btnShare.setVisible(false);
		btnShare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnShare.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnShare.setBounds(20, 215, 88, 23);
		frame.getContentPane().add(btnShare);
		
		JButton btnUparrow = new JButton("");
		btnUparrow.setIcon(new ImageIcon(this.getClass().getResource("/img/UpArrow.png")));
		btnUparrow.setBounds(37, 382, 45, 16);
		frame.getContentPane().add(btnUparrow);
		btnUparrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    newVisibility.changeVisibilityUpArrow();
			}
		});
		
		JLabel lblTesting = new JLabel("Testing");
		lblTesting.setVisible(false);
		lblTesting.setForeground(Color.GRAY);
		lblTesting.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTesting.setBounds(10, 243, 98, 20);
		frame.getContentPane().add(lblTesting);
		
		JButton btnRunTests = new JButton("Run Tests");
		btnRunTests.setVisible(false);
		btnRunTests.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRunTests.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnRunTests.setBounds(20, 265, 88, 23);
		frame.getContentPane().add(btnRunTests);
		
		JRadioButton rdbtnRecording = new JRadioButton("recording");
		rdbtnRecording.setVisible(false);
		rdbtnRecording.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rdbtnRecording.setEnabled(false);
		rdbtnRecording.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnRecording.setBounds(20, 295, 98, 20);
		frame.getContentPane().add(rdbtnRecording);
		
		JButton btnEnd = new JButton("End");
		btnEnd.setVisible(false);
		btnEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEnd.setEnabled(false);
		btnEnd.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnEnd.setBounds(49, 322, 59, 23);
		frame.getContentPane().add(btnEnd);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setVisible(false);
		btnCancel.setMargin(new Insets(2, 11, 2, 14));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setEnabled(false);
		btnCancel.setHorizontalAlignment(SwingConstants.LEFT);
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCancel.setBounds(49, 348, 59, 23);
		frame.getContentPane().add(btnCancel);
		
		JButton btnDownarrow = new JButton("");
		btnDownarrow.setIcon(new ImageIcon(this.getClass().getResource("/img/DownArrow.png")));
		btnDownarrow.setVisible(false);
		btnDownarrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    newVisibility.changeVisibilityDownArrow();
			}
		});
		btnDownarrow.setBounds(37, 167, 45, 16);
		frame.getContentPane().add(btnDownarrow);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(141, 23, 605, 370);
		frame.getContentPane().add(scrollPane);
		
		panel.setBackground(new Color(253, 245, 230));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JButton btnDocument = new JButton("");
		btnDocument.setBounds(10, 11, 51, 59);
		panel.add(btnDocument);
		btnDocument.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    newReference.beginAddDocumentPanelProcedure();
			}
		});
		btnDocument.setIcon(new ImageIcon(this.getClass().getResource("/img/document.png")));
		
		JButton btnFirstclass = new JButton("");
		btnFirstclass.setBounds(179, 39, 93, 59);
		btnFirstclass.setIcon(new ImageIcon(this.getClass().getResource("/img/ClassNull.png")));
		panel.add(btnFirstclass);
		
		JLabel lblFirstclass = new JLabel("FirstClass");
		lblFirstclass.setBounds(115, 48, 46, 14);
		
		btnFirstclass.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
                    newReference.addMouseDragMotionListener(btnFirstclass, e);
			}
		});
		btnFirstclass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    newReference.addMouseActionListener(e);
			}
		});
		btnFirstclass.setLayout(new GridLayout(2, 1));
		btnFirstclass.add(lblFirstclass);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(253, 245, 230));
		panel_1.setBounds(10, 409, 737, 171);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton button_2 = new JButton("");
		button_2.setVisible(false);
		button_2.setBounds(457, 65, 19, 40);
		panel_1.add(button_2);
		button_2.setIcon(new ImageIcon(this.getClass().getResource("/img/ArrowRight.png")));
		button_2.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
                    newVisibility.changeVisibilityRightArrow();
			}
		});	
		JButton button_1 = new JButton("");
		button_1.setBounds(716, 65, 21, 40);
		panel_1.add(button_1);
		button_1.setIcon(new ImageIcon(this.getClass().getResource("/img/ArrowLeft.png")));
		button_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
                    newVisibility.changeVisibilityLeftArrow();
			}
		});
		
		JPanel panel_2 = new JPanel();
		panel_2.setVisible(false);
		panel_2.setBounds(476, 0, 261, 171);
		panel_1.add(panel_2);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(new Color(253, 245, 230));
		panel_2.setLayout(null);
		
		TextField textField = new TextField();
		textField.setVisible(false);
		textField.setBounds(0, 139, 266, 32);
		panel_2.add(textField);
		
    //added constructor
    newVisibility = new MainWindowVisibility(btnUparrow,  
        btnDownarrow, btnCancel, btnEnd,  btnRunTests,  btnShare,
        lblTeamwork, lblTesting,  rdbtnRecording,  button_1, button_2,
        textField,  panel_2);
  }
}
