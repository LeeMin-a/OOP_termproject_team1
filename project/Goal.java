package project;

/**
 * Goal class that inherit Plan class
 * Author : Lee Min A
 * Last modify : 2021 / 05 / 29
 * Term project of OOP_Team 1
 */

public class Goal extends Plan
{
	private String importance;
		
	// get a content's importance
	public String getImportance() 
	{
		return importance;
	}
	
	// set a content's importance
	public void setImportance(String importance) 
	{
		this.importance = importance;
	}
	
	// overriding
	public String getInfo() 
	{
		return super.getInfo() + "   " + super.getContent() + "   " + "중요도: " + importance;
	}


}
