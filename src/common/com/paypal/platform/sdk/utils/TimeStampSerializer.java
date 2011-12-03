package common.com.paypal.platform.sdk.utils;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
public class TimeStampSerializer implements JsonSerializer<XMLGregorianCalendar> {

	public JsonElement serialize(XMLGregorianCalendar src, Type typeOfSrc,JsonSerializationContext context) {
		SimpleDateFormat aFormat=new SimpleDateFormat("yyyy-MM-dd");
		Date date=src.toGregorianCalendar().getTime();
		String dateString=aFormat.format(date);
		return new JsonPrimitive(dateString);
	}
}
