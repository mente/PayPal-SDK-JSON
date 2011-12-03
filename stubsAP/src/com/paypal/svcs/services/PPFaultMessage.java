
package com.paypal.svcs.services;

import javax.xml.ws.WebFault;
import com.paypal.svcs.types.common.FaultMessage;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "FaultMessage", targetNamespace = "http://svcs.paypal.com/types/common")
public class PPFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private FaultMessage faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public PPFaultMessage(String message, FaultMessage faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public PPFaultMessage(String message, FaultMessage faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.paypal.svcs.types.common.FaultMessage
     */
    public FaultMessage getFaultInfo() {
        return faultInfo;
    }


	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("PPFaultMessage");
		sb.append("{faultInfo=").append(faultInfo);
		sb.append('}');
		return sb.toString();
	}
}