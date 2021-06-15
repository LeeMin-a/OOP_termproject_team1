package project;

/**
 * Assignment class that inherit Plan class
 * Author : Lee Min A
 * Last modify : 2021 / 05 / 29
 * Term project of OOP_Team 1
 */

public class Assignment extends Plan
{
	private String difficulty;
	
	// get a content's difficulty
	public String getDifficulty() 
	{
		return difficulty;
	}
	
	// set a content's difficulty
	public void setDifficulty(String difficulty) 
	{
		this.difficulty = difficulty;
	}
	
	// overriding
	public String getInfo() 
	{
		return super.getInfo() + "   " + super.getContent() + "   " + "난이도: "+ difficulty;
	}
}
