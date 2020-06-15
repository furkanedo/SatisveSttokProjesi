package tr.com.ferdogan.test;

import javax.swing.SwingUtilities;

import tr.com.ferdogan.fe.AnaPencereFE;

public class Run {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				new AnaPencereFE();
				
			}
		});
	}

}
