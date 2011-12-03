package src.paypalsamples.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateUtil {

	public static XMLGregorianCalendar getDate(String date) throws Exception {
		DateFormat aFmt = new SimpleDateFormat("yyyy-MM-dd");
		Date aDate = aFmt.parse(date);

		Calendar aCal = Calendar.getInstance();
		aCal.setTime(aDate);

		DatatypeFactory dtf = DatatypeFactory.newInstance();

		/*
		 * return dtf.newXMLGregorianCalendarDate(aCal.get(Calendar.YEAR),
		 * aCal.get(Calendar.MONTH) + 1, aCal.get(Calendar.DAY_OF_MONTH),
		 * DatatypeConstants.FIELD_UNDEFINED);
		 */
		return dtf.newXMLGregorianCalendar(aCal.get(Calendar.YEAR), aCal
				.get(Calendar.MONTH)+ 1, aCal.get(Calendar.DAY_OF_MONTH), aCal
				.get(Calendar.HOUR), aCal.get(Calendar.MINUTE), aCal
				.get(Calendar.SECOND), aCal.get(Calendar.MILLISECOND),
				DatatypeConstants.FIELD_UNDEFINED);
	}

	public static String getNextMonth(Calendar aCal) {

		DateFormat aFmt = new SimpleDateFormat("yyyy-MM-dd");

		Calendar cal = (Calendar) aCal.clone();

		cal.add(Calendar.MONTH, 1);

		return aFmt.format(cal.getTime());

	}

	public static String getNextMonth() throws Exception {
		Calendar now = Calendar.getInstance();
		return getNextMonth(now);

	}

	public static String getNextYear(Calendar aCal) {
		DateFormat aFmt = new SimpleDateFormat("yyyy-MM-dd");

		Calendar cal = (Calendar) aCal.clone();

		cal.add(Calendar.YEAR, 1);

		return aFmt.format(cal.getTime());
	}

	public static String getNextYear() throws Exception {
		Calendar now = Calendar.getInstance();
		return getNextYear(now);

	}

	public static XMLGregorianCalendar getNextMonthDate(
			GregorianCalendar calendar) throws Exception {
		DatatypeFactory df = DatatypeFactory.newInstance();

		GregorianCalendar aCal = (GregorianCalendar) calendar.clone();

		aCal.add(Calendar.MONTH, 1);

		return df.newXMLGregorianCalendar(aCal);
	}

	public static XMLGregorianCalendar getNextMonthDate() throws Exception {
		return getNextMonthDate(new GregorianCalendar());

	}

	public static XMLGregorianCalendar getNextYearDate(
			GregorianCalendar calendar) throws Exception {
		DatatypeFactory df = DatatypeFactory.newInstance();

		GregorianCalendar aCal = (GregorianCalendar) calendar.clone();

		aCal.add(Calendar.YEAR, 1);

		return df.newXMLGregorianCalendar(aCal);
	}

	public static XMLGregorianCalendar getNextYearDate() throws Exception {
		return getNextYearDate(new GregorianCalendar());

	}

	public static void main(String arg[]) {
		try {
			System.out.println(DateUtil.getNextMonthDate());
			System.out.println(DateUtil.getNextYearDate());
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
