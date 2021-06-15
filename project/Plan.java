package project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * Implement Plan class.
 * @author Seo Eun Su.
 * last modified 2021-06-15.
 */
public class Plan extends DateInfo implements PlanInterface
{
	// fields.
	private String content;
	private String remainingDay;

	// Declare constructors.
	public Plan() {
		super();
		this.content = "No plan yet.";
		this.remainingDay = "none";
	}
	public Plan(String month, String day, String dayOfTheWeek, String time, String content, String remainingDay) {
		super(month, day, dayOfTheWeek, time);
		this.content = content;
		this.remainingDay = remainingDay;
	}
	public Plan(String month, String day, String dayOfTheWeek, String time) {
		this(month, day, dayOfTheWeek, time, "No plan yet.", "none");
	}

	// Define methods.
	// Get a content of the plan.
	public String getContent() 
	{
		return content;
	}
	// Set a content of the plan.
	public void setContent(String content) 
	{
		this.content = content;
	}

	// Get a remaining time that how much time is left until the appointment.
	public String getRemainingTime() 
	{
		return remainingDay;
	}
	// Returns the remaining date (d-day) between today's date and appointment date.
	public String calRemainingTime()
	{
		Calendar getToday = Calendar.getInstance();

		getToday.setTime(new Date()); // today's date.
		// Initialize hours, minutes, seconds.
		getToday.set(Calendar.HOUR,-12);
		getToday.set(Calendar.MINUTE,0);
		getToday.set(Calendar.SECOND,0);

		String s_date = "2021" + super.getMonth() + super.getDay();
		Date date = null;
		try {
			date = new SimpleDateFormat("yyyyMMdd").parse(s_date);
		} catch (ParseException e) {
			e.printStackTrace();
		}


		Calendar cmpDate = Calendar.getInstance();
		// Initialize hours, minutes, seconds.
		cmpDate.set(Calendar.HOUR,0);
		cmpDate.set(Calendar.MINUTE,0);
		cmpDate.set(Calendar.SECOND,0);
		cmpDate.setTime(date); // appointment date.

		long Sec = (cmpDate.getTimeInMillis() - getToday.getTimeInMillis() ) / 1000 +1; // Calculate in seconds.		
		long Days = Sec / (24*60*60); // Calculate in days.

		this.setRemainingTime(String.valueOf(Days)); // Convert to string and save.

		// If the appointment date is earlier than today. (= already a day in the past.)
		if(Days < 0)
		{
			this.remainingDay = "PAST!";
		}

		return remainingDay;
	}
	// Set a remaining time.
	public void setRemainingTime(String remainingTime)
	{
		remainingDay = remainingTime;
	}
	
}
