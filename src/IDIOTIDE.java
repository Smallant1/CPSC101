import javax.swing.SwingUtilities;


public class IDIOTIDE {

	public static void main(String[] args) 
	{
		//this will start our GUI and the rest of the program
		//starts the program in it;s own dedicated Thread
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            			StartClass startClass = new StartClass();
            			startClass.start();	
            					}
            });
	}

}
