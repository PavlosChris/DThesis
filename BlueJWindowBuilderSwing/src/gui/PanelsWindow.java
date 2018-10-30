package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import codewritten.BlueJMainWindowMyCode;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;
import javax.swing.JMenuItem;
import java.util.ArrayList;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PanelsWindow extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public PanelsWindow(BlueJMainWindowMyCode newReference) {
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				newReference.clearAppWindow();
			}
		});
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setBounds(100, 100, 815, 739);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnClass = new JMenu("Project");
		menuBar.add(mnClass);
		
		JMenu mnMoveTab = new JMenu("Move tab...");
		mnClass.add(mnMoveTab);
		
		JMenuItem mntmToNewWindow = new JMenuItem("To new window");
		mntmToNewWindow.setEnabled(false);
		mnMoveTab.add(mntmToNewWindow);
		
		JSeparator separator = new JSeparator();
		mnClass.add(separator);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnClass.add(mntmSave);
		
		JMenuItem mntmReload = new JMenuItem("Reload");
		mnClass.add(mntmReload);
		
		JSeparator separator_1 = new JSeparator();
		mnClass.add(separator_1);
		
		JMenuItem mntmPrint = new JMenuItem("Print...");
		mnClass.add(mntmPrint);
		
		JSeparator separator_2 = new JSeparator();
		mnClass.add(separator_2);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mnClass.add(mntmClose);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmUndo = new JMenuItem("Undo");
		mntmUndo.setEnabled(false);
		mnEdit.add(mntmUndo);
		
		JMenuItem mntmRedo = new JMenuItem("Redo");
		mntmRedo.setEnabled(false);
		mnEdit.add(mntmRedo);
		
		JSeparator separator_3 = new JSeparator();
		mnEdit.add(separator_3);
		
		JMenuItem mntmCut = new JMenuItem("Cut");
		mnEdit.add(mntmCut);
		
		JMenuItem mntmCopy = new JMenuItem("Copy");
		mnEdit.add(mntmCopy);
		
		JMenuItem mntmPaste = new JMenuItem("Paste");
		mnEdit.add(mntmPaste);
		
		JSeparator separator_4 = new JSeparator();
		mnEdit.add(separator_4);
		
		JMenuItem mntmIndentMore = new JMenuItem("Indent more");
		mnEdit.add(mntmIndentMore);
		
		JMenuItem mntmIndentLess = new JMenuItem("Indent less");
		mnEdit.add(mntmIndentLess);
		
		JMenuItem mntmComment = new JMenuItem("Comment");
		mnEdit.add(mntmComment);
		
		JMenuItem mntmUncomment = new JMenuItem("Uncomment");
		mnEdit.add(mntmUncomment);
		
		JMenuItem mntmAutolayout = new JMenuItem("Auto-layout");
		mnEdit.add(mntmAutolayout);
		
		JSeparator separator_5 = new JSeparator();
		mnEdit.add(separator_5);
		
		JMenuItem mntmInsertMethod = new JMenuItem("Insert method");
		mnEdit.add(mntmInsertMethod);
		
		JMenuItem mntmAddMethodComment = new JMenuItem("Add method comment");
		mnEdit.add(mntmAddMethodComment);
		
		JMenu mnTools = new JMenu("Tools");
		menuBar.add(mnTools);
		
		JMenuItem mntmFind = new JMenuItem("Find...");
		mnTools.add(mntmFind);
		
		JMenuItem mntmFindNext = new JMenuItem("Find Next");
		mnTools.add(mntmFindNext);
		
		JMenuItem mntmFindNextBackward = new JMenuItem("Find Next Backward");
		mnTools.add(mntmFindNextBackward);
		
		JMenuItem mntmReplace = new JMenuItem("Replace...");
		mnTools.add(mntmReplace);
		
		JMenuItem mntmGoToLine = new JMenuItem("Go to line...");
		mnTools.add(mntmGoToLine);
		
		JSeparator separator_7 = new JSeparator();
		mnTools.add(separator_7);
		
		JMenuItem mntmCompile = new JMenuItem("Compile");
		mntmCompile.setEnabled(false);
		mnTools.add(mntmCompile);
		
		JMenuItem mntmSetclearBreakpoint = new JMenuItem("Set/Clear Breakpoint");
		mntmSetclearBreakpoint.setEnabled(false);
		mnTools.add(mntmSetclearBreakpoint);
		
		JSeparator separator_6 = new JSeparator();
		mnTools.add(separator_6);
		
		JMenuItem mntmToggleDocumentationView = new JMenuItem("Toggle Documentation View");
		mnTools.add(mntmToggleDocumentationView);
		
		JMenu mnOptions = new JMenu("Options");
		menuBar.add(mnOptions);
		
		JMenuItem mntmIncreaseFontSize = new JMenuItem("Increase Font Size");
		mnOptions.add(mntmIncreaseFontSize);
		
		JMenuItem mntmDecreaseFontSize = new JMenuItem("Decrease Font Size");
		mnOptions.add(mntmDecreaseFontSize);
		
		JMenuItem mntmResetFontSize = new JMenuItem("Reset Font Size");
		mnOptions.add(mntmResetFontSize);
		
		JSeparator separator_8 = new JSeparator();
		mnOptions.add(separator_8);
		
		JMenuItem mntmKeyBindings = new JMenuItem("Key Bindings...");
		mnOptions.add(mntmKeyBindings);
		
		JMenuItem mntmPreferences = new JMenuItem("Preferences...");
		mnOptions.add(mntmPreferences);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("CheckBox.light"));
		panel.setBounds(0, 638, 809, 51);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSaved = new JLabel("Saved");
		lblSaved.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaved.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblSaved.setForeground(Color.GRAY);
		lblSaved.setBounds(709, 5, 80, 22);
		panel.add(lblSaved);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setOpaque(true);
		separator_9.setForeground(Color.DARK_GRAY);
		separator_9.setBackground(Color.GRAY);
		separator_9.setBounds(697, 0, 1, 44);
		panel.add(separator_9);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(-5, 0, 814, 634);
		contentPane.add(tabbedPane);
		
    newReference.setContentPane(contentPane, tabbedPane);
	}
}
