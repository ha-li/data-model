package com.gecko.json.marshaller;

import java.io.StringWriter;

/**
 * Marshalls any object to json.
 *
 *
 * Created by hlieu on 04/20/17.
 */
public class JsonMarshaller {

   private static com.fasterxml.jackson.databind.ObjectMapper OBJ_MAPPER;

   static {
      OBJ_MAPPER = new com.fasterxml.jackson.databind.ObjectMapper ();
   }

   /**
    * Marshalls any object into json using the java bean conventions.
    * @param object
    * @return
    */
   public static String marshal (Object object) {
      StringWriter sw = new StringWriter ();
      try {
         OBJ_MAPPER.writeValue (sw, object);
      } catch (Exception ex) {
         ex.printStackTrace ();
         return null;
      }
      return sw.toString ();
   }
}
