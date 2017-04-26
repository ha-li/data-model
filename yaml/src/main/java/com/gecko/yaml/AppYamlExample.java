package com.gecko.yaml;

import com.gecko.domain.Contact;
import com.gecko.domain.Phone;

import java.net.URL;

/**
 * Created by hlieu on 04/22/17.
 */
public class AppYamlExample {

   public static void main (String[] args) throws Exception {
      URL url = ClassLoader.getSystemResource ("app.yaml");
      String fileName = url.getFile ();

      Contact contact = ConfigReader.read (fileName);
      System.out.println (contact.getAddress ());
      for (Phone p : contact.getPhone_numbers ()) {
         System.out.println ( "Phone numbers: " + p.getPlace() + " " + p.getNumber () );
      }

   }
}
