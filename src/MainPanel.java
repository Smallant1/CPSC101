import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;



public class MainPanel extends JPanel
{

	JSplitPane mainSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
	JSplitPane editSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
	JEditorPane edit = new JEditorPane();
	JEditorPane file = new JEditorPane();
	JEditorPane error = new JEditorPane();
	
	public MainPanel()
	{
		this.setLayout(new BorderLayout());
		this.setBackground(Color.WHITE);
	
		editSplitPane.add(edit);
		editSplitPane.add(error);
		
		mainSplitPane.setOneTouchExpandable(true);
		mainSplitPane.add(file);
		mainSplitPane.add(editSplitPane);
		this.add(mainSplitPane);
	}
	
}
