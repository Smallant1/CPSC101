import java.awt.Dimension;

import javax.swing.JFrame;


public class StartClass 
{

	//the Frame to place the GUI in
	JFrame mainFrame = new JFrame("Idiot IDE");
	
	//Panel sits in the GUI, MainPanel extends JPanel, GUI added in the MainPanel class
	MainPanel thePanel = new MainPanel();
	
	//MenuBar extends JMenuBar, menus created and added in the MenuBar class
	MenuBar theMenuBar = new MenuBar();
	
	
	//Used to set and add the main components to the mainFrame
	public void start()
	{
		mainFrame.setJMenuBar(theMenuBar);
		mainFrame.add(thePanel);
		mainFrame.setMinimumSize(new Dimension(600,480));
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
	
}
