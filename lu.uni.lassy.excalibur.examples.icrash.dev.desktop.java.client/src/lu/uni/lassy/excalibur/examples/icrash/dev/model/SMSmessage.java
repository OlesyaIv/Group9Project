package lu.uni.lassy.excalibur.examples.icrash.dev.model;

import javax.swing.JDialog;
import javax.swing.JTextArea;

public class SMSmessage extends JDialog {
	
	 
	 
	public SMSmessage( String applicationTitle , String chartTitle,String code)
	{
		super();
		JTextArea message=new JTextArea();
		message.setText("You received this message from ICrash system. To login use this code: "+code);
		this.add(message);
		this.pack();
	}
}
