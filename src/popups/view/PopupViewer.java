package popups.view;

import javax.swing.JOptionPane;

public class PopupViewer
{
	/**
	 * Makes a popup window to display the supplied message. 
	 * @param message The message to be placed in the popup.
	 */
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	/**
	 * Creates an input popup to collect a response from the user as a String.
	 * @param question The question being asked to the user. 
	 * @return The user's response
	 */
	public String collectResponse(String question)
	{
		String response = "";
		
		response = JOptionPane.showInputDialog(null, question);
				
		return response;
	}
	
	
}
