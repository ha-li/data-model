package com.gecko.json.marshaller;

import com.gecko.json.domain.Employee;

import java.io.StringWriter;

/**
 * Created by hlieu on 04/20/17.
 */
public class EmployeeMarshaller {

   private static com.fasterxml.jackson.databind.ObjectMapper OBJ_MAPPER;

   static {
      OBJ_MAPPER = new com.fasterxml.jackson.databind.ObjectMapper ();
   }

   public static String marshal (Employee e) {
      StringWriter sw = new StringWriter ();
      try {
         OBJ_MAPPER.writeValue (sw, e);
      } catch (Exception ex) {
         ex.printStackTrace ();
         return null;
      }
      return sw.toString ();
   }
}
