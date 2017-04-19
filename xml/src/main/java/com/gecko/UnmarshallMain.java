package com.gecko;

import com.gecko.schema.fintech.v1.CreditCard;
import com.gecko.schema.zoo.v1.Animal;
import com.gecko.unmarshaller.FinancialUnmarshaller;
import com.gecko.unmarshaller.ZooUnmarshaller;

import java.net.URL;

/**
 * Created by hlieu on 04/18/17.
 */
public class UnmarshallMain {

   public static void creditcard () throws Exception {
      URL url = ClassLoader.getSystemResource("data/creditcard.xml");
      String fileName = url.getFile ();
      CreditCard cc = (CreditCard) FinancialUnmarshaller.readFromFile (fileName);
      System.out.println ("The control number found is " + cc.getControlNumber ());
   }

   public static void zoo () throws Exception {
      URL url = ClassLoader.getSystemResource("data/zoo.xml");
      String fileName = url.getFile ();
      Animal dragon = (Animal) ZooUnmarshaller.readFromFile (fileName);
      System.out.println ("The " + dragon.getSpecied () + " favorite food are " + dragon.getFood ());
   }


   public static void main (String[] args) throws Exception {
      creditcard ();
      zoo ();
   }
}
