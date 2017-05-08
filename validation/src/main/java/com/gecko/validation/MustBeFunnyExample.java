package com.gecko.validation;

import com.gecko.json.domain.Message;
import com.gecko.json.unmarshaller.JsonUnMarshaller;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.groups.Default;
import javax.validation.metadata.BeanDescriptor;
import java.io.IOException;
import java.util.Set;

/**
 * Created by hlieu on 04/28/17.
 */
public class MustBeFunnyExample {
   public static void main (String[] args) {

      java.net.URL url = ClassLoader.getSystemResource ("notfunny.json");
      String fileName = url.getFile ();

      Message message = new Message ();

      try {
         message = JsonUnMarshaller.unmarshall (fileName, new Message ());

         // here we validate the entire message object
         UniversalValidator.validate (message);

      } catch (IOException e) {
         e.printStackTrace ();
      } catch (ConstraintViolationException e) {
         UniversalValidator.violation ( e, System.out );
      }
      System.out.println (message);

      // get descriptor object describing bean constraints
      BeanDescriptor db = UniversalValidator.constraints (Message.class);
      System.out.println ("descriptors");

      try {
         UniversalValidator.validateProperty (message, "str", Default.class);
      } catch (ConstraintViolationException e) {
         UniversalValidator.violation ( e, System.out );
      }

      try {
         UniversalValidator.validateProperty (message, "staticString", Default.class);
      } catch (ConstraintViolationException e) {
         UniversalValidator.violation ( e, System.out );
      } catch (Exception e) {
         // this exception occurs "IllegalArgumentException because static properties and methods
         // cannot be validated
         System.out.println ("Static fields and methods cannot be validated");
      }

      UniversalValidator.destroy ();
   }
}
