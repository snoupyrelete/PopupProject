package popups.controller;

import popups.view.PopupViewer;
import popups.model.Thingy;
import java.util.List;
import java.util.ArrayList;

public class PopupController
{
	
	private PopupViewer display;
	private List<Thingy> thingyList;
	
	public PopupController()
	{
		thingyList = new ArrayList<Thingy>();
		display = new PopupViewer();
	}
	
	public void start()
	{
		// testForDoubleInputLoop();
		learnLists();
	}
	
	private void testForDoubleInputLoop()
	{
		String answer = "sample";
		while (answer != null && !isDouble(answer))
		{
			answer = display.collectResponse("Give me a number.");
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
		catch(NumberFormatException notDouble)
		{
			display.displayMessage("This is not a double value.");
		}
		
		return isParseable;
	}
	
	/**
	 * Checks if the supplied string can be parsed to an integer value.
	 * @param potentialNumber The string to test for parsing.
	 * @return Whether it could be parsed as an integer. 
	 */
	private boolean isInteger(String potentialNumber)
	{
		boolean isParseable = false;
		try 
		{
			int test = Integer.parseInt(potentialNumber);
			isParseable = true;
		}
		catch(NumberFormatException notInt)
		{
			display.displayMessage(notInt.getMessage());
			display.displayMessage("Type in an integer next time!");
		}
		return isParseable;
	}
	
	private void learnLists()
	{
		display.displayMessage(thingyList.size() + " is the size of the list.");
		Thingy testThingy = new Thingy();
		thingyList.add(testThingy);
		display.displayMessage(thingyList.size() + " is the size of the list.");
		testThingy.setValue(12.1);
	}
}
