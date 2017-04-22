package com.gecko.json;

import com.gecko.json.domain.Unknown;
import com.gecko.json.unmarshaller.JsonUnMarshaller;

import java.io.IOException;
import java.net.URL;

/**
 * Created by hlieu on 04/22/17.
 */
public class JacksonAnnotationsExample {

   public static void main (String[] args) throws IOException {

      // unknown.json is Unknown object marshalled into json string,
      // then hand edited to have an extra field "what-is-this".
      // Unmarshalling to a java pojo shoud fail, but for the annotation
      // @JsonIgnoreProperties (ignoreUnknown=true)
      URL url = ClassLoader.getSystemResource ("unknown.json");
      Unknown u = JsonUnMarshaller.unmarshall (url.getFile (), new Unknown());
      System.out.println (u.getField1 ());
   }
}
