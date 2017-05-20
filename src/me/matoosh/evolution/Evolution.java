package me.matoosh.evolution;

import java.awt.EventQueue;

import me.matoosh.evolution.ui.AppFrame;

/**
 * The main class of the program.
 * @author Mateusz Rêbacz
 *
 */
public class Evolution {
	/**
	 * Called when the program starts.
	 * @param args
	 */
	public static void main(String[] args) {
		//Creating the main window.
		EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AppFrame();
            }
        });
	}

}
