package com.gecko;

import com.gecko.schema.fintech.v1.CreditCard;
import com.gecko.unmarshaller.FinancialUnmarshaller;
import java.net.URL;

/**
 * Created by hlieu on 04/18/17.
 */
public class UnmarshallMain {

   public static void main (String[] args) throws Exception {
      URL url = ClassLoader.getSystemResource("data/creditcard.xml");
      String fileName = url.getFile ();
      CreditCard cc = (CreditCard) FinancialUnmarshaller.readFromFile (fileName);
      System.out.println ("The control number found is " + cc.getControlNumber ());
   }
}
