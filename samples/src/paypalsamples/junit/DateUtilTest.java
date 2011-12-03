package src.paypalsamples.junit;

import java.util.GregorianCalendar;

import junit.framework.TestCase;
import src.paypalsamples.utils.DateUtil;


public class DateUtilTest extends TestCase{
	final GregorianCalendar	DEC_31_2008	= new GregorianCalendar(2008, 11, 31, 13, 13);
	final GregorianCalendar	JAN_30_2008	= new GregorianCalendar(2008, 00, 30, 13, 13);

	public void testNextYear_New() {

		final String exp = "2009-12-31";
		final String act = DateUtil.getNextYear(DEC_31_2008);

		assertEquals(exp, act);

	}

	public void testNextMonth() {

		final String exp = "2009-01-31";
		final String act = DateUtil.getNextMonth(DEC_31_2008);
		 
		assertEquals(exp, act);
	}

	public void testNextMonth_2() {

		final String exp = "2008-02-29"; // Last day of Feb.
		final String act = DateUtil.getNextMonth(JAN_30_2008);

		assertEquals(exp, act);
	}

	public void testGetNextMonthDate() throws Exception {
		final String exp = "2009-01-31T13:13:00.000+05:30";
		final String act = DateUtil.getNextMonthDate(DEC_31_2008).toXMLFormat();
		
		assertEquals(exp, act);
	}

	public void testGetDate() throws Exception {

		final String exp = "2009-01-02T00:00:00.000";
		final String act = DateUtil.getDate(exp).toXMLFormat();
		assertEquals(exp, act);

	}

	// ---- Test of the old utils class

	public void testNextMonth_Old() {

		final String exp = "2009-01-31";
		final String act = DateUtil.getNextMonth(DEC_31_2008);

		assertEquals(exp, act);

	}

	public void testNextMonth_2_Old() {

		final String exp = "2008-02-29"; // Last day of Feb.
		final String act = DateUtil.getNextMonth(JAN_30_2008);
		
		assertEquals(exp, act);
	}
}