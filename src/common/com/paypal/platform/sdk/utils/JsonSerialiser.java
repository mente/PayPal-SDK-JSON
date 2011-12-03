package common.com.paypal.platform.sdk.utils;

import javax.xml.datatype.XMLGregorianCalendar;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.paypal.svcs.services.PPFaultMessage;
import com.paypal.svcs.types.common.ErrorParameter;
import com.paypal.svcs.types.common.FaultMessage;

public class JsonSerialiser {
  
	 public static String serializeObjectToJson(Object object){
		  String payload="";
		  try{
		    Gson gson = new GsonBuilder().registerDeserializer(XMLGregorianCalendar.class, new TimeStampDserializer()).registerDeserializer(ErrorParameter.class, new ErrorParameterDeserializer()).registerSerializer(XMLGregorianCalendar.class,new TimeStampSerializer()).create();
			payload = gson.toJson(object);
		   }catch (Exception e) {
			// TODO: handle exception
		   }	
			return payload;
	  }
	  public static Object deserializeJsonToObject(String response,Class clazz)throws PPFaultMessage{
		  Gson gson = new GsonBuilder().registerDeserializer(XMLGregorianCalendar.class, new TimeStampDserializer()).registerDeserializer(ErrorParameter.class, new ErrorParameterDeserializer()).create();
		   Object result=null;
		   FaultMessage faultMessage=null;
		   try{
		   if(response.contains("\"ack\":\"Success\"")){
			    result=gson.fromJson(response, clazz);
			}else if(response.contains("\"ack\":\"Failure\"")){
				faultMessage=gson.fromJson(response, FaultMessage.class);
				throw new PPFaultMessage("Fault Exception",faultMessage);  
			}
		   }catch (PPFaultMessage pp) {
			   throw pp;
			}catch (Exception e) {
				// TODO: handle exception
		    }
		   return  result;
	  }
}
