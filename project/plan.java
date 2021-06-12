package project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class plan extends date
{
	// fields.
	public String content;
	public String remainingDay;

	// Declare constructors.
	public plan() {
		super();
		this.content = "No plan yet.";
		this.remainingDay = "none";
	}
	public plan(String month, String day, String dayOfTheWeek, String time, String content, String remainingDay) {
		super(month, day, dayOfTheWeek, time);
		this.content = content;
		this.remainingDay = remainingDay;
	}
	public plan(String month, String day, String dayOfTheWeek, String time) {
		this(month, day, dayOfTheWeek, time, "No plan yet.", "none");
	}

	// Define methods.
	// Get a content of the plan.
	public String getcontent() 
	{
		return content;
	}
	// Get a remaining time that how much time is left until the appointment.
	public String getRemainTime() 
	{
		return remainingDay;
	}

	// Set a content of the plan.
	public void setContent(String content) 
	{
		this.content = content;
	}

	// Set a remaining time.
	public void setRemaingTime(String remaingTime)
	{
		this.remainingDay = remaingTime;
	}

	// Get a date information.
	public String getInfo() 
	{
		return  super.getMonth() +"월 "+ super.getDay() +"일 " + super.getTime() + "시 ";
	}


	// 금일날짜와 약속일자 사이에 남은 날짜(d-day)를 리턴
	public String getRemaingTime()
	{
		Calendar getToday = Calendar.getInstance();

		getToday.setTime(new Date()); // 금일 날짜
		getToday.set(Calendar.HOUR,-12); // 시간 분 초 초기화
		getToday.set(Calendar.MINUTE,0);
		getToday.set(Calendar.SECOND,0);

		String s_date = "2021" + super.month + super.day;
		Date date = null;
		try {
			date = new SimpleDateFormat("yyyyMMdd").parse(s_date);
		} catch (ParseException e) {
			e.printStackTrace();
		}


		Calendar cmpDate = Calendar.getInstance();
		cmpDate.set(Calendar.HOUR,0); // 시간 분 초 초기화
		cmpDate.set(Calendar.MINUTE,0);
		cmpDate.set(Calendar.SECOND,0);
		cmpDate.setTime(date); // 약속일자

		long Sec = (cmpDate.getTimeInMillis() - getToday.getTimeInMillis() ) / 1000 +1; // 초 단위로 계산		
		long Days = Sec / (24*60*60); // 일 단위로 계산

		this.setRemaingTime(String.valueOf(Days)); // string으로 변환 후 저장

		// 약속일자가 금일일자 보다 빠를 시 
		if(Days < 0)
		{
			this.remainingDay = "NULL";
		}

		return remainingDay;
	}

}
