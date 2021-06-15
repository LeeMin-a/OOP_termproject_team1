package project;

public class Goal extends Plan
{
	private String importance;
		
	public String getImportance() 
	{
		return importance;
	}
		
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
