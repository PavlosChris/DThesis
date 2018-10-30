package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import codewritten.BlueJMainWindowMyCode;
import codewritten.NewClassWindowVisibility;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JToggleButton;

public class ClassCreationWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txtClassname;

	/**
	 * Create the frame.
	 */
	public ClassCreationWindow(BlueJMainWindowMyCode newReference) {
		setTitle("Create New Class");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(200, 200, 281, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClassName = new JLabel("Class Name:");
		lblClassName.setHorizontalAlignment(SwingConstants.CENTER);
		lblClassName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblClassName.setBounds(4, 10, 98, 28);
		contentPane.add(lblClassName);
		
		txtClassname = new JTextField();
		txtClassname.setBounds(126, 11, 128, 28);
		contentPane.add(txtClassname);
		txtClassname.setColumns(10);
		
		JLabel lblClassLanguage = new JLabel("Class Language:");
		lblClassLanguage.setHorizontalAlignment(SwingConstants.CENTER);
		lblClassLanguage.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblClassLanguage.setBounds(14, 49, 105, 28);
		contentPane.add(lblClassLanguage);
		
		JLabel lblClassType = new JLabel("Class Type");
		lblClassType.setHorizontalAlignment(SwingConstants.CENTER);
		lblClassType.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblClassType.setBounds(4, 95, 90, 28);
		contentPane.add(lblClassType);
		
		JRadioButton rdbtnClass = new JRadioButton("Class");
		rdbtnClass.setSelected(true);
		rdbtnClass.setBounds(50, 130, 109, 23);
		contentPane.add(rdbtnClass);
		
		JRadioButton rdbtnAbstractClass = new JRadioButton("Abstract Class");
		rdbtnAbstractClass.setBounds(50, 156, 109, 23);
		contentPane.add(rdbtnAbstractClass);
		
		JRadioButton rdbtnInterface = new JRadioButton("Interface");
		rdbtnInterface.setBounds(50, 182, 109, 23);
		contentPane.add(rdbtnInterface);
		
		JRadioButton rdbtnUnitTest = new JRadioButton("Unit Test");
		rdbtnUnitTest.setBounds(50, 208, 109, 23);
		contentPane.add(rdbtnUnitTest);
		
		JRadioButton rdbtnEnum = new JRadioButton("Enum");
		rdbtnEnum.setBounds(50, 234, 109, 23);
		contentPane.add(rdbtnEnum);
		
		JRadioButton rdbtnJavafxClass = new JRadioButton("JavaFX Class");
		rdbtnJavafxClass.setBounds(50, 260, 109, 23);
		contentPane.add(rdbtnJavafxClass);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newReference.createClassIcon(txtClassname.getText(),newReference);
				dispose();
			}
		});
		btnOk.setBounds(99, 337, 79, 23);
		btnOk.setEnabled(false);
		contentPane.add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(186, 337, 79, 23);
		contentPane.add(btnCancel);
		
		JToggleButton tglbtnJava = new JToggleButton("Java");
		tglbtnJava.setSelected(true);
		tglbtnJava.setHorizontalAlignment(SwingConstants.RIGHT);
		tglbtnJava.setBounds(139, 50, 55, 23);
		contentPane.add(tglbtnJava);
		
		JToggleButton tglbtnStride = new JToggleButton("Stride");
		tglbtnStride.setBounds(192, 50, 62, 23);
		contentPane.add(tglbtnStride);
		
    newReference.addTextFieldListener(txtClassname, btnOk);
    NewClassWindowVisibility newVisibility = new NewClassWindowVisibility(tglbtnStride,
        tglbtnJava,  rdbtnUnitTest,
        rdbtnEnum,  rdbtnJavafxClass, 
        rdbtnAbstractClass,  rdbtnInterface,  rdbtnClass);

		tglbtnJava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    newVisibility.setToggleButtonJavaVisibility();
			}
		});
		
		tglbtnStride.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    newVisibility.setToggleBtnStrideVisibiity();
			}
		});
		
		rdbtnClass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    newVisibility.setRdBtnClassVisibility();
			}
		});
		
		rdbtnAbstractClass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                     newVisibility.setRdBtnAbstractClassVisibility();
			}
		});
		
		rdbtnInterface.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    newVisibility.setRdBtnInterfaceVisibility();
			}
		});
		
		rdbtnUnitTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    newVisibility.setRdBtnUnitTestVisibility();
			}
		});
		
		rdbtnEnum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    newVisibility.setRdBtnEnumVisibility();
			}
		});
		
		rdbtnJavafxClass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    newVisibility.setRdBtnJavaFXClassVisibility();
			}
		});
	}
}
