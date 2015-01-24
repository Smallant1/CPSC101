
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MenuBar extends JMenuBar
{
JMenu file = new JMenu("File");
JMenu edit = new JMenu("Edit");
JMenu project = new JMenu("Project");
JMenu help = new JMenu("Help");
	
JMenuItem newFile = new JMenuItem("New");
JMenuItem exit = new JMenuItem("Exit");

	//to add the menus together and send them off
	public MenuBar()
	{
		createFileMenu();
	
	this.add(edit);
	this.add(project);
	this.add(help);
	
	}
	
	//create the file Menu and items in this method
	void createFileMenu()
	{
		file.add(newFile);
		file.add(exit);
		
		this.add(file);
	}
	
	
}
