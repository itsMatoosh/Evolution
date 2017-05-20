package me.matoosh.evolution.ui;

import java.awt.GridBagLayout;
import javax.swing.JFrame;

/**
 * The frame of the aplication.
 * @author Mateusz Rebacz
 *
 */
public class AppFrame extends JFrame {
	/**
	 * UUID of this ui element.
	 */
	private static final long serialVersionUID = 928370391529452127L;
	
	/**
	 * Instantiates a default application frame.
	 */
	public AppFrame() {
		//Setting window properties.
		super("Evolution");
        setSize(1280,720);
		setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Adding panels.
        addPanels();
        
        //Making the window visible.
        setVisible(true);
	}
	
	/**
	 * Adds the default panels to thw window.
	 */
	private void addPanels() {
		
	}
}
