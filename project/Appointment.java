package project;

/**
 * Appointment class that inherit Plan class
 * Author : Lee Min A
 * Last modify : 2021 / 05 / 29
 * Term project of OOP_Team 1
 */

public class Appointment extends Plan
{
	private String friendName;
	
	// get a name of content's person
	public String getFriendName() 
	{
		return friendName;
	}
	
	// set a name of content's person
	public void setFriendName(String friendName) 
	{
		this.friendName = friendName;
	}
	
	// overriding
	public String getInfo() 
	{
		return super.getInfo() + "   " + super.getContent() + "   " + "만나는 사람: " + friendName;
	}
	
}
