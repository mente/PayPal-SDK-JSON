
package com.paypal.svcs.types.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.paypal.svcs.types.common package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FaultMessage_QNAME = new QName("http://svcs.paypal.com/types/common", "FaultMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.paypal.svcs.types.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultMessage }
     * 
     */
    public FaultMessage createFaultMessage() {
        return new FaultMessage();
    }

    /**
     * Create an instance of {@link ResponseEnvelope }
     * 
     */
    public ResponseEnvelope createResponseEnvelope() {
        return new ResponseEnvelope();
    }

    /**
     * Create an instance of {@link RequestEnvelope }
     * 
     */
    public RequestEnvelope createRequestEnvelope() {
        return new RequestEnvelope();
    }

    /**
     * Create an instance of {@link ErrorParameter }
     * 
     */
    public ErrorParameter createErrorParameter() {
        return new ErrorParameter();
    }

    /**
     * Create an instance of {@link ClientDetailsType }
     * 
     */
    public ClientDetailsType createClientDetailsType() {
        return new ClientDetailsType();
    }

    /**
     * Create an instance of {@link ErrorData }
     * 
     */
    public ErrorData createErrorData() {
        return new ErrorData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://svcs.paypal.com/types/common", name = "FaultMessage")
    public JAXBElement<FaultMessage> createFaultMessage(FaultMessage value) {
        return new JAXBElement<FaultMessage>(_FaultMessage_QNAME, FaultMessage.class, null, value);
    }

}
