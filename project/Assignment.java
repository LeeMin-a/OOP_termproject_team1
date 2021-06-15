package project;

public class Assignment extends Plan
{
	private String difficulty;
	
	public String getDifficulty() 
	{
		return difficulty;
	}
	
	
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
