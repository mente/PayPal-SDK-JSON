package src.paypalsamples.utils;
import com.paypal.svcs.types.common.ClientDetailsType;
import com.paypal.svcs.types.common.RequestEnvelope;

public class ClientInfoUtil {
	public static ClientDetailsType getMyAppDetails () {
		ClientDetailsType cl = new ClientDetailsType();
		cl.setDeviceId("platformSDKSOAPSample");
		cl.setIpAddress("127.0.0.1");
		cl.setApplicationId("APP-80W284485P519543T");
		return cl;
	}
	public static ClientDetailsType getMyAccountAppDetails () {
		ClientDetailsType cl = new ClientDetailsType();
		cl.setDeviceId("platformSDKSOAPSample");
		cl.setIpAddress("127.0.0.1");
		cl.setApplicationId("APP-80W284485P519543T");
		return cl;
	}
	public static RequestEnvelope getMyAppRequestEnvelope() {
		RequestEnvelope en = new RequestEnvelope();
		en.setErrorLanguage("en_US");
		return en;
	}


}
