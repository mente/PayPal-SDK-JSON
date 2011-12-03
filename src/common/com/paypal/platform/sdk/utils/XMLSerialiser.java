package common.com.paypal.platform.sdk.utils;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import com.paypal.svcs.services.PPFaultMessage;
import com.paypal.svcs.types.common.FaultMessage;

public class XMLSerialiser {

	public static String serializeObjectToXML(Object object,String packageContext){
		   String payload=null;
		   try{
		    JAXBContext context = JAXBContext.newInstance(packageContext);
		    Marshaller marshaller = context.createMarshaller();
		    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    StringWriter stringWriter = new StringWriter();
		    marshaller.marshal( new JAXBElement(new QName("uri","local"), object.getClass(), object),stringWriter);
		    payload=stringWriter.toString();
		   }catch(Exception e){
			  // TODO: handle exception
		   }
		   return payload;
	  }
	  public static Object deserializeXMLToObject(String xmlResponse,Class clazz,String packageContext) throws PPFaultMessage{
	      Object response=null;
	  	try{
		  	JAXBContext context = JAXBContext.newInstance(packageContext);
		  	final Unmarshaller unmarshaller = context.createUnmarshaller();
			XMLInputFactory xmlif = XMLInputFactory.newInstance();
			XMLStreamReader xmlr = xmlif.createXMLStreamReader(new StringReader(xmlResponse));

			if(xmlResponse.contains("<ack>Failure</ack>")){
				JAXBElement<FaultMessage> faultMsgElement =  unmarshaller.unmarshal(xmlr, FaultMessage.class);
				FaultMessage faMessageObj=faultMsgElement.getValue();
				PPFaultMessage pFaultMessage=new PPFaultMessage("Fault Exception",faMessageObj);
				throw pFaultMessage;
			}else{
				JAXBElement res =  unmarshaller.unmarshal(xmlr,clazz);
				response = res.getValue();
			}
	    }catch (PPFaultMessage pp) {
			   throw pp;
		 }catch (Exception e) {
			// TODO: handle exception
		}
	    return response;
	  }
}
