package codewritten;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelTab extends JPanel {

	private JPanel pnlTab = new JPanel(new GridBagLayout());
	private String name;

	public PanelTab(String name, BlueJMainWindowMyCode newReference) {
		this.name = name;

		JButton btnClose = setUpBtnClose();
		setBtnListener(btnClose, newReference);
		setGbLayout(btnClose);
	}

	private void setGbLayout(JButton btnClose) {
		pnlTab.setOpaque(false);
		GridBagConstraints gbc = new GridBagConstraints();

		setGbcforLabel(gbc);
		pnlTab.add(new JLabel(name), gbc);

		setGbcForButton(gbc);
		pnlTab.add(btnClose, gbc);
	}

	private void setGbcforLabel(GridBagConstraints gbc) {
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1;
	}

	private void setGbcForButton(GridBagConstraints gbc) {
		gbc.gridx++;
		gbc.weightx = 0;
	}

	private JButton setUpBtnClose() {
		JButton btnClose = new JButton("");
		setUpButtonParameters(btnClose);
		return btnClose;
	}

	private void setBtnListener(JButton btnClose, BlueJMainWindowMyCode newReference) {
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newReference.closeTab(name);
			}
		});
	}

	private void setUpButtonParameters(JButton btnClose) {
		Image img = new ImageIcon(this.getClass().getResource("/img/CloseTab.png")).getImage();
		btnClose.setIcon(new ImageIcon(img));
		btnClose.setBorder(null);
	}

	public JPanel getPnlTab() {
		return pnlTab;
	}
}
