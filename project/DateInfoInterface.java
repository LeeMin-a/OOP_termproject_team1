package project;
/**
 * Implements DateInfoInterface.
 * @author Seo Eun Su.
 * last modified 21-06-15.
 */
public interface DateInfoInterface {
	public String getMonth();
	public void setMonth(String month);
	public String getDay();
	public void setDay(String day);
	public String getDayOfTheWeek();
	public void setDayOfTheWeek(String dayOfTheWeek);
	public String getTime();
	public void setTime(String time);
	public String getInfo();
}
