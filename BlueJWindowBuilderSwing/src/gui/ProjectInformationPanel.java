package gui;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import codewritten.BlueJMainWindowMyCode;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class ProjectInformationPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ProjectInformationPanel(int index, BlueJMainWindowMyCode newReference) {
		
		setBackground(new Color(192, 192, 192));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(0, 0, 815, 47);
		add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEnabled(false);
		comboBox.setBounds(682, 12, 108, 20);
		panel.add(comboBox);
		
		JButton btnCompile = new JButton("Compile");
		btnCompile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCompile.setEnabled(false);
		btnCompile.setMargin(new Insets(2, 4, 2, 4));
		btnCompile.setBounds(10, 11, 58, 23);
		panel.add(btnCompile);
		
		JButton btnUndo = new JButton("Undo");
		btnUndo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUndo.setEnabled(false);
		btnUndo.setBounds(73, 11, 58, 23);
		panel.add(btnUndo);
		
		JButton btnCut = new JButton("Cut");
		btnCut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCut.setBounds(137, 11, 58, 23);
		panel.add(btnCut);
		
		JButton btnCopy = new JButton("Copy");
		btnCopy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCopy.setBounds(202, 11, 58, 23);
		panel.add(btnCopy);
		
		JButton btnPaste = new JButton("Paste");
		btnPaste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPaste.setMargin(new Insets(2, 4, 2, 4));
		btnPaste.setBounds(266, 11, 58, 23);
		panel.add(btnPaste);
		
		JButton btnFind = new JButton("Find...");
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFind.setMargin(new Insets(2, 4, 2, 4));
		btnFind.setBounds(330, 11, 58, 23);
		panel.add(btnFind);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    newReference.closeTab("README.TXT");
			}
		});
		btnClose.setMargin(new Insets(2, 4, 2, 4));
		btnClose.setBounds(396, 11, 58, 23);
		panel.add(btnClose);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 47, 42, 578);
		add(panel_1);
		panel_1.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setOpaque(true);
		separator.setBackground(Color.BLACK);
		separator.setBounds(41, 0, 1, 250);
		panel_1.add(separator);
		
		JTextArea txtrThisIsThe = new JTextArea();
		txtrThisIsThe.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtrThisIsThe.setText("------------------------------------------------------------------------\r\nThis is the project README file. Here, you should describe your project.\r\nTell the reader (someone who does not know anything about this project)\r\nall he/she needs to know. The comments should usually include at least:\r\n------------------------------------------------------------------------\r\n\r\nPROJECT TITLE:\r\nPURPOSE OF PROJECT:\r\nVERSION or DATE:\r\nHOW TO START THIS PROJECT:\r\nAUTHORS:\r\nUSER INSTRUCTIONS:\r\n\r\n");
		txtrThisIsThe.setBounds(42, 47, 773, 578);
		add(txtrThisIsThe);

	}
}
