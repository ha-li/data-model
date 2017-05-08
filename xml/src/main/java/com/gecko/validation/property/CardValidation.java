package com.gecko.validation.property;

import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;

/**
 * Created by hlieu on 04/19/17.
 */
public class CardValidation implements ValidationEventHandler {
   public boolean handleEvent (ValidationEvent event) {
      System.out.println ("Failed validation");
      return false;
   }
}
