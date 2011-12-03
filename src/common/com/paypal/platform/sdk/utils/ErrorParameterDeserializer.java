package common.com.paypal.platform.sdk.utils;
import java.lang.reflect.Type;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.paypal.svcs.types.common.ErrorParameter;

public class ErrorParameterDeserializer implements JsonDeserializer<ErrorParameter>{

 public ErrorParameter deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
 throws JsonParseException 
 {
  ErrorParameter ep= new ErrorParameter();
  ep.setName("name");
  ep.setValue(json.getAsString());
  return ep;
 }
}
