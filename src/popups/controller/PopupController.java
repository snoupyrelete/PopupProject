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
		for (int index = 0; index <5; index ++)
		{
			Thingy addThingy = new Thingy();
			thingyList.add(addThingy);
			display.displayMessage(addThingy.getWords());
		
		}
		display.displayMessage(thingyList.size() + " is the size.");
		thingyList.get(3).setWords("LOOK I CHANGED A VALUE.");
		
		display.displayMessage(thingyList.get(3) + "is @ 3");
		
//		Thingy temp = thingyList.get(4);
//		temp.setWords("#SWAG");
//		
		for (int index = 0; index < thingyList.size(); index ++)
		{
			display.displayMessage(thingyList.get(index).getWords());
		}
//		
//		thingyList.add(3, new Thingy());
//		
//		display.displayMessage("The size is " + thingyList.size());
//		
//		thingyList.remove(0); //I no longer have access to this object because there is no = sign.
//		
//		display.displayMessage("The size is NOW! " + thingyList.size());
//		
//		Thingy deletedThingy = thingyList.remove(3); // BECAUSE .REMOVE RETURNS A VALUE SO WE CAN USE IT!!!
//		display.displayMessage(deletedThingy.getWords() + " and the list size is " + thingyList.size());
//		
//		thingyList.set(0, deletedThingy);
//		
//		for (int index = 0; index < thingyList.size(); index ++)
//		{
//			display.displayMessage(thingyList.get(index).getWords());
//		}
//		
		for (Thingy currentThingy : thingyList)
		{
			display.displayMessage(currentThingy.getWords());
		}
		
		for (Thingy currentThingy : thingyList)
		{
			display.collectResponse("How are you?");
		}
		
		String indexToChange = "ABC";
		String whatToChangeTo = "XYZ";
		while (indexToChange != null && !isInteger(indexToChange) && whatToChangeTo != null)
		{
			indexToChange = display.collectResponse("At what index should we change?.");
			whatToChangeTo = display.collectResponse("What should we change it to?.");
			int updatedIndex = Integer.parseInt(indexToChange);
			thingyList.get(updatedIndex).setWords(whatToChangeTo);
			display.displayMessage("You changed " + updatedIndex + "to " + whatToChangeTo);
		}
	
		
	}
}
