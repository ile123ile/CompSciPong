import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Pong2 extends JFrame {
	JPanel panel;
	int ballCenterX, ballCenterY, lowerPaddleX, upperPaddleX, ballVelX, ballVelY, lowerPaddleVel, upperPaddleVel;
	private Image dbImage;
	private Graphics dbg;
	public Pong2() {
		setBackground(Color.black);
		setTitle("Arena");
 		setResizable(false);
		setSize(800, 800);
		//not sure why this is necessary, but it works
		setVisible(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setFocusTraversalKeysEnabled(false);
		panel=new JPanel();
		this.add(panel);
		addKeyBindings(panel);
		setFocusable(true);
		panel.requestFocus();
		//blipstream.playSound();
	}
	public static void addKeyBindings(JComponent jc) {
		jc.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0, false),  "LeftPress");
	    jc.getActionMap().put("LeftPress", new AbstractAction() {
	    	private static final long serialVersionUID = 1L;
	        public void actionPerformed(ActionEvent ae) {
	        	
	        }
	    });
		jc.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0, false),  "RightPress");
	    jc.getActionMap().put("RightPress", new AbstractAction() {
	    	private static final long serialVersionUID = 1L;
	        public void actionPerformed(ActionEvent ae) {
	        	
	        }
	    });
		jc.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_A, 0, false),  "APress");
	    jc.getActionMap().put("APress", new AbstractAction() {
	    	private static final long serialVersionUID = 1L;
	        public void actionPerformed(ActionEvent ae) {
	        	
	        }
	    });
		jc.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_D, 0, false),  "DPress");
	    jc.getActionMap().put("DPress", new AbstractAction() {
	    	private static final long serialVersionUID = 1L;
	        public void actionPerformed(ActionEvent ae) {
	        	
	        }
	    });	    
	}
	public void paint(Graphics g) {
		dbImage = createImage(getWidth(), getHeight());
		dbg = dbImage.getGraphics();
		paintComponent(dbg);
		g.drawImage(dbImage,  0,  0,  this);
		
	}
	public void paintComponent(Graphics g) {
		
	}
	public static void main(String[] args) {
		new Pong2();
	}
}
