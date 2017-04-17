package com.gecko.marshaller;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

/**
 * Created by hlieu on 04/16/17.
 */
public class FinanicalMarshaller {

   private static final String XML_NS = "com.gecko.schema.fintech.v1";
   private static final JAXBContext JAXB_CONTEXT;
   private static final Marshaller MARSHALLER;

   static {
      try {
         JAXB_CONTEXT = JAXBContext.newInstance (XML_NS);
         MARSHALLER = JAXB_CONTEXT.createMarshaller ();
         MARSHALLER.setProperty (Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
      } catch (Exception e) {
         e.printStackTrace ();
         throw new ExceptionInInitializerError (e);
      }
   }

   public synchronized static String marshal (Object object) throws Exception {
      try (StringWriter sw = new StringWriter ()) {
         MARSHALLER.marshal (object, sw);
         return sw.toString ();
      }
   }
}
