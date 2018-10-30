package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import codewritten.BlueJMainWindowMyCode;

import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ScrollPaneConstants;

public class ClassInformationPanel extends JPanel {

	private String className;
	/**
	 * Create the panel.
	 */
	public ClassInformationPanel(String className, BlueJMainWindowMyCode newReference) {
		this.className = className;
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 816, 44);
		add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Source Code", "Documentation"}));
		comboBox.setBounds(680, 12, 105, 20);
		panel.add(comboBox);
		
		JButton btnCompile = new JButton("Compile");
		btnCompile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCompile.setMargin(new Insets(2, 4, 2, 4));
		btnCompile.setBounds(10, 11, 57, 23);
		panel.add(btnCompile);
		
		JButton btnUndo = new JButton("Undo");
		btnUndo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUndo.setEnabled(false);
		btnUndo.setBounds(73, 11, 57, 23);
		panel.add(btnUndo);
		
		JButton btnCut = new JButton("Cut");
		btnCut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCut.setBounds(135, 11, 57, 23);
		panel.add(btnCut);
		
		JButton btnCopy = new JButton("Copy");
		btnCopy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCopy.setBounds(196, 11, 57, 23);
		panel.add(btnCopy);
		
		JButton btnPaste = new JButton("Paste");
		btnPaste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPaste.setMargin(new Insets(2, 4, 2, 4));
		btnPaste.setBounds(259, 11, 57, 23);
		panel.add(btnPaste);
		
		JButton btnFind = new JButton("Find...");
		btnFind.setMargin(new Insets(2, 4, 2, 4));
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnFind.setBounds(323, 11, 57, 23);
		panel.add(btnFind);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    newReference.closeTab(className);
			}
		});
		btnClose.setMargin(new Insets(2, 4, 2, 4));
		btnClose.setBounds(384, 11, 57, 23);
		panel.add(btnClose);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 44, 25, 596);
		add(panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(26, 44, 785, 581);
		add(scrollPane);
		
		JPanel panel_2 = new JPanel();
		scrollPane.setViewportView(panel_2);
		panel_2.setBackground(new Color(255, 255, 255));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(60, 179, 113));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(6)
					.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(10)
					.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("/**\r\n * Write a description of class " + className + " here.\r\n *\r\n * @author (your name)\r\n * @version (a version number or a date)\r\n */\r\npublic class " + className + "\r\n{");
		textArea_1.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textArea_1.setBackground(new Color(60, 179, 113));
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textArea_2.setText("// instance variables - replace the example below with your own\r\n    private int x;");
		textArea_2.setBackground(Color.WHITE);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textArea_3.setText("/**\r\n     * Constructor for objects of class " + className + "\r\n     */\r\n    public " + className + "()\r\n    {");
		textArea_3.setBackground(new Color(250, 250, 210));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(250, 250, 210));
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textArea_4.setText("// initialise instance variables\r\n        x = 0;");
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textArea_6.setBackground(new Color(250, 250, 210));
		textArea_6.setText("}");
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(45)
							.addComponent(textArea_4, GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(34)
							.addComponent(textArea_6, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(textArea_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(textArea_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		panel_5.setLayout(gl_panel_5);
		
		JTextArea txtrAn = new JTextArea();
		txtrAn.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtrAn.setText("/**\r\n     * An example of a method - replace this comment with your own\r\n     *\r\n     * @param  y  a sample parameter for a method\r\n     * @return    the sum of x and y\r\n     */\r\n    public int sampleMethod(int y)\r\n    {");
		txtrAn.setBackground(new Color(250, 250, 210));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(250, 250, 210));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_5, 0, 0, Short.MAX_VALUE)
						.addComponent(textArea_3, GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
						.addComponent(txtrAn, GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
						.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addComponent(textArea_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtrAn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(57, Short.MAX_VALUE))
		);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textArea_5.setText("// put your code here\r\n        return x + y;");
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textArea.setBackground(new Color(250, 250, 210));
		textArea.setText("}");
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_6.createSequentialGroup()
							.addGap(46)
							.addComponent(textArea_5, GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
						.addGroup(gl_panel_6.createSequentialGroup()
							.addGap(37)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addComponent(textArea_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_6.setLayout(gl_panel_6);
		panel_4.setLayout(gl_panel_4);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_3.createSequentialGroup()
						.addContainerGap()
						.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 510, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
					.addGroup(gl_panel_3.createSequentialGroup()
						.addGap(32)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
							.addComponent(textArea_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
							.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE))))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textArea_2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 458, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(288, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		panel_2.setLayout(gl_panel_2);

	}
}
