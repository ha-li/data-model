package com.gecko.validation;

import com.gecko.json.domain.Message;
import com.gecko.json.unmarshaller.JsonUnMarshaller;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
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
         UniversalValidator.validate (message);

      } catch (IOException e) {
         e.printStackTrace ();

      } catch (ConstraintViolationException e) {

         Set<ConstraintViolation<?>> violations = e.getConstraintViolations ();
         for(ConstraintViolation<?> infraction: violations) {
            System.out.println ("Object violation: " + infraction.getPropertyPath () + " " + infraction.getMessage () + " in " + infraction.getRootBeanClass ());
         }
         //e.printStackTrace ();
      }
      System.out.println (message);
   }
}
