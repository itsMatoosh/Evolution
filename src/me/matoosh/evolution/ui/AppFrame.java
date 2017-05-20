package me.matoosh.evolution.ui;

import java.awt.GridBagLayout;
import javax.swing.JFrame;

/**
 * The frame of the aplication.
 * @author Mateusz Rêbacz
 *
 */
public class AppFrame extends JFrame {
	/**
	 * UUID of this ui element.
	 */
	private static final long serialVersionUID = 928370391529452127L;
	/**
	 * The layout manager of the application.
	 */
	public AppLayoutManager layoutManager;
	
	/**
	 * Instantiates a default application frame.
	 */
	public AppFrame() {
		//Setting window properties.
		super("Evolution");
        setSize(1280,720);
		setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        //Changing the layout to HUB.
        if(layoutManager == null) {
        	layoutManager = new AppLayoutManager();
        }
        layoutManager.changeLayout(LayoutType.HUB);
	}
}
