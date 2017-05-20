package me.matoosh.evolution.ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

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
	 * The simulation options panel.
	 */
	private SimulationOptionsPanel simulationOptionsPanel;
	/**
	 * The simulation panel.
	 */
	private SimulationPanel simulationPanel;
	
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
	 * Adds the default panels to the window.
	 */
	private void addPanels() {
		//Simulation panel.
		simulationPanel = new SimulationPanel();
		add(simulationPanel, new GridBagConstraints(0, 0, 1, 1, 0.95, 1, GridBagConstraints.FIRST_LINE_START, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
	
		//Settings panel.
		simulationOptionsPanel = new SimulationOptionsPanel();
		add(simulationOptionsPanel, new GridBagConstraints(1, 0, 1, 1, 0.05, 1, GridBagConstraints.FIRST_LINE_START, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
	}
}
