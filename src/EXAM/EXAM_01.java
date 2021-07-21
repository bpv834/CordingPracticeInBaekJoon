package EXAM;

import java.util.Calendar;

public class EXAM_01 {

	public static void main(String[] args) {
		Calendar now=Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		
		int month=now.get(Calendar.MONTH)+1;
		String strmonth=(month<10)?("0"+month):(""+month);
		
		int dayOfMonth=now.get(Calendar.DAY_OF_MONTH);
		String strDayOfMonth=(dayOfMonth<10)?("0"+dayOfMonth):(""+dayOfMonth);
		
		String dayArr[]= {"일","월","화","수","목","금","토"};
		int dayOfWeek=now.get(Calendar.DAY_OF_WEEK);
		String strDayOfWeek=dayArr[dayOfWeek-1]+"요일";
		
		int hour =now.get(Calendar.HOUR_OF_DAY);
		String strHour=(hour<10)?("0"+hour):(""+hour);
		
		int minute=now.get(Calendar.MINUTE);
		String strminute=(minute<10)?("0"+minute):(""+minute);
		
		int second=now.get(Calendar.SECOND);
		String strSecond=(second<10)?("0"+second):(""+second);
		
		
		System.out.println(year+"년");
		System.out.println(strmonth+"월");
		System.out.println(strDayOfMonth+"일");
		System.out.println(strDayOfWeek+"");
		System.out.println(strHour+"시");
		System.out.println(strminute+"분");
		System.out.println(strSecond+"초");

	}

}
