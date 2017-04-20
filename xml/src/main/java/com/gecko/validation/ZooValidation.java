package com.gecko.validation;

import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;

/**
 * Created by hlieu on 04/19/17.
 */
public class ZooValidation implements ValidationEventHandler {
   public boolean handleEvent (ValidationEvent event) {
      System.out.println ("validation error of zoo");
      return false;
   }
}
