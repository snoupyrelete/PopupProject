package popups.controller;

import popups.view.PopupViewer;

public class PopupController
{
	
	private PopupViewer display;
	
	public PopupController()
	{
		display = new PopupViewer();
	}
	
	public void start()
	{
		String answer = "sample";
		while (answer != null && !answer.equals(""))
		{
			
			display.displayMessage("Hello!");
			answer = display.collectResponse("Is kaden dumb?");
			display.displayMessage(answer + " is what you said.");
			display.collectOption("Is Kaden stupid?");
		
		}
	}
	/**
	 * Checks if the supplied string can be parsed to a double value.
	 * @param potentialValue The string to test.
	 * @return Whether the value can be parsed; True if it can be parsed, false otherwise.
	 */
	private boolean isDouble(String potentialValue)
	{
		boolean isParseable = false;
		
		try 
		{
			double test = Double.parseDouble(potentialValue);
			isParseable = true;
		}
		catch (NumberFormatException notDouble)
		{
			display.displayMessage("This is not a double value.");
		}
		
		return isParseable;
	}
	private int isInteger(String potentialValue);
	{
		boolean 
	}
}
