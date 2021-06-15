package project;

public class Appointment extends Plan
{
	private String friendName;
	
	public String getFriendName() 
	{
		return friendName;
	}
	
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
