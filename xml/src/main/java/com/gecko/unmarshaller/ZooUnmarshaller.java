package com.gecko.unmarshaller;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by hlieu on 04/18/17.
 */
public class ZooUnmarshaller {

   private static final String XML_NS = "com.gecko.schema.zoo.v1";
   private static final JAXBContext JAXB_CONTEXT;
   private static final Unmarshaller UNMARSHALLER;

   static {
      try {
         JAXB_CONTEXT = JAXBContext.newInstance (XML_NS);
         UNMARSHALLER = JAXB_CONTEXT.createUnmarshaller ();
      } catch (Exception e) {
         e.printStackTrace ();
         throw new ExceptionInInitializerError (e);
      }
   }

   public static Object readFromFile (String fileName) throws Exception {
      File file = new File(fileName);
      if(file.exists ()) {
         return UNMARSHALLER.unmarshal (file);
      }
      throw new FileNotFoundException ("File " + fileName + " was not found");
   }
}
