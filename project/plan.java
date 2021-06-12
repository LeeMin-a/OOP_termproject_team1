package project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class plan extends date
{
	public String content;
	public String remaingDay;
	
	public String getcontent() 
	{
		return content;
	}
	
	public String getRemainTime() 
	{
		return remaingDay;
	}
	
	
	public void setContent(String content) 
	{
		this.content = content;
	}
	
	public void setRemaingTime(String remaingTime)
	{
		this.remaingDay = remaingTime;
	}
	
	public String getInfo() 
	{
		return  super.getMonth() +"�� "+ super.getDay() +"�� " + super.getTime() + "�� ";
	}
	
	
	//���ϳ�¥�� ������� ���̿� ���� ��¥(d-day)�� ����
	public String getRemaingTime()
	{
		Calendar getToday = Calendar.getInstance();
		
		getToday.setTime(new Date()); //���� ��¥
		getToday.set(Calendar.HOUR,-12); //�ð� �� �� �ʱ�ȭ
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
		cmpDate.set(Calendar.HOUR,0); //�ð� �� �� �ʱ�ȭ
		cmpDate.set(Calendar.MINUTE,0);
		cmpDate.set(Calendar.SECOND,0);
		cmpDate.setTime(date); //�������
		
		long Sec = (cmpDate.getTimeInMillis() - getToday.getTimeInMillis() ) / 1000 +1; //�� ������ ���		
		long Days = Sec / (24*60*60); // �� ������ ���
		
		this.setRemaingTime(String.valueOf(Days)); // string���� ��ȯ �� ����
		
		// ������ڰ� �������� ���� ���� �� 
		if(Days < 0)
		{
			this.remaingDay = "NULL";
		}
		
		return remaingDay;
	}
	
}
