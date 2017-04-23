package com.gecko;

import com.gecko.json.domain.Message;
import com.gecko.json.marshaller.JsonMarshaller;
import com.gecko.json.unmarshaller.JsonUnMarshaller;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Set;

/**
 * Created by hlieu on 04/23/17.
 */
public class MustBeFunnyExample {
   public static void main (String[] args) throws Exception {
      java.net.URL url = ClassLoader.getSystemResource ("notfunny.json");
      String fileName = url.getFile ();

      Message notFunny = null;
      try {
         notFunny = JsonUnMarshaller.unmarshall (fileName, new Message ());
      } catch (ConstraintViolationException e) {
         Set<ConstraintViolation<?>> violations = e.getConstraintViolations ();
         for(ConstraintViolation<?> infraction: violations) {
            System.out.println ("Object violation: " + infraction.getPropertyPath () + " " + infraction.getMessage () + " in " + infraction.getRootBeanClass ());
         }
         //e.printStackTrace ();
      }

      System.out.println (notFunny);
   }
}
