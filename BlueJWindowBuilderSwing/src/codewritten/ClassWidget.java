package codewritten;

import java.awt.Image;
import javax.swing.JFrame;

public class ClassWidget extends JFrame {
	private String name;
	private int windowX, windowY;
	private Image img;
	private boolean dragged;

	public ClassWidget(final String name, final Image img, 
			final BlueJMainWindowMyCode newReference) {
		this.name = name;
		this.img = img;
		dragged = false;
	}

	public final void setDragged(final boolean dragged) {
		this.dragged = dragged;
	}

	public final boolean getDragged() {
		return dragged;
	}

	public final void setWindowX(final int winX) {
		windowX = winX;
	}

	public final void setWindowY(final int winY) {
		windowY = winY;
	}

	public final String getName() {
		return name;
	}

	public final int getWindowX() {
		return windowX;
	}

	public final int getWindowY() {
		return windowY;
	}

	public final Image getImage() {
		return img;
	}

}
