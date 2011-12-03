package common.com.paypal.platform.sdk.utils;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class TimeStampDserializer implements
		JsonDeserializer<XMLGregorianCalendar> {

	public XMLGregorianCalendar deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {
		DatatypeFactory dtf = null;
		GregorianCalendar aGreg = null;
		XMLGregorianCalendar xCalendar=null;
		try {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSz");
			String timeStamp=json.getAsString();
			int lastColon=timeStamp.lastIndexOf(':');
			StringBuffer newTimeStamp=new StringBuffer(timeStamp);
			newTimeStamp.deleteCharAt(lastColon);
			Date adate = df.parse(newTimeStamp.toString());
			//Date adate = df.parse(timeStamp.substring(0, 26) + timeStamp.substring(27, 29));  
			Calendar acal = Calendar.getInstance(TimeZone.getTimeZone("PST"));
			acal.setTime(adate);
			aGreg = (GregorianCalendar) acal;
			dtf = DatatypeFactory.newInstance();
			xCalendar=dtf.newXMLGregorianCalendar(aGreg);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return xCalendar;
	}

}
