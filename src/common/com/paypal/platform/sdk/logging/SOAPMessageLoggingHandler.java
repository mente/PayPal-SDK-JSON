package common.com.paypal.platform.sdk.logging;

import java.io.*;
import java.util.Set;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.soap.SOAPMessage;

public class SOAPMessageLoggingHandler implements
		SOAPHandler<SOAPMessageContext> {
	private OutputStream fos = null;
	boolean logEnabled = true;

	public SOAPMessageLoggingHandler(OutputStream fos) {
		this.fos=fos;

	}
	public boolean handleMessage(SOAPMessageContext context) {
		SOAPMessage soapMsg = context.getMessage();
		try {
			soapMsg.writeTo(fos);


		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}
	public boolean handleFault(SOAPMessageContext context) {
		SOAPMessage msg = context.getMessage();
		try {
			msg.writeTo(fos);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	public void close(MessageContext c) {
		/*
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
	public Set getHeaders() {
		// do not log headers as it is sensitive information
		return null;
	}

}
